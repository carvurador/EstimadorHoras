/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.properties;

import com.eth.ga.model.ClassificationTech;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sapollonio
 */
public class ClassificationInit {
    
    public static ArrayList Initialize(){
        List<ClassificationTech> listClassification = new ArrayList<>();
        listClassification.add(new ClassificationTech("Report", 80));
        listClassification.add(new ClassificationTech("Report", 120));
        listClassification.add(new ClassificationTech("Report", 160));
        listClassification.add(new ClassificationTech("Report", 200));
        listClassification.add(new ClassificationTech("Report", 240));
        return (ArrayList) listClassification;
    }
}
