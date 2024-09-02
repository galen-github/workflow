package org.bigant.wf.node;

import lombok.Data;

import java.util.List;

/**
 * 审批节点
 */
@Data
public class Node {

    /**
     * 名称
     */
    private String name;

    /**
     * 节点Key
     */
    private String key;


    /**
     * 节点类型
     * 开始节点/0
     * 审批节点/1
     * 抄送节点/2
     * 条件节点/3
     * 结束节点/-1
     */
    private String type;

    /**
     * 审批类型
     * 1，指定成员
     * 2，主管
     * 3，角色
     * 4，发起人自选
     * 5，发起人自己
     * 6，连续多级主管
     * 7，部门
     */
    private Integer approveType;

    /**
     * 审批人
     */
    private List<Assignee> assignees;

    /**
     * 主管审批层级
     */
    private Integer managerLevel;

    /**
     * 连续多级上级方式 0，直到最上级主管 1，自定义审批终点
     */
    private String continuousManagerMode;

    /**
     * 连续多级上级
     */
    private Integer continuousManagerLevel;

    /**
     * 发起自选最多人数
     */
    private Integer maxSelected;

    /**
     * 多人审批时审批方式 1，按顺序依次审批 2，会签 (可同时审批，每个人必须审批通过) 3，或签 (有一人审批通过即可) 4，票签 (总权重大于 50% 表示通过)
     */
    private Integer approvalMode;

    /**
     * 条件
     */
    private List<Condition> conditions;

    /**
     * 子节点
     */
    private Node children;

}
