fun main() {
    val array: List<Product> = arrayListOf(
        Product("Хлеб",23),
        Product("Картошка",34),
        Product("Колбаса",2),
        Product("Арбуз",34),
        Product("Помидоры",53),
    )

    val count = array.fold(0){sum,elem -> sum + elem.count}
    println(count)
}