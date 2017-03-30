package com.zhicloud.mig.repository;

import com.zhicloud.mig.domain.Car;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * Created by lynn on 17/3/29.
 */
@Mapper
public interface CarMapper {

    @Options(useGeneratedKeys = true)
    @Insert("insert into car(make,model,year) values (#{make},#{model},#{year})")
    void insert(Car car);

    @Delete("delete from car where id = #{id}")
    void deleteById(long id);


    @Select("select * from CAR")
    Collection<Car> selectAll();

    Collection<Car> search(@Param("make") String make,
                           @Param("model") String model,
                           @Param("year") int year);
}

