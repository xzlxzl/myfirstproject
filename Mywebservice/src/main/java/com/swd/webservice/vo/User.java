package com.swd.webservice.vo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="user")
public class User {
    /**
     * 用户id	长度：8
     */
    private Integer userId;

    /**
     * 用户工号	非空	长度：12
     */
    private String userNo;

    /**
     * 用户密码	非空	长度：64
     */
    private String userPwd;

    /**
     * 用户姓名	非空	长度：80
     */
    private String userName;

    /**
     * 用户电话	非空	长度：15
     */
    private String tel;

    /**
     * 部门id	非空	长度：4
     */
    private Integer deptId;

    /**
     * 身份证号码	非空	长度：20
     */
    private String sfzNo;

    /**
     * 用户类型	非空	长度：2	默认值：0
     */
    private Integer userType;

    /**
     * 用户注册时间	长度：7	默认值：sysdate 
     */
    private Date userDate;

    /**
     * 公司	非空	长度：10
     */
    private String compNo;

    /**
     * 是否默认密码0否1是	长度：1	默认值：0 
     */
    private Integer pwdDefault;

    /**
     * 职位ID	非空	长度：4
     */
    private Integer jobId;

    /**
     * 电话类型	非空	长度：20
     */
    private String phoneType;

    /**
     * 电话编号	非空	长度：128
     */
    private String phoneSn;

    /**
     * 访问令牌	非空	长度：128
     */
    private String token;

    /**
     * 图片地址	非空	长度：400
     */
    private String picUrl;

    /**
     * 昵称	非空	长度：100
     */
    private String nickName;

    /**
     * 即时通讯账号	非空	长度：100
     */
    private String imNo;

    /**
     * 短号	非空	长度：11
     */
    private String smallTel;

    /**
     * 短号是否公开	非空	长度：38
     */
    private Integer smallTelOpen;

    /**
     * 推荐人	非空	长度：8
     */
    private Integer recommendUser;

    /**
     * 手机号码归属国家或地区	长度：10	默认值：'+86' 
     */
    private String telArea;

    /**
     * 性别0女1男	长度：38	默认值：1  
     */
    private Integer sex;

    /**
     * 	非空	长度：400
     */
    private String address;

    /**
     * 认证状态0未认证1员工2供应商3客户97离职98认证中99其他	长度：2	默认值：0 

     */
    private Integer registerStatus;

    /**
     * 	非空	长度：64
     */
    private String wagePwd;
    
    /**
     * 	长度：64;手势密码
     */
    private String gesturePwd;
    
    private String appVersion;
   
    private String ekpPwd;

    public String getEkpPwd() {
		return ekpPwd;
	}

	public void setEkpPwd(String ekpPwd) {
		this.ekpPwd = ekpPwd;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getSfzNo() {
        return sfzNo;
    }

    public void setSfzNo(String sfzNo) {
        this.sfzNo = sfzNo;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getCompNo() {
        return compNo;
    }

    public void setCompNo(String compNo) {
        this.compNo = compNo;
    }

    public Integer getPwdDefault() {
        return pwdDefault;
    }

    public void setPwdDefault(Integer pwdDefault) {
        this.pwdDefault = pwdDefault;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneSn() {
        return phoneSn;
    }

    public void setPhoneSn(String phoneSn) {
        this.phoneSn = phoneSn;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImNo() {
        return imNo;
    }

    public void setImNo(String imNo) {
        this.imNo = imNo;
    }

    public String getSmallTel() {
        return smallTel;
    }

    public void setSmallTel(String smallTel) {
        this.smallTel = smallTel;
    }

    public Integer getSmallTelOpen() {
        return smallTelOpen;
    }

    public void setSmallTelOpen(Integer smallTelOpen) {
        this.smallTelOpen = smallTelOpen;
    }

    public Integer getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(Integer recommendUser) {
        this.recommendUser = recommendUser;
    }

    public String getTelArea() {
        return telArea;
    }

    public void setTelArea(String telArea) {
        this.telArea = telArea;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(Integer registerStatus) {
        this.registerStatus = registerStatus;
    }

    public String getWagePwd() {
        return wagePwd;
    }

    public void setWagePwd(String wagePwd) {
        this.wagePwd = wagePwd;
    }

	public String getGesturePwd() {
		return gesturePwd;
	}

	public void setGesturePwd(String gesturePwd) {
		this.gesturePwd = gesturePwd;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
}