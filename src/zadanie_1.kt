import kotlinx.coroutines.*

/*suspend fun main() = coroutineScope{
    try{
        var n = 0
        var st = Student()

        while (n<=0)
        {
            println("Введите количество функций")
            n = readLine()!!.toInt()
            if (n<=0) println("Минимум можно вывести 1 функцию")
        }
        launch {
            for (i in 1..n){
                st.student()
                delay(600L)
            }
        }
        for (i in 1..n){
            println("------------------------------------------------------------")
            delay(5000L)
        }
    }
    catch (e: Exception)
    {
        println("Неверно введено данное")
    }



}
*/