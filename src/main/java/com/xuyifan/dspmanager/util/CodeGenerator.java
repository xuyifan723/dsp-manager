package com.xuyifan.dspmanager.util;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Xu yifan
 * @Ddecription 待写
 * @date 2019/8/22 10:40
 * @Version 1.0
 */
public class CodeGenerator {

    private static  String configPath = "/src/main/resources/application-dev.properties";
    private static String[] tableName = new String[] {"user"};

    /**
     * 作者
     */
    private static String author;

    /**
     * 数据库
     */
    private static String url;
    private static String driverName;
    private static String userName;
    private static String password;

    private static String projectPath;

    /**
     * 代码生成的目录
     */
    private static String packageName;
    private static String outputPath;
    private static String mapperXmlPath;

    public static void main(String[] args) {

        /**
         * 初始化变量
         */
        initial();

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        gc.setOutputDir(projectPath + outputPath);
        //如果文件存在是否覆盖，覆盖有风险，最好不要覆盖
        gc.setFileOverride(false);
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(false);
        gc.setAuthor(author);
        gc.setOpen(false);

        //生成文件名:
        gc.setXmlName("%sMapper");
        gc.setMapperName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packageName);
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + mapperXmlPath + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();

        /**
         *设置表名前缀；
         *此表名前缀若与数据库表名前缀一致，则自动创建实体类时，实体类名匹配数据库表名下划线后面的名；
         *栗子：数据库表名为 admin_info ，当strategy.setTablePrefix("admin_")时，则实体类名为Info；
         *若不设置表名前缀，则实体类名匹配数据库表名
         */
        strategy.setTablePrefix(new String[] { "bus_", "com_", "res_"});

        /**
         * 需要生成代码的表的设置
         * 若不设置则会生成全表的代码
         */
        strategy.setInclude(tableName);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }


    public static void initial() {
        Properties prop = new Properties();
        try{

            /**
             * 因为使用聚合工程，所以多了一层文件夹
             */
            projectPath = System.getProperty("user.dir") ;

            //读取属性文件a.properties
            InputStream in = new BufferedInputStream(new FileInputStream(projectPath + configPath));
            ///加载属性列表
            prop.load(in);
            in.close();

            author = prop.getProperty("code.generator-author");
            url = prop.getProperty("spring.datasource.url");
            driverName = prop.getProperty("spring.datasource.driverClassName");
            userName = prop.getProperty("spring.datasource.username");
            password = prop.getProperty("spring.datasource.password");
            outputPath = prop.getProperty("code.generator-output-path");
            packageName = prop.getProperty("code.generator-package-name");
            mapperXmlPath = prop.getProperty("code.generator-mapper-xml-path");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
