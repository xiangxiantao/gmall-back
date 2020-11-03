package com.xxt.gmall.member.feign;

import com.xxt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gmall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/coupon")
    public R getMembersAllCoupon();

}
