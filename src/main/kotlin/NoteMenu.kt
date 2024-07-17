import java.util.Scanner

class NoteMenu(lst: MutableList<Note>) : Menu<Note>(lst) {

    override fun printMenu() {
        println("Список заметок")
        println("0. Создать заметку")
        super.printMenu()
    }

    override fun create(scanner: Scanner) {
        println("Введите название заметки")
        val noteName = Utils.getStringFromScanner(scanner)
        println("Введите текст заметки")
        val noteText = Utils.getStringFromScanner(scanner)
        lst.add(Note(noteName, noteText))
    }

    override fun open(num: Int, checkNote: (MutableList<Note>) -> Unit) {
        val note = lst[num - 1]
        println("Название заметки: ${note.name}")
        println("Текст заметки: \n ${note.text}")
    }
}