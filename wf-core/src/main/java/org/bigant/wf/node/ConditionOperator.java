package org.bigant.wf.node;

/**
 * 条件运算符
 */
public enum ConditionOperator {
    EQ("等于"),
    NE("不等于"),
    GT("大于"),
    GE("大于等于"),
    LT("小于"),
    LE("小于等于"),
    IN("包含"),
    NOT_IN("不包含"),
    LIKE("包含"),
    NOT_LIKE("不包含"),
    BETWEEN("在之间"),
    NOT_BETWEEN("不在之间"),
    IS_NULL("为空"),
    IS_NOT_NULL("不为空");

    private String desc;

    ConditionOperator(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
