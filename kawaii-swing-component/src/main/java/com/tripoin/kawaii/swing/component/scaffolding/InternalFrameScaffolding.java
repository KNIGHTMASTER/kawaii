package com.tripoin.kawaii.swing.component.scaffolding;

import com.tripoin.kawaii.swing.component.base.ISwingInitalizer;

import javax.annotation.PostConstruct;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public abstract class InternalFrameScaffolding extends JInternalFrame implements ISwingInitalizer {
    
    private static final long serialVersionUID = 5604399973657634408L;

    @PostConstruct
    @Override
    public void init() {
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(getJIFScaffoldingTitle());
        setMinimumSize(new java.awt.Dimension(800, 550));
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().add(getPanelScaffoldingContent(), java.awt.BorderLayout.CENTER);

        pack();
    }

    public abstract String getJIFScaffoldingTitle();
    
    public abstract JPanel getPanelScaffoldingContent();
}
