package com.code.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by KaBu on 2018/11/24.
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    private long deptNo;
    private String deptName;
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
