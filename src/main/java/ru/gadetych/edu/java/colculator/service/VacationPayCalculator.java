package ru.gadetych.edu.java.colculator.service;

import org.springframework.stereotype.Service;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;

import java.time.LocalDate;
import java.time.Period;

@Service
public class VacationPayCalculator {

    public SumResponse calculacte(Double averageSalary, LocalDate date1, LocalDate date2, String result){
        Period period = Period.between(date1, date2);
        int numberOfVacationDays = period.getDays();
        double vacationPay = averageSalary/(12 * 29.3) * (double) (numberOfVacationDays - parser(result));
        SumResponse sumResponse = new SumResponse(vacationPay);
        return sumResponse;
    }

    private double parser(String result){
        String[] str = result.split("/");
        double notWorkingDay = 0;
        for (String s: str){
            if(s.equals("1")){
                notWorkingDay += 1;
            }
        }
        return notWorkingDay;
    }
}
