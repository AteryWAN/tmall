package com.young.tmall.coupon.feign;

import com.young.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * tmall
 * {description}
 *
 * @author Young
 * @date 2020-08-25 21:46
 **/
@FeignClient("member")
public interface MemberFeignService {

    @GetMapping(value = "/member/member/test")
    public R test();
}
