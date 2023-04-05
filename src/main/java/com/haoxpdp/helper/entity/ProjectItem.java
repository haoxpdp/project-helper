package com.haoxpdp.helper.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * @author haoxp
 */
@TableName("project_item")
@lombok.Data
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
public class ProjectItem {

    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String name;
    private String status;
    private int version;
    private String remark;


}
