package com.tripoin.kawaii.data.preload;

import com.tripoin.kawaii.data.AuditedModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created on 11/9/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "system_parameter")
public class SystemParameter extends AuditedModel {
    private static final long serialVersionUID = -3565393106507853432L;
}
