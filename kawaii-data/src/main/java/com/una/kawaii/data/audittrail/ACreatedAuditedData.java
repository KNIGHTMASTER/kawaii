package com.una.kawaii.data.audittrail;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 * DATA with created Audit Trail
 */
@MappedSuperclass
public abstract class ACreatedAuditedData implements Serializable{

    private static final long serialVersionUID = -7097685957615065173L;

    /**
     * Timestamp when data is created
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON", updatable = false)
    protected Date createdDate;

    /**
     * Identification to whom data is created by
     */
    @Column(name = "CREATED_BY")
    protected String createdBy;


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "ACreatedAuditedData{" +
                "createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}
