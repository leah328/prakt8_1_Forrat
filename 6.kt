class Poezd {
    var nomer=1234
    var po="Екатеринбург"
    var pn="Москва"
    var date="12/07/2024"
    var vo="15:04"
    var time=14
    var info="hsd"
    var price=0.0
    var ch=5
    var chi=5
    var newp=2.0
    fun Input(poezd1:Poezd)
    {
        try {
            println("введите номер поезда")
            poezd1.nomer = readLine()!!.toInt()
            println("введите пункт отправления")
            poezd1.po = readLine()!!.toString()
            println("введите пункт назначения")
            poezd1.pn = readLine()!!.toString()
            println("введите дату отправления")
            poezd1.date = readLine()!!.toString()
            println("введите время отправления")
            poezd1.vo = readLine()!!.toString()
            println("введите сколько часов длится поездка")
            poezd1.time = readLine()!!.toInt()
            println("введите цену билета")
            poezd1.price = readLine()!!.toDouble()
            println("на сколько человек берете билеты?")
            poezd1.ch = readLine()!!.toInt()
            println("если среди них есть дети, о напишите сколько их")
            poezd1.chi = readLine()!!.toInt()
        }
        catch(e:Exception){println("error")}
    }
    fun info(poezd1:Poezd):String
    {
        when {
            (poezd1.time<8&&poezd1.time>0)-> poezd1.info="ваша поездка менее 8-ми часов, вам полгается один бесплатный обед"
            (poezd1.time>8&&poezd1.time<24)->poezd1.info="ваша поездка большее 8 часов но длится не весь день, вам полгается обед и ужин"
            (poezd1.time>24)->poezd1.info="ваша поездка длится более дня, вы можете чтыре раза бесплатно поесть"
        }
        return poezd1.info
    }
    fun skidki(poezd1:Poezd):Double
    {
        if (poezd1.ch>3)
        {
            poezd1.newp=(poezd1.price*poezd1.ch)-((poezd1.price*poezd1.ch)*0.1)
        }
        else{
            poezd1.newp=(poezd1.price*poezd1.ch)
        }
        return poezd1.newp
    }
    fun skidkibb(poezd1:Poezd):Double
    {
        if (poezd1.chi>0)
        {
            poezd1.price=((poezd1.price*(poezd1.ch-poezd1.chi)))-((poezd1.price*(poezd1.ch-poezd1.chi)))*0.1
        }
        else{
            poezd1.price=poezd1.newp
        }

        return poezd1.price
    }
    fun Output(poezd1:Poezd)
    {
        println("номер поезда:${poezd1.nomer}\nпункт отправления:${poezd1.po}\nпункт назначения:${poezd1.pn}\nдата отправления:${poezd1.date}\nвремя отправления:${poezd1.vo}\nвремя в пути:${poezd1.time}\n")
        println("${poezd1.info(poezd1)}")
        println("для тех кто едет не менее чем три человека полагается скидка в 10%, ваша цена:${poezd1.skidki(poezd1)}")
        println("для детей билет бесплатный, ваша цена:${poezd1.skidkibb(poezd1)}")
    }
}