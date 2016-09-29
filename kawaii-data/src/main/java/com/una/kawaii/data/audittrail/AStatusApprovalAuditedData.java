package com.una.kawaii.data.audittrail;

import com.una.kawaii.data.constant.IDataConstant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@MappedSuperclass
public abstract class AStatusApprovalAuditedData extends AModifiedAuditedData{

    private static final long serialVersionUID = 3431055670656175396L;

    /**
     * Status whether DATA is Active (1) or Not (0)
     */
    @Column(name = IDataConstant.STATUS)
    protected int status;

    /**
     * Timestamp when DATA is approved
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = IDataConstant.APPROVED_ON)
    protected Date approvedOn;

    /**
     * Identification to whom data is approved by
     */
    @Column(name = IDataConstant.APPROVED_BY)
    protected String approvedBy;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "AStatusApprovalAuditedData{" +
                "status=" + status +
                ", approvedOn=" + approvedOn +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }
}
