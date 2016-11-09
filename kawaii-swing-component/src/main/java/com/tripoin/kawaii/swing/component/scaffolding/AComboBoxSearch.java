package com.tripoin.kawaii.swing.component.scaffolding;

import com.tripoin.kawaii.swing.component.base.ISwingInitalizer;

import javax.swing.JComboBox;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public abstract class AComboBoxSearch extends JComboBox implements ISwingInitalizer {
    
    private static final long serialVersionUID = 5910446816431061744L;
    
    protected abstract String[] getComboBoxData();

    public AComboBoxSearch() {
        init();
    }    
    
    @Override
    public void init() {
        this.setModel(new javax.swing.DefaultComboBoxModel(
                getComboBoxData()
        ));
    }
        
    
}
