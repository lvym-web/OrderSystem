package com.lvym.api.controller;

import com.lvym.entiy.Menu;
import com.lvym.entiy.MenuVO;
import com.lvym.entiy.Type;
import com.lvym.repository.MenuRepository;
import com.lvym.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private TypeRepository typeRepository;





    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
       int count= menuRepository.count();
        System.out.println("yyyyyyyyyy"+count);
        return new  MenuVO(0,"",count,menuRepository.findAll(index,limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){

        menuRepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> types(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }
    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRepository.findById(id);
    }
    @PutMapping("/edit")
    public void edit(@RequestBody Menu menu){
        menuRepository.update(menu);
    }
}
