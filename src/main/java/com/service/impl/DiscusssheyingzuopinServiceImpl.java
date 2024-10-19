package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusssheyingzuopinDao;
import com.entity.DiscusssheyingzuopinEntity;
import com.service.DiscusssheyingzuopinService;
import com.entity.vo.DiscusssheyingzuopinVO;
import com.entity.view.DiscusssheyingzuopinView;

@Service("discusssheyingzuopinService")
public class DiscusssheyingzuopinServiceImpl extends ServiceImpl<DiscusssheyingzuopinDao, DiscusssheyingzuopinEntity> implements DiscusssheyingzuopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssheyingzuopinEntity> page = this.selectPage(
                new Query<DiscusssheyingzuopinEntity>(params).getPage(),
                new EntityWrapper<DiscusssheyingzuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssheyingzuopinEntity> wrapper) {
		  Page<DiscusssheyingzuopinView> page =new Query<DiscusssheyingzuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssheyingzuopinVO> selectListVO(Wrapper<DiscusssheyingzuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssheyingzuopinVO selectVO(Wrapper<DiscusssheyingzuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssheyingzuopinView> selectListView(Wrapper<DiscusssheyingzuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssheyingzuopinView selectView(Wrapper<DiscusssheyingzuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
