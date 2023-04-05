package com.haoxpdp.helper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.haoxpdp.helper.mapper.ProjectItemMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haoxp
 */
@SpringBootApplication
public class HelperApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HelperApp.class, args);
    }

    @Resource
    private ProjectItemMapper projectItemMapper;

    @Override
    public void run(String... args) throws Exception {
        List list = projectItemMapper.selectList(new QueryWrapper<>());
        System.out.println(list.size());
    }
}
