package com.tedu.dao.sms.mapper;

import com.tedu.domain.sms.Sms;

public interface SmsMapper {
    /**
     *
     * @mbg.generated 2018-08-22
     */
    int deleteByPrimaryKey(String phonenumber);

    /**
     *
     * @mbg.generated 2018-08-22
     */
    int insert(Sms record);

    /**
     *
     * @mbg.generated 2018-08-22
     */
    int insertSelective(Sms record);

    /**
     *
     * @mbg.generated 2018-08-22
     */
    Sms selectByPrimaryKey(String phonenumber);

    /**
     *
     * @mbg.generated 2018-08-22
     */
    int updateByPrimaryKeySelective(Sms record);

    /**
     *
     * @mbg.generated 2018-08-22
     */
    int updateByPrimaryKey(Sms record);
}