/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.model;

import com.eth.ga.controllers.HoursCalculatorController;
import com.eth.ga.properties.Initializer;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;



/**
 *
 * @author sapollonio
 */
public class ProjectTest implements com.eth.ga.model.ICalculable{

    String assesment;
    String assesmentDescription;
    int complexity;
    double assesmentImpact;   
   
    
    public ProjectTest() {
    }

    public ProjectTest(String assesment, String assesmentDescription) {
        this.assesment = assesment;
        this.assesmentDescription = assesmentDescription;
    }
    
    public ProjectTest(String assesment, String assesmentDescription, int complexity, double assesmentImpact) {
        this.assesment = assesment;
        this.assesmentDescription = assesmentDescription;
        this.complexity = complexity;
        this.assesmentImpact = assesmentImpact;
    }

    public String getAssesment() {
        return assesment;
    }

    public void setAssesment(String assesment) {
        this.assesment = assesment;
    }

    public String getAssesmentDescription() {
        return assesmentDescription;
    }

    public void setAssesmentDescription(String assesmentDescription) {
        this.assesmentDescription = assesmentDescription;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public double getAssesmentImpact() {
        return assesmentImpact;
    }

    public void setAssesmentImpact(double assesmentImpact) {
        this.assesmentImpact = assesmentImpact;
    }
    
    @Override
    public double calculateStimateHours() {
        
        HoursCalculatorController components = new HoursCalculatorController();
        
        int baseHours = Integer.valueOf(components.getLabelBaseHour().getText()); 
        
        
        double reqAssesmentMultiplier;
        double numberOfVersMultiplier;
        double setUpMultiplier;
        double PerformanceMultiplier;
        double TBCMultiplier;
        double techEffortGLMultiplier;
        double techEffortTestMultiplier;    
        double total=0;
        
     
            
        
        return total;
    }
    
    
    
}