package org.bigant.wf.util;

import lombok.Data;

@Data
public class PageQuery {

    protected long size;

    protected long current;

    protected boolean searchCount;
}
