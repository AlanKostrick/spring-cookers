package org.wecancodeit.spring.kitchen;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@Resource
	private Collection<Cooker> cookers;
	
	
    @RequestMapping("/showCookers")
    public String showCookers(Model model) {
        model.addAttribute("cookers", cookers);
        return "cookers";
    }
    

}