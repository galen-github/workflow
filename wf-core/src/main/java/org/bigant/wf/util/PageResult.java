package org.bigant.wf.util;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    protected long size;

    protected long current;

    protected long total;

    protected List<T> records;

    protected boolean searchCount;
}
