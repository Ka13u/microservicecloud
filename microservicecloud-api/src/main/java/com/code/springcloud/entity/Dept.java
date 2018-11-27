package com.code.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by KaBu on 2018/11/24.
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{

    private long deptno;
    private String dname;
    private String db_source;

}
