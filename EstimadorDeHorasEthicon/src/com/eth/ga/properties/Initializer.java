/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eth.ga.properties;
import com.eth.ga.model.ProjectDescription;
import com.eth.ga.model.ProjectTest;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sapollonio
 */
public class Initializer {
    
    public static int getHours(String Classification,int Comlexity){
        
        List<ProjectDescription> ProjectDescriptionList = new ArrayList<>();
        
        ProjectDescriptionList.add(new ProjectDescription("Report", 1, 80));
        ProjectDescriptionList.add(new ProjectDescription("Report", 2, 120));
        ProjectDescriptionList.add(new ProjectDescription("Report", 3, 160));
        ProjectDescriptionList.add(new ProjectDescription("Report", 4, 200));
        ProjectDescriptionList.add(new ProjectDescription("Report", 5, 240));
        
        for(ProjectDescription b:ProjectDescriptionList){
            if(b.getClassification().equals(Classification) && b.getComplexity()==Comlexity){
                return b.getHours();
            }
        }
        return 0;
    }    
    
   
    public static double getAssesmentImpacts(String assessment, String assesmentDescription){
        
            List<ProjectTest> ProjectTestList = new ArrayList<>();
            
            //
            ProjectTestList.add(new ProjectTest("","",0,0.0));

            //Requirement
            ProjectTestList.add(new ProjectTest("CBRequirement", "Not Applicable",0,0));
            ProjectTestList.add(new ProjectTest("CBRequirement", "Requirements are very detailed explained",1, 0.05));
            ProjectTestList.add(new ProjectTest("CBRequirement", "Requirements are clear, however additional analysis are required",2, 0.15));
            ProjectTestList.add(new ProjectTest("CBRequirement", "Requirements are not clear",3,0.30));
            
            //Testing Stage
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortDV", "No hours are needed at testing stage (eg. support functional team)", 0, 0));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortDV", "Few hours are needed at testing stage (eg. support functional team)", 1, 0.25));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortDV", "Unit Test is applicable in DEV, however mainly tests will require additional analysis", 2, 0.35));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortDV", "Huge effort needed at testing Stage", 3, 0.50));
            
            //Go Live
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortPS", "Follow-up and validations are not needed",0,0));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortPS", "Complexity Low - minimum follow-up and validations",1,0.05));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortPS", "Complexity Medium",2,0.15));
            ProjectTestList.add(new ProjectTest("CBFunctionalEffortPS", "Complexity High - strong follow-up of other teams and validations",3,0.30));
            
            //Performance
            ProjectTestList.add(new ProjectTest("CBRisk","Not Applicable",0,0.0));
            ProjectTestList.add(new ProjectTest("CBRisk","Low",1,0.05));
            ProjectTestList.add(new ProjectTest("CBRisk","Medium",2,0.15));
            ProjectTestList.add(new ProjectTest("CBRisk","High",3,0.30));
            
            //TBC
            ProjectTestList.add(new ProjectTest("CBImpact","Not Applicable",0,0.0));
            ProjectTestList.add(new ProjectTest("CBImpact","Low",1,0.0));
            ProjectTestList.add(new ProjectTest("CBImpact","Medium",2,0.0));
            ProjectTestList.add(new ProjectTest("CBImpact","High",3,0.0));
            
            //Set Up Lower
            ProjectTestList.add(new ProjectTest("CBSetUpLowerEnv","Not Applicable",0,0.0));
            ProjectTestList.add(new ProjectTest("CBSetUpLowerEnv","Simple",0,0.01));
            ProjectTestList.add(new ProjectTest("CBSetUpLowerEnv","Medium-Complex",0,0.02));
            ProjectTestList.add(new ProjectTest("CBSetUpLowerEnv","Complex",0,0.03));

            //Cant Vers            
            ProjectTestList.add(new ProjectTest("CBNumberofVersion","Till 10",0,0.00));
            ProjectTestList.add(new ProjectTest("CBNumberofVersion","Till 20",1,0.01));
            ProjectTestList.add(new ProjectTest("CBNumberofVersion","Till 50",2,0.02));
            ProjectTestList.add(new ProjectTest("CBNumberofVersion","Till 70",3,0.03));
            ProjectTestList.add(new ProjectTest("CBNumberofVersion","Till 100",4,0.04));
            
            for(ProjectTest a : ProjectTestList){
                if(a.getAssesmentDescription().equals(assesmentDescription)
                        && a.getAssesment().equals(assessment)){
                    
                    return a.getAssesmentImpact();
                }
            }
        return 0;
    }       
    
    
}
