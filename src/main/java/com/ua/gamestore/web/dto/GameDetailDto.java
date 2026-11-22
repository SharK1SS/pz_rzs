package com.ua.gamestore.web.dto;

import java.math.BigDecimal;

/** DTO для сторінки гри (повний набір полів). */
public record GameDetailDto(Long id, String title, String developer, BigDecimal price,
                            Integer releaseYear, String coverUrl, String description, String genre) {
}
