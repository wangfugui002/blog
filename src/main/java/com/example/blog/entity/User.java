package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * 
 * @author bianj
 * @version 1.0.0 2020-08-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    /** id */
    private Integer id;

    /** name */
    private String name;

    /** password */
    private String password;

    /** icon */
    private String icon;

    /** admin */
    private Integer admin;

    /** createTime */
    private Date createTime;

}