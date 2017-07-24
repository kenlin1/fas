package com.founder.fas.secure.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//异常页面处理
@Controller  
public class MainsiteErrorController implements ErrorController {  
  
 private static final String ERROR_PATH = "/error";  
   
 @RequestMapping(value=ERROR_PATH)  
    public String handleError(){  
        return "login/error";  
    }  
   
 @Override  
 public String getErrorPath() {  
  // TODO Auto-generated method stub  
  return ERROR_PATH;  
 }  
}  