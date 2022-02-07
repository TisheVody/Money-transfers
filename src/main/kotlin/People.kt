

fun main() {
        val likes = 1211211
        val end = if ((likes % 10 == 1) && (likes % 100 !==11)) "человеку" else "людям"
        println("Понравилось $likes $end")
    }
