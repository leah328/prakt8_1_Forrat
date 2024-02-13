fun main(){
    var tovar1=Tovar()
    tovar1.Input(tovar1)
    if (tovar1.price!=0.0)
    {tovar1.Output(tovar1)
    }
    else {println("неверный формат ввода")}
}
