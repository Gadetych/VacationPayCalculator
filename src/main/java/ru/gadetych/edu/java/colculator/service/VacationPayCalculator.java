package ru.gadetych.edu.java.colculator.service;

import org.springframework.stereotype.Service;
import ru.gadetych.edu.java.colculator.dto.request.AddSalaryRequest;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;

@Service
public class VacationPayCalculator {

    public SumResponse calculacte (AddSalaryRequest addSalaryRequest){
        double sum = addSalaryRequest.averageSalary() * 29.3 * addSalaryRequest.numberOfVacationDays()/12;
        SumResponse sumResponse = new SumResponse(sum);
        return sumResponse;
    }
}
