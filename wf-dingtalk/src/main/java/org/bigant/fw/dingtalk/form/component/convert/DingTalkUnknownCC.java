package org.bigant.fw.dingtalk.form.component.convert;

import com.aliyun.dingtalkworkflow_1_0.models.GetProcessInstanceResponseBody;
import org.bigant.wf.exception.WfException;
import org.bigant.wf.form.bean.FormComponent;
import org.bigant.wf.form.component.ComponentType;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 钉钉字符串转换器
 *
 * @author galen
 * @date 2024/3/115:29
 */
public class DingTalkUnknownCC extends DingTalkBaseCC {

    private static final List<String> DING_TALK_TYPES = Arrays.asList("TextNote",
            "PhoneField",
            "InnerContactField",
            "RelateField",
            "AddressField",
            "StarRatingField",
            "DepartmentField");

    @Override
    public Map<String, String> toOther(FormComponent component, String dingTalkUserId) {
        String errorMsg = String.format("钉钉-无法将%s转换为 form组件。", getType());
        throw new WfException(errorMsg);
    }

    @Override
    public FormComponent toComponent(GetProcessInstanceResponseBody.GetProcessInstanceResponseBodyResultFormComponentValues component) {
        String errorMsg = String.format("钉钉-无法将%s转换为 form组件。", DING_TALK_TYPES);
        throw new WfException(errorMsg);
    }

    @Override
    public ComponentType getType() {
        return ComponentType.UNKNOWN;
    }

    @Override
    public Collection<String> getOtherType() {
        return DING_TALK_TYPES;
    }
}
