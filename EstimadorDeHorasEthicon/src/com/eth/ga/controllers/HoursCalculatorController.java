/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.controllers;
import com.eth.ga.model.ClassificationTech;
import com.eth.ga.properties.ClassificationInit;
import com.eth.ga.calculations.Operations;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author sapollonio
 */
public class HoursCalculatorController implements Initializable {

    @FXML
    private ComboBox<?> classif_cmbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        List<ClassificationTech> listClassif = new ArrayList<>();
        listClassif = ClassificationInit.Initialize();
        //Operations.setValueView();
        
    }    

    @FXML
    private void SaveObject_menubar(MouseEvent event) {
    }
    
}
