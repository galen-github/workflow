package org.bigant.wf.form;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 校验实体
 */
@Data
@EqualsAndHashCode
public class FormItemValid {

    private FormItemValidType type;

    /**
     * 表达式
     */
    private String expression;

    private String message;

}
