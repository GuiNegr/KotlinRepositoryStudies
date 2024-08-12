fun main() {
println(atvGastos(100.0,150.0))
}

fun atv1(compra :Int,desconto : Double ) : Double{
    return compra.toDouble() - desconto;
}
fun atv1Continue(compra: Int, desconto: Double) : String {

    return "Compra finalizada! o total deu R$ ${atv1(compra,desconto)}";
}

fun atv2(compra : Int, desconto: Double) : Double{
    return (compra * desconto) / 100
}
fun atv2Continue(compra: Int , desconto: Double) :String {
    return "Compra finalizada ! o total com desconto ficará R$ ${atv2(compra,desconto)}"
}

fun atv3 (kg:Int) : Double{
    return kg.toDouble() * 1000
}

fun atv4 (real: Double) : Double{
    return real * 5.16
}

fun atv5 (valorCompra: Double, parcelas:Int) : Double{
    return valorCompra / parcelas;
}
fun atv5Continue (valorCompra: Double, parcelas: Int) : String{
    return "Compra de R$ $valorCompra Fianlziada, Parcelado em $parcelas de ${atv5(valorCompra,parcelas)}"
}

fun atv6(capTanque: Double, kmViagem: Double, litrosPorKm: Double) : Int {
    var kmPorViag: Double = kmViagem / litrosPorKm
    if(capTanque > kmPorViag){
        return 1
    }else{
        var contador = 0;
        while (capTanque < (kmPorViag)){
            contador ++;
            kmPorViag += kmPorViag
            return contador;
        }
    }
    return -1
}

fun atvGastos(salario: Double , gastos: Double) : Double{
     //iria implementar da maneira mais porca, e percebi que não estava fazendo sentindo, tive que recorrer ao chat, pois minha logica
    // estava extremamente porca.

/*    var valorBase81 = 81 * (salario / 100)
    var valorBase100 = 100 * (salario / 100)
    var valorBase80 = 80 * (salario / 100)
    var valorBase51 = 51 * (salario/100)
    var valorBase50 = 50 * (salario/100)
    var valorBase21 = 21 * (salario/100)
    var valorBase20 = 20 * (salario/100)
    var valorBase0 = 0 * (salario/100)*/
    
    var valorBase = (gastos / salario) * 100; // Aqui temos o valor resultante, precisamos saber qual e a porcentagem em cima do valor total
    return valorBase
}
