package com.amu.gulimall.member.dao;

import com.amu.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author amu
 * @email mujinmj@gmail.com
 * @date 2022-06-13 22:07:23
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

    MemberLevelEntity getDefaultLevel();
}
