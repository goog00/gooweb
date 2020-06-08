package com.gooweb.pattern.timegeek.factory;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @description 定义抽象的bean
 * @date 2020-06-04 4:41 下午
 **/
@Data
public class BeanDefinition {

    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;


    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public static enum Scope {SINGLETON, PROTOTYPE}
    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg; // 省略必要的getter/setter/constructors }


        public boolean isRef() {
            return isRef;
        }

        public void setRef(boolean ref) {
            isRef = ref;
        }

        public Class getType() {
            return type;
        }

        public void setType(Class type) {
            this.type = type;
        }

        public Object getArg() {
            return arg;
        }

        public void setArg(Object arg) {
            this.arg = arg;
        }
    }

}
