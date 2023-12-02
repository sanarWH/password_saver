import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter

//тут будут храниться пароли в зашифрованном виде
class DataBase(){
    fun savePasswordToDataBase(password: String) : File{
        val passwordFile: File = File("password.txt") //отправляем имя файла в конструктор класса File и сохраняем экземпляр класса в переменную password
        passwordFile.createNewFile() //создаем пустой файл с указанным выше именем, вернет тру если файл создан
        passwordFile.appendText(password) //записываем в файл наш ранее сгенерированный пароль (зашифрованный)

        return passwordFile
    }

    fun readPasswordFromDataBase(nameVal: File, index: Int){ //тут я указваю что буду использовать переменную из другой функции
        val readFile = nameVal.readLines()[index]
        println(readFile)
    }

}

