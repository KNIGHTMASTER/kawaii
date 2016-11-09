package com.tripoin.kawaii.data.audittrail;

import com.tripoin.kawaii.data.SingleKeyEntityDATA;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <KEY>
 */
@MappedSuperclass
public abstract class ABaseAuditTrail<KEY> extends StatusApprovalAuditedDATA implements SingleKeyEntityDATA<KEY> {

    private static final long serialVersionUID = 179167223777367060L;

    private String authenticatedUserName;

    public ABaseAuditTrail() {
        authenticatedUserName = getUsernameOfAuthenticatedUser();
    }

    @PrePersist
    public void prePersist(){
        this.createdDate = new Timestamp(new Date().getTime());
        this.createdBy = authenticatedUserName;
    }

    @PreUpdate
    public void preUpdate(){
        this.modifiedDate = new Timestamp(new Date().getTime());
        this.modifiedBy = authenticatedUserName;
    }

    private String getUsernameOfAuthenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return null;
        }

        return ((User) authentication.getPrincipal()).getUsername();
    }


}
