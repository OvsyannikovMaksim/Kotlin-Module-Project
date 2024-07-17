abstract class Menu<T>(protected val lst: MutableList<T>) : IMenu<T> where T : Storable {

    override fun printMenu() {
        for (i in 1..lst.size) {
            println("${i}. ${lst[i - 1].name}")
        }
        println("${lst.size + 1}. Выход")
    }

    override fun resultOfChoose(num: Int): Results {
        return when (num) {
            0 -> Results.CREATE
            in 1..lst.size -> Results.OPEN
            lst.size + 1 -> Results.ClOSE
            else -> Results.FAILURE
        }
    }
}