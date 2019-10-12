package nom.brunokarpo

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("nom.brunokarpo")
                .mainClass(Application.javaClass)
                .start()
    }
}