package ru.gadetych.edu.java.colculator.service;

import org.springframework.stereotype.Service;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;

@Service
public class VacationPayCalculator {

    public SumResponse calculacte(Double averageSalary, Double numberOfVacationDays){
        double vacationPay = averageSalary/(12 * 29.3) * numberOfVacationDays;
        SumResponse sumResponse = new SumResponse(vacationPay);
        return sumResponse;
    }
}
