
package com.projectfiles.model;

import javax.swing.Icon;

/**
 *
 * @author BLANCO
 */
public class Model_Card {
    private Icon icon;
    private String title;
    private String value;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Model_Card() {
    }

    public Model_Card(Icon icon, String title, String value) {
        this.icon = icon;
        this.title = title;
        this.value = value;
    }
    
    
    
    
}
