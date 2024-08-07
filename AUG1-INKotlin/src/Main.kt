import java.util.*;

fun main() {


}

//Treinando chamadas de funções, ao declarar tipo nas funções aparentemente

fun soma(a:Int , b:Int) : Int{
    return a+b;
}
fun dobro(a:Int) :Int{
    return a * 2
}
fun triplo (a:Double) :Double{
    return a * 3
}
fun metade (a : Int) :Int{
    return  a / 2
}
fun areaQuad(a : Int) : Int {
    return a * a;
}
//JÁ APLICANDO POLIFORMISMO KKKKKKKKKKKKKKKK TOMALHEEEE
fun areaTrinagulo(a :Int , b:Int) :Int{
    return a * b
}
fun areaTriangulo(a:Double , b: Double) : Double{
    return (a * b) / 2
}
fun perOctagono ( a: Int) : Int{
    return a * 8
}
/*
ainda está confuso o casting de valor em kotlin
    eu vi isso no Kotlin.org
    para fazer a conversão tem q ser utilizado a expressão as
    ISTO A SEGUIR CAUSOU UM ERRO DE CAST. APARENTEMENTE NÃO HÁ CAST DE INT PARA DOUBLE
    VER FUTURAMENTE AS CLASSES INTERGER
        fun mediaEscola(a: Int, b: Int , c:Int) : Double{
            var soma = (a+b+c)
            val madia : Double = soma / 3 as Double
           return madia
*/

fun mediaEscola(a: Int, b: Int , c:Int) : Int{
    var soma = (a+b+c)
    val madia  = soma / 3
    return madia
}