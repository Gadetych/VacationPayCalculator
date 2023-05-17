package ru.gadetych.edu.java.colculator.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.gadetych.edu.java.colculator.dto.response.SumResponse;
import ru.gadetych.edu.java.colculator.service.IsDayOffClient;
import ru.gadetych.edu.java.colculator.service.VacationPayCalculator;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
public class ColculatorCntroller {
    private VacationPayCalculator vacationPayCalculator;
    private IsDayOffClient isDayOffClient;

    @GetMapping(value = "/calculacte"
            , produces = {"application/json"})
    public SumResponse calculacte(Double averageSalary, LocalDate date1, LocalDate date2) {
        String result = isDayOffClient.getData(date1, date2);
        return vacationPayCalculator.calculacte(averageSalary, date1, date2, result);
    }

//    @GetMapping(value = "/getDate"
//            , produces = {"text/plain"})
//    public String getDate(LocalDate date1, LocalDate date2){
//        return isDayOffClient.getData(date1, date2);
//    }
}
