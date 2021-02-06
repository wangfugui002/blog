package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * 
 * @author bianj
 * @version 1.0.0 2020-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {


    /** id */
    private Integer id;

    /** replyName */
    private String replyName;

    /** replyEmail */
    private String replyEmail;

    /** blogId */
    private Integer blogId;

    /** publishDate */
    private Date publishDate;

    /** bloggerState */
    private Integer bloggerState;

    /** replyState */
    private Integer replyState;

    /** replyContent */
    private String replyContent;

    /** parentId */
    private Integer parentId;

    /** createTime */
    private Date createTime;


}