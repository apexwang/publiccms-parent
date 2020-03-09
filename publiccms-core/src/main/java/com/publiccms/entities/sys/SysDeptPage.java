package com.publiccms.entities.sys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDeptPage generated by hbm2java
 */
@Entity
@Table(name = "sys_dept_page")
@DynamicUpdate
public class SysDeptPage implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysDeptPageId id;

    public SysDeptPage() {
    }

    public SysDeptPage(SysDeptPageId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "deptId", column = @Column(name = "dept_id", nullable = false)),
            @AttributeOverride(name = "page", column = @Column(name = "page", nullable = false)) })
    public SysDeptPageId getId() {
        return this.id;
    }

    public void setId(SysDeptPageId id) {
        this.id = id;
    }

}
