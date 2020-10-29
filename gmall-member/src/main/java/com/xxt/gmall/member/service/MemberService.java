package com.xxt.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxt.common.utils.PageUtils;
import com.xxt.gmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:47:53
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

