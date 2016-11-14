/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;

/**
 *
 * @author Luiz
 */
public class Database {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Database.usuarios = usuarios;
    }
    
    
    
}
