package com.example.studentmanagement.model;

import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Relation N,1 : Une note appartient à un seul cours
    @ManyToOne
    @JoinColumn(name = "cours_id")  // La colonne de clé étrangère pour Cours
    private Cours cours;

    // Relation N,1 : Une note appartient à un seul étudiant
    @ManyToOne
    @JoinColumn(name = "etudiant_id")  // La colonne de clé étrangère pour Etudiant
    private Etudiant etudiant;

    private double valeur;

    // Constructeur par défaut
    public Note() {}

    // Constructeur avec paramètres
    public Note(Cours cours, Etudiant etudiant, double valeur) {
        this.cours = cours;
        this.etudiant = etudiant;
        this.valeur = valeur;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
}




//package com.example.studentmanagement.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Note {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne
//    private Cours cours;
//
//    @ManyToOne
//    private Etudiant etudiant;
//
//    private double valeur;
//
//    // Getters and Setters
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Cours getCours() {
//        return cours;
//    }
//
//    public void setCours(Cours cours) {
//        this.cours = cours;
//    }
//
//    public Etudiant getEtudiant() {
//        return etudiant;
//    }
//
//    public void setEtudiant(Etudiant etudiant) {
//        this.etudiant = etudiant;
//    }
//
//    public double getValeur() {
//        return valeur;
//    }
//
//    public void setValeur(double valeur) {
//        this.valeur = valeur;
//    }
//}
