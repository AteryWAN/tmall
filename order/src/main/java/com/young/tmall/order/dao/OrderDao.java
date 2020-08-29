package com.young.tmall.order.dao;

import com.young.tmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author young
 * @email 605968060@qq.com
 * @date 2020-08-24 15:15:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
