package com.zcq.service;

import java.util.List;

import com.zcq.vo.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * City Client.
 * 
 * @since 1.0.0 2017年11月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient("msa-weather-city-eureka")
public interface CityClient {
	
	@GetMapping("/cities")
	List<City> listCity() throws Exception;
}
