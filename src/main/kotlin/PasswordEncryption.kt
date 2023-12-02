import java.util.*

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

