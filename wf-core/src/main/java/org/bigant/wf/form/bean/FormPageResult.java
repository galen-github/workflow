package org.bigant.wf.form.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FormPageResult {

    /**
     * eq查询
     */
    private String code;

    /**
     * 模糊查询
     */
    private String name;

    /**
     * 模糊查询
     */
    private String description;



}
