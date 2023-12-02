fun main() {
    println("Привет! Это генератор случайных паролей из цифр, букв в нижнем и верхнем регистре.")
    Thread.sleep(1000) //задержка для красоты
    println("") //отступ между принтами
    print("Какой длины пароль вы хотите создать? Ответ: ")
    val passwordLength: Int = readln().toInt() //длина генерируемого пароля

    val password: String = PasswordGenerator().generate(passwordLength) //создали пароль через функцию генерации пароля
    println("Ваш случайно сгенерированный пароль: $password")
    val encryptPassword = PasswordEncryption(password).saveEncryptPassword() //сохраняю сгененрированный и зашифрованный пароль в переменную для дальнейшего хранения
//    val decrypt = PasswordDecryption(encryptPassword).getDecryptionPassword() //расшифровываю пароль




}