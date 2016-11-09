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
public class LabelKeyword extends JLabel implements ISwingInitalizer {
    
    private static final long serialVersionUID = 6526394029431352889L;

    @Value("scaffolding.label.keyword")
    private String keywordString;
    
    @PostConstruct
    @Override
    public void init() {
        this.setText(keywordString);
    }        

}
