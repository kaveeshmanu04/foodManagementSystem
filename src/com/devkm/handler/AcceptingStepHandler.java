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
public class AcceptingStepHandler implements Handler {
    private Handler nextHandler;
    private ProcessPanel processPanel;

    public AcceptingStepHandler() {
    }

    
    public AcceptingStepHandler(ProcessPanel processPanel) {
        this.processPanel = processPanel;
    }

    @Override
    public void handleRequest() {
        // Logic to handle the accepting step
        // Update the accepting step label
        System.out.println("Accepting Step Completed");
        processPanel.updateAcceptingStepLabel("Accepting Step Completed");
        
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
