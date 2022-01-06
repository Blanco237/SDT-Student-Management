/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectfiles.swingcomponents;

import com.projectfiles.events.EventDeleteItem;
import com.projectfiles.events.EventMenuSelected;
import com.projectfiles.model.Model_Delete;
import com.projectfiles.model.Model_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 * @param <E>
 */
public class ListDelete<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    EventDeleteItem event;
    
    public void addEventMenuSelected(EventDeleteItem event){
        this.event = event;
    }
    
    public ListDelete(){
        model = new DefaultListModel();
        setModel(model);
        
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    System.out.println("Index of Element is "+index);
                    Object o = model.get(index);
                    if(o instanceof Model_Delete){
                        Model_Delete item = (Model_Delete) o;
                            selectedIndex = index;
                            if(event != null){
                                event.selected(index);
                            }
                       }
                    else{
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        } );
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index, boolean selected, boolean focus){
                Model_Delete data;
                if(o instanceof Model_Delete){
                    data = (Model_Delete) o;
                }
                else{
                    data = new Model_Delete("Empty");
                }
                DeleteItem item = new DeleteItem(data);
                item.setSelected(selectedIndex == index);
                return item;
                
            }
        };
    }
    
    public void addItem(Model_Delete data){
        model.addElement(data);
    }
}
