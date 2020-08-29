package com.young.tmall.member.dao;

import com.young.tmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author young
 * @email 605968060@qq.com
 * @date 2020-08-24 15:13:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
