package org.bigant.wf.form.bean;

import lombok.Builder;
import lombok.Data;
import org.bigant.wf.instances.form.FormDataItem;

import java.util.List;

@Data
@Builder
public class FormDataUpdate {

    private Long id;

    private String formCode;

    private List<FormDataItem> items;
}
