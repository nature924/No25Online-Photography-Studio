package com.dao;

import com.entity.DiscusssheyingzuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssheyingzuopinVO;
import com.entity.view.DiscusssheyingzuopinView;


/**
 * 摄影作品评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
public interface DiscusssheyingzuopinDao extends BaseMapper<DiscusssheyingzuopinEntity> {
	
	List<DiscusssheyingzuopinVO> selectListVO(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
	
	DiscusssheyingzuopinVO selectVO(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
	
	List<DiscusssheyingzuopinView> selectListView(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);

	List<DiscusssheyingzuopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
	
	DiscusssheyingzuopinView selectView(@Param("ew") Wrapper<DiscusssheyingzuopinEntity> wrapper);
	
}
