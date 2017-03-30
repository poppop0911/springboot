package com.zhicloud.mig.service;


import com.zhicloud.mig.domain.Car;
import com.zhicloud.mig.repository.CarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CarAdminService {

	private static Logger logger = LoggerFactory.getLogger(CarAdminService.class);

	@Autowired
	private CarMapper carMapper;


	@Transactional
	public void addCar(Car car) {
		carMapper.insert(car);
	}

	@Transactional
	public Collection<Car> listCars() {
		return carMapper.selectAll();
	}


}
