package org.bigant.wf.form.bean;

import lombok.Data;
import org.bigant.wf.instances.form.FormDataItem;
import org.bigant.wf.util.PageQuery;

import java.util.List;

@Data
public class FormDataPageResult extends PageQuery {

    /**
     * 表单code
     */
    private String formCode;


    private List<FormDataItem> items;


}
