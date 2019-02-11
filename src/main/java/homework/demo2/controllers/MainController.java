package homework.demo2.controllers;


import homework.demo2.dao.CarDao;
import homework.demo2.models.Car;
import homework.demo2.models.Diller;
import homework.demo2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Controller
public class MainController {





    @Autowired
    CarService carService;

    @Autowired
    CarDao carDao;

    @GetMapping("/")
    public String mainPage(Model model) {


        List<Car> car = carService.findAll();
        model.addAttribute("car", car);


        return "index";

    }





    /*@GetMapping("/")
    public String mainPage() {

        return "index";
    }*/


   /* @PostMapping("/deliver/create/")
    public String saveDeliver(
            @RequestParam String deliver
    ){
        Diller diller = new Diller();


    }*/

    @PostMapping("/car/create")
    public  String saveProduct(
            @RequestParam String car_make,
            @RequestParam String model,
            @RequestParam int price,
            @RequestParam int date_release

    ){


        Car car1 = new Car(car_make, model,price,date_release);
        carService.save(car1);
        return "redirect:/";



    }

    @GetMapping("/homework")
            public String Homework()
    {



        return "homework";
    }
    @GetMapping("/homework/all")
    public String showAll(Model model) {
        List<Car> all = carService.findAll();
        model.addAttribute("all", all);
        return "homework";
    }



    @GetMapping("/homework/morethen")
    public String showMore1000(Model model){

        List<Car> all = carDao.queryCarsByPriceIsGreaterThanEqual(10000) ;
        model.addAttribute("all",all);

        return "homework";

    }
    @GetMapping("/homework/morethen2")
    public String showMore2000(Model model){

        List<Car> all = carDao.queryCarsByPriceIsGreaterThanEqual(2000) ;
        model.addAttribute("all",all);

        return "homework";

    }



    @GetMapping("/homework/last10")
    public String last(Model model){

        List<Car> all = carDao.findFirst10ByOrderByIdDesc();
        model.addAttribute("all",all);

        return "homework";
    }

    @GetMapping("/cars/{id}")
    public String getCar(
            @PathVariable int id,
            Model model
    ){
        Optional<Car> carOptional = carService.findById(id);
        Car car = carOptional.get();
        model.addAttribute("car", car);
        return "car";
    }


    @GetMapping("/cars/delete/{id}")

    public String deleteCar(
            @PathVariable int id

    ){
        carService.delete(id);
        return "redirect:/";
    }

}







