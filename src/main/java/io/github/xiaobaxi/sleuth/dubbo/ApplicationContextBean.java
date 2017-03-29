package io.github.xiaobaxi.sleuth.dubbo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author fangzhibin
 */
public class ApplicationContextBean implements ApplicationContextAware {
    private static ApplicationContext context = null;

    /**
     * 实现ApplicationContextAware接口的context注入函数, 将其存入静态变量
     */
    public void setApplicationContext(org.springframework.context.ApplicationContext context) {
        ApplicationContextBean.setContext(context);
    }

    /**
     * 取得存储在静态变量中的ApplicationContext.
     */
    public static ApplicationContext getContext() {
        if (context == null)
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义AppContext");
        return context;
    }
    /**
     * 存储静态变量中的ApplicationContext.
     */
    public static void setContext(org.springframework.context.ApplicationContext context) {
        ApplicationContextBean.context = context;
    }
    /**
     * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        if (context == null)
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义AppContext");
        try {
            return (T) context.getBean(name);
        } catch (BeansException e) {
            e.printStackTrace();
        }
        return (T) null;
    }
}