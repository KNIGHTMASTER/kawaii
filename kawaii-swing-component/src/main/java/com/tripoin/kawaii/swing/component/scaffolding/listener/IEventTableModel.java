package com.tripoin.kawaii.swing.component.scaffolding.listener;

import java.util.List;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a> 
 * @param <DATA>
 */
public interface IEventTableModel<DATA> {
    
    boolean add(DATA p_Data);
    
    DATA get(int p_Index);
    
    DATA set(int p_Index, DATA p_Element);
    
    DATA remove(int p_Index);
    
    void setList(List<DATA> p_DATAList);
}
