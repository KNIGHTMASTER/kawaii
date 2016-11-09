package com.tripoin.kawaii.data.preload;

import com.tripoin.kawaii.data.AuditedModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created on 11/8/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "mst_locale")
public class Locale extends AuditedModel {
    private static final long serialVersionUID = 7649590699551048697L;
}
