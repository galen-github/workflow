package org.bigant.workflow.form.impl.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.bigant.wf.ComponentType;
import org.bigant.wf.form.FormItemValid;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

/**
 * @author wangxin
 * @date 2022/03/04
 **/
@Data
public class FormItemEntity {

    @TableId
    private Long id;

    private Long formId;

    private String formCode;

    private String key;

    private String name;

    private String placeholder;

    private Boolean required;

    private ComponentType componentType;

    private Map<String, String> option;

    private Set<FormItemValid> valid;

    private String createUser;

    private String updateUser;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
