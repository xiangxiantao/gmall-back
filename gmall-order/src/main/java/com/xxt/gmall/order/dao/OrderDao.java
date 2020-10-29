package com.xxt.gmall.order.dao;

import com.xxt.gmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:46:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
