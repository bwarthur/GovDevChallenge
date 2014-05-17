package servlet;

import javax.servlet.http.*;

import com.googlecode.objectify.ObjectifyService;

import entity.Test;

public class StartupServlet extends HttpServlet {
	static {
    	System.out.println("servlet.StartupServlet");
    	System.out.println("");

        System.out.println("ObjectifyService - registering entities:");

       //ObjectifyService.register(Test.class);
    	System.out.println("  Test.class");
   
    }
}
