/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.handler;

import com.devkm.view.ProcessPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author KAVEESH
 */
public class PackingStepHandler implements Handler {
    private Handler nextHandler;
    private ProcessPanel processPanel;

    public PackingStepHandler() {
    }
    
    

    public PackingStepHandler(ProcessPanel processPanel) {
        this.processPanel = processPanel;
    }

    @Override
    public void handleRequest() {
        // Logic to handle the packing step
        // Update the packing step label
        System.out.println("Packing Step Completed");
        processPanel.updatePackingStepLabel("Packing Step Completed");
        
         try {
        Thread.sleep(4000); // Adjust the duration as needed (in milliseconds)
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
