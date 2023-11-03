import kotlin.math.min

fun main(args: Array<String>) {
    val minDiscountAmount = 1001
    val minDiscountPercentAmount = 10001

    val discountAmount = 100
    val discountPercent = 5
    val regularPercent = 1
    val regulagCustomer = false

    var amount = 100

    var discount = 0;
    println("Сумма покупки: $amount руб")

    if (amount >= minDiscountPercentAmount) {
        discount = amount * discountPercent / 100
        println("Скидка $discountPercent%: $discount руб")
    } else if (amount >= minDiscountAmount) {
        discount = discountAmount
        println("Скидка: $discount руб")
    }

    if (discount != 0) {
        amount -= discount;
        println("Сумма покупки после применения скидки: $amount руб")
    }

    if (regulagCustomer) {
        discount = amount * regularPercent / 100
        println("Скидка $regularPercent%: $discount руб")
        amount -= discount
        println("Сумма покупки после применения скидки: $amount руб")
    }

    println("Итоговая сумма покупки: $amount руб")
}