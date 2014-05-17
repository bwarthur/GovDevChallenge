package servlet;

import javax.servlet.http.*;

public class StartupServlet extends HttpServlet {
	static {
    	System.out.println("servlet.StartupServlet");
    	System.out.println("");
    	
    	System.out.println("ObjectifyService - registering translators:");

//    	ObjectifyService.factory().getTranslators().add(new BigDecimalLongTranslatorFactory(10000));
//
//    	System.out.println("  BigDecimalLongTranslatorFactory(10000)");
//    	
//    	System.out.println("");
//
//    	
//        System.out.println("ObjectifyService - registering entities:");
//
//        ObjectifyService.register(EgiUser.class);
//    	System.out.println("  EgiUser.class");
   
    }
}
