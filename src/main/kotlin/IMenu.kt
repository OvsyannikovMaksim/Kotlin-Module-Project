import java.util.Scanner

interface IMenu<T> {
    fun printMenu()
    fun resultOfChoose(num: Int): Results
    fun create(scanner: Scanner)
    fun open(num: Int, checkNote: (MutableList<Note>) -> Unit)
}