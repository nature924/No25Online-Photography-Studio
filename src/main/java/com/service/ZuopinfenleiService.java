package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinfenleiView;


/**
 * 作品分类
 *
 * @author 
 * @email 
 * @date 2021-05-06 10:41:03
 */
public interface ZuopinfenleiService extends IService<ZuopinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopinfenleiVO> selectListVO(Wrapper<ZuopinfenleiEntity> wrapper);
   	
   	ZuopinfenleiVO selectVO(@Param("ew") Wrapper<ZuopinfenleiEntity> wrapper);
   	
   	List<ZuopinfenleiView> selectListView(Wrapper<ZuopinfenleiEntity> wrapper);
   	
   	ZuopinfenleiView selectView(@Param("ew") Wrapper<ZuopinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopinfenleiEntity> wrapper);
   	
}

