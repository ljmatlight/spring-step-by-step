package org.galsang.spring.base.instantiatingcontainer;

import org.galsang.spring.base.instantiatingcontainer.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 注解元数据
 *
 * @author tengpeng.gao
 * @since 2018/8/28
 */
@Configuration // 相当于传统的 xml 配置文件
@ImportResource("beans.xml") // 相当于导入传统的 xml 配置文件
public class BeanConfig {

    @Bean
    public Bike bike() {
        Bike bike = new Bike("凤凰牌自行车");
        return bike;
    }

}
