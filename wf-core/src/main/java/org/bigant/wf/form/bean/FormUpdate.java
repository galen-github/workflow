package org.bigant.wf.form.bean;

import lombok.Builder;
import lombok.Data;
import org.bigant.wf.form.FormItem;

import java.util.List;

@Data
@Builder
public class FormUpdate {

    private String code;

    private String name;

    private String description;

    private String iconUrl;

    private List<FormItem> items;
}
