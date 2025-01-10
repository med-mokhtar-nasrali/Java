package com.hopperreceipt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hoppers {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Mokhtar";
        String itemName = "Computer";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds. to just test";
        String vendor = "Little Things Corner Store , test";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name",name);
        model.addAttribute("itemName",itemName);
        model.addAttribute("description",description);
        model.addAttribute("price",price);
        model.addAttribute("vendor",vendor);
        
    
        return "index.jsp";
    }
    //...
    

}
