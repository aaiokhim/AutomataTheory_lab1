package org.example

import org.example.implementations.regex.RegexImplementation

fun main() {
    val processor = RegexImplementation()

    print("Input string\nFormat:\nmailto: user_name@server_name.zone_name?subject=text\n-->")
    val input = readln()

    processor.StringProcessing(input)
}