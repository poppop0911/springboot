package com.zhicloud.mig.dto;

import com.zhicloud.mig.domain.Car;
import io.swagger.annotations.ApiModel;

/**
 * Created by lynn on 17/3/29.
 */
@ApiModel
public class CarDisplayDto {

    private String make;
    private String model;
    private int year;
    private Long id;

    public CarDisplayDto() {
        // Intentionally empty.
    }

    public CarDisplayDto(Car car) {
        this.make = car.getMake();
        this.model = car.getMake();
    }

    public CarDisplayDto(String make, String model) {
        this.make = make;
        this.model = model;
    }


}
