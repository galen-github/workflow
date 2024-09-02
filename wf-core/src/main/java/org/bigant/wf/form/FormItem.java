package org.bigant.wf.form;

import lombok.Data;
import org.bigant.wf.ComponentType;

import java.util.Map;
import java.util.Set;

@Data
public class FormItem implements IFormItem {

    /**
     * key
     */
    private String key;

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

    /**
     * 多个校验实体
     */
    private Set<FormItemValid> valid;


}
