# Java
## Основные принципы языка Java
- Write once, run anywhere (WORA)
- Кроссплатформенность - код компилируется в специальный байт-код, который выполняется на виртуальной машине Java (JVM)
- Объектоно-ориентированный - все сущности в программе представляются в виде объектов
- Простота и знакомство - синтаксис является упрощенным вариантом синтаксиса C/C++
- Надежность и безопасность - включает строгую проверку типов, сборку мусора и механизм исключений
- Производительность - использование JIT-компилятора (Just-in-time) позволяет значительно ускорить выполнение байт-кода

## JVM, JRE, JDK - различия и назначение
|JDK|JRE|JVM|
|---|---|---|
|Расшифровка - Java Development Kit|Java Runtime Environment|Java Virtual Machine|
|Средства разработки|Программный пакет, который предоставляет библиотеки классов Java со всеми компонентами, необходимыми для запуска Java-кода|JVM выполняет байт-код Java и предоставляет среду для его выполнения|
|Платформо-зависимый|Платформо-зависимый|Крайне платформо-зависимый|
|Содержит инструкменты, необходимые для разработки, отладки и управления Java-кодом|Содержит библиотеки классов и прочие вспомогательные файлы, которые необходимы JVM для выполнения программ|JVM не содержит инструементы для разработки ПО|

## Структура простой Java-программы
```java
// Объявление класса
public class HelloWorld {
    // Объявление главного метода
    public static void main(String[] args) {
        // Исполняемый оператор
        System.out.println("Hello, world!");
    }
}
```

- В любой программе Java обязательно должен быть класс
    - Этот класс должен иметь такое же имя, как и файл, в котором этот класс объявлен
- Java чувствителен к регистру
- `public static void main(String[] args)` обязательно должен быть

- main - это особый метод. JVM всегда начинает выполнение программы с этого метода. Без него программа не запустится.


## Базовый синтаксис - переменные, типы данных, операторы
Переменная - это именованная область памяти для хранения данных, значение которой можно изменять в проессе выполнения программы.

- Объявление переменной `Тип имя;` (например `int age;`)
- Инициализация `имя = значение;` (например `age = 25;`)
- Объявление и инициализацию можно совместить

## Примитивные типы данных
- byte
- short
- int (4 байта)
    - `int i = 1_000_000;`
- long (8 байт)
    - `long i = 100L;`
- float
- double
- char (2 БАЙТА)
- boolean
    - `bool isReady = true;`

## Ссылочные типы данных
- String
    - `String name = "Alice`;
- Массивы
    - `int numbers = {1, 2, 3}`
- Объекты любых классов
- enum
    - `enum Size {SMALL, MEDIUM, LARGE}`;
    - `Size s = Size.MEDIUM;`

## Операторы
```
double y = Math.sqrt(4);
Math.E
```
Конкатенация строк
```java
String str = "Hello " + "World";
String str2 = " 1" + " 2"; // " 1 2"
```

`System.out.printf` для форматирования

## Условные операторы
```java
if (number % 2 == 0) {
    ...
} else if (number < 0) {
    ...
} else {

}
```

Тернарный оператор
```java
int a = 5, b = 10;
int mx = (a > b) ? a : b;
```


### switch
```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Понедельник";
        break;
    case 2:
        dayName = "Вторник";
        break;
    // ...
    case 7:
        dayName = "Воскресенье";
        break;
    default:
        dayName = "Неверный день";
}

System.out.println(dayName);
```

#### Switch expressions (Java 14+)
```java
String dayType = switch (day) {
    case 1, 2, 3, 4, 5 -> "Рабочий день";
    case 6, 7 -> "Выходной";
    default -> "Неверный день";
};
```


## Приведение типов
```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Narrowing casting: double to int
```

## Циклы
```java
for (int i = 0; i < 5; i++) {
    // ...
}

// RANGE BASED LOOP
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    // ..
}

int count = 0;
while (count < 5) {
    // ...
    count++;
}

int x = 0;
do {
    // ...
    x++;
} while (x < 3);
```


### Операторы управления циклом
`break`
`continue`

```java
outerLoop:
for (/* */) {
    for (/* */) {
        if (/* */) {
            break outerLoop;
        }
    }
}
```


### Массивы
```java
int[] numbers; // предпочтительный стиль
int numbers[]; // альтернитивный стиль

int[] numbers = new int[5]; // массив на 5 элементов (значения по умолчанию 0)
String[] names = new String[3]; // значения по умолчаюнию null

int[] primes = {2, 3, 5, 7};
String[] strings = {"one", "two"};
```

#### Обращение к элементам
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30

System.out.println(numbers.length); // длина массива
```

### Многомерные массивы
```java
int[][] matrix = new int[3][3];

int[][] matrix2 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
};

System.out.println(matrix2[1, 2]); // 6
```

### Операции над массивами
```java
System.arraycopy(source, 0, destination, 0, source.length);

int[] copy = Arrays.copyOf(source, source.length);
```
```java
int[] unsorted = { /* */ };
Arrays.sort(unsorted);
int index = Arrays.binarySearch(unsorted);
```


## Коллекции
Коллекции в Java - это фреймворк, предоставляющий арихтектуру для хранения и использования групп объектов.

### ArrayList
ArrayList - это реализация интерфейса List, основанная на массиве. Она обеспечивает быстрый доступ к элементам по индексу, но операции вставки и удаления могут быть медленнным, особенно при работе с большими объемами данных.

