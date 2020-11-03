package com.xxt.gmall.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.xxt.gmall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xxt.gmall.member.entity.MemberEntity;
import com.xxt.gmall.member.service.MemberService;
import com.xxt.common.utils.PageUtils;
import com.xxt.common.utils.R;



/**
 * 会员
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:47:53
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @GetMapping("/test")
    public R test(){
        return couponFeignService.getMembersAllCoupon();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")

    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")

    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")

    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")

    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
