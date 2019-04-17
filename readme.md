数据来源
http://wthrcdn.etouch.cn/weather_mini?city=深圳
http://wthrcdn.etouch.cn/weather_mini?citykey=101280601
http://mobile.weather.com.cn/js/citylist.xml


xml解析映射成java类
```java
//根元素
@XmlRootElement(name = "d")
//访问类型
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	@XmlAttribute(name = "d1")
	private String cityId;
	
	@XmlAttribute(name = "d2")
	private String cityName;
	
	@XmlAttribute(name = "d3")
	private String cityCode;
	
	@XmlAttribute(name = "d4")
	private String province;
}
```