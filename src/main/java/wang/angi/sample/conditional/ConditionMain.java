package wang.angi.sample.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by angi on 17-9-26.
 */
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ctx.registerShutdownHook();
        ListService listService = ctx.getBean(ListService.class);
        System.out.println(ctx.getEnvironment().getProperty("os.name") + "操作系统下的列表命令为：" + listService.showListCmd());
    }
}
