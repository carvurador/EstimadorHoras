/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.main.views.comboxInit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

/**
 *
 * @author sapollonio
 */
public class Initialize {
    
    /*
    ====================================================
    Here we initialize our values for the comboxes.
    ====================================================
    */
    ObservableList<String> classif = FXCollections
            .observableArrayList("Report",
                    "Application",
                    "Interface",
                    "Set-up");
     
    ObservableList<String> process = FXCollections
            .observableArrayList("Make",
                    "Deliver",
                    "Finance",
                    "Master Date",
                    "Plan",
                    "Source",
                    "Quality",
                    "Security",
                    "Master Data");
    
    ObservableList<String> subProcess = FXCollections
            .observableArrayList("Manufacturing",
                    "Distribution & Logistic",
                    "Finance & General Ledger",
                    "Product Data",
                    "Planning",
                    "Procurement");
    
    ObservableList<String> complex = FXCollections.
            observableArrayList("1","2","3","4","5");
    
    ObservableList<String> reqAssesment = FXCollections.
            observableArrayList("Not Applicable",
                    "Requirements are very detailed explained",
                    "Requirements are clear, however additional analysis are required");
    
    ObservableList<String> techEffortTest = FXCollections.
            observableArrayList("Not Applicable",
                    "No hours are needed at testing stage (eg. support functional team)",
                    "Few hours are needed at testing stage (eg. support functional team)",
                    "Unit Test is applicable in DEV, however mainly tests will require additional analysis",
                    "Huge effort needed at testing Stage");
    
    ObservableList<String> techEffortLive = FXCollections.
            observableArrayList("Not Applicable",
                    "Follow-up and validations are not needed",
                    "Complexity Low - minimum follow-up and validations",
                    "Complexity Medium",
                    "Complexity High - strong follow-up of other teams and validations");
    
    ObservableList<String> performance = FXCollections.
            observableArrayList("Not Applicable",
                    "Low",
                    "Medium",
                    "High");
    
    ObservableList<String> tbc = FXCollections.
            observableArrayList("Not Applicable",
                    "Low",
                    "Medium",
                    "High");
    
    ObservableList<String> setUpLowerEnv = FXCollections.
            observableArrayList("Not Applicable",
                    "Simple",
                    "Medium-Complex",
                    "Complex");
    
    ObservableList<String> NumberOfVersion = FXCollections.
            observableArrayList("Not Applicable",
                    "Till 10",
                    "Till 20",
                    "Till 50",
                    "Till 70",
                    "More than 100");
    /*
    =======================
    End ComboBox Values
    =======================
    */
    
    /*
    ============
    Getters
    ============
     */    
    public ObservableList<String> getClassif(){
        return classif;
    }    

    public ObservableList<String> getProcess() {
        return process;
    }

    public ObservableList<String> getSubProcess() {
        return subProcess;
    }

    public ObservableList<String> getComplex() {
        return complex;
    }

    public ObservableList<String> getReqAssesment() {
        return reqAssesment;
    }

    public ObservableList<String> getTechEffortTest() {
        return techEffortTest;
    }

    public ObservableList<String> getTechEffortLive() {
        return techEffortLive;
    }

    public ObservableList<String> getPerformance() {
        return performance;
    }

    public ObservableList<String> getTbc() {
        return tbc;
    }

    public ObservableList<String> getSetUpLowerEnv() {
        return setUpLowerEnv;
    }
    /*
    ============
    End Getters
    ============
     */
    
    public ObservableList<String> getNumberOfVersion() {
        return NumberOfVersion;
    }

    public static void InitializeComboBox(ComboBox<String> Combobox, ObservableList<String> Textolista) {
        Combobox.setItems(Textolista);
    }    
}
