package com.loonpdata.tools;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/** 
 * 类说明 :properties文件操作工具类
 * @author  joker 
 * 创建时间：2013-7-3 下午4:21:25 
 */
public class PropertiesTools {
	public String getValueForKey(String propertiesName, String key){
		
		if("".equals(propertiesName) && propertiesName == null){
			return "the propertiesName is null";
		}
		if("".equals(propertiesName) && propertiesName == null){
			return "the key is null";
		}
		
		Properties properties = new Properties();
		InputStream inputStream = getClass().getResourceAsStream("/"+propertiesName);
		
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("properties load error");
			e.printStackTrace();
		}
		
		return properties.getProperty(key);
	}
}
