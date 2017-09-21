package com.java.service;  
  
import javax.jws.WebParam;  
import javax.jws.WebService;  
import javax.jws.soap.SOAPBinding;  
import javax.jws.soap.SOAPBinding.Style;  
  
import com.java.entity.User;  
  
/** 
 * <b>function:</b>定制客户端请求WebService所需要的接口 
 */  
@WebService  
@SOAPBinding(style = Style.RPC)  
public interface IUserService {  
    public User getUserByName(@WebParam(name = "name") String name);  
  
    public void setUser(User user);  
}  