package com.lvym.api.controller;

import com.lvym.entiy.Menu;
import com.lvym.entiy.MenuVO;
import com.lvym.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuFeign menuFeign;


    /**
     *
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){

        return menuFeign.findAll((page-1)*limit,limit);
    }
    @GetMapping("/deleteById/{id}")
    public String deletebyId(@PathVariable("id") long id){
        menuFeign.deleteById(id);
        return "redirect:/menu/redirect/menu_manage";
    }
    @GetMapping("/findTypes")
    public ModelAndView findTypes(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("menu_add");
        modelAndView.addObject("list",menuFeign.types());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/menu_manage";
    }
    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") long id, Model model){
        Menu byId = menuFeign.findById(id);
         model.addAttribute("menu",byId);
        model.addAttribute("list",menuFeign.types());
        return "menu_update";

    }

    @PostMapping("/update")
    public String edit(Menu menu){
        menuFeign.edit(menu);
        return "redirect:/menu/redirect/menu_manage";
    }
    /**
     *
     * @param location
     * @return
     */
    @GetMapping("/redirect/{location}")
    public String index(@PathVariable("location") String location){
        return location;
    }
}
