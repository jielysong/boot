package com.jiely.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Administrator on 2017/2/17.
 */
@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * customerId:用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    /**
     * customerName:登录名
     */
    private String customerName;
    private Long companyId;
    /**
     * createDate:创建日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",serialize = true)
    private Date createDate;
    /**
     * modifiedDate:修改日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm",serialize = true)
    private Date modifiedDate;
    /**
     * password_:登录密码
     */
    @JSONField(serialize=false)
    private String password;
    /**
     * screenName:用户别名
     */
    private String screenName;
    /**
     * emailAddress:用户邮箱地址
     */
    private String emailAddress;
    /**
     * loginIP:登陆ip
     */
    private String loginIP;
    /**
     * loginDate:登陆时间
     */
    private Date loginDate;
    /**
     * lastLoginIP:最后一次登陆ip
     */
    @JSONField(serialize=false)
    private String lastLoginIP;
    /**
     * lastLoginDate:最后一次登陆时间
     */
    @JSONField(serialize=false)
    private Date lastLoginDate;
    /**
     * lastFailedLoginDate:最后一次登陆失败时间
     */
    @JSONField(serialize=false)
    private Date lastFailedLoginDate;
    @JSONField(serialize=false)
    private Integer failedLoginAttempts;
    /**
     * lockout:帐号是否锁定
     */
    @JSONField(serialize=false)
    private Integer lockout;
    /**
     * lockoutDate:锁定时间
     */
    @JSONField(serialize=false)
    private Date lockoutDate;
    /**
     * status:帐号是否可用
     */
    @JSONField(serialize=false)
    private Integer status;
    /**
     * headImgId:用户头像图片id
     */
    private Long headImgId;
    /**
     * headImgUrl:用户头像名称
     */
    private String headImgUrl;

    /**
     * openId:第三方登陆id
     */
    @JSONField(serialize=false)
    private String openId;

    /**
     * balance:剩余金额
     */
    private Double balance;
    /**
     * payPassword:支付密码
     */
    @JSONField(serialize=false)
    private String payPassword;

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public String getPassword() {
        return password;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public Date getLastFailedLoginDate() {
        return lastFailedLoginDate;
    }

    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public Integer getLockout() {
        return lockout;
    }

    public Date getLockoutDate() {
        return lockoutDate;
    }

    public Integer getStatus() {
        return status;
    }

    public Long getHeadImgId() {
        return headImgId;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public String getOpenId() {
        return openId;
    }

    public Double getBalance() {
        return balance;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setLastFailedLoginDate(Date lastFailedLoginDate) {
        this.lastFailedLoginDate = lastFailedLoginDate;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public void setLockout(Integer lockout) {
        this.lockout = lockout;
    }

    public void setLockoutDate(Date lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setHeadImgId(Long headImgId) {
        this.headImgId = headImgId;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", companyId=" + companyId
                + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", password=" + password
                + ", screenName=" + screenName + ", emailAddress=" + emailAddress + ", loginIP=" + loginIP
                + ", loginDate=" + loginDate + ", lastLoginIP=" + lastLoginIP + ", lastLoginDate=" + lastLoginDate
                + ", lastFailedLoginDate=" + lastFailedLoginDate + ", failedLoginAttempts=" + failedLoginAttempts
                + ", lockout=" + lockout + ", lockoutDate=" + lockoutDate + ", status=" + status + ", headImgId="
                + headImgId + ", headImgUrl=" + headImgUrl + ", openId=" + openId + ", balance=" + balance
                + ", payPassword=" + payPassword + "]";
    }
}
