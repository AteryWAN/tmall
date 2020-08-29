package com.young.tmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.young.common.utils.PageUtils;
import com.young.tmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author young
 * @email 605968060@qq.com
 * @date 2020-08-24 15:13:34
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

