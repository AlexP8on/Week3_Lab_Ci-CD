package ie.atu.week3_lab_cicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data

@AllArgsConstructor

public class Product {

    private String name;
    private String category;
    private int price;
    private int id;

}
