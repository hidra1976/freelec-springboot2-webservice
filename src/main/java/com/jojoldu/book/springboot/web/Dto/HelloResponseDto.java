package com.jojoldu.book.springboot.web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private  final  int amount;


}
