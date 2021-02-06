package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * columnist
 * 
 * @author bianj
 * @version 1.0.0 2020-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Columnist implements Serializable {


    /** id */
    private Integer id;

    /** name */
    private String name;

    /** intro */
    private String intro;

    /** blogCount */
    private Integer blogCount;

    /** createTime */
    private Date createTime;

    private Date updateTime;

    private int columnistState;


}