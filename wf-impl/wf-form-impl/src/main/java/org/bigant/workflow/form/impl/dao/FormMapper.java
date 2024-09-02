package org.bigant.workflow.form.impl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.bigant.workflow.form.impl.entity.FormEntity;

@Mapper
public interface FormMapper extends BaseMapper<FormEntity> {


}
