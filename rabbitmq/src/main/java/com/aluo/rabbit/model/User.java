package com.aluo.rabbit.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * 电话
     */
    private String phone;


    /**
     * 姓名
     */
    private String name;

    private static final long serialVersionUID = 1L;
}