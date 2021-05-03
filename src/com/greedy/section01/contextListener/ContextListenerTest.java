package com.greedy.section01.contextListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ContextListenerTest
 *
 */
@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

	/*
	 * 리스너는 특정 이벤트 행위가 동작하는 경우 컨테이너에 의해 호출되는 메소드들을 인터페이스에 정의해두었다.
	 * 이를 상속받아 구현한 메소드가 특정 이벤트가 발생한 경우 필요한 로직을 작성하게 된다.
	 * 
	 * 1. Context
	 *  1-1. ServletContextListener : 웹 어플리케이션의 시작, 종료에 대한 이벤트 리스너
	 *  1-2. ServletContextAttributeListener : context에 attribute 추가, 제거, 수정에 대한 이벤트 리스너
	 * 
	 * 2. session
	 * 	2-1. HttpSessionListener : Http세션의 시작, 종료에 대한 이벤트 리스너
	 *  2-2. HttpSessionAttributeListener : HttpSeesion에 attribute 추가, 제거, 수정에 대한 이벤트 리스너
	 * 
	 * 3. request
	 *  3-1. HttpSessionListener : ServletRequest 생성과 소멸에 대한 이벤트 리스너
	 *  3-2. ServletRequestAttributeListener : ServletRequest에 attribute를 추가, 제거, 수정하는 것에 대한 이벤트 리스너
	 */
	
	// Listener를 이용하여 내부적인 처리 관리 등을 할 수 있다! (프로젝트 후반에 적용 가능)
	
    /*
     * Default constructor.
     * context(tomcat) 시작 시 동작하는 메소드 
     */
    public ContextListenerTest() {
        /* 해당 conext가 생성될 때 변화를 감지하는 Listener 인스턴스가 함께 생성 */
    	System.out.println("context Listener 인스턴스 생성");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     * attribute가 되면 동작하면 메소드
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         /* 해당  context에 attribute가 추가될 때 동작한다. */
    	System.out.println("context attribute added!!");
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	/* context에 attribute가 제거될 때 동작 */
    	System.out.println("context attribute removed!!");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         /* context가 소멸될때 동작 */
    	System.out.println("context destroy!!");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	/* context에 attribute가 변경될 때 동작 */
    	System.out.println("context attribute replaced!!");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	/* context가 최초 생성될 때 호출 이후 동작하는 메소드 */
    	System.out.println("context init!!");
    }
	
}
