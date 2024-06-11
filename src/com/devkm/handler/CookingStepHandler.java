/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.handler;

import com.devkm.view.ProcessPanel;



/**
 *
 * @author KAVEESH
 */
public class CookingStepHandler implements Handler {
    private Handler nextHandler;
    private ProcessPanel processPanel;

    public CookingStepHandler() {
    }
    
    

    public CookingStepHandler(ProcessPanel processPanel) {
        this.processPanel = processPanel;
    }

    @Override
    public void handleRequest() {
        // Logic to handle the cooking step
        // Update the cooking step label
        System.out.println("Cooking Step Completed");
        processPanel.updateCookingStepLabel("Cooking Step Completed");
        
         try {
        Thread.sleep(2000); // Adjust the duration as needed (in milliseconds)
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread interrupted");
    }
        // Invoke the next handler in the chain
        if (nextHandler != null) {
            nextHandler.handleRequest();
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
