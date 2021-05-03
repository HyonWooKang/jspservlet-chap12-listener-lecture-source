package com.greedy.section03.requestListener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestListenerTestServlet
 */
@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 시작할 때 init 후 replace가 1회 발생하는 부분은 Replace() 메소드에서 확인
		
		/* request에 attribute를 추가할 때 attributeAdded() 메소드가 동작 */
		request.setAttribute("username", "honggildong");
		request.setAttribute("age", 20);
		request.setAttribute("gender", "M");
		
		/* request에 attribute를 동일한 key로 덮어쓴느 경우(value)수정 attributeReplaced() 메소드가 동작한다. */
		request.setAttribute("username", "hong");
		
		/* request에 attribute를 제거할 때 attributeRemove()가 동작하게 된다. */
		request.removeAttribute("gender");
	}

}
