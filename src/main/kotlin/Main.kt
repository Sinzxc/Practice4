fun main(args: Array<String>) {
    //1
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " "+ lastName);
    }
    printFullName("Никита", "Панычев");
    //


    //2
    val firstName="Никита";
    val lastName="Панычев";
    printFullName(firstName,lastName);
    //

    //3
    fun calculateFullName(firstName:String, lastName:String):String{
        return "${firstName} ${lastName}";
    }
    val name=calculateFullName("Никита", "Панычев");
    //

    //4
        fun calculateFullNameAndLength(firstName:String, lastName:String):Pair<String, Int>{
            val fullName="${firstName} ${lastName}";
        return Pair(fullName,fullName.length-1);
        }
        println(calculateFullNameAndLength(firstName,lastName));
    //

    //5
        fun isSimple(n: Int): Boolean {
            if (n < 2) return false
            for (i in 2..n - 1) {
                if (n % i == 0) return false
            }
            return true
        }
        println(isSimple(3));
    //

    //6
        fun fibonacci(n:Int):Int{
            var fib1=1;
            var fib2=1;
            for (i in 3..n)
            {
                var sum=fib1+fib2;
                fib1=fib2;
                fib2=sum;
            }
        return fib2;
        }
        println(fibonacci(7));
    //
}

