class Tovar {
    var name="товар"
    var price=0.0
    var ed="рубли"
    var vid=1
    var kolvo=200
    var newp=200.0
    var info="ski"

    fun Input(tovar1:Tovar)
    {
        try {
            println("введите номер вида товара товара, чтобы увидеть продукцию:\n1.молочка\n2.колбасы\n3.выпечка\n4.газировки")
            tovar1.vid = readLine()!!.toInt()
            if (tovar1.vid < 1 && tovar1.vid > 4) {
                println("неверно введено значение")
            } else {
                println("введите название товара")
                tovar1.name = readLine()!!.toString()
                println("введите сколько он стоит")
                tovar1.price = readLine()!!.toDouble()
                println("введите в какой валюте измеряется")
                tovar1.ed = readLine()!!.toString()
                println("введите количество товара")
                tovar1.kolvo = readLine()!!.toInt()
            }
        }catch(e:Exception){println("error")}
    }
    fun skidki(tovar1:Tovar):Double
    {
        if (tovar1.price>299.0)
        {
            tovar1.price=tovar1.price*tovar1.kolvo
            tovar1.newp=tovar1.price-(tovar1.price*0.1)
        }
        else{
            tovar1.newp=tovar1.price*tovar1.kolvo
        }
        return tovar1.newp
    }
    fun nkolvo(tovar1:Tovar):Double
    {
        if (tovar1.kolvo>50)
        {
            tovar1.newp=(tovar1.price*tovar1.kolvo)/2
        }
        else{
            tovar1.newp=tovar1.newp
        }
        return tovar1.newp
    }
    fun vidinfo(tovar1:Tovar):String
    {
        when(tovar1.vid)
        {
            1->tovar1.info="йогурт клубничный\nпломбир русский стандарт\nсыр"
            2->tovar1.info="докторская\nохотничья\nсервелат"
            3->tovar1.info="крендель\nхлеб\nпирожок"
            4->tovar1.info="пепса\nдобрый апельсин\nадриналайн"
        }
        return tovar1.info
    }
    fun Output(tovar1:Tovar)
    { println("продукция:\n${tovar1.vidinfo(tovar1)}")
        println("название товара:${tovar1.name}\nцена:${tovar1.price}\nединицы измерения:${tovar1.ed}\nколичество:${tovar1.kolvo}\n")
        println("сегодня акция если ваш товар стоит больше 299 рублей, то вы получаете скидку в 10%\nновая цена вашего товара:${tovar1.skidki(tovar1)}")
        println("также если вы взяли более 50 единиц товара, то они вам обойдутся только в половину цену\nновая цена вашего товара:${tovar1.nkolvo(tovar1)}")
    }
}