package org.cuatrovientos.spring.battles.mikel;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MonitorWar {
	
	@Before("execution(* org.cuatrovientos.spring.battles.mikel.Battle.engage(*, *))")
	public void beforeEngage(JoinPoint joinPoint) {
		System.out.println("Arguments: " + joinPoint.getArgs()[0].toString() + " ||||| " + joinPoint.getArgs()[1].toString());
		
	}
	
	
	@AfterReturning(value = "execution(* org.cuatrovientos.spring.battles.mikel.Battle.engage(*, *))", returning="soldier")
	public void afterEngage(Soldier soldier) {
		System.out.println("Soldier returned: " + soldier.toString());
	}
	
}
