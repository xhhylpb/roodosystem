package com.xhhy.bean;

import java.io.Serializable;
import java.util.Date;

public class RoleBean implements Serializable{
    private Integer roleId;

    private String roleName;

    private String addtime;

    private Integer sort;

    private String remark;

    private Integer del;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public void setAddtime(String addtime) {
		this.addtime = addtime;
	}


    public String getAddtime() {
		return addtime;
	}

	public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}