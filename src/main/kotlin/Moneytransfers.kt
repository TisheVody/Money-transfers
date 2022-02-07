fun main() {
    val amount = 1500000
    val minCommission = 3500
    val commission = if ((amount * 0.0075) > minCommission) amount * 0.0075 else minCommission
    println("Комиссия: $commission копеек")
}
