
package com.devkm.handler;

import com.devkm.view.ProcessPanel;


/**
 *
 * @author KAVEESH
 */
public class DeliveryStepHandler implements Handler {
    private Handler nextHandler;
    private ProcessPanel processPanel;

    public DeliveryStepHandler() {
    }
    
    

    public DeliveryStepHandler(ProcessPanel processPanel) {
        this.processPanel = processPanel;
    }

    @Override
    public void handleRequest() {
        // Logic to handle the delivery step
        // Update the delivery step label
        System.out.println("Delivery Step Completed");
        processPanel.updateDeliveryStepLabel("Delivery Step Completed");
        
         try {
        Thread.sleep(3000); // Adjust the duration as needed (in milliseconds)
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
