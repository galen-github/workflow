package org.bigant.wf.form;

import lombok.Data;
import lombok.Getter;

/**
 * 校验类型
 */
@Getter
public enum FormItemValidType {
    NONE("none", "无"),
    REQUIRED("required", "必填"),
    MIN("min", "最小值"),
    MAX("max", "最大值"),
    RANGE("range", "范围"),
    LENGTH("length", "长度"),
    REGEX("regex", "正则"),
    EQUAL_TO("equalTo", "相等"),
    NOT_EQUAL_TO("notEqualTo", "不相等"),
    GREATER_THAN("greaterThan", "大于"),
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo", "大于等于"),
    LESS_THAN("lessThan", "小于"),
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo", "小于等于"),
    CONFIRM("confirm", "确认"),
    NUMBER("number", "数字"),
    INTEGER("integer", "整数"),
    EMAIL("email", "邮箱"),
    URL("url", "网址"),
    DATE("date", "日期"),
    DATE_TIME("dateTime", "日期时间"),
    MOBILE("mobile", "手机号"),
    ID_CARD("idCard", "身份证"),
    CHINESE("chinese", "中文"),
    ENGLISH("english", "英文"),
    ZH_EN("zh_en", "中英文"),
    EN_NUM("en_num", "英文数字"),
    ZH_EN_NUM("zh_en_num", "中文英文数字"),
    EN_NUM_SYMBOL("en_num_symbol", "英文数字符号"),
    ZH_EN_NUM_SYMBOL("zh_en_num_symbol", "中文英文数字符号");


    private final String type;
    private final String desc;

    FormItemValidType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
