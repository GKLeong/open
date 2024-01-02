package com.spyker.commons.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spyker.commons.entity.SysDept;
import com.spyker.commons.mapper.SysDeptMapper;
import com.spyker.commons.search.SysDeptSearch;
import com.spyker.commons.service.SysDeptService;
import com.spyker.framework.response.RestResponse;

import lombok.RequiredArgsConstructor;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author CodeGenerator
 * @since 2023-09-28
 */
@Service
@Transactional
@RequiredArgsConstructor
@CacheConfig(cacheNames = "SysDept")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

	private final SysDeptMapper sysDeptMapper;

	@Override
	public List<SysDept> query(SysDeptSearch search) {
		List<SysDept> result = sysDeptMapper.query(search);

		return result;
	}

	@Override
	public IPage<SysDept> queryPage(IPage<SysDept> page, SysDeptSearch search) {
		page = sysDeptMapper.queryPage(page, search);

		return page;
	}

	@Cacheable
	@Override
	public SysDept get(String id) {
		SysDept result = getById(id);

		return result;
	}

	@Override
	public RestResponse<?> insert(SysDept SysDept) {
		save(SysDept);

		return RestResponse.success(SysDept);
	}

	@Override
	public RestResponse<?> update(SysDept SysDept) {
		updateById(SysDept);

		return RestResponse.success();
	}

	@Override
	public RestResponse<?> delete(String id) {
		removeById(id);

		return RestResponse.success();
	}

}