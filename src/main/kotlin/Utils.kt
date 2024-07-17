import java.util.Scanner

object Utils {

    fun <T : Storable> startMenu(menu: IMenu<T>, scanner: Scanner) {
        while (true) {
            menu.printMenu()
            val choose = getIntFromScanner(scanner)
            when (menu.resultOfChoose(choose)) {
                Results.ClOSE -> return
                Results.CREATE -> menu.create(scanner)
                Results.OPEN -> menu.open(choose, checkNote = { startMenu(NoteMenu(it), scanner) })
                else -> println("Неверное число")
            }
        }
    }

    fun getIntFromScanner(scanner: Scanner): Int {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt()
            } else {
                println("Необходимо ввести число. Повторите попытку.")
                scanner.next()
            }
        }
    }

    fun getStringFromScanner(scanner: Scanner): String {
        var text: String
        //clear io
        scanner.nextLine()
        while (true) {
            text = scanner.nextLine().trim()
            if (text.isNotEmpty()) {
                return text
            } else {
                println("Необходимо ввести строку. Повторите попытку.")
            }
        }
    }
}