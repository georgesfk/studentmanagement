package com.example.studentmanagement.controller;

import com.example.studentmanagement.exception.CustomException;
import com.example.studentmanagement.model.Etudiant;
import com.example.studentmanagement.model.Note;
import com.example.studentmanagement.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @PostMapping
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) throws CustomException {
        return etudiantService.ajouterEtudiant(etudiant);
    }

    @GetMapping("/{id}/notes")
    public List<Note> consulterNotes(@PathVariable int id) throws CustomException {
        return etudiantService.consulterNotes(id);
    }
}
