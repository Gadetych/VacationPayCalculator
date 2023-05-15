package ru.gadetych.edu.java.colculator.service;

import org.springframework.stereotype.Service;
import ru.gadetych.edu.java.calculator.dto.request.AddSalaryRequest;
import ru.gadetych.edu.java.calculator.dto.response.SumResponse;

@Service
public class VacationPayCalculator {

    public SumResponse calculacte (AddSalaryRequest addSalaryRequest){
        int sum = addSalaryRequest.averageSalary()* addSalaryRequest.numberOfVacationDays();
        SumResponse sumResponse = new SumResponse(sum);
        return sumResponse;
    }
}
