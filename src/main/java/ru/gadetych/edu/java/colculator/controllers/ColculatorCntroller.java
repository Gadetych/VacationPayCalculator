package ru.gadetych.edu.java.colculator.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;
import ru.gadetych.edu.java.colculator.service.VacationPayCalculator;

@RestController
@AllArgsConstructor
public class ColculatorCntroller {
    private VacationPayCalculator vacationPayCalculator;

    @GetMapping(value = "/calculacte"
            , produces = {"application/json"})
    public SumResponse calculacte(Double averageSalary, Double numberOfVacationDays){
        return vacationPayCalculator.calculacte(averageSalary, numberOfVacationDays);
    }

}
