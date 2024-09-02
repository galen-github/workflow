package org.bigant.workflow.form.impl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class FormEntity {
    @TableId
    private Long id;

    /**
     * 表单名称
     */
    private String name;

    private String iconUrl;

    private String code;

    private Long version;

    private String description;

    private String status;

    private String createUser;

    private String updateUser;

    private Long createTime;

    private Long updateTime;



}
