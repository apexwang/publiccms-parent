package com.publiccms.entities.sys;
// Generated 2016-11-19 15:33:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysRoleAuthorizedId generated by hbm2java
 */
@Embeddable
public class SysRoleAuthorizedId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "角色", condition = true)
    private int roleId;
    @GeneratorColumn(title = "地址", condition = true)
    private String url;

    public SysRoleAuthorizedId() {
    }

    public SysRoleAuthorizedId(int roleId, String url) {
        this.roleId = roleId;
        this.url = url;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "url", nullable = false, length = 100)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysRoleAuthorizedId))
            return false;
        SysRoleAuthorizedId castOther = (SysRoleAuthorizedId) other;

        return (this.getRoleId() == castOther.getRoleId()) && ((this.getUrl() == castOther.getUrl())
                || (this.getUrl() != null && castOther.getUrl() != null && this.getUrl().equals(castOther.getUrl())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getRoleId();
        result = 37 * result + (getUrl() == null ? 0 : this.getUrl().hashCode());
        return result;
    }

}
