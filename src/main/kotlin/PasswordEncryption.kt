import java.util.*

//тут будет шифрования пароля через взятие ключевого слова и метода шифрования
// Мне нужно после генерации пароля предложить зашифровать его и сохранить в бд.
// Тут нужно реализовать функцию шифрования


//fun PasswordEncryption(generatedPassword: String){
//    val encodingPassword = Base64.getEncoder().encodeToString(generatedPassword.toByteArray())
//    println("Зашифрованный пароль: $encodingPassword")
//}
class PasswordEncryption(generatedPassword: String) {
    val encodingPassword: String = Base64.getEncoder().encodeToString(generatedPassword.toByteArray())

    fun getEncryptPassword() {
        println("Зашифрованный пароль: $encodingPassword")
    }

    fun saveEncryptPassword(): String {
        //функция для хранения зашифрованного пароля
        return encodingPassword
    }
}

