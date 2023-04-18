package ru.web.repository;

import org.springframework.stereotype.Controller;
import ru.web.model.Contact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@Controller
public class ContactRepo {

    private HashMap<Integer, Contact> repo;
    public ContactRepo(){
        HashMap<Integer, Contact> contactMap = new HashMap<>();
        contactMap.put(1, Contact.builder()
                .id(1)
                .name("Elena")
                .lastName("Gorlanova")
                .email("via@via")
                .tel(1111111111L)
                .build());
        contactMap.put(2, Contact.builder()
                .id(2)
                .name("Elena")
                .lastName("Potapova")
                .email("tia@via")
                .tel(222222222222L)
                .build());
        contactMap.put(3, Contact.builder()
                .id(3)
                .name("Anna")
                .lastName("Sokolova")
                .email("lia@nia")
                .tel(33333333333L)
                .build());
        this.repo= contactMap;
    }
    public Contact getContactById(Integer id) {
        return repo.get(id);
    }

    public Collection<Contact> getAllContacts() {
        return repo.values();
    }


    public void saveContact(Contact contact) {
        repo.put((contact.getId()), contact);
    }
    public void edit (Contact contact){
        repo.put(contact.getId(), contact);
    }

    public void deleteContact(Integer id) {
        repo.remove(id);
    }
}
