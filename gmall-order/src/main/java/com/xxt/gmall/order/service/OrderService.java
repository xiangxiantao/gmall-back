package com.xxt.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:46:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

