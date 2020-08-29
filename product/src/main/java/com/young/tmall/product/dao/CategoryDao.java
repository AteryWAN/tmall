package com.young.tmall.product.dao;

import com.young.tmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author young
 * @email 605968060@qq.com
 * @date 2020-08-18 23:18:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
