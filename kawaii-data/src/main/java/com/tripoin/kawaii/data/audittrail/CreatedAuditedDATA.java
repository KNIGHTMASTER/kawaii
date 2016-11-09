package com.tripoin.kawaii.data.audittrail;

import com.tripoin.kawaii.data.constant.IDATAConstant;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 * DATA with created Audit Trail
 */
public class CreatedAuditedDATA implements Serializable{

    private static final long serialVersionUID = -7097685957615065173L;

    /**
     * Timestamp when data is created
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = IDATAConstant.CREATED_DATE, updatable = false)
    @CreatedDate
    protected Timestamp createdDate;

    /**
     * Identification to whom data is created by
     */
    @Column(name = IDATAConstant.CREATED_BY)
    @CreatedBy
    protected String createdBy;

    @Column(name = IDATAConstant.CREATED_BY_IP)
    protected String createdIp;

    @Column(name = IDATAConstant.CREATED_BY_PLATFORM)
    protected String createdPlatform;

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp;
    }

    public String getCreatedPlatform() {
        return createdPlatform;
    }

    public void setCreatedPlatform(String createdPlatform) {
        this.createdPlatform = createdPlatform;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
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
        return "CreatedAuditedDATA{" +
                "createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", createdIp='" + createdIp + '\'' +
                ", createdPlatform='" + createdPlatform + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreatedAuditedDATA that = (CreatedAuditedDATA) o;

        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdIp != null ? !createdIp.equals(that.createdIp) : that.createdIp != null) return false;
        if (createdPlatform != null ? !createdPlatform.equals(that.createdPlatform) : that.createdPlatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = createdDate != null ? createdDate.hashCode() : 0;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdIp != null ? createdIp.hashCode() : 0);
        result = 31 * result + (createdPlatform != null ? createdPlatform.hashCode() : 0);
        return result;
    }
}
