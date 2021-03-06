
package com.projectfiles.components;

import com.projectfiles.model.Model_Card;
import com.sun.prism.paint.Gradient;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author BLANCO
 */
public class Card extends javax.swing.JPanel {

    private Color color1;
    private Color color2;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Card data){
        lb_icon.setIcon(data.getIcon());
        lb_title.setText(data.getTitle());
        lb_value.setText(data.getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_icon = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        lb_value = new javax.swing.JLabel();

        lb_icon.setForeground(new java.awt.Color(255, 255, 255));
        lb_icon.setIcon( new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SDT-Student-Management\\ProjectFiles\\src\\main\\java\\com.projectfiles.icons\\stock.png"));

        lb_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("STUDENTS");

        lb_value.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_value.setForeground(new java.awt.Color(255, 255, 255));
        lb_value.setText("5000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_value, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_value, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

     @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grad = new GradientPaint(0,0,color1,0,getHeight(),color2);
        g2.setPaint(grad);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-20, getHeight()/2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_value;
    // End of variables declaration//GEN-END:variables
}
