package org.bigant.wf.form;

import lombok.Data;
import org.bigant.wf.ComponentType;

import java.util.Map;

/**
 * 表单基础字段
 */
@Data
public class FormBase {

    /**
     * 表单Id
     */
    private String componentId;

    /**
     * 表单名称
     */
    private String name;

    /**
     * 表单类型
     */
    private ComponentType componentType;

    /**
     * 表单提示语
     */
    private String placeholder;

    /**
     * 是否必填
     */
    private Boolean required;

    /**
     * 附属信息
     */
    private Map<String, String> option;

}
