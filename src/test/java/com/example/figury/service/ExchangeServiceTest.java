package com.example.figury.service;

import com.example.figury.domain.Result;
import com.example.figury.repository.ExchangeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExchangeServiceTest {

    @Mock
    private ExchangeRepository exchangeRepository;

    @InjectMocks
    private ExchangeService exchangeService;

    @Test
    public void shouldReturnFalse() {
        assert !exchangeService.isExchangeValid("TESTOWA");
        assert !exchangeService.isExchangeValid("FAIL");
        assert !exchangeService.isExchangeValid("VALID");
    }

    @Test
    public void shouldSave() {
        Result result1 = new Result(1, "USD", "PLN", 100.0, 420.0);

        when(exchangeRepository.findById(anyInt())).thenReturn(Optional.of(result1));

        Optional<Result> result2 = exchangeRepository.findById(1);
        assertEquals(result1.getFrom(), result2.get().getFrom());
        assertEquals(result1.getTo(), result2.get().getTo());
        assertEquals(result1.getAmount(), result2.get().getAmount());
    }
}