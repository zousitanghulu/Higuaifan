package com.demo.common.model;

import com.demo.common.model.base.BaseAdmin;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Admin extends BaseAdmin<Admin> {
    private static final Admin dao = new Admin().dao();

    public List getAdmin() {
        return Admin.dao.find("select * from admin");
    }

    public List login(String user,String pwd){
        return Admin.dao.find("select * from admin where admin_name=? and password=?",user,pwd);
    }

}
