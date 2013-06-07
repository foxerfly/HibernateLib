package com.edwin.admin;
// Generated Jun 7, 2013 9:45:51 PM by Hibernate Tools 3.6.0



/**
 * UserAccount generated by hbm2java
 */
public class UserAccount  implements java.io.Serializable {


     private String userId;
     private String userName;
     private String passWord;
     private String userGroup;
     private String depart;

    public UserAccount() {
    }

	
    public UserAccount(String userId) {
        this.userId = userId;
    }
    public UserAccount(String userId, String userName, String passWord, String userGroup, String depart) {
       this.userId = userId;
       this.userName = userName;
       this.passWord = passWord;
       this.userGroup = userGroup;
       this.depart = depart;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getUserGroup() {
        return this.userGroup;
    }
    
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }
    public String getDepart() {
        return this.depart;
    }
    
    public void setDepart(String depart) {
        this.depart = depart;
    }




}


