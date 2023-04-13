package ru.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.web.model.Contact;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HtmlController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allFilms() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("");
//        return modelAndView;
//    }
  @RequestMapping("/contacts")
  public String contactService(Model model) {
      List<Contact> contactList = new ArrayList<>();
      contactList.add(Contact.builder()
              .id(1L)
              .name("Elena")
              .lastName("Gorlanova")
              .email("via@via")
              .tel(1111111111L)
              .build());
      contactList.add(Contact.builder()
              .id(2L)
              .name("Elena")
              .lastName("Potapova")
              .email("tia@via")
              .tel(222222222222L)
              .build());
      contactList.add(Contact.builder()
              .id(2L)
              .name("Anna")
              .lastName("Sokolova")
              .email("lia@nia")
              .tel(33333333333L)
              .build());
      model.addAttribute("contactList", contactList);
      return "contactList";
  }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }
    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public ModelAndView contacts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contacts");
        return modelAndView;
    }
}
