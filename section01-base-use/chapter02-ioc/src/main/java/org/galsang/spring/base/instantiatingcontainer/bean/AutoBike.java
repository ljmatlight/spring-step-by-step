package org.galsang.spring.base.instantiatingcontainer.bean;


/**
 * AutoBike bean
 *
 * @author tengpeng.gao
 * @since 2018/8/28
 */
public class AutoBike {

    public AutoBike() {
    }

    public AutoBike(String name) {
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
