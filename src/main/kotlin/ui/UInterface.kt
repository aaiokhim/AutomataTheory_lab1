package org.example.ui

interface UInterface {
    fun MainMenu() { //показывает меню и ждет запроса
        println("Меню:\n" +
                "1. Ввод из консоли;\n" +
                "2. Ввод из файла;\n" +
                "3. Вывести статистику;\n" +
                "4. Завершение работы." +
                "--> "
        )
        val state = readLine()

    }

    fun ImplementationMenu() {
        println("Меню реализаций:\n" +
                "1. SMC\n" +
                "2. Regex\n" +
                "3. Lex\n" +
                "--> "
        )
        val state = readLine()
    }

    fun Parser(string: String): Boolean

    fun FileProcessing() {

    }

}

enum class TypeImplementation {
    SMC,
    REGEX,
    LEX
}