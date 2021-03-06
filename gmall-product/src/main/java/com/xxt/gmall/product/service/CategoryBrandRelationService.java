package com.xxt.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-29 23:32:03
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

