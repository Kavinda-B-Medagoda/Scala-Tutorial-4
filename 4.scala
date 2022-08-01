object `4` {
  def main(args:Array[String]):Unit={
    println(inputnum(6));
  }

  def inputnum(num:Int):Any = num match{
     case x if(x<=0) => "Negative/Zero"
     case x if(x%2 ==0) => "Even Number"
     case x if(x%2 !=0) => "Odd Number"
  }
}
