package com.java.client;  
  
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;  
  
public class SpringUsersWsClient {  
  
    public static void main(String[] args) throws Exception {  
        // 调用WebService  
//        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
//        factory.setServiceClass(IUserService.class);  
//        factory.setAddress("http://localhost:8080/CXFWebService/Users");  
//  
//        IUserService service = (IUserService) factory.create();  
//  
//        System.out.println("#############Client getUserByName##############");  
//        User user = service.getUserByName("hoojo");  
//        System.out.println(user.getName());  
//  
//        user.setAddress("China-Guangzhou");  
//        service.setUser(user);  
    	
    	
		 JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();  
	        Client client = clientFactory.createClient("http://localhost:8080/CXFWebService/Users?wsdl");  
	        Object[] result = client.invoke("getUserByName","hoojo");  
	        System.out.println(ToStringBuilder.reflectionToString(result[0], ToStringStyle.SHORT_PREFIX_STYLE));  
    }  
}  