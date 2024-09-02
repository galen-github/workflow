package org.bigant.wf.node;

import lombok.Data;

@Data
public class Assignee {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名称
     */
    private String name;


    /**
     * 头像地址
     */
    private String headUrl;
}
