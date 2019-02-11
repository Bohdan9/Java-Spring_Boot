package homework.demo2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    @Data
    @AllArgsConstructor
public class Car {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private  String car_make;
        private String model;
        private int price;

        private int date_release;

        public Car() {
        }

        public Car(String car_make, String model, int price, int date_release) {
            this.car_make = car_make;
            this.model = model;
            this.price = price;
            this.date_release = date_release;
        }

    }


