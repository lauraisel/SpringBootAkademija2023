package hr.kingict.springbootakademija2023.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PageSuffixAfterAspect {

    Logger logger = LoggerFactory.getLogger(PageSuffixAfterAspect.class);
    @After(value = "execution(* hr.kingict.springbootakademija2023.service.PageSuffixService.getSuffix())")
    private void afterPageSuffixServiceGetSuffix(JoinPoint joinPoint){
        String result = joinPoint.getTarget().getClass().getSimpleName();
        logger.info("afterPageSuffixServiceGetSuffix : " + result);
    }
}
