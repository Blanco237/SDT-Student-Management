/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectfiles.components;

import com.projectfiles.events.EventMenuSelected;
import com.projectfiles.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class StudentSideBar extends javax.swing.JPanel {

    
    private final int hand_cursor = 12;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
            
    public StudentSideBar() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        listMenu1.setCursor(new java.awt.Cursor(this.hand_cursor));
        init();
    }

    private void init(){
        listMenu1.addItem(new Model_Menu("1","DASHBOARD",Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("2","Home",Model_Menu.MenuType.MENU));
        
        listMenu1.addItem(new Model_Menu("","COURSE",Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("9","Register Course",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("9","Drop Course",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("9","View Courses",Model_Menu.MenuType.MENU));
        
        listMenu1.addItem(new Model_Menu("","PROFILE",Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("5","View Profile",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("6","Update Profile",Model_Menu.MenuType.MENU));     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new com.projectfiles.swingcomponents.ListMenu<>();

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SDT-Student-Management\\ProjectFiles\\src\\main\\java\\com.projectfiles.icons\\logo.png"));
        jLabel1.setText("EDU-PRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grad = new GradientPaint(0,0,Color.decode("#2d2d2d"),0,getHeight(),Color.decode("#000000"));
        g2.setPaint(grad);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        g2.fillRect(getWidth()-20,0,getWidth(),getHeight());
        super.paintChildren(grphcs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.projectfiles.swingcomponents.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
