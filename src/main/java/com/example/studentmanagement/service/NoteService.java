package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Note;
import com.example.studentmanagement.Repository.NoteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteDAO noteDAO;

    public Note ajouterNote(Note note) {
        return noteDAO.save(note);
    }

    public List<Note> consulterNotesParEtudiant(int etudiantId) {
        return noteDAO.findByEtudiantId(etudiantId);
    }

    public Note modifierNote(int id, double nouvelleValeur) {
        Note note = noteDAO.findById(id).orElseThrow(() -> new IllegalArgumentException("Note introuvable"));
        note.setValeur(nouvelleValeur);
        return noteDAO.save(note);
    }
}



//package com.example.studentmanagement.service;
//
//
//import com.example.studentmanagement.Repository.NoteDAO;
//import com.example.studentmanagement.exception.CustomException;
//import com.example.studentmanagement.model.Etudiant;
//import com.example.studentmanagement.model.Note;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class NoteService {
//
//    private final NoteDAO noteDAO;
//
//    @Autowired
//    public NoteService(NoteDAO noteDAO) {
//        this.noteDAO = noteDAO;
//    }
//
//
//    public Note addNoteToStudent(Note note, Etudiant etudiant) throws CustomException {
//        if (note.getValeur() < 0 || note.getValeur() > 20) {
//            throw new CustomException("La note doit être entre 0 et 20.");
//        }
//        note.setEtudiant(etudiant);
//        return noteDAO.save(note);
//    }
//
//
//    public List<Note> getNotesForStudent(int etudiantId) {
//        return noteDAO.findByEtudiantId(etudiantId);
//    }
//
//
//    public Note updateNote(int noteId, double newValeur) throws CustomException {
//        Optional<Note> existingNote = noteDAO.findById(noteId);
//        if (existingNote.isPresent()) {
//            Note note = existingNote.get();
//            if (newValeur < 0 || newValeur > 20) {
//                throw new CustomException("La note doit être entre 0 et 20.");
//            }
//            note.setValeur(newValeur);
//            return noteDAO.save(note);
//        } else {
//            throw new CustomException("Note introuvable.");
//        }
//    }
//
//
//    public void deleteNoteById(int noteId) throws CustomException {
//        if (!noteDAO.existsById(noteId)) {
//            throw new CustomException("Note introuvable.");
//        }
//        noteDAO.deleteById(noteId);
//    }
//}
//
