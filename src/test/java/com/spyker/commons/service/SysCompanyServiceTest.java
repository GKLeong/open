package com.spyker.commons.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spyker.BaseTest;
import com.spyker.commons.entity.SysCompany;
import com.spyker.commons.search.SysCompanySearch;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 部门表 服务类
 *
 * @author CodeGenerator
 * @since 2023-12-25
 */
@Slf4j
public class SysCompanyServiceTest extends BaseTest {

    @Autowired private SysCompanyService service;

    @Test
    public void get() {

        SysCompany result = service.getById("1");
        log.info("result------>{}", result);
    }

    @Test
    public void delete() {

        service.delete("1");
    }

    @Test
    public void add() {
        SysCompany add = new SysCompany();

        add.setCompanyName("companyName");

        add.setOrderNum(1);

        add.setStatus("status");

        add.setDelFlag("delFlag");

        add.setCreateBy("createBy");

        add.setUpdateBy("updateBy");

        log.info("add------>{}", add);

        service.insert(add);
    }

    @Test
    public void update() {
        SysCompany update = new SysCompany();

        update.setId("id");

        update.setCompanyName("companyName");
        update.setOrderNum(1);

        update.setStatus("status");

        update.setDelFlag("delFlag");

        update.setCreateBy("createBy");

        update.setUpdateBy("updateBy");

        log.info("update------>{}", update);

        service.update(update);
    }

    @Test
    public void query() {
        SysCompanySearch search = new SysCompanySearch();

        search.setCompanyName("companyName");

        search.setStatus("status");

        search.setDelFlag("delFlag");

        service.query(search);
    }

    @Test
    public void queryPage() {
        IPage<SysCompany> page = new Page<>(1, 10);

        SysCompanySearch search = new SysCompanySearch();

        search.setCompanyName("companyName");

        search.setStatus("status");

        search.setDelFlag("delFlag");

        service.queryPage(page, search);
    }
}