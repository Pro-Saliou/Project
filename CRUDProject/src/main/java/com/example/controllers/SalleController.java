package com.example.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entities.Salle;
import com.example.repositories.SalleRepository;

@Controller
public class SalleController {
	@Autowired
	 SalleRepository  salleRepository;
	 
	// Afficher la liste des salles
	@GetMapping("/index")
    public String Menu( ) {
        return "menu";
    }
	
    @GetMapping("/salleform")
    public String showSignUpForm(Salle salle) {
    	//salle salle= new salle();
       //model.addAttribute("salle", salle);
        return "salle";
    }

    @PostMapping("/addsalle")
    public String addsalle(@Valid Salle salle, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "salle";
        }

        salleRepository.save(salle);
        model.addAttribute("salles", salleRepository.findAll());
        return "listeSalles";
    }

    @GetMapping("/editsalle/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Salle salle = salleRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid salle Id:" + id));

        model.addAttribute("salle", salle);
        return "edit_salle";
    }
    
    @PostMapping("/updatesalle/{id}")
    public String updatesalle(@PathVariable("id") long id, @Valid Salle salle,
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            salle.setId(id);
            return "edit_salle";
        }

        salleRepository.save(salle);
        model.addAttribute("salles", salleRepository.findAll());
        return "listeSalles";
    }
// Afficher la liste des salles
    @GetMapping("/listeSalle")
    public String listesalle( Model model) {
        model.addAttribute("salles", salleRepository.findAll());
        return "listeSalles";
    }
    
    // Supprimer une Salle
    
    @GetMapping("/deletesalle/{id}")
    public String deletesalle(@PathVariable("id") long id, Model model) {
        Salle salle = salleRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid salle Id:" + id));
        salleRepository.delete(salle);
        model.addAttribute("salles", salleRepository.findAll());
        return "listeSalles";
    }
}