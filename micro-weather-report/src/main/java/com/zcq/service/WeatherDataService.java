package com.zcq.service;

import com.zcq.vo.WeatherResponse;

/**
 * @Author: zcq
 * @Date: 2019/4/13 11:00
 */
public interface WeatherDataService {
    /**
     * 根据城市ID查询天气数据
     *
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市名称查询天气数据
     *
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

    /**
     * 根据城市ID来同步天气
     * @param cityId
     */
    void syncDateByCityId(String cityId);
}
