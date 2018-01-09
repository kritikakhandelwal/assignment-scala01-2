class Assignment_scala02 {


  def string_interpolation(list:scala.List[Int]) = {

    for(i <-list)
    {
      println(s"${list.indexOf(i)} = $i")
    }

  }

  def maximum_element(list1:scala.List[Int]):Int= {


    var max = 0
    for (i <- list1) {

      if ((i) > max)
        max = i

    }
    max
  }


  def fibonacci(num:Int): Int = {
      if (num == 0)
         0
      else if (num == 1)
         1
      else
        fibonacci(num - 1) + fibonacci(num - 2)
    }

  def sum_of_products(n: Int,sum:Int): Int = {
   if(n == 1)
     sum_of_digits(sum,1)
    else
     sum_of_products(n - 1,sum * n)
  }

  def sum_of_digits(n:Int,sum:Int) : Int = {
  if(n <= 0)
    1
    else
    sum_of_digits(n/10,sum+n%10)
  }


}
 object class_main extends App{

     val classMainObject = new Assignment_scala02
     val list = List(10, 20, 30, 40)
     classMainObject.string_interpolation(list)
     val list1 = List(1, 5, 2, 9, 7)
     println(classMainObject.maximum_element(list1))
     val num = 4
     println(classMainObject.fibonacci(num))
   println()
     val n = 5
     val sum = 1
     println(classMainObject.sum_of_products(n, sum))


 }




