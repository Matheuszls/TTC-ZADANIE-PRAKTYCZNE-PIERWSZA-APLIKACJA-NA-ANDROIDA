fun main() {

    val imie = "Mateusz"
    var klasa = "4Td"
    val kierunek = "Technik informatyk"

    println("=== DANE UCZNIA ===")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    println()

    val wynik1 = obliczGodziny(30, 4)
    val wynik2 = obliczGodziny(25, 6)

    println("=== GODZINY ZAJĘĆ ===")
    println("30 godzin tygodniowo przez 4 tygodnie: $wynik1 godzin")
    println("25 godzin tygodniowo przez 6 tygodni: $wynik2 godzin")
}

fun obliczGodziny(godziny: Int, tygodnie: Int): Int {
    return godziny * tygodnie
}
