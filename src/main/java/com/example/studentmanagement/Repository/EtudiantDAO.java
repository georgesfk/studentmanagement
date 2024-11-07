package com.example.studentmanagement.Repository;

import com.example.studentmanagement.model.Etudiant;
import com.example.studentmanagement.model.Note;

import java.util.List;

public interface EtudiantDAO {
    Etudiant save(Etudiant etudiant);
    Etudiant findById(int id);
    List<Note> getNotes(int etudiantId);
    void delete(int id);
    boolean exists(int id);
}



//package com.example.studentmanagement.Repository;
//
//import com.example.studentmanagement.model.Etudiant;
//import com.example.studentmanagement.model.Note;
//
//import java.util.List;
//
//public interface EtudiantDAO {
//    Etudiant save(Etudiant etudiant);
//    Etudiant findById(int id);
//    List<Note> getNotes(int etudiantId);
//    void delete(int id);
//    boolean exists(int id);
//}