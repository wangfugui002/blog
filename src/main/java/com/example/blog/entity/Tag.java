package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * tag
 *
 * @author bianj
 * @version 1.0.0 2020-08-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag implements Serializable {


    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * blogCount
     */
    private Integer blogCount;

    private Integer tagState;


}