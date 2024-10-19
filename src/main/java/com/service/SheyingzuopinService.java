package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingzuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingzuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingzuopinView;


/**
 * 摄影作品
 *
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
public interface SheyingzuopinService extends IService<SheyingzuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingzuopinVO> selectListVO(Wrapper<SheyingzuopinEntity> wrapper);
   	
   	SheyingzuopinVO selectVO(@Param("ew") Wrapper<SheyingzuopinEntity> wrapper);
   	
   	List<SheyingzuopinView> selectListView(Wrapper<SheyingzuopinEntity> wrapper);
   	
   	SheyingzuopinView selectView(@Param("ew") Wrapper<SheyingzuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingzuopinEntity> wrapper);
   	
}

