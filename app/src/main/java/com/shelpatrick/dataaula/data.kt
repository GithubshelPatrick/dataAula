package com.shelpatrick.dataaula

class Date (){
    var day :Int = 0
    var month : Int = 0
    var year : Int = 0
    constructor(day:Int, month:Int):this(){

        if (day>0&& day<32)
          //this.day= day
        else this.day =1

        if (month> 0 && month< 13)
          //  this.month = 00
        this.month= month

        if (year>1900 &&  year<2020)
          //  this.year = 00
        this.year= year

    }

    fun getDateDescription(): String{
        return "$day/$month/$year"

    }

}
