package LatihanKotlin.antrianRS

import java.util.*

object antirianRS {
    @JvmStatic
    fun main(args: Array<String>) {
        val ulang = true // UNTUK PER-ULANGAN WHILE
        var urutan = 1 // UNTUK ANGKA ANTRIAN KELAS VVIP
        var b = 1 //UNTUK ANGKA ANTRIAN KELAS BPJS
        while (ulang) {
            val inputUser = Scanner(System.`in`)
            println("selamat datang di rumah sakit bayu")
            println("silahkan ambil antrian")
            println(" 1. untuk VVIP")
            println(" 2. untuk BPJS")
            println(" 3. untuk keluar")
            println("pencet angka untuk memilih : ")
            val input = inputUser.nextInt() // UNTUK MENERIMA INPUT YANG BERSIFAT INT
            if (input == 1) {
                println("==== RSUD PASAR MINGGU ====")
                println("|| \tkelas VVIP   \t ||")
                println("||   NOMOR ANTRIAN ANDA  ||")
                println("-------------------")
                println("|   A $urutan   |")
                println("-------------------")
                urutan++ //INCREMENT
            } else if (input == 2) {
                println("==== RSUD PASAR MINGGU ====")
                println("|| \tkelas BPJS   \t ||")
                println("||   NOMOR ANTRIAN ANDA  ||")
                println("-------------------")
                println("|   B $b   |")
                println("-------------------")
                b++ //INCREMENT
            } else if (input == 3) { //JIKA MEMILILH 3 MAKA AKAN KELUAR DARI PROGRAM
                break
            } else { //JIKA PILIHAN TIDAK DITEMUKAN
                println("pilihan tidak ditemukan silahkan memilih dengan benar")
            }
        }
    }
}