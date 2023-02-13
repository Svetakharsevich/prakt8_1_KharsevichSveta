class product(_title:String,_price:Int,_unit:String,_view:String,_quantity:Int)
{
    var title:String=_title
    var price:Int=_price
    var unit:String=_unit
    var  view:String=_view
    var quantity:Int=_quantity
    fun ProductPrice(){
        println("Товар '${title}' = ${price} рублей")
    }
    fun TypeOfProduct(){
        println("Товар '${title}' = ${view}")
    }
    fun NumberOfproducts(){
        when{
            (quantity==0)-> println("Товара '${title}' нет на складе")
            (quantity>0)->println("Товара '${title}' = на складе ${quantity} ${unit}")
        }
    }
}

