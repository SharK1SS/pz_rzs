package com.ua.gamestore.config;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.repository.GameRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GameSeeder implements ApplicationRunner {

    private final GameRepository repository;

    public GameSeeder(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Game(null, "Iratus: Lord of the Dead", "Unfrozen",
                new BigDecimal("349.00"), 2020, "/covers/iratus.jpg",
                "Тактична рольова гра: некромант Іратус збирає армію нежиті та веде її проти хрестоносців.",
                "Тактична RPG"));
        repository.save(new Game(null, "Factorio", "Wube Software",
                new BigDecimal("450.00"), 2020, "/covers/factorio.jpg",
                "Побудуйте та автоматизуйте виробництво, оптимізуючи логістику та ресурси.",
                "Автоматизація"));
        repository.save(new Game(null, "Into the Breach", "Subset Games",
                new BigDecimal("299.00"), 2018, "/covers/into-the-breach.jpg",
                "Покрокова тактика на крихітних картах: захищайте міста від прибульців, плануючи кожен хід.",
                "Тактика"));
        repository.save(new Game(null, "Slay the Spire", "Mega Crit Games",
                new BigDecimal("349.00"), 2019, "/covers/slay-the-spire.jpg",
                "Roguelike з побудовою колоди: підіймайтеся на вежу, комбінуючи карти та реліквії.",
                "Roguelike"));
        repository.save(new Game(null, "Opus Magnum", "Zachtronics",
                new BigDecimal("279.00"), 2017, "/covers/opus-magnum.jpg",
                "Головоломка про алхімічні машини: проєктуйте механізми, оптимізуючи вартість і швидкість.",
                "Головоломка"));
    }
}