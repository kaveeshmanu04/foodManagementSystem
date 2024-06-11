/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.devkm.view;

import com.devkm.mediator.ChatMediator;
import com.devkm.mediator.ChatUser;
import com.devkm.mediator.ConcreteChatMediator;
import com.devkm.mediator.User;

/**
 *
 * @author KAVEESH
 */
public class ChatPannel extends javax.swing.JFrame {

    private ChatMediator mediator;
    private ChatUser currentUser;
    private ChatUser otherUser;

    public ChatPannel() {
        initComponents();
    }

    public ChatPannel(ChatMediator mediator, ChatUser currentUser, ChatUser otherUser) {
        this.mediator = mediator;
        this.currentUser = currentUser;
        this.otherUser = otherUser;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatBoxTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        chatHistoryLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 300));

        jPanel1.setBackground(new java.awt.Color(176, 168, 185));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 300));

        chatBoxTextArea.setColumns(20);
        chatBoxTextArea.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        chatBoxTextArea.setRows(5);
        jScrollPane1.setViewportView(chatBoxTextArea);

        jButton1.setBackground(new java.awt.Color(255, 128, 102));
        jButton1.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chatHistoryLabel.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel2.setText("Chat History");

        sendButton.setBackground(new java.awt.Color(0, 157, 255));
        sendButton.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        sendButton.setText("Send");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chatHistoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chatHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       goBack();
    }//GEN-LAST:event_jButton1ActionPerformed

       private void goBack() {
        // Logic to go back to the previous screen (OrderManagement or CustomizePanel)
        // ...
        // Close the current frame
        OrderManagement om = new OrderManagement();
        om.setVisible(true);
        this.dispose();
    }
    public void updateChatHistory(String message) {
        String currentText = chatHistoryLabel.getText();
        String newText = currentText + "\n" + message;
        chatHistoryLabel.setText(newText);
    }

    private void sendMessage() {
        String message = chatBoxTextArea.getText();
        // Send the message through the mediator
        mediator.sendMessage(message, currentUser);
        // Update the chat history text area with the sent message
        updateChatHistory(currentUser.getName() + ": " + message);
        // Clear the chat box
        chatBoxTextArea.setText("");
    }

    // Method to handle receiving a message
    public void receiveMessage(String message) {
        // Update the chat history text area with the received message
        updateChatHistory(otherUser.getName() + ": " + message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatBoxTextArea;
    private javax.swing.JLabel chatHistoryLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
