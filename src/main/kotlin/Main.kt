fun main() {
    println("Привет! Это генератор случайных паролей из цифр, больших и маленьких букв.")
    Thread.sleep(1000) //задержка для красоты
    println("") //отступ между принтами
    print("Какой длины пароль вы хотите создать? Ответ: ")
    val passwordLength: Int = readln().toInt() //длина генерируемого пароля
    val password = passwordGenerator(passwordLength)
    println(password)
}