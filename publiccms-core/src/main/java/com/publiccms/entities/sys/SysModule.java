package com.publiccms.entities.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysModule generated by hbm2java
 */
@Entity
@Table(name = "sys_module")
@DynamicUpdate
public class SysModule implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private String id;
    @GeneratorColumn(title = "地址")
    private String url;
    @GeneratorColumn(title = "授权地址")
    private String authorizedUrl;
    @GeneratorColumn(title = "附加")
    private String attached;
    @GeneratorColumn(title = "父模块", condition = true)
    private String parentId;
    @GeneratorColumn(title = "是否菜单", condition = true)
    private boolean menu;
    @GeneratorColumn(title = "排序")
    private int sort;

    public SysModule() {
    }

    public SysModule(String id, boolean menu, int sort) {
        this.id = id;
        this.menu = menu;
        this.sort = sort;
    }

    public SysModule(String id, String url, String authorizedUrl, String attached, String parentId, boolean menu,
            int sort) {
        this.id = id;
        this.url = url;
        this.authorizedUrl = authorizedUrl;
        this.attached = attached;
        this.parentId = parentId;
        this.menu = menu;
        this.sort = sort;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 30)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "authorized_url", length = 65535)
    public String getAuthorizedUrl() {
        return this.authorizedUrl;
    }

    public void setAuthorizedUrl(String authorizedUrl) {
        this.authorizedUrl = authorizedUrl;
    }

    @Column(name = "attached", length = 50)
    public String getAttached() {
        return this.attached;
    }

    public void setAttached(String attached) {
        this.attached = attached;
    }

    @Column(name = "parent_id", length = 30)
    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Column(name = "menu", nullable = false)
    public boolean isMenu() {
        return this.menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

}
