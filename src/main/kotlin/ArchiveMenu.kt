import java.util.Scanner

class ArchiveMenu(lst: MutableList<Archive>) : Menu<Archive>(lst) {
    override fun printMenu() {
        println("Список Архивов")
        println("0. Создать архив")
        super.printMenu()
    }

    override fun create(scanner: Scanner) {
        println("Введите название архива")
        val archiveName = Utils.getStringFromScanner(scanner)
        lst.add(Archive(archiveName, mutableListOf()))
    }

    override fun open(num: Int, checkNote: (MutableList<Note>) -> Unit) {
        println("Открываем архив ${lst[num - 1].name}")
        checkNote.invoke(lst[num - 1].notes)
    }
}