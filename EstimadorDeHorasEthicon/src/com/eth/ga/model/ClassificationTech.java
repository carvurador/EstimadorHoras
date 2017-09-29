/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author sapollonio
 */
public class ClassificationTech {
    
    static AtomicInteger nextId = new AtomicInteger();
    int ID;
    String Classif;
    float Valor;

    /*
    ==================
    Constructors
    ==================
    */
    public ClassificationTech() {
        
        //GetNext ID
        ID = nextId.incrementAndGet();
    }

    public ClassificationTech(String Classif, float Valor) {
        
        //GetNext ID
        ID = nextId.incrementAndGet();
        this.Classif = Classif;
        this.Valor = Valor;
    }
    /*
    ======================
    End Constructors
    ======================
    */
    
    /*
    ====================
    Getters and Setters
    ====================
    */
    public static AtomicInteger getNextId() {
        return nextId;
    }

    public static void setNextId(AtomicInteger nextId) {
        ClassificationTech.nextId = nextId;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    /*
    ====================
    End Getters and Setters
    ====================
    */
    
    
}
