object `1` {
  
    def main(args:Array[String])={

        println(interest(10000000));
    }



    def interest(amount:Int)= amount match{
        case x if(x<=20000)=> amount*2/100;
        case x if(x>20000 && x<=200000)=> amount*4/100;
        case x if(x>200000 && x<=2000000)=> amount*3.5/100;
        case x if(x>2000000)=> amount*6.5/100;
    }
}
