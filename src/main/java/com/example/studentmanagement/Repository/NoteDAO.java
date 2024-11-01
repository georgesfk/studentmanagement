package com.example.studentmanagement.Repository;

import com.example.studentmanagement.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDAO extends JpaRepository<Note, Integer> {

    // Custom method to find notes by student ID
    List<Note> findByEtudiantId(int etudiantId);
}
