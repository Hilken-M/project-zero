//package rest;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.startup.Tomcat;
//import org.glassfish.jersey.servlet.ServletContainer;
//
//import java.io.File;
//
//public class Application {
//    public static main(String[] args){
//        Tomcat tomcat= new Tomcat();
//        tomcat.setPort(8080);
//        Context context = tomcat.addWebapp("/api", new File('.').getAbsolutePath());
//        ServerletContainer servletContainer = new ServerletContainer(new RestConfig());
//        tomcat.addServlet("/api", "restConfig", servletContainer);
//    }
//}
