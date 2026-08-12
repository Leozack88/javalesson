package dz;

public class practice1 {
    public static void main(String[] args) {
        System.out.println("dz.hello");
        System.out.println("Welcome to the first lesson!");
        System.out.println("welcome        ");
        System.out.println("test           ");
        System.out.print("Меня зовут ");
        System.out.print("Николай ");
        System.out.println("Веселов");
        System.out.print("Веселов ");
        System.out.print("Веселов");
        System.out.print("Веселов");
        System.out.print("Веселов");
        System.out.print("Веселов");
        System.out.print("Веселов");
        System.out.print("Веселов");
        System.out.println(" ") ;
        System.out.println("Hello\nНовая страка");  // \n Новая строка
        System.out.println("Hello\tТабуляция");  //  \tТабуляция
        System.out.println("Hello\" Двойная кавычка внутри строки\"");  // \"    текст  \"
        System.out.println("Hello\\ Двойная кавычка внутри строки"); //   \ один обратный слэш
        System.out.println("C:\\Users");
        System.out.println("He said: \"Hi\"");
        System.out.println("Name\tRole");
        System.out.println("Leo\tQA Engineer");
        System.out.println("Line 1\nLine 2");
        System.out.println("____________________");                      //Создай класс Main и выведи в консоль своё имя, профессию и цель обучения на трёх разных строках.
        System.out.println("Leo");                                      //    метод println  с новых строк
        System.out.println("QA тестировщик / программист");
        System.out.println("Цель: стать сильным QA и прокачать Java");
        System.out.println("____________________");                // Сделай тот же вывод, но часть текста напечатай через print(), а переносы строк через println().
        System.out.print("Leo\n");                                 // Здесь перенос строки делается через \n
        System.out.print("QA тестировщик / программист\n");       // Здесь перенос строки делается через \n
        System.out.println("Цель: стать сильным QA и прокачать Java");
        System.out.println("____________________");           //Выведи мини-таблицу: Test Name, Status, Duration.
        System.out.println("Test Name\tStatus\tDuration");        //\t = табуляция (как колонка)
        System.out.println("Login Test\tPASSED\t120ms");
        System.out.println("Signup Test\tFAILED\t98ms");
        System.out.println("____________________");             //мини задание для таблици
        System.out.println("Test case: Login with valid credentials");
        System.out.println("Expected: user is logged in");
        System.out.println("Actual: user is logged in");
        System.out.println("Result: PASSED");
        System.out.println("____________________");
        System.out.println("Test Case\tExpected\tActual\tResult");
        System.out.println("Login\tLogged in\tLogged in\tPASSED");
        System.out.println("____________________");       // printf  Это "умный вывод", который позволяет:задавать ширину делать таблицы выравнивать текст
        System.out.printf("%-15s %-15s %-15s %-10s%n",     // s — это строка %s  / 15 ширина колонки %15s / "выдели 15 символов под этот текст"
                "Test Case", "Expected", "Actual", "Result");  //%-15s  "выровняй по ЛЕВОМУ краю" Если без -: %15s будет по правому краю:

        System.out.printf("%-15s %-15s %-15s %-10s%n",            //%n — перенос строки
                "Login", "Logged in", "Logged in", "PASSED");   // Как это работает визуально %-15s Если слово "Login" (5 символов): Login__________   (10 пробелов) всего = 15

        System.out.println("____________________");
        System.out.printf("%-20s %-20s %-20s %-10s%n",
                "Test Case", "Expected", "Actual", "Result");

        System.out.printf("%-20s %-20s %-20s %-10s%n",
                "Login valid", "User logged in", "User logged in", "PASSED");

        System.out.printf("%-20s %-20s %-20s %-10s%n",
                "Login invalid", "Error shown", "Error shown", "PASSED");

    }
}
