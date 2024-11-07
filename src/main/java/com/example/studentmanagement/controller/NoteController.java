package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Note;
import com.example.studentmanagement.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note ajouterNote(@RequestBody Note note) {
        return noteService.ajouterNote(note);
    }

    @GetMapping("/etudiant/{etudiantId}")
    public List<Note> consulterNotes(@PathVariable int etudiantId) {
        return noteService.consulterNotesParEtudiant(etudiantId);
    }

    @PutMapping("/{id}")
    public Note modifierNote(@PathVariable int id, @RequestBody double nouvelleValeur) {
        return noteService.modifierNote(id, nouvelleValeur);
    }
}

