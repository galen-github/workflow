package org.bigant.workflow.form.impl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class FormDataEntity {
    @TableId
    private Long id;

    private Long version;

    private Long formCode;

    private Long formId;

    private Long processId;

    private Long taskId;

    private String userId;

    private String data;

    private String status;

    private Long createTime;

    private String createUser;

    private Long updateTime;

    private String updateUser;

}
