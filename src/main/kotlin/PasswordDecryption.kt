import java.util.*


//тут будет дешифрование пароля на базе ключевого слова и метдов шифрования

class PasswordDecryption(encryptionPassword: String) { //тут указываем строку в кодировке base64, которую нужнно расшифровать
    val decryptionPassword: ByteArray = Base64.getDecoder().decode(encryptionPassword)
    val decryptionPasswordToString = String(decryptionPassword)

    fun getDecryptionPassword() {
        println("Ваш пароль: $decryptionPasswordToString")
    }
}