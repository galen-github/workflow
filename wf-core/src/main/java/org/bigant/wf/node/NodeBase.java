package org.bigant.wf.node;

import lombok.Data;

/**
 * 审批节点
 */
@Data
public class NodeBase {

    private String nodeId;

    private String nodeName;

    private String nodeType;
}
