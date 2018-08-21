package com.tedu.domain.sms;

import java.util.Date;

public class Sms {
    /**
     * 手机号
     */
    private String phonenumber;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 验证码
     */
    private String idenifyCode;

    /**
     * 日期时间
     */
    private Date date;

    /**
     * 状态；0：未使用；1：已使用
     */
    private Byte status;

    /**
     * 短信类型
     */
    private Byte type;

    /**
     * 手机号
     * @return phonenumber 手机号
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 手机号
     * @param phonenumber 手机号
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * 主键id
     * @return id 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 验证码
     * @return idenify_code 验证码
     */
    public String getIdenifyCode() {
        return idenifyCode;
    }

    /**
     * 验证码
     * @param idenifyCode 验证码
     */
    public void setIdenifyCode(String idenifyCode) {
        this.idenifyCode = idenifyCode == null ? null : idenifyCode.trim();
    }

    /**
     * 日期时间
     * @return date 日期时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 日期时间
     * @param date 日期时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 状态；0：未使用；1：已使用
     * @return status 状态；0：未使用；1：已使用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态；0：未使用；1：已使用
     * @param status 状态；0：未使用；1：已使用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 短信类型
     * @return type 短信类型
     */
    public Byte getType() {
        return type;
    }

    /**
     * 短信类型
     * @param type 短信类型
     */
    public void setType(Byte type) {
        this.type = type;
    }
}