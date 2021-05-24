package net.javaguides.springbootsecurity.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springbootsecurity.entities.Professeur;
import net.javaguides.springbootsecurity.repositories.ProfesseurRepository;

@Controller
public class ProfesseurController {
	@Autowired
	 ProfesseurRepository  professeurRepository;
	 
    @GetMapping("/formProf")
    public String showSignUpForm(Professeur professeur) {
        return "new_professeur";
    }

    //Ajouter les informations d'un professeur
    
    @PostMapping("/addProfesseur")
    public String addProfesseur(@Valid Professeur professeur, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "new_professeur";
        }

        professeurRepository.save(professeur);
        model.addAttribute("professeurs", professeurRepository.findAll());
        return "professeurList";
    }

    //Afficher les informations à modifier d'un professeur
    
    @GetMapping("/editProfesseur/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Professeur professeur = professeurRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid Professeur Id:" + id));

        model.addAttribute("professeur", professeur);
        return "edit_professeur";
    }
    
 // Afficher la liste des professeurs
    @GetMapping("/listeProfesseurs")
    public String listeProf( Model model) {
    	 model.addAttribute("professeurs", professeurRepository.findAll());
         return "professeurList";
    	// return "Table";
    }
    
    //Mettre à jour les informations d'un professeur
    
    @PostMapping("/updateProfesseur/{id}")
    public String updateEtudiant(@PathVariable("id") long id, @Valid Professeur professeur,
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            professeur.setId(id);
            return "edit_professeur";
        }

        professeurRepository.save(professeur);
        model.addAttribute("professeurs", professeurRepository.findAll());
        return "professeurList";
    }
    
    //Supprimer les informations d'un professeurs

    @GetMapping("/deleteProfesseur/{id}")
    public String deleteEtudiant(@PathVariable("id") long id, Model model) {
        Professeur professeur = professeurRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid Professeur Id:" + id));
        professeurRepository.delete(professeur);
        model.addAttribute("professeurs", professeurRepository.findAll());
        return "professeurList";
    }
}