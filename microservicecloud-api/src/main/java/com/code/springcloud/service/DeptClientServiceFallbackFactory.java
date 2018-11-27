package com.code.springcloud.service;

import com.code.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 服务降级处理信息，消费者找不到生产者之后，提示客户端熔断信息
 * Created by KaBu on 2018/11/27.
 */
@Component   //重点
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(@PathVariable("id") Long id) {
                return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应信息,该Provider挂了，进行了服务降级")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(@RequestBody Dept dept) {
                return false;
            }
        };
    }
}
