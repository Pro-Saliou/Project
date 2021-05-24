package net.javaguides.springbootsecurity.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springbootsecurity.entities.Etudiant;
import net.javaguides.springbootsecurity.repositories.EtudiantRepository;

@Controller
public class EtudiantController {
	@Autowired
	 EtudiantRepository  etudiantRepository;
	 
    @GetMapping("/formEtu")
    public String showSignUpForm(Etudiant Etudiant) {
    	//Etudiant Etudiant= new Etudiant();
       //model.addAttribute("Etudiant", Etudiant);
        return "etudiant";
    }
 // Afficher la liste  des etudiants
    @GetMapping("/listeEtudiant")
    public String listesalle( Model model) {
    	 model.addAttribute("Etudiants", etudiantRepository.findAll());
         return "listeEtudiants";
    }
    @PostMapping("/addEtudiant")
    public String addEtudiant(@Valid Etudiant etudiant, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "etudiant";
        }

        etudiantRepository.save(etudiant);
        model.addAttribute("Etudiants", etudiantRepository.findAll());
        return "listeEtudiants";
    }

    @GetMapping("/editEtudiant/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Etudiant Etudiant = etudiantRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid Etudiant Id:" + id));

        model.addAttribute("etudiant", Etudiant);
        return "edit_etudiant";
    }
    @PostMapping("/updateEtudiant/{id}")
    public String updateEtudiant(@PathVariable("id") long id, @Valid Etudiant etudiant,
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            etudiant.setId(id);
            return "edit_etudiant";
        }

        etudiantRepository.save(etudiant);
        model.addAttribute("Etudiants", etudiantRepository.findAll());
        return "listeEtudiants";
    }

    @GetMapping("/deleteEtudiant/{id}")
    public String deleteEtudiant(@PathVariable("id") long id, Model model) {
        Etudiant Etudiant = etudiantRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid Etudiant Id:" + id));
        etudiantRepository.delete(Etudiant);
        model.addAttribute("Etudiants", etudiantRepository.findAll());
        return "ListeEtudiants";
    }
}