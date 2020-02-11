package com.lujieni.cloud.util;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;


public class BeanCloneUtils {

	public static final DozerBeanMapper beanMapper = new DozerBeanMapper();

	/**
	 * 对象到类，目标类可以不是源对象的类
	 * 
	 * @param source   复制源
	 * @param destclas Class可以不是source的Class
	 * @return
	 */
	public static <T> T copyTo(Object source, Class<T> destclas) {
		return beanMapper.map(source, destclas);
	}

	/**
	 * 集合复制
	 * 
	 * @param sources
	 * @param destclas
	 * @return
	 */
	public static <T> List<T> copyTo(List<?> sources, Class<T> destclas) {
		List<T> destList = new ArrayList<>(sources.size());
		for (Object source : sources) {
			T dest = beanMapper.map(source, destclas);
			destList.add(dest);
		}
		
		return destList;
	}

	/**
	 * 对象到对象
	 * 
	 * @param source
	 * @param dest
	 */
	public static void copyTo(Object source, Object dest) {
		beanMapper.map(source, dest);
	}

	/**
	 * 对象复制
	 * 
	 * @param source
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T copyTo(T source) {
		return (T) beanMapper.map(source, source.getClass());
	}
	
	

}
