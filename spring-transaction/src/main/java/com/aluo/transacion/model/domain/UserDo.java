package com.aluo.transacion.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class UserDo extends Model<UserDo> implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 电话
     */
    private String phone;

    /**
     * 
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

//    private String username;

    /**
     * 
     */
    private String ide;

    /**
     * 
     */
    private String tradepassword;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}