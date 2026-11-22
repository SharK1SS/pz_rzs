package com.ua.gamestore.config;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.repository.GameRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/** Початкове наповнення сховища, поки немає POST-ендпоінта. */
@Component
public class GameSeeder implements ApplicationRunner {

    private final GameRepository repository;

    public GameSeeder(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Game(null, "The Witcher 3: Wild Hunt", "CD Projekt RED",
                new BigDecimal("599.00"), 2015, "/covers/witcher3.jpg",
                "Рольова гра з відкритим світом: мисливець на монстрів Геральт шукає прийомну доньку.",
                "RPG"));
        repository.save(new Game(null, "Stardew Valley", "ConcernedApe",
                new BigDecimal("249.00"), 2016, "/covers/stardew-valley.jpg",
                "Симулятор ферми: обробляйте землю, розводьте тварин, знайомтеся з мешканцями містечка.",
                "Симулятор"));
        repository.save(new Game(null, "Hades", "Supergiant Games",
                new BigDecimal("399.00"), 2020, "/covers/hades.jpg",
                "Динамічний roguelike: вирвіться з підземного царства, щоразу ставши сильнішим.",
                "Roguelike"));
        repository.save(new Game(null, "Factorio", "Wube Software",
                new BigDecimal("450.00"), 2020, "/covers/factorio.jpg",
                "Побудуйте та автоматизуйте виробництво, оптимізуючи логістику та ресурси.",
                "Стратегія"));
        repository.save(new Game(null, "Portal 2", "Valve",
                new BigDecimal("199.00"), 2011, "/covers/portal2.jpg",
                "Головоломка від першої особи з портальною гарматою та кооперативним режимом.",
                "Головоломка"));
    }
}
