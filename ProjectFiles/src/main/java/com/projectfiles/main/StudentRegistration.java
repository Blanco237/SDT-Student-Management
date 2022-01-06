/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectfiles.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.Types.NULL;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class StudentRegistration extends javax.swing.JFrame {


    public StudentRegistration() {
        initComponents();
    }
    
    public String getId(){
        String id;
        Random rand = new Random();
        id = in_name.getText().substring(0,2);
        Number num = rand.nextInt(100);
        id = id + num.toString() ;
        
        return id;
    }
    
    public String getDate(){
        LocalDate myDate = LocalDate.now();
        return myDate.toString();
    }

    
    private boolean checkInput(){
        boolean state=true;
        
        if(in_cfmpassword.getText().trim()==""){
            lb_confirmPasswordErr.setText("*");
            state=false;
        }
        if(in_dateofbirth.getText().trim()==""){
            lb_dobErr.setText("*");
            state=false;
        }
        if(in_division.getText().trim()==""){
            lb_divisionErr.setText("*");
            state=false;
        }
        if(in_name.getText().trim()==""){
            lb_nameErr.setText("*");
            state=false;
        }
        if(in_nationality.getText().trim()==""){
            lb_nationalityErr.setText("*");
            state=false;
        }
        if(in_parentaddress.getText().trim()==""){
            lb_parentAddressErr.setText("*");
            state=false;
        }
        if(in_parentname.getText().trim()==""){
            lb_parentNameErr.setText("*");
            state=false;
        }
        if(in_password.getText().trim()==""){
            lb_passwordErr.setText("*");
            state=false;
        }
        if(in_placeofbirth.getText().trim()==""){
            lb_pobErr.setText("*");
            state=false;
        }
        if(in_region.getText().trim()==""){
            lb_regionErr.setText("*");
            state=false;
        }
        if(in_status.getText().trim()==""){
            lb_statusErr.setText("*");
        }
        if(in_surname.getText().trim()==""){
            lb_surnameErr.setText("*");
            state=false;
        }
        
        if(in_password.getText().trim() != in_cfmpassword.getText().trim()){
            lb_passwordErr.setText("Passwords do not match");
            lb_confirmPasswordErr.setText("*");
            state = false;
        }
        
        System.out.println("State is : " + state);
        return true;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.projectfiles.swingcomponents.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        in_name = new javax.swing.JTextField();
        in_dateofbirth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        in_surname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        in_placeofbirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        in_parentname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        in_parentaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        in_division = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        in_region = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        in_status = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        in_nationality = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        in_password = new javax.swing.JPasswordField();
        in_cfmpassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        in_sex = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        lb_nameErr = new javax.swing.JLabel();
        lb_surnameErr = new javax.swing.JLabel();
        lb_dobErr = new javax.swing.JLabel();
        lb_pobErr = new javax.swing.JLabel();
        lb_parentAddressErr = new javax.swing.JLabel();
        lb_parentNameErr = new javax.swing.JLabel();
        lb_divisionErr = new javax.swing.JLabel();
        lb_nationalityErr = new javax.swing.JLabel();
        lb_statusErr = new javax.swing.JLabel();
        lb_regionErr = new javax.swing.JLabel();
        lb_passwordErr = new javax.swing.JLabel();
        lb_confirmPasswordErr = new javax.swing.JLabel();
        lb_confirmPasswordErr1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        in_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_nameActionPerformed(evt);
            }
        });

        in_dateofbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_dateofbirthActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Date of Birth");

        in_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_surnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Sex");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Place of Birth");

        in_placeofbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_placeofbirthActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Parent's Name");

        in_parentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_parentnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Parent's Address");

        in_parentaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_parentaddressActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Division of Origin");

        in_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_divisionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Region of Origin");

        in_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_regionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Marital Status");

        in_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_statusActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Nationality");

        in_nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_nationalityActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Password");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Confirm Password");

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Surname");

        in_sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        in_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Fill In the Details below to register a new student");

        lb_nameErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nameErr.setForeground(new java.awt.Color(255, 0, 0));

        lb_surnameErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_surnameErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_dobErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_dobErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_pobErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_pobErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_parentAddressErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_parentAddressErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_parentNameErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_parentNameErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_divisionErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_divisionErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_nationalityErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nationalityErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_statusErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_statusErr.setForeground(new java.awt.Color(255, 51, 0));
        lb_statusErr.setText("*");

        lb_regionErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_regionErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_passwordErr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_passwordErr.setForeground(new java.awt.Color(255, 51, 0));
        lb_passwordErr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lb_confirmPasswordErr.setForeground(new java.awt.Color(255, 51, 0));

        lb_confirmPasswordErr1.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_name, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_nameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_dobErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_parentname, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_parentNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_division, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_divisionErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_nationalityErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_passwordErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_status, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_statusErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_parentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_parentAddressErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_region, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_regionErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_cfmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_confirmPasswordErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(in_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_surnameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(in_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(in_placeofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3)
                        .addGap(49, 49, 49))))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                    .addContainerGap(550, Short.MAX_VALUE)
                    .addComponent(lb_pobErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)))
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder1Layout.createSequentialGroup()
                    .addGap(536, 536, 536)
                    .addComponent(lb_confirmPasswordErr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(in_name)
                            .addComponent(in_sex)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lb_nameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(in_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_surnameErr))))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_dobErr)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in_placeofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_parentname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_parentNameErr)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_parentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_parentAddressErr))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_division, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_divisionErr)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_region, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_regionErr))))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_statusErr)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_nationalityErr))))
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_passwordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_cfmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_confirmPasswordErr))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBorder1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(lb_pobErr)
                    .addContainerGap(393, Short.MAX_VALUE)))
            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                    .addContainerGap(513, Short.MAX_VALUE)
                    .addComponent(lb_confirmPasswordErr1)
                    .addGap(97, 97, 97)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void in_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_nameActionPerformed

    private void in_dateofbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_dateofbirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_dateofbirthActionPerformed

    private void in_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_surnameActionPerformed

    private void in_placeofbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_placeofbirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_placeofbirthActionPerformed

    private void in_parentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_parentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_parentnameActionPerformed

    private void in_parentaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_parentaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_parentaddressActionPerformed

    private void in_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_divisionActionPerformed

    private void in_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_regionActionPerformed

    private void in_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_statusActionPerformed

    private void in_nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_nationalityActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(checkInput()){
            System.out.println("Sending Student to Database");
            String studID = getId();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdt", "root","iGetInt0pc.com!");
                String sql = "INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, studID);
                pst.setString(2, in_name.getText());
                pst.setString(3, in_surname.getText());
                pst.setString(4,in_sex.getItemAt(in_sex.getSelectedIndex()));
                pst.setString(5, in_dateofbirth.getText());
                pst.setString(6, in_placeofbirth.getText());
                pst.setString(7, in_parentname.getText());
                pst.setString(8,in_parentaddress.getText());
                pst.setString(9, in_division.getText());
                pst.setString(10, in_region.getText());
                pst.setString(11, in_nationality.getText());
                pst.setString(12, in_status.getText());
                pst.setString(13, getDate());
                pst.setString(14,"NULL");
                pst.setString(15, "NULL");
                pst.setString(16, in_password.getText());
                
                int rs = pst.executeUpdate();
                
                if(rs > 0){
                    JOptionPane.showMessageDialog(null, "Student Registered\n Your Student ID is : "+ studID);
                    new StudentDashboard().setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "An Error Occured, Try again Later");
                }
            }
            catch(Exception e){
                System.out.println("Error::"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField in_cfmpassword;
    private javax.swing.JTextField in_dateofbirth;
    private javax.swing.JTextField in_division;
    private javax.swing.JTextField in_name;
    private javax.swing.JTextField in_nationality;
    private javax.swing.JTextField in_parentaddress;
    private javax.swing.JTextField in_parentname;
    private javax.swing.JPasswordField in_password;
    private javax.swing.JTextField in_placeofbirth;
    private javax.swing.JTextField in_region;
    private javax.swing.JComboBox<String> in_sex;
    private javax.swing.JTextField in_status;
    private javax.swing.JTextField in_surname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_confirmPasswordErr;
    private javax.swing.JLabel lb_confirmPasswordErr1;
    private javax.swing.JLabel lb_divisionErr;
    private javax.swing.JLabel lb_dobErr;
    private javax.swing.JLabel lb_nameErr;
    private javax.swing.JLabel lb_nationalityErr;
    private javax.swing.JLabel lb_parentAddressErr;
    private javax.swing.JLabel lb_parentNameErr;
    private javax.swing.JLabel lb_passwordErr;
    private javax.swing.JLabel lb_pobErr;
    private javax.swing.JLabel lb_regionErr;
    private javax.swing.JLabel lb_statusErr;
    private javax.swing.JLabel lb_surnameErr;
    private com.projectfiles.swingcomponents.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
