open class Student {
    var sr = 0.0
    open fun student() {
        try {
            var mathem = 0
            var physics = 0
            println("Введите имя студента")
            var st = readLine()!!.toString()
            while (mathem <= 0 || mathem > 5) {
                println("Введите оценку по математике")
                mathem = readLine()!!.toInt()
                if (mathem <= 0 || mathem > 5) println("Оценка не может быть такой")
            }
            while (physics <= 0 || physics > 5) {
                println("Введите оценку по физике")
                physics = readLine()!!.toInt()
                if (physics <= 0 || physics > 5) println("Оценка не может быть такой")
            }
            sr = (mathem + physics) / 2.0
            println("Студент: $st имеет общий средний балл: $sr по двум предметам (математика и физика)")
        }
        catch (e: Exception)
        {
            println("Неверно введено данное")
        }
    }
}