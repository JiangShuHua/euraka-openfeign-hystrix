package cn.siwen.service;

import cn.siwen.entity.CommonResult;

public class PaymentFallbackService implements PaymentFeignService {

    @Override
    public CommonResult getPaymentByid(long id) {
        return new CommonResult(404,"OpenFeign兜底方法",null);
    }
}
