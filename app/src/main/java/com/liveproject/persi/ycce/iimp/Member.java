package com.liveproject.persi.ycce.iimp;

/**
 * Created by Tiger on 22-08-2016.
 */
public class Member {

    String id, username, emailid, mobileno, designation;

    public Member(){}

    public Member(String id, String username, String emailid, String mobileno, String designation) {
        this.id = id;
        this.username = username;
        this.mobileno = mobileno;
        this.emailid = emailid;
        this.designation = designation;
    }

    public Member(Member m){
        this.id = m.getId();
        this.username = m.getUsername();
        this.emailid = m.getEmailid();
        this.mobileno = m.getMobileno();
        this.designation = m.getDesignation();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
