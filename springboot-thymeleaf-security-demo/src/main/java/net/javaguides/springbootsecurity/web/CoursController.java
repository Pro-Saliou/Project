package net.javaguides.springbootsecurity.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springbootsecurity.entities.Cours;
import net.javaguides.springbootsecurity.repositories.CoursRepository;

@Controller
public class CoursController {
	@Autowired
	 CoursRepository  coursRepository;
	
    @GetMapping("/coursform")
    public String showSignUpForm(Cours cours) {
    	
        return "cours";
    }

    @PostMapping("/addcours")
    public String addcours(@Valid Cours cours, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "cours";
        }

        coursRepository.save(cours);
        model.addAttribute("coursListe", coursRepository.findAll());
        //return "listecours";
        return "bonjour";
    }

  /* @GetMapping("/editcours/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Cours cours = coursRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid cours Id:" + id));

        model.addAttribute("cours", cours);
        return "edit_cours";
    }
    
    @PostMapping("/updatecours/{id}")
    public String updatecours(@PathVariable("id") long id, @Valid Cours cours,
      BindingResult result, Model model) {
        if (result.hasErrors()) {
           // cours.setPk(id);
            return "edit_cours";
        }

        coursRepository.save(cours);
        model.addAttribute("coursListe", coursRepository.findAll());
        return "listecourss";
    }
// Afficher la liste des courss
    @GetMapping("/listecours")
    public String listecours( Model model) {
        model.addAttribute("coursListe", coursRepository.findAll());
        return "listecours";
    }
    
    // Supprimer une cours
    
    @GetMapping("/deletecours/{id}")
    public String deletecours(@PathVariable("id") long id, Model model) {
        Cours cours = coursRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid cours Id:" + id));
        coursRepository.delete(cours);
        model.addAttribute("courss", coursRepository.findAll());
        return "listecours";
    }*/
}