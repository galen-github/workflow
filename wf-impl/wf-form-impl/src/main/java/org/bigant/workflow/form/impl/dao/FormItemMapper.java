package org.bigant.workflow.form.impl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bigant.workflow.form.impl.entity.FormItemEntity;

@Mapper
public interface FormItemMapper extends BaseMapper<FormItemEntity> {
}
