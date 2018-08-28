package org.galsang.spring.base.instantiatingcontainer;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试容器初始化
 *
 * @author tengpeng.gao
 * @since 2018/8/28
 */
public class IocContainerInitTest {

    @Test
    public void testAnnotationConfigImportXmlApplicationContext() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig
                .class);
        System.out.println("容器初始化完成");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        applicationContext.close();

    }

    @Test
    public void testXmlConfigApplicationContext() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化完成");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        applicationContext.close();

    }

    @Test
    public void testXmlBeanFactory() {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        System.out.println("容器初始化完成");
        String[] names = factory.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

}