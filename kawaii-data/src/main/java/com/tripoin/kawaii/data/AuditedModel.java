package com.tripoin.kawaii.data;

import com.tripoin.kawaii.data.audittrail.ABaseAuditTrail;
import com.tripoin.kawaii.data.constant.IDATAConstant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class AuditedModel extends ABaseAuditTrail<Long> {

    private static final long serialVersionUID = 2666092355221874688L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name= IDATAConstant.ID)
    private Long id;

    @Size(max = 50)
    @Column(name = IDATAConstant.CODE, length = 50)
    private String code;

    @Size(max = 50)
    @Column(name = IDATAConstant.NAME, length = 50)
    private String name;

    @Size(max = 255)
    @Column(name = IDATAConstant.DESCRIPTION, length = 255)
    private String description;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AuditedModel baseModel = (AuditedModel) o;

        if (code != null ? !code.equals(baseModel.code) : baseModel.code != null) return false;
        if (description != null ? !description.equals(baseModel.description) : baseModel.description != null)
            return false;
        if (id != null ? !id.equals(baseModel.id) : baseModel.id != null) return false;
        if (name != null ? !name.equals(baseModel.name) : baseModel.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
