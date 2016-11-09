package com.tripoin.kawaii.swing.component.scaffolding.listener;

/**
 *
 * @author Ladies Man
 * @param <DATA>
 */
public interface IAddItemListener<DATA> {

    public void onChange(DATA p_DATA);

    public void onInsert(DATA p_DATA);

    public void onUpdate(DATA p_DATA);

}
