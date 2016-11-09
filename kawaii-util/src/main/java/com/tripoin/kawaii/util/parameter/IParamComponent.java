package com.tripoin.kawaii.util.parameter;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <COMPONENT>
 */
public interface IParamComponent<COMPONENT> {

    void setComponent(COMPONENT p_Component);
    
    COMPONENT getComponent();
}
