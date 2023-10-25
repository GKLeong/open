package com.spyker.base.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spyker.base.BaseTest;
import com.spyker.base.entity.SysConfig;
import com.spyker.base.search.SysConfigSearch;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 参数配置表 服务类
 * </p>
 *
 * @author CodeGenerator
 * @since 2023-09-28
 */

@Slf4j
public class SysConfigServiceTest extends BaseTest {

    @Autowired
    private SysConfigService service;

    @Test
    public void get() {

        SysConfig result = service.getById("1");
    }

    @Test
    public void delete() {

        service.delete("1");
    }

    @Test
    public void add() {
        SysConfig add = new SysConfig();

        add.setConfigName("configName");

        add.setConfigKey("configKey");

        add.setConfigValue("configValue");

        add.setConfigType("1");

        add.setCreateBy("createBy");

        add.setUpdateBy("updateBy");

        add.setRemark("remark");

        service.insert(add);
    }

    @Test
    public void update() {
        SysConfig update = new SysConfig();

        update.setConfigId("configId");

        update.setConfigName("configName");

        update.setConfigKey("configKey");

        update.setConfigValue("configValue");

        update.setConfigType("configType");

        update.setCreateBy("createBy");

        update.setUpdateBy("updateBy");

        update.setRemark("remark");

        service.update(update);
    }

    @Test
    public void query() {
        SysConfigSearch search = new SysConfigSearch();

        search.setConfigName("configName");
        search.setConfigKey("configKey");
        search.setConfigValue("configValue");
        search.setConfigType("configType");
        search.setCreateBy("createBy");
        search.setUpdateBy("updateBy");
        search.setRemark("remark");

        service.query(search);
    }

    @Test
    public void queryPage() {
        IPage<SysConfig> page = new Page<>(1, 10);

        SysConfigSearch search = new SysConfigSearch();

        search.setConfigName("configName");

        search.setConfigKey("configKey");

        search.setConfigValue("configValue");

        search.setConfigType("configType");

        search.setCreateBy("createBy");

        search.setUpdateBy("updateBy");

        search.setRemark("remark");

        service.queryPage(page, search);
    }

}