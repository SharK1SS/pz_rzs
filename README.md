# gamestore

Backend інтернет-магазину відеоігор (самостійна робота до заняття 1.1).
Spring Boot 3.4.x · Java 21 · Maven.

## Запуск
```bash
./mvnd spring-boot:run      # або: mvnd spring-boot:run
```

## Ендпоінти
- `GET /api/games` — перелік (`GameCardDto`)
- `GET /api/games/{id}` — одна гра (`GameDetailDto`), 404 якщо немає

Приклади — у [requests.md](requests.md).

## Структура
```
com.ua.gamestore
├── domain       Game
├── repository   GameRepository, InMemoryGameRepository
├── service      GameService, GameServiceImpl, mapper/GameMapper
├── web          GameController, dto/GameCardDto, dto/GameDetailDto
├── config       GameSeeder
└── exception    GameNotFoundException
```
