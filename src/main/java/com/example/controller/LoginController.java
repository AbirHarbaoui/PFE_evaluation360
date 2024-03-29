package com.example.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Login;
import com.example.service.LoginService;
 

 
@Controller
public class LoginController {
@Autowired
    private LoginService logService;


      
@GetMapping("/oublie")
public String oublie() {
	return"motdepasseoublie" ;
}

	@GetMapping("/acc")
	public String acc() {
		return"acceuil" ;
	}
	
	@GetMapping("/modifempl")
	public String modifempl() {
		return "modifieremploye" ;
	}

	
	
    @GetMapping("/login")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user ) {
    	Login oauthUser = logService.login(user.getEmail(), user.getPassword());
        
    	 
        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser))
        {
     
        return "redirect:/acc";
       
       
        } else {
        return "redirect:/login";
       
       
        }
    
   }
       
       @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
       public String logoutDo(HttpServletRequest request,HttpServletResponse response)
       {
       
     
           return "redirect:/login";
       }
    
   }