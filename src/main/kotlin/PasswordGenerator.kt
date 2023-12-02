//тут будет гератор паролей

class PasswordGenerator(){
    fun generate(lengthPassword: Int): String {
        var password: String = "" //тут будет храниться пароль

        val letterRange = ('A'..'Z') + ('a'..'z') // создал диапазон символов для генерации
        val numberRange = 0..9
        val symbolRange = letterRange + numberRange //объеденил диапазоны, чтобы не делать проверку в while

        while (password.length < lengthPassword) { //если длина пароля меньше количества символов в переменной пароль, то
            password += symbolRange.random()
        }
        val shuffleSymbolsPassword = password.toList().shuffled().joinToString("") //перемешал все символы в пароле, чтобы он был реально рандомный
        return shuffleSymbolsPassword
    }

    fun getPassword(){
//        println("Ваш случайно сгененрированный пароль: ${generate()}")
    }

}


