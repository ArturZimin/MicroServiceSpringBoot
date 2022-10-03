package by.step.zimin.controller;

import by.step.zimin.cervice.CustomerService;
import by.step.zimin.model.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController//содержит @ResponseBody and @Controller
@AllArgsConstructor //вместо @Autowired через конструктор тоже создадутся бины
public class CustomerController {//обрабатывает запросы которые приходят

    private CustomerService customerService;// инжектим наш интерфейс

    @PostMapping//method init при инициализации бина
    public void addCustomer(@RequestParam int id, @RequestParam String name) {
        customerService.addCustomer(id, name);

    }

    @GetMapping
    public CustomerDTO getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }

}
