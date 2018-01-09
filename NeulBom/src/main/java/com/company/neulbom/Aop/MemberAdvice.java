package com.company.neulbom.Aop;

import java.util.Arrays;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MemberAdvice {


private static final  Logger logger =LoggerFactory.getLogger(MemberAdvice.class);
//@Before("execution(* com.company.smnb20.Service.BoardDao_S*.*(..))")
//

//public void startLog(JoinPoint jp){
//logger.info("Aop---------------------------------------------------------------------------------------------------------");
//
//logger.info("Aop---------------------------------------------------------------------------------------------------------");
//logger.info(Arrays.toString(jp.getArgs()));
//
//

@Around("execution(* com.company.neulbom.Service.Memb*.*(..))")

public Object timeLog(ProceedingJoinPoint pjp)throws Throwable{
	
	long startTime = System.currentTimeMillis();
	logger.info(Arrays.toString(pjp.getArgs()));
	
	Object result = pjp.proceed();	

	long endTime = System.currentTimeMillis();
	logger.info(pjp.getSignature().getName()+":"+(endTime-startTime));
	logger.info("================================================================");

return result;
}

	

	
	

}

