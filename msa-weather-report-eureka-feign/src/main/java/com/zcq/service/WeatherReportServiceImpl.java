package com.zcq.service;

import com.zcq.vo.Forecast;
import com.zcq.vo.Weather;
import com.zcq.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {


	@Autowired
	private WeatherDataClient weatherDataClient;
	@Override
	public Weather getDataByCityId(String cityId) {

		// 由天气数据API微服务来提供
		WeatherResponse resp = weatherDataClient.getDataByCityId(cityId);
		Weather data = resp.getData();
		return data;
	}


}
