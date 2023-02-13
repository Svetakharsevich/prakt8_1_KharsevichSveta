
class train( _nomer:Int, _departurepoint:String,_destination:String,_data:String,_time:String,
             _traveltime:Int) {
    var nomer:Int=_nomer
    var departurepoint:String=_departurepoint
    var destination:String=_destination
    var data:String=_data
    var time:String=_time
    var traveltime:Int=_traveltime
    fun route(){
        println("Поезд-${nomer}-Пункт отправления = ${departurepoint}, Пункт назначения = ${destination}")
    }
    fun date(){
       println("Поезд ${nomer}-Дата отправления ${data}")
    }
    fun traintime(){
        when{
            (traveltime<60)->println("Поезд-${nomer}-${time}-в пути = ${traveltime} часов")
            (traveltime>=60&&traveltime<120)-> println("Поезд-${nomer}-${time}-в пути = ${traveltime/60} часов ${traveltime%60} минут")
            (traveltime>=120&&traveltime<180)->println("Поезд-${nomer}-${time}-в пути = ${traveltime/120}часов ${traveltime%120} минут")
        }

    }

}


