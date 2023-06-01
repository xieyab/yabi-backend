package com.yabo.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yabo.springbootinit.model.entity.Chart;
import com.yabo.springbootinit.service.ChartService;
import com.yabo.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 谢雅博
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-05-30 17:19:41
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




