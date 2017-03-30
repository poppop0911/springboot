package com.zhicloud.mig.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lynn on 17/3/29.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String make;
    private String model;
    private int year;
    private Long id;
}
