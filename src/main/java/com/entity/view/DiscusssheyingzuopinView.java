package com.entity.view;

import com.entity.DiscusssheyingzuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影作品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
@TableName("discusssheyingzuopin")
public class DiscusssheyingzuopinView  extends DiscusssheyingzuopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssheyingzuopinView(){
	}
 
 	public DiscusssheyingzuopinView(DiscusssheyingzuopinEntity discusssheyingzuopinEntity){
 	try {
			BeanUtils.copyProperties(this, discusssheyingzuopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
