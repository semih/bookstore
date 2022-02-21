package com.example.bookapp.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookOrderRequest {

    private List<Integer> bookIdList;
    private String userName;
}
