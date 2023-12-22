package com.spyker.commons.service;

import com.spyker.commons.entity.SysOssConfig;
import com.baomidou.mybatisplus.extension.service.IService;

import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import com.spyker.framework.response.RestResponse;

import com.spyker.commons.search.SysOssConfigSearch;

/**
 * <p>
 * 对象存储配置表 服务类
 * </p>
 *
 * @author CodeGenerator
 * @since 2023-12-21
 */
public interface SysOssConfigService extends IService<SysOssConfig> {

    List<SysOssConfig> query(SysOssConfigSearch search);

    IPage<SysOssConfig> queryPage(IPage<SysOssConfig> page, SysOssConfigSearch search);

    SysOssConfig get(String id);

    boolean insert(SysOssConfig SysOssConfig);

    boolean update(SysOssConfig SysOssConfig);

    boolean delete(String id);

}