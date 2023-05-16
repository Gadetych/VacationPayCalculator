package ru.gadetych.edu.java.colculator.dto.request;

import jakarta.validation.constraints.NotNull;


public record AddSalaryRequest(@NotNull double averageSalary
        , @NotNull double numberOfVacationDays) {
}
