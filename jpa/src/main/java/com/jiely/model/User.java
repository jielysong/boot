package com.jiely.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Administrator on 2017/2/15.
 */
public class User implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * userId:商家用户ID
     */
    private Long userId;

    /**
     * userName:商家用户名
     */
    private String userName;
    /**
     * companyId:用户公司
     */
    @JSONField(serialize=false)
    private Long companyId;
    /**
     * createDate:创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = true)
    private Date createDate;
    /**
     * repassword:确认密码
     */
    @JSONField(serialize=false)
    private String repassword;
    /**
     * modifiedDate:修改时间
     */
    @JSONField(serialize=false)
    private Date modifiedDate;

    /**
     * password_:用户密码
     */
    private String password;

    /**
     * screenName:用户别名
     */
    @JSONField(serialize=false)
    private String screenName;

    /**
     * emailAddress:用户邮箱地址
     */
    private String emailAddress;

    /**
     * loginIP:登陆IP
     */
    @JSONField(serialize=false)
    private String loginIP;

    /**
     * loginDate:登陆日期
     */

    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = false)
    private Date loginDate;

    /**
     * lastLoginIP:最后一次登陆的ip
     */
    @JSONField(serialize=false)
    private String lastLoginIP;

    /**
     * lastLoginDate:最后一次登陆时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = false)
    private Date lastLoginDate;

    /**
     * lastFailedLoginDate:最后一次登陆失败时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = false)
    private Date lastFailedLoginDate;

    /**
     * failedLoginAttempts:登陆失败原因
     */
    @JSONField(serialize=false)
    private Integer failedLoginAttempts;

    /**
     * lockout:是否锁定,密码输入3次后锁定
     */
    @JSONField(serialize=false)
    private Integer lockout;

    /**
     * lockoutDate:锁定日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = false)
    private Date lockoutDate;

    /**
     * status:用户状态是否可用
     */
    @JSONField(serialize=false)
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }


    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


    public Date getLastFailedLoginDate() {
        return lastFailedLoginDate;
    }

    public void setLastFailedLoginDate(Date lastFailedLoginDate) {
        this.lastFailedLoginDate = lastFailedLoginDate;
    }

    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public Integer getLockout() {
        return lockout;
    }

    public void setLockout(Integer lockout) {
        this.lockout = lockout;
    }


    public Date getLockoutDate() {
        return lockoutDate;
    }

    public void setLockoutDate(Date lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", companyId=" + companyId + ", createDate="
                + createDate + ", repassword=" + repassword + ", modifiedDate=" + modifiedDate + ", password="
                + password + ", screenName=" + screenName + ", emailAddress=" + emailAddress + ", loginIP=" + loginIP
                + ", loginDate=" + loginDate + ", lastLoginIP=" + lastLoginIP + ", lastLoginDate=" + lastLoginDate
                + ", lastFailedLoginDate=" + lastFailedLoginDate + ", failedLoginAttempts=" + failedLoginAttempts
                + ", lockout=" + lockout + ", lockoutDate=" + lockoutDate + ", status=" + status + "]";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
