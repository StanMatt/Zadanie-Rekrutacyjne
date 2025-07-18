# Zadanie-Rekrutacyjne

Projekt rekrutacyjny napisany w Javie 21 z użyciem Spring Boot 3.5.  
Aplikacja udostępnia jeden endpoint REST, który pozwala pobrać listę publicznych repozytoriów GitHub danego użytkownika.

## Technologie

- Spring Web
- JSON
- Testy integracyjne
- Maven

## Założenia zadania

- Pobieranie publicznych repozytoriów użytkownika z GitHuba
- Pomijanie forków
- Pobieranie branchy dla każdego repo
- Zwracanie: nazwy repo, loginu właściciela, listy branchy z SHA ostatniego commita
- Obsługa błędu 404
