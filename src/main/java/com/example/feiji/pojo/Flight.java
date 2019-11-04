package com.example.feiji.pojo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight implements Serializable {
    private Integer id;
    private String flightNO;
    private Integer departureCity;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date departureTime;
    private Integer arrivalCity;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date arrivalTime;
}
