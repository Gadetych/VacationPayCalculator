package ru.gadetych.edu.java.colculator.service;

import org.springframework.stereotype.Service;
import ru.gadetych.edu.java.colculator.dto.request.AddSalaryRequest;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;

@Service
public class VacationPayCalculator {

    public SumResponse calculacte (AddSalaryRequest addSalaryRequest){
        int sum = addSalaryRequest.averageSalary()* addSalaryRequest.numberOfVacationDays();
        SumResponse sumResponse = new SumResponse(sum);
        return sumResponse;
    }
}
