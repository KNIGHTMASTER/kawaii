package com.tripoin.kawaii.swing.component.scaffolding;

import com.tripoin.kawaii.swing.component.scaffolding.listener.IEventTableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public abstract class AGenericTableModel<DATA> extends AbstractTableModel implements IEventTableModel<DATA> {
    
    private static final long serialVersionUID = 6263344220745613439L;    
    
    abstract protected List<DATA> getDATAList();
    
    private List<DATA> DATAList;

    public AGenericTableModel() {
        this.DATAList = getDATAList();
    }           
    
    @Override
    public int getRowCount() {
        return DATAList.size();
    }

    @Override
    public boolean add(DATA p_Data) {
        try{
            return DATAList.add(p_Data);
        }finally{
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    @Override
    public DATA get(int p_Index) {
        return DATAList.get(p_Index);
    }

    @Override
    public DATA set(int p_Index, DATA p_Element) {
        try{
            return DATAList.set(p_Index, p_Element);
        }finally{
            fireTableRowsUpdated(p_Index, p_Index);
        }
    }

    @Override
    public DATA remove(int p_Index) {
        try{
           return DATAList.remove(p_Index);
        }finally{
            fireTableRowsDeleted(p_Index, p_Index);
        }
    }

    @Override
    public void setList(List<DATA> p_DATAList) {
        this.DATAList = p_DATAList;
        fireTableDataChanged();
    }

}
