package com.example.studentmanagement.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;

    // Relation 1,N : Un étudiant peut avoir plusieurs notes
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Note> notes;

    // Constructeur par défaut (exigé par JPA)
    public Etudiant() {}

    // Constructeur avec paramètres
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}





//package com.example.studentmanagement.model;
//
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//public class Etudiant {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String nom;
//    private String prenom;
//
//    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
//    private List<Note> notes;
//
//    // Constructor, getters, and setters
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public List<Note> getNotes() {
//        return notes;
//    }
//
//    public void setNotes(List<Note> notes) {
//        this.notes = notes;
//    }
//}
