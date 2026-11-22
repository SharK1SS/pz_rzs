# Приклади запитів (curl)

Запустіть застосунок (`GamestoreApplication`), за замовчуванням порт 8080.

## Перелік ігор (картки)
```bash
curl http://localhost:8080/api/games
```
Очікувано: `200 OK`, масив карток `{id, title, developer, price, coverUrl}`.

## Одна гра з деталями
```bash
curl http://localhost:8080/api/games/1
```
Очікувано: `200 OK`, об'єкт `{id, title, developer, price, releaseYear, coverUrl, description, genre}`.

## Неіснуюча гра
```bash
curl -i http://localhost:8080/api/games/999
```
Очікувано: `404 Not Found`.
