package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.model.CustomerType;
import com.example.furama.service.CustomerService;
import com.example.furama.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerTypeController {
    @Autowired
    private CustomerTypeService customerTypeService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customertypes")
    public ModelAndView listCustomerTypes(){
        Iterable<CustomerType> customertypes = customerTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customertype/list");
        modelAndView.addObject("customertypes", customertypes);
        return modelAndView;
    }

    @GetMapping("/create-customertype")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/customertype/create");
        modelAndView.addObject("customertype", new CustomerType());
        return modelAndView;
    }

    @PostMapping("/create-customertype")
    public ModelAndView saveCustomerType(@ModelAttribute("customertype") CustomerType customertype){
        customerTypeService.save(customertype);

        ModelAndView modelAndView = new ModelAndView("/customertype/create");
        modelAndView.addObject("customertype", new CustomerType());
        modelAndView.addObject("message", "New customertype created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-customertype/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        CustomerType customertype = customerTypeService.findById(id);
        if(customertype != null) {
            ModelAndView modelAndView = new ModelAndView("/customertype/edit");
            modelAndView.addObject("customertype", customertype);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customertype")
    public ModelAndView updateCustomerType(@ModelAttribute("customertype") CustomerType customertype){
        customerTypeService.save(customertype);
        ModelAndView modelAndView = new ModelAndView("/customertype/edit");
        modelAndView.addObject("customertype", customertype);
        modelAndView.addObject("message", "CustomerType updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customertype/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        CustomerType customertype = customerTypeService.findById(id);
        if(customertype != null) {
            ModelAndView modelAndView = new ModelAndView("/customertype/delete");
            modelAndView.addObject("customertype", customertype);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customertype")
    public String deleteCustomerType(@ModelAttribute("customertype") CustomerType customertype){
        customerTypeService.remove(customertype.getCustomertypeId());
        return "redirect:customertypes";
    }

    @GetMapping("/view-customertype/{id}")
    public ModelAndView viewCustomerType(@PathVariable("id") Long id){
        CustomerType customertype = customerTypeService.findById(id);
        if(customertype == null){
            return new ModelAndView("/error.404");
        }

        Iterable<Customer> customers = customerService.findAllByCustomerType(customertype);

        ModelAndView modelAndView = new ModelAndView("/customertype/view");
        modelAndView.addObject("customertype", customertype);
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
