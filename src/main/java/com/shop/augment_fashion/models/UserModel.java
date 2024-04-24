package com.shop.augment_fashion.models;

public class UserModel {
    private int nid_user;
    private String cfirst_name;
    private String csurnames;
    private String cnickname;
    private String cemail;
    private String cpassword;
    private int nrole;
    private int nid_Address;

    public int getNid_user() {
        return nid_user;
    }

    public void setNid_user(int nid_user) {
        this.nid_user = nid_user;
    }

    public String getCfirst_name() {
        return cfirst_name;
    }

    public void setCfirst_name(String cfirst_name) {
        this.cfirst_name = cfirst_name;
    }

    public String getCsurnames() {
        return csurnames;
    }

    public void setCsurnames(String csurnames) {
        this.csurnames = csurnames;
    }

    public String getCnickname() {
        return cnickname;
    }

    public void setCnickname(String cnickname) {
        this.cnickname = cnickname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public int getNrole() {
        return nrole;
    }

    public void setNrole(int nrole) {
        this.nrole = nrole;
    }

    public int getNid_Address() {
        return nid_Address;
    }

    public void setNid_Address(int nid_Address) {
        this.nid_Address = nid_Address;
    }
}
