package com.xxt.gmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.xxt.gmall.coupon.entity.CouponEntity;
import com.xxt.gmall.coupon.service.CouponService;
import com.xxt.common.utils.PageUtils;
import com.xxt.common.utils.R;



/**
 * 优惠券信息
 *
 * @author xxt
 * @email 1067301216@qq.com
 * @date 2020-10-30 00:50:19
 */
@RestController
@RequestMapping("coupon/coupon")
@RefreshScope
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.name}")
    private String name;

    @Value("${coupon.count}")
    private Integer count;


    @GetMapping("/sm")
    public R getSm(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满减");
        return R.ok().put("name", name).put("count", count);
    }


    @GetMapping("/member/coupon")
    public R getMembersAllCoupon(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满减");
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")

    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")

    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")

    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")

    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
