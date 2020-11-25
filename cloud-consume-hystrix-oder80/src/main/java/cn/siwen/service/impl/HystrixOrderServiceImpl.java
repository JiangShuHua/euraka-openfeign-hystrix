package cn.siwen.service.impl;

import cn.siwen.service.HystrixOrderService;

public class HystrixOrderServiceImpl implements HystrixOrderService {

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "降级了！！！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "降级了！！！！";
    }

    @Override
    public String paymentInfo(Integer id) {
        return "降级了！！！！";
    }
}
