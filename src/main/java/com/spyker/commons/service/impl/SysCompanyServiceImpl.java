package com.spyker.commons.service.impl;

import com.spyker.commons.entity.SysCompany;
import com.spyker.commons.mapper.SysCompanyMapper;
import com.spyker.commons.service.SysCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.ArrayList;

import com.spyker.commons.search.SysCompanySearch;
import lombok.RequiredArgsConstructor;

import com.spyker.framework.response.RestResponse;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author CodeGenerator
 * @since 2023-12-25
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class SysCompanyServiceImpl extends ServiceImpl<SysCompanyMapper, SysCompany> implements SysCompanyService {

	private final SysCompanyMapper sysCompanyMapper;

	@Override
	public List<SysCompany> query(SysCompanySearch search) {

		List<SysCompany> result = sysCompanyMapper.query(search);
		log.info("result------>{}", result);

		return result;
	}

	@Override
	public IPage<SysCompany> queryPage(IPage<SysCompany> page, SysCompanySearch search) {

		page = sysCompanyMapper.queryPage(page, search);
		log.info("page------>{}", page);

		return page;
	}

	@Override
	public SysCompany get(String id) {
		SysCompany result = getById(id);
		return result;
	}

	@Override
	public boolean insert(SysCompany SysCompany) {
		return save(SysCompany);
	}

	@Override
	public boolean update(SysCompany SysCompany) {
		return updateById(SysCompany);
	}

	@Override
	public boolean delete(String id) {
		return removeById(id);
	}

}