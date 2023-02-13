fun main() {
    println("Вариант 6:")
    var train1:train=train(1, "Ekaterinburg", "Moscow", "12.01.2023","12:30", 76)
    println(train1.route())
    println(train1.date())
    println(train1.traintime())
    println("Вариант 13:")
    var product1:product=product("Диван", 12000, "штуки","Мебель", 3)
    println(product1.ProductPrice())
    println(product1.TypeOfProduct())
    println(product1.NumberOfproducts())

}

