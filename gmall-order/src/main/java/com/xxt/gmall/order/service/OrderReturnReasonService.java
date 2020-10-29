package com.xxt.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:46:04
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

