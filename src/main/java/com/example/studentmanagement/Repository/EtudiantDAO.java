package com.example.studentmanagement.Repository;

import com.example.studentmanagement.model.Etudiant;
import com.example.studentmanagement.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface EtudiantDAO extends JpaRepository<Etudiant, Integer> {

    // JpaRepository already provides these methods by default
    // Optional<Etudiant> findById(int id);  <-- automatically provided by JpaRepository
    // Etudiant save(Etudiant etudiant); <-- automatically provided by JpaRepository
    // void deleteById(int id); <-- automatically provided by JpaRepository
    // boolean existsById(int id); <-- automatically provided by JpaRepository

    List<Note> getNotes(int etudiantId);  // You may need to define a custom query for this
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