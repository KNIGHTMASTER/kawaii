package com.tripoin.kawaii.swing.component.scaffolding;

import java.util.List;

/**
 *
 * @author Ladies Man
 * @param <DATA>
 */
public interface IPanelScaffoldingListener<DATA> {
    
    public void onChange(DATA p_DATA);
    
    public void onInsert(DATA p_DATA);
    
    public void onUpdate(DATA p_DATA);
    
    public void onDelete();
    
    public void onSearch(List list);
    
    public void onSort(List list);
    
}
