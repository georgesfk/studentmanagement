package com.example.studentmanagement.model;

import jakarta.persistence.*;



@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double valeur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Cours getCours() {
        return cours;
    }

    public double getValeur() {
        return valeur;
    }

    @ManyToOne
    @JoinColumn(name = "etudiant_id", referencedColumnName = "id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "cours_id", referencedColumnName = "id")
    private Cours cours;

    // Getters and setters
}
