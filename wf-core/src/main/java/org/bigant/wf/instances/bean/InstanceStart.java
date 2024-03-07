package org.bigant.wf.instances.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bigant.wf.instances.form.FormDataItem;

import java.util.List;

/**
 * 发起审批实例实体
 *
 * @author galen
 * @date 2024/1/3114:54
 */
@Data
@ApiModel("发起审批实例")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InstanceStart {
    @ApiModelProperty("审批流程code")
    private String processCode;

    @ApiModelProperty("发起人id")
    private String userId;

    @ApiModelProperty("发起人id")
    private String deptId;

    @ApiModelProperty("自选节点用户（与 targetSelectUsersAuthMatch 只能二选一）")
    private List<TargetSelectUser> targetSelectUsers;

    @ApiModelProperty("自选节点用户自动匹配 （与 targetSelectUsers 只能二选一）")
    private List<TargetSelectUserAuthMatch> targetSelectUsersAuthMatch;

    @ApiModelProperty("表单字段集合")
    private List<FormDataItem> formData;

    /*@ApiModelProperty("抄送人")
    private List<String> ccUsers;*/


    @ApiModel("自选节点用户")
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TargetSelectUser {
        @ApiModelProperty("节点key")
        private String key;
        @ApiModelProperty("用户id")
        private List<String> userIds;
    }

    @ApiModel("自选节点用户自动匹配")
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TargetSelectUserAuthMatch {

        @ApiModelProperty("用户id")
        private List<String> userIds;
    }


}
