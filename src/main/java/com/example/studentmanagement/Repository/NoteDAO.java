package com.example.studentmanagement.Repository;

import com.example.studentmanagement.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteDAO extends JpaRepository<Note, Integer> {
    // Retrieve notes by student ID
    List<Note> findByEtudiantId(int etudiantId);

    // Retrieve a specific note by both student ID and course ID
    Optional<Note> findByEtudiantIdAndCoursId(int etudiantId, int coursId);
}





//package com.example.studentmanagement.Repository;
//
//import com.example.studentmanagement.model.Note;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface NoteDAO extends JpaRepository<Note, Integer> {
//
//    // Méthode personnalisée pour trouver les notes par ID étudiant
//    List<Note> findByEtudiantId(int etudiantId);
//}


//package com.example.studentmanagement.Repository;
//
//import com.example.studentmanagement.model.Note;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface NoteDAO extends JpaRepository<Note, Integer> {
//
//    // Custom method to find notes by student ID
//    List<Note> findByEtudiantId(int etudiantId);
//}
