package com.tripoin.kawaii.data.audittrail;

import com.tripoin.kawaii.data.constant.IDATAConstant;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class StatusApprovalAuditedDATA extends ModifiedAuditedDATA {

    private static final long serialVersionUID = 3431055670656175396L;

    /**
     * Status whether DATA is Active (1) or Not (0)
     */
    @Column(name = IDATAConstant.STATUS)
    protected Integer status;

    /**
     * Timestamp when DATA is approved
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = IDATAConstant.APPROVED_DATE)
    protected Timestamp approvedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = IDATAConstant.REJECT_DATE)
    protected Timestamp rejectDate;

    /**
     * Identification to whom data is approved by
     */
    @Column(name = IDATAConstant.APPROVED_BY)
    protected String approvedBy;

    @Column(name = IDATAConstant.REJECT_BY)
    protected String rejectBy;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Timestamp approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getRejectDate() {
        return rejectDate;
    }

    public void setRejectDate(Timestamp rejectDate) {
        this.rejectDate = rejectDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getRejectBy() {
        return rejectBy;
    }

    public void setRejectBy(String rejectBy) {
        this.rejectBy = rejectBy;
    }

    @Override
    public String toString() {
        return "StatusApprovalAuditedDATA{" +
                "status=" + status +
                ", approvedDate=" + approvedDate +
                ", rejectDate=" + rejectDate +
                ", approvedBy='" + approvedBy + '\'' +
                ", rejectBy='" + rejectBy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusApprovalAuditedDATA that = (StatusApprovalAuditedDATA) o;

        if (approvedBy != null ? !approvedBy.equals(that.approvedBy) : that.approvedBy != null) return false;
        if (approvedDate != null ? !approvedDate.equals(that.approvedDate) : that.approvedDate != null) return false;
        if (rejectBy != null ? !rejectBy.equals(that.rejectBy) : that.rejectBy != null) return false;
        if (rejectDate != null ? !rejectDate.equals(that.rejectDate) : that.rejectDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + (approvedDate != null ? approvedDate.hashCode() : 0);
        result = 31 * result + (rejectDate != null ? rejectDate.hashCode() : 0);
        result = 31 * result + (approvedBy != null ? approvedBy.hashCode() : 0);
        result = 31 * result + (rejectBy != null ? rejectBy.hashCode() : 0);
        return result;
    }
}
