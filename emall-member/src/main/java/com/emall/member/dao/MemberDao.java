package com.emall.member.dao;

import com.emall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jayden
 * @email jimnywen@gmail.com
 * @date 2021-01-05 19:18:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
