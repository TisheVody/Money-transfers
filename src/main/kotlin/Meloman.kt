

class Meloman {
}

fun main() {
    val meloman = true
    val totalPrice = 100_000_00
    val discount = 100_00
    val discountStart = 1_000_00
    val percentDiscount = 0.05 * totalPrice
    val percentDiscountStart = 10_000_00
    //discount coefficient for melomans (1% of total price)
    val melomanDiscount = 0.99

    val result = if (!meloman) {
        if (totalPrice > percentDiscountStart) totalPrice - percentDiscount
        else if (totalPrice > discountStart) totalPrice - discount
        else totalPrice
    } else {
        if (totalPrice > percentDiscountStart) (totalPrice - percentDiscount) * melomanDiscount
        else if (totalPrice > discountStart) (totalPrice - discount) * melomanDiscount
        else totalPrice * melomanDiscount
    }
    println("Итоговая цена в копейках: $result")
}




