package org.bigant.wf.node;

import lombok.Data;

@Data
public class Condition {
    /**
     * 名称
     */
    private String name;

    /**
     * 字段
     */
    private String field;

    /**
     * 条件
     */
    private ConditionOperator operator;

    /**
     * 内容
     */
    private String value;

    /**
     * 类型
     */
    private ConditionType type;

    /**
     * 条件排序从小到大
     */
    private Integer sort;

    /**
     * node节点
     */
    private Node node;


}
