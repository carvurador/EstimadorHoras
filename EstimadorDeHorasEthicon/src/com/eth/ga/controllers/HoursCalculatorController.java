/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.controllers;


import com.eth.ga.model.ICalculable;
import com.eth.ga.model.ProjectDescription;
import com.eth.ga.model.ProjectTest;
import com.eth.ga.properties.Initializer;
import java.awt.event.ItemEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.Label;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javax.swing.JComboBox;

/**
 * FXML Controller class
 *
 * @author sapollonio
 */
public class HoursCalculatorController implements Initializable {

    @FXML
    private ComboBox<String> CBClassification;
    @FXML
    private ComboBox<String> CBProcess;
    private ComboBox<String> DCSubProcess;
    private ComboBox<Integer> DCComplex;
    @FXML
    private ComboBox<String> CBTBC;
    @FXML
    private ComboBox<String> CBRequirement;
    @FXML
    private ComboBox<String> CBFunctionalEffortLS;
    @FXML
    private ComboBox<String> CBFunctionalEffortTest;
    @FXML
    private ComboBox<String> CBSetUpLowerEnv;
    @FXML
    private ComboBox<String> CBNumberofVersion;
    @FXML
    private ComboBox<String> CBPerformance;
    @FXML
    private Label labelBaseHour;
    @FXML
    private Label labelAdjustedHours;
    @FXML
    private Label labelTotalHours;
    @FXML
    private Label labelRequirement;
    @FXML
    private Label labelTechTestStage;
    @FXML
    private Label labelTechGoLive;
    @FXML
    private Label labelPerformance;
    @FXML
    private Label labelTBC;
    @FXML
    private Label labelSetUp;
    @FXML
    private Label labelNumberofVers;
    @FXML
    private ComboBox<String> CBSubProcess;
    @FXML
    private ComboBox<Integer> CBComplex;
    
    ComboBox<Object> box;
    ProjectDescription setProjectValues = new ProjectDescription();
    List<Object> setTestValues = new ArrayList<>();
    ProjectTest projectest = new ProjectTest();
    
    double CBRiskValue=0;
    double CBImpactValue=0;
    double CBRequirementValue=0;
    double CBFunctionalEffortDVValue=0;
    double CBFunctionalEffortPSValue=0;
    double CBSetUpLowerEnvValue=0;
    double CBNumberofVersionValue=0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        setComboboxs();   
    }    

    @FXML
    private void SaveObject_menubar(MouseEvent event) {
    }   

    private void DeliverableComplexitysetHours(ActionEvent event) {
        
        int hours = Initializer.getHours(CBClassification.getValue(),DCComplex.getValue());
        labelBaseHour.setText(String.valueOf(hours));
        labelAdjustedHours.setText(String.valueOf(hours));
        labelTotalHours.setText(String.valueOf(hours));
    }   

    private void AssessmentRequirement(ActionEvent event) {
        
        double multiplier = Initializer.getAssesmentImpacts(labelRequirement.getText(),CBRequirement.getValue());
        int baseHours = Integer.valueOf(labelBaseHour.getText());        
        labelAdjustedHours.setText(String.valueOf(baseHours+baseHours*multiplier));
        labelTotalHours.setText(String.valueOf(baseHours+baseHours*multiplier));
    }

    
    /*
    =====================
    getters
    =====================
    */
    public ComboBox<String> getCBClassification() {
        return CBClassification;
    }

    public ComboBox<String> getCBProcess() {
        return CBProcess;
    }

    public ComboBox<String> getDCSubProcess() {
        return DCSubProcess;
    }

    public ComboBox<Integer> getDCComplex() {
        return DCComplex;
    }

    public ComboBox<String> getCBTBC() {
        return CBTBC;
    }

    public ComboBox<String> getCBRequirement() {
        return CBRequirement;
    }

    public ComboBox<String> getCBFunctionalEffortLS() {
        return CBFunctionalEffortLS;
    }

    public ComboBox<String> getCBFunctionalEffortTest() {
        return CBFunctionalEffortTest;
    }

    public ComboBox<String> getCBSetUpLowerEnv() {
        return CBSetUpLowerEnv;
    }

    public ComboBox<String> getCBNumberofVersion() {
        return CBNumberofVersion;
    }

    public ComboBox<String> getCBPerformance() {
        return CBPerformance;
    }

    public Label getLabelBaseHour() {
        return labelBaseHour;
    }

    public Label getLabelAdjustedHours() {
        return labelAdjustedHours;
    }

    public Label getLabelTotalHours() {
        return labelTotalHours;
    }

    public Label getLabelRequirement() {
        return labelRequirement;
    }

    public Label getLabelTechTestStage() {
        return labelTechTestStage;
    }

    public Label getLabelTechGoLive() {
        return labelTechGoLive;
    }

    public Label getLabelPerformance() {
        return labelPerformance;
    }

    public Label getLabelTBC() {
        return labelTBC;
    }

    public Label getLabelSetUp() {
        return labelSetUp;
    }

    public Label getLabelNumberofVers() {
        return labelNumberofVers;
    }
    
    /*
    =====================
    END getters
    =====================
    */
    
    public void setComboboxs(){
        //Set Values to ComboBoxes
        
        CBClassification.
                getItems().addAll("Report",
                        "Application",
                        "Interface",
                        "Set-Up");
        CBProcess.
            getItems().addAll("Make",
                    "Deliver",
                    "Finance",
                    "Master Date",
                    "Plan",
                    "Source",
                    "Quality",
                    "Security",
                    "Master Data");
        
        CBSubProcess.
            getItems().addAll("Manufacturing",
                    "Distribution & Logistic",
                    "Finance & General Ledger",
                    "Product Data",
                    "Planning",
                    "Procurement");

        CBComplex.
            getItems().addAll(1,2,3,4,5);
        
        CBTBC.
            getItems().addAll("Not Applicable",
                    "Low",
                    "Medium",
                    "High");
        
        CBRequirement.
                getItems().addAll("Not Applicable",
                    "Requirements are very detailed explained",
                    "Requirements are clear, however additional analysis are required",
                    "Requirements are not clear");
        
        CBFunctionalEffortTest.
                getItems().addAll("No hours are needed at testing stage (eg. support functional team)",
                    "Few hours are needed at testing stage (eg. support functional team)",
                    "Unit Test is applicable in DEV, however mainly tests will require additional analysis",
                    "Huge effort needed at testing Stage");
        
        CBFunctionalEffortLS.
                getItems().addAll("Follow-up and validations are not needed",
                    "Complexity Low - minimum follow-up and validations",
                    "Complexity Medium",
                    "Complexity High - strong follow-up of other teams and validations");
        
        CBPerformance.
                getItems().addAll("Not Applicable",
                    "Low",
                    "Medium",
                    "High");
        
        CBSetUpLowerEnv.
                getItems().addAll("Not Applicable",
                    "Simple",
                    "Medium-Complex",
                    "Complex");
        
        CBNumberofVersion.
                getItems().addAll("Not Applicable",
                    "Till 10",
                    "Till 20",
                    "Till 50",
                    "Till 70",
                    "More than 100");
    }
    
    @FXML
    private void setClassification(ActionEvent event) {
        box = (ComboBox<Object>) event.getSource();
        String a =String.valueOf(box.getValue());
        setProjectValues.setClassification(a);
        int result = Initializer.getHours(setProjectValues.getClassification(), setProjectValues.getComplexity());
        labelBaseHour.setText(String.valueOf(result));               
    }

    @FXML
    private void setComplexity(ActionEvent event) {
        box = (ComboBox<Object>) event.getSource();  
        int a =(int)box.getValue();        
        setProjectValues.setComplexity(a);
        int result = Initializer.getHours(setProjectValues.getClassification(), setProjectValues.getComplexity());
        labelBaseHour.setText(String.valueOf(result));
    }

    @FXML
    private void CalculateAdjustedHours(ActionEvent event) {
                
        box = (ComboBox<Object>) event.getSource();
        String cbValue = (String)box.getValue();
        
        double result = Initializer.getAssesmentImpacts(box.getId(), cbValue);
        double a = Double.valueOf(labelBaseHour.getText());
        double b = Double.valueOf(labelAdjustedHours.getText());
        String boxId = box.getId();
        System.out.println(box.getId());        
            
        setTestValues.add(new ProjectTest(box.getId(),(String) box.getValue()));        
        switch(boxId){
            case "CBRisk": CBRiskValue=Initializer.getAssesmentImpacts(box.getId(), cbValue); break;
            case "CBImpact":CBImpactValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
            case "CBRequirement":CBRequirementValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
            case "CBFunctionalEffortDV":CBFunctionalEffortDVValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
            case "CBFunctionalEffortPS":CBFunctionalEffortPSValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
            case "CBSetUpLowerEnv":CBSetUpLowerEnvValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
            case "CBNumberofVersion":CBNumberofVersionValue=Initializer.getAssesmentImpacts(box.getId(), cbValue);break;
        }
        
        //Calculate result
        result=a+CBRiskValue * a+
        CBImpactValue * a+
        CBRequirementValue * a+
        CBFunctionalEffortDVValue * a+
        CBFunctionalEffortPSValue * a+
        CBSetUpLowerEnvValue * a+
        CBNumberofVersionValue * a;
        labelAdjustedHours.setText(String.valueOf(result));        
    }

}
