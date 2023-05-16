package ru.gadetych.edu.java.colculator.controllers;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gadetych.edu.java.colculator.dto.request.AddSalaryRequest;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;
import ru.gadetych.edu.java.colculator.service.VacationPayCalculator;

@RestController
@AllArgsConstructor
public class ColculatorCntroller {
    private VacationPayCalculator vacationPayCalculator;

    @GetMapping("/calculacte")
    public SumResponse calculacte(@Valid @RequestBody AddSalaryRequest addSalaryRequest){
        return vacationPayCalculator.calculacte(addSalaryRequest);
    }
}
