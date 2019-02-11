package homework.demo2.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
public class Diller {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int adress;
    @OneToMany
    private String model;

    public Diller() {
    }

    public Diller(String name, int adress, String model) {
        this.name = name;
        this.adress = adress;
        this.model = model;
    }
}
