package com.tripoin.kawaii.data.audittrail;

import com.tripoin.kawaii.data.constant.IDATAConstant;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 * DATA with Modifed Audit Trail
 */
public class ModifiedAuditedDATA extends CreatedAuditedDATA {

    private static final long serialVersionUID = 8933668582406018786L;

    /**
     * Timestamp when DATA is modifed
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = IDATAConstant.MODIFIED_DATE)
    @LastModifiedDate
    protected Timestamp modifiedDate;

    /**
     * Identification to whom data is modified by
     */
    @Column(name = IDATAConstant.MODIFIED_BY)
    @LastModifiedBy
    protected String modifiedBy;

    @Column(name = IDATAConstant.MODIFIED_BY_IP)
    protected String modifiedIp;

    @Column(name = IDATAConstant.MODIFIED_BY_PLATFORM)
    private String modifiedPlatform;

    public String getModifiedIp() {
        return modifiedIp;
    }

    public void setModifiedIp(String modifiedIp) {
        this.modifiedIp = modifiedIp;
    }

    public String getModifiedPlatform() {
        return modifiedPlatform;
    }

    public void setModifiedPlatform(String modifiedPlatform) {
        this.modifiedPlatform = modifiedPlatform;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "ModifiedAuditedDATA{" +
                "modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedIp='" + modifiedIp + '\'' +
                ", modifiedPlatform='" + modifiedPlatform + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifiedAuditedDATA that = (ModifiedAuditedDATA) o;

        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (modifiedIp != null ? !modifiedIp.equals(that.modifiedIp) : that.modifiedIp != null) return false;
        if (modifiedPlatform != null ? !modifiedPlatform.equals(that.modifiedPlatform) : that.modifiedPlatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modifiedDate != null ? modifiedDate.hashCode() : 0;
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (modifiedIp != null ? modifiedIp.hashCode() : 0);
        result = 31 * result + (modifiedPlatform != null ? modifiedPlatform.hashCode() : 0);
        return result;
    }
}
