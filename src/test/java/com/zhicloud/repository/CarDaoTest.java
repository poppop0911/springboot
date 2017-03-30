package com.zhicloud.repository;

import com.zhicloud.mig.BootApiApplication;
import com.zhicloud.mig.domain.Car;
import com.zhicloud.mig.repository.CarMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lynn on 17/3/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApiApplication.class)
public class CarDaoTest {
    @Autowired
    private CarMapper carMapper;

    @Test
    @Transactional
    public void findByOwnerId() {
        List<Car> carList = Arrays.asList(
                new Car("BMW", "x", 1984, null),
                new Car("Honda", "y", 1978, null),
                new Car("Infiniti", "z", 1967, null)
        );

        carList.forEach(car -> {
            carMapper.insert(car);
            System.out.println(car.toString());
        });

        System.out.println("-------");
        carMapper.selectAll().forEach(System.out::println);

        System.out.println("-------");
        carMapper.search("Honda", "x", 0).forEach(System.out::println);

        System.out.println("-------");
        carMapper.search("Infiniti", null, 0).forEach(System.out::println);


        System.out.println("-------");
        carMapper.search(null, null, 0).forEach(System.out::println);

        System.out.println(Car.builder().make("CarBuilder").model("12").year(1).build());


    }


}
