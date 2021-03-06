package com.xxt.gmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:44:52
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

