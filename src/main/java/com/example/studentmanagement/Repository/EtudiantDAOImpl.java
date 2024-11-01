package com.example.studentmanagement.Repository;

import com.example.studentmanagement.model.Etudiant;
import com.example.studentmanagement.model.Note;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EtudiantDAOImpl implements EtudiantDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Etudiant save(Etudiant etudiant) {
        em.persist(etudiant);
        return etudiant;
    }

    @Override
    public Etudiant findById(int id) {
        return em.find(Etudiant.class, id);
    }

    @Override
    public List<Note> getNotes(int etudiantId) {
        Etudiant etudiant = em.find(Etudiant.class, etudiantId);
        return etudiant != null ? etudiant.getNotes() : null;
    }

    @Override
    public void delete(int id) {
        Etudiant etudiant = em.find(Etudiant.class, id);
        if (etudiant != null) {
            em.remove(etudiant);
        }
    }

    @Override
    public boolean exists(int id) {
        return em.find(Etudiant.class, id) != null;
    }
}
