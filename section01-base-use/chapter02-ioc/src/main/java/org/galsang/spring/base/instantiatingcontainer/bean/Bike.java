package org.galsang.spring.base.instantiatingcontainer.bean;

/**
 * Bike bean
 *
 * @author tengpeng.gao
 * @since 2018/8/28
 */
public class Bike {

    public Bike() {
    }

    public Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
