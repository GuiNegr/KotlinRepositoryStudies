fun AnotacoesEmKt() {
    //forma de pritar Na tela algo (o famoso sysout do JAVA)
    println("Hello World!")

    // variaveis em kotlin tem tipagem automatica dependendo do contexto
    val pi = 3.145 //acredito que seja um double, quando compilar trago: a vdd Sim é um double
    val intDiferente = 100_100_100 // por mais estranho, essa sintaxe é permitida em kotlin. ela diz que é um int, podemos fazer dessa forma
    //para tornar o codigo mais legivel

    //sentença de if diferente?
   if(pi is Double){
       println("Isso é um double")
   }
    // se declarado com Val as variaveis não podem ser reescritas, só acessadas.


    val string : String = "ISTO É UM CAST EXPLICITO PARA O VALOR STRING";
    //variaveis podem ter cast explicito para utilização
    val boolVariavel : Boolean
    //aqui aconteceu uma inicialização nula de valor na variavel


    println(string)

    // isto vai acusar um erro dizendo que val's não podem ser reescritas
   // string = "Novo valor";

    var stg = string;
    println("AQUI A VAR STG ESTÁ SENDO PRINTADA APOS RECEBER O VALOR DE UMA VAL"+stg)
    stg = "como isto é um var, ela pode ser reescrita"
    println("AQUI A ALTERAÇÃO NA VAR MOSTRANDO O BLOQUEIO DELA"+stg)

    val mutableList = mutableListOf(1,2,2)
     //esse conceito apareceu, é uma collections do kotlin semelhante ao list. acontece q esse termo mutableList, quer dizer que apos criada
    //pode haver alterações nela

     //Const Em Kotlin, uma constante de tempo de compilação é uma propriedade somente de leitura
    // que é conhecida em tempo de compilação e seu valor não pode ser alterado durante o tempo de execução
    //variaveis com const são declaradas da seguinte forma
   // const val issoEumConst = 20
    // ela so pode receber valores primitivos e strings, ou seja não pode haver array de const
    //não podem ser utilizadas para receber valores em tempo de execução
    //ou seja se eu for fazer
    val ler = readln()
    //readLn eo mesmo que scanner em java.
    //a const não pode ser utilizada nesse caso já que so vai haver o conhecimento dela para o programa quando passar
    // e const tem que ser declaradas antes das classes.

    //QUANDO UTILIZAR VAL E VAR?
    //usar val para variaveis que eu tenho ciencia que não tera a necessidade de alteração ou realocação de valor
    //posos utilizar var para tudo que eu quiser, porém o codigo provavelmente ficará sucetivel a erros.

    //quando for escrever variaveis const lembre-se de colocar em maiuscula e com espaços utilizando _ para ajudar a leitura

}