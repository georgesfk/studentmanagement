package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Etudiant;
import com.example.studentmanagement.model.Note;
import com.example.studentmanagement.Repository.EtudiantDAO;
import com.example.studentmanagement.Repository.NoteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantDAO etudiantDAO;

    @Autowired
    private NoteDAO noteDAO;

    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        if (etudiantDAO.exists(etudiant.getId())) {
            throw new IllegalArgumentException("Étudiant déjà existant!");
        }
        return etudiantDAO.save(etudiant);
    }

    public Etudiant consulterEtudiant(int id) {
        return etudiantDAO.findById(id);
    }

    public List<Note> consulterNotes(int etudiantId) {
        return noteDAO.findByEtudiantId(etudiantId);
    }

    public void supprimerEtudiant(int id) {
        etudiantDAO.delete(id);
    }
}



//package com.example.studentmanagement.service;
//
//import com.example.studentmanagement.Repository.EtudiantDAO;
//import com.example.studentmanagement.model.Etudiant;
//import com.example.studentmanagement.model.Note;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EtudiantService {
//    @Autowired
//    private EtudiantDAO etudiantDAO;
//
//    public Etudiant ajouterEtudiant(Etudiant etudiant) {
//        if (etudiantDAO.exists(etudiant.getId())) {
//            throw new IllegalArgumentException("Étudiant existe déjà !");
//        }
//        return etudiantDAO.save(etudiant);
//    }
//
//    public List<Note> consulterNotes(int etudiantId) {
//        return etudiantDAO.getNotes(etudiantId);
//    }
//
//    public void supprimerEtudiant(int id) {
//        etudiantDAO.delete(id);
//    }
//}

