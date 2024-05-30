## Обработчик Чисел

Этот проект на Java считывает числа из файла и вычисляет минимальное, максимальное значение, сумму и произведение этих чисел. Проект включает функции для выполнения этих вычислений, а также тесты для проверки их корректности и производительности.

## Функциональность

- **_min**: Находит минимальное число.
- **_max**: Находит максимальное число.
- **_sum**: Вычисляет сумму всех чисел.
- **_mult**: Вычисляет произведение всех чисел.

## Требования

- JDK 11 или выше
- Gradle

## Установка

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/yourusername/number-processor.git
   cd number-processor
Сборка проекта с помощью Gradle:

bash
复制代码
./gradlew build
Использование
Создайте файл с именем numbers.txt в корневом каталоге проекта с числами, разделенными пробелами, например:

复制代码
1 4 2 3
Запустите класс NumberProcessor:

bash
复制代码
./gradlew run
Результат будет:

makefile
复制代码
Минимальное: 1
Максимальное: 4
Сумма: 10
Произведение: 24
Тестирование
Для запуска тестов используйте следующую команду:

bash
复制代码
./gradlew test
Эта команда выполнит тесты, определенные в классе NumberProcessorTest.

Тестирование производительности
Класс NumberProcessorTest включает тест для измерения производительности. Он генерирует случайные числа различного размера и измеряет время выполнения каждой функции.

Непрерывная интеграция
Этот проект использует GitHub Actions для непрерывной интеграции. CI-пайплайн настроен на запуск тестов при каждом пуше и pull request в ветку main.



Интеграция с Telegram
CI-система интегрирована с Telegram для отправки уведомлений о статусе сборки. Вы получите сообщение в Telegram, когда тесты пройдут или провалятся.

Лицензия
Этот проект лицензирован под лицензией MIT. Подробности смотрите в файле LICENSE.

Контакты
По всем вопросам и предложениям обращайтесь:

Имя: Ваше Имя
Email: your.email@example.com
yaml
复制代码

### Настройка CI с GitHub Actions

Создайте файл `.github/workflows/ci.yml` для настройки GitHub Actions:

```yaml
name: Java CI

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v1
      with:
        java-version: '11'
    - name: Build with Gradle
      run: ./gradlew build
    - name: Run tests
      run: ./gradlew test

    - name: Notify Telegram
      if: failure()
      run: curl -s -X POST https://api.telegram.org/bot${{ secrets.TELEGRAM_BOT_TOKEN }}/sendMessage -d chat_id=${{ secrets.TELEGRAM_CHAT_ID }} -d text="Тесты не прошли для коммита ${{ github.sha }}."
    - name: Notify Telegram Success
      if: success()
      run: curl -s -X POST https://api.telegram.org/bot${{ secrets.TELEGRAM_BOT_TOKEN }}/sendMessage -d chat_id=${{ secrets.TELEGRAM_CHAT_ID }} -d text="Тесты прошли успешно для коммита ${{ github.sha }}."
Не забудьте добавить секреты TELEGRAM_BOT_TOKEN и TELEGRAM_CHAT_ID в настройках вашего репозитория на GitHub.

График зависимости времени выполнения от количества чисел
Для построения графика зависимости времени выполнения от количества чисел в файле, используйте следующий код на Python:

python
复制代码
import matplotlib.pyplot as plt

sizes = [1000, 10000, 100000, 1000000]
times = [time1, time2, time3, time4]  # Вставьте измеренные времена выполнения

plt.plot(sizes, times, marker='o')
plt.xlabel('Количество чисел')
plt.ylabel('Время выполнения (мс)')
plt.title('Зависимость времени выполнения от количества чисел')
plt.grid(True)
plt.show()
Пример времени выполнения
Пример времени выполнения для различных размеров файлов:

Количество чисел	Время выполнения (мс)
1000	50
10000	200
100000	1500
1000000	12000
Теперь ваш проект полностью настроен и готов к использованию!

# NumberOperations

![Java CI](https://github.com/creativedak/tz2/actions/workflows/ci.yml/badge.svg)
