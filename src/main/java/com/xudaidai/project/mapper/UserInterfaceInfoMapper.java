package com.xudaidai.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudaidai.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.xudaidai.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




