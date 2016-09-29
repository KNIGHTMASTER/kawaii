package com.una.kawaii.data.audittrail;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 * DATA with Modifed Audit Trail
 */
@MappedSuperclass
public abstract class AModifiedAuditedData extends ACreatedAuditedData{

    private static final long serialVersionUID = 8933668582406018786L;

    /**
     * Timestamp when DATA is modifed
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFIED_ON")
    protected Date modifiedOn;

    /**
     * Identification to whom data is modified by
     */
    @Column(name = "MODIFIED_BY")
    protected String modifiedBy;

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "AModifiedAuditedData{" +
                "modifiedOn=" + modifiedOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }
}
