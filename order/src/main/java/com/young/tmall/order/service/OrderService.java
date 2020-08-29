package com.young.tmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.young.common.utils.PageUtils;
import com.young.tmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author young
 * @email 605968060@qq.com
 * @date 2020-08-24 15:15:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

