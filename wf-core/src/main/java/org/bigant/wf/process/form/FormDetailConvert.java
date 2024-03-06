package org.bigant.wf.process.form;

import org.bigant.wf.ComponentTypeAndOtherType;
import org.bigant.wf.instances.form.FormDataItem;

/**
 * 控件转换器
 * 工作流的具体实现方案应使用此接口来完成表单数据的转换
 *
 * @author galen
 * @date 2024/1/3115:33
 */
public interface FormDetailConvert<R, OP extends FormDetailItem, FP> extends ComponentTypeAndOtherType {

    R toOther(OP component);

    FormDataItem toFormData(FP component);

}
