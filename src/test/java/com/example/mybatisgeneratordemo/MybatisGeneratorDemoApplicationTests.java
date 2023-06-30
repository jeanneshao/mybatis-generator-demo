package com.example.mybatisgeneratordemo;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
@SpringBootTest
class MybatisGeneratorDemoApplicationTests {

    @Test
    void contextLoads() {
    }
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder(
                    "jdbc:mysql://110.42.204.86:3306/low_code_configuration?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia%2FShanghai",
            "notebook",
            "123@Telenor")
            .schema("low_code")
            .build();
    //com.mysql.cj.jdbc.Driver
    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(strategyConfig().build());
        generator.global(globalConfig().build());
        generator.execute();
    }
    protected static StrategyConfig.Builder strategyConfig() {
        return new StrategyConfig.Builder();
    }
    /**
     * 全局配置
     */
    protected static GlobalConfig.Builder globalConfig() {
        return new GlobalConfig.Builder()
                .author("Jeanne")
                .outputDir("D:\\git\\unicom\\mybatis-generator-demo\\out")
                .enableSwagger();
    }

}
