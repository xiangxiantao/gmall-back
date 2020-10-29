package com.xxt.gmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-29 23:32:03
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

