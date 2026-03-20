package org.example.implementations.regex

import org.example.ui.UInterface
import kotlin.text.Regex

//mailto: user_name@server_name.zone_name?subject=text
/*mailto: - обязательный заголовок строки;
имя_получателя – обязательное поле, строка литералов {[a-z], [0-9]} в любом регистре;
имя_сервера – обязательное поле, строка литералов {[a-z], [0-9]} в любом регистре;
имя_зоны – обязательное поле, представляет собой строки литералов [a-z] в любом регистре;
текст – опциональное поле, строка литералов {[a-z], [0-9]} в любом регистре длиное не более 64 символов.*/

class RegexImplementation: UInterface {
    lateinit var userName: String

    override fun Parser(string: String): Boolean {
        /*val pattern = Regex(
            """\s*mailto:\s*([a-zA-Z0-9]+)@([a-zA-Z0-9]+)\.([a-zA-Z]+)(?:\?subject=([a-zA-Z0-9\s]*))?""".trimMargin()
        )*/

        val pattern = Regex(
            """\s*mailto:\s*
                |([a-zA-Z0-9]+)
                |@
                |([a-zA-Z0-9]+)
                |\.
                |([a-zA-Z]+)
                |(?:\?subject=([a-zA-Z0-9\s]*))?
                |""".trimMargin().replace("\n", "") //чисто теоретически будет мешать таймированию
        )

        val match = pattern.matchEntire(string)

        if (match != null) {
            userName = match.groupValues[1]
            return true
        } else return false
    }

    fun StringProcessing(string: String) {
        //запуск таймирования
        val process = Parser(string)
        if (process) {
            println("User Name: $userName")
        } else {
            println("Wrong format")
        }

        //конец таймирования
    }

}