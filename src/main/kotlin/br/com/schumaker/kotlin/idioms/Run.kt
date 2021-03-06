package br.com.schumaker.kotlin.idioms

/**
 * @author Hudson Schumaker
 */
object Run {
    @JvmStatic
    fun main(args: Array<String>) {
        val justAString = "string"
        val n = justAString.run {
            this.length // this can be omitted
        }
        println(n) // prints 6

        val year = JamesBond().run {
            name = "Roger Moore"
            movie = "The man with the golden gun"
            1974 // not JamesBond type
        }
        print(year) // prints 1974
    }
}