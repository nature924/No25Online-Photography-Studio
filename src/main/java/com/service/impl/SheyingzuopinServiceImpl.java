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


import com.dao.SheyingzuopinDao;
import com.entity.SheyingzuopinEntity;
import com.service.SheyingzuopinService;
import com.entity.vo.SheyingzuopinVO;
import com.entity.view.SheyingzuopinView;

@Service("sheyingzuopinService")
public class SheyingzuopinServiceImpl extends ServiceImpl<SheyingzuopinDao, SheyingzuopinEntity> implements SheyingzuopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingzuopinEntity> page = this.selectPage(
                new Query<SheyingzuopinEntity>(params).getPage(),
                new EntityWrapper<SheyingzuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingzuopinEntity> wrapper) {
		  Page<SheyingzuopinView> page =new Query<SheyingzuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingzuopinVO> selectListVO(Wrapper<SheyingzuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingzuopinVO selectVO(Wrapper<SheyingzuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingzuopinView> selectListView(Wrapper<SheyingzuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingzuopinView selectView(Wrapper<SheyingzuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
