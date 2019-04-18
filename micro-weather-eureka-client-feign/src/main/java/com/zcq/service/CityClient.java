package com.zcq.service;






import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zcq
 * @Date: 2019/4/18 18:26
 */
@FeignClient(name = "msa-weather-city-eureka")
public interface CityClient {
    @GetMapping("/cities")
    //方法名与城市数据api微服务中接口对应
    String listCity();
}
