/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

/**
 *
 * @author Luiz
 */
public class Usuario {
    private int id;
    private String nome;
    private double ultimaNota;
    private double soma;
    private double media;
    
    public String getId() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getUltimaNota() {
        return ultimaNota;
    }

    public void setUltimaNota(double ultimaNota) {
        this.ultimaNota = ultimaNota;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
}
