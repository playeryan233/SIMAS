package com.simas.service.impl;

import com.simas.domain.po.School;
import com.simas.mapper.SchoolMapper;
import com.simas.service.ISchoolService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  院校库服务实现类，更新院校信息，更新院校排名
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

}
