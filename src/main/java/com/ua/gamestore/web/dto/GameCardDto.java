package com.ua.gamestore.web.dto;

import java.math.BigDecimal;

/** DTO для переліку ігор (мінімум полів). */
public record GameCardDto(Long id, String title, String developer,
                          BigDecimal price, String coverUrl) {
}
