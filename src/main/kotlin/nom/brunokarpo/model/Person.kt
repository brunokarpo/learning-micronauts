package nom.brunokarpo.model

import java.util.*

data class Person(
        var id: UUID? = null,
        var name: String,
        var age: Int
)