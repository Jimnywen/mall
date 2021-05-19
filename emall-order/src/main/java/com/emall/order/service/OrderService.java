package com.emall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.emall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jayden
 * @email jimnywen@gmail.com
 * @date 2021-01-05 19:31:10
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

