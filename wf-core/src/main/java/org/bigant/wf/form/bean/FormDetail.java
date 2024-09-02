package org.bigant.wf.form.bean;

import lombok.Builder;
import lombok.Data;
import org.bigant.wf.form.FormItem;

import java.util.List;

@Data
@Builder
public class FormDetail {

    private String code;
    private String name;

    private String description;
    private String iconUrl;

    private List<FormItem> items;

    private String createUser;
    private String updateUser;
    private Long createTime;
    private Long updateTime;
}
