package com.xxt.gmall.product.dao;

import com.xxt.gmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-29 23:32:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
