package by.step.zimin.cervice;

import by.step.zimin.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id ,String name);
    CustomerDTO getCustomer(int id);
}
