package by.step.zimin.cervice.impl;

import by.step.zimin.cervice.CustomerService;
import by.step.zimin.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class CustomerServiceInMemoryImpl implements CustomerService {

    Map<Integer, CustomerDTO> persist = new HashMap<>(); //потом сюда можно добавить репозиторий к базе данных а мапу удалить

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}
