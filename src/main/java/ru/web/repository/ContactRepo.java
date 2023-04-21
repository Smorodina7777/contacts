package ru.web.repository;

import org.springframework.stereotype.Controller;
import ru.web.model.Contact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class ContactRepo {

    private HashMap<Integer, Contact> repo;
    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);
    public ContactRepo(){
        HashMap<Integer, Contact> contactMap = new HashMap<>();
        contactMap.put(AUTO_ID.getAndIncrement(), Contact.builder()
                .id(1)
                .name("Elena")
                .lastName("Gorlanova")
                .email("via@via")
                .tel(1111111111L)
                .build());
        contactMap.put(AUTO_ID.getAndIncrement(), Contact.builder()
                .id(2)
                .name("Elena")
                .lastName("Potapova")
                .email("tia@via")
                .tel(222222222222L)
                .build());
        contactMap.put(AUTO_ID.getAndIncrement(), Contact.builder()
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
contact.setId(AUTO_ID.getAndIncrement());
        repo.put((contact.getId()), contact);
    }
    public void edit (Contact contact){
        repo.put(contact.getId(), contact);
    }

    public void deleteContact(Integer id) {
        repo.remove(id);
    }
}
