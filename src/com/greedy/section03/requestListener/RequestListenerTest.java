package com.greedy.section03.requestListener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestListenerTest
 *
 */
@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public RequestListenerTest() {

    	/* context가 로드될 때 생성자 호출하여 인스턴스 생성 */
    	System.out.println("request listener 인스턴스 생성");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 

    	/* request가 소멸될 때 호출 */
    	System.out.println("request destroyed!!");
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 

    	/* request에 attribute가 제거될 때 동작 */
    	System.out.println("request attribute removed!!");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 

    	/* request가 생성될 때 호출 */
    	System.out.println("request init!!");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	
    	/* request에 attribute가 추가될 때 호출 */
    	System.out.println("reqeuet attribute added!!");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 

    	/* request에 attribute가 변경(갱신)될 때 호출
    	 * (시작 시) org.apache.catalina.ASYNC_SUPPORTED라는 attribute가 자동 수정되기 때문에 한 번은 호출된다.
    	 * => 내부적인 sync를 맞춰주는 과정이다.
    	 */
    	System.out.println("request attribute replaced");
    	
    }
	
}
