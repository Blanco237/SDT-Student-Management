/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectfiles.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {
    String icon;
    String name;
    MenuType type;
    
    public static enum MenuType{
        TITLE,MENU,EMPTY
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu() {
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
    
    public Icon toIcon(){
        return new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\SDT-Student-Management\\ProjectFiles\\src\\main\\java\\com.projectfiles.icons\\" + icon + ".png");
    }
    
}



