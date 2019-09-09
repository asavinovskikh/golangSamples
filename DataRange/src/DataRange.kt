//class DateRange(val start: MyDate, val endInclusive: MyDate){
//    operator fun contains(d: MyDate):Boolean{
//        return  compare(start, d) && compare(d,endInclusive)
//    }
//}
//fun compare(date1: MyDate, date2: MyDate) = date1 < date2
//fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
//    return date in DateRange(first, last)
//}