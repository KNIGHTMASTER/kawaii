package com.tripoin.kawaii.swing.component.scaffolding;

import javax.annotation.PostConstruct;
import javax.swing.JLabel;

import com.tripoin.kawaii.swing.component.base.ISwingInitalizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class LabelSortBy extends JLabel implements ISwingInitalizer {
    
    private static final long serialVersionUID = 9143316945798547960L;

    @Value("scaffolding.label.sortby")
    private String sortByString;
    
    @PostConstruct
    @Override
    public void init() {
        this.setText(sortByString);        
    }

}
