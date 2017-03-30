package com.zhicloud.mig.api;

import com.zhicloud.mig.domain.Car;
import com.zhicloud.mig.service.CarAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by lynn on 17/3/29.
 */
@RestController
@RequestMapping(value = "/cars")
public class CarAdminController {

    private CarAdminService carAdminService;

    @Autowired
    public CarAdminController(CarAdminService carAdminService) {
        this.carAdminService = carAdminService;
    }

    @ApiOperation(value = "Display car list.", tags = "cars")
    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public Collection<Car> list()  {
        return carAdminService.listCars();
    }




}
