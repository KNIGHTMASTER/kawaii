package com.tripoin.kawaii.swing.component.scaffolding;

import javax.swing.JInternalFrame;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IEventController {
    
    void insert(JInternalFrame p_JInternalFrame);
    
    void add(JInternalFrame p_JInternalFrame);
    
    void delete(JInternalFrame p_JInternalFrame);
    
    void truncate(JInternalFrame p_JInternalFrame);
}
