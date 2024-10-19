package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssheyingzuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssheyingzuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssheyingzuopinView;


/**
 * 摄影作品评论表
 *
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
public interface DiscusssheyingzuopinService extends IService<DiscusssheyingzuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssheyingzuopinVO> selectListVO(Wrapper<DiscusssheyingzuopinEntity> wrapper);
   	
   	DiscusssheyingzuopinVO selectVO(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
   	
   	List<DiscusssheyingzuopinView> selectListView(Wrapper<DiscusssheyingzuopinEntity> wrapper);
   	
   	DiscusssheyingzuopinView selectView(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssheyingzuopinEntity> wrapper);
   	
}

