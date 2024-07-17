import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val archiveMenu = ArchiveMenu(mutableListOf())

    println("Начало приложения \"Заметки\"")
    Utils.startMenu(archiveMenu, scanner)

}