package com.entity.view;

import com.entity.SheyingzuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影作品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
@TableName("sheyingzuopin")
public class SheyingzuopinView  extends SheyingzuopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingzuopinView(){
	}
 
 	public SheyingzuopinView(SheyingzuopinEntity sheyingzuopinEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingzuopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
