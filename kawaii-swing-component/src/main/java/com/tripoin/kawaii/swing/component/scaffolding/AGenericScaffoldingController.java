package com.tripoin.kawaii.swing.component.scaffolding;

import java.io.Serializable;
import javax.swing.JInternalFrame;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public abstract class AGenericScaffoldingController<DATA> implements IEventController, Serializable{
    
    private static final long serialVersionUID = 100563581261567280L;

    protected abstract Class<DATA> getDTOClass();
    
    protected abstract JInternalFrame getInternalFrame();
        
}
