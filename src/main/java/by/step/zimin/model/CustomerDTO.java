package by.step.zimin.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                       //генерирует геттеры сеттеры иквалсе хещкод
@AllArgsConstructor
public class CustomerDTO {

    private  int id;
    private String name;
}
