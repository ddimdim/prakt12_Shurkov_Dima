import kotlinx.coroutines.*
suspend fun main() = coroutineScope{

        var n = 0
        var us = repozitoriy()
        var block = ""
        launch {
            try {
                while (n<=0) {
                    println("Введите количество участников")
                    n = readLine()!!.toInt()
                    if (n<=0) println("Можно вывести как минимум 1 участника")
                }
            }
            catch (e: Exception)
            {
                println("Неверно введено данное")
            }

            for (i in 1..n){
                us.user()
                println("Введите [Вывести список], если хотите отобразить список")
                var vivod = readLine()!!.toString()
                if (vivod == "Вывести список") {
                    delay(3000L)
                    println(us.users.sorted())
                }


            }
        }
        Unit

}
