## Обработчик Чисел

Этот проект на Java считывает числа из файла и вычисляет минимальное, максимальное значение, сумму и произведение этих чисел. Проект включает функции для выполнения этих вычислений, а также тесты для проверки их корректности и производительности.

## Функциональность

- **readNumbersFromFile**: Считывает числа из файлва
- **getMinimum**: Находит минимальное число.
- **getMaximum**: Находит максимальное число.
- **getSumm**: Вычисляет сумму всех чисел.
- **getMultiplication**: Вычисляет произведение всех чисел.

## Требования

- JDK 21 или выше
- Maven

## Установка

Использование
Создайте файл с именем numbers.txt в корневом каталоге проекта с числами, разделенными пробелами, например:
1 4 2 3

Сборка проекта с помощью Maven:

```bash
mvn clean install
```

Минимальное: 1
Максимальное: 4
Сумма: 10
Произведение: 24
## Тестирование
```bash
mvn test
```
# Статус тестирования
![example workflow](https://github.com/creativedak/tz2/actions/workflows/ci.yml/badge.svg)
