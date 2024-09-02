package org.bigant.workflow.form.impl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.bigant.wf.ComponentType;

@Data
public class FormDataItemEntity {

    @TableId
    private Long id;

    private String formCode;

    private String formItemKey;

    private Long formDataId;

    private String name;

    private ComponentType componentType;

    private String value;

    private String createUser;
    private String updateUser;

    private Long updateTime;
    private Long createTime;
}
