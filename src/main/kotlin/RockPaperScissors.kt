import java.util.*

class RockPaperScissors {

    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }

    fun startGame() {
        println("Напиши 1 - если выбрал камень,2 - если бумага,3 - ножницы")
        val start = 1
        val end = 3
        val AI_BOT = rand(start, end)
        val scan = Scanner(System.`in`)
        val PLAYER:Int = scan.nextInt()
        println("Ваш выбор:" + PLAYER)
        println("Выбор искусственного интелекта:" + AI_BOT)
        if (AI_BOT == 1) {
            if (PLAYER == 1)
            {
                println("ИИ выбрал камень")
                println("Ничья!")
            }
            else if (PLAYER == 2)
            {
                println("ИИ выбрал камень")
                println("Вы победили!Бумага побеждает камень")

            }
            else if (PLAYER == 3)
            {
                println("ИИ выбрал камень")
                println("ИИ выиграл!Камень бьет ножницы!")
            }
            else
            {
                println("Неправильный ввод(1,2,3)")
            }
        }
        else if (AI_BOT == 2) {
            if (PLAYER == 1)
            {
                println("ИИ выбрал бумагу")
                println("ИИ выиграл!Бумага побеждает камень")

            }
            else if (PLAYER == 2)
            {
                println("ИИ выбрал бумагу")
                println("Ничья!")

            }
            else if (PLAYER == 3)
            {
                println("ИИ выбрал бумагу")
                println("Вы победели!Ножницы режут бумагу")
            }
            else
            {
                println("Неправильный ввод(1,2,3)")
            }
        }
        else if (AI_BOT == 3) {
            if (PLAYER == 1) {
                println("ИИ выбрал ножницы!")
                println("Вы победили!Камень бьет ножницы")

            }
            else if (PLAYER == 2) {
                println("ИИ выбрал ножницы!")
                println("ИИ победил!Ножницы режут бумагу")
            }
            else if (PLAYER == 3) {
                println("ИИ выбрал ножницы!")
                println("Ничья!")

            }
            else {
                println("Неправильный ввод(1,2,3)")

            }

        }

    }
}