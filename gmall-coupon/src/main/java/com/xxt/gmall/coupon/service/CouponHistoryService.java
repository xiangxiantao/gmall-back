package com.xxt.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:50:19
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

