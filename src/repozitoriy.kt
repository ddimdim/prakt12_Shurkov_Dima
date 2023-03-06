open class repozitoriy {
    var users = listOf<String>()


    fun user(){
        try {
            var login = ""
            var password = ""
            var count_rep = -1

            println("Введите имя пользователя (логин)")
            login = readLine()!!.toString()
            println("Введите пароль")
            password = readLine()!!.toString()
            while (count_rep<0) {
                println("Введите количество репозиториев")
                count_rep = readLine()!!.toInt()
                if (count_rep<0) println("Не может быть отрицательное количество репозиториев")
            }
            var info = "\n" + count_rep + " repositories     "  + login + " - логин       " + password + " - пароль"
            println("Введите [Блокировать], если не хотите добавлять этого пользователя")
            var block = readLine()!!.toString()
            if (block != "Блокировать")
                users += info
        }
        catch (e: Exception)
        {
            println("Неверно введено данное")
        }


    }

}