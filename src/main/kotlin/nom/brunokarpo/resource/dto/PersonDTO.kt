package nom.brunokarpo.resource.dto

import nom.brunokarpo.model.Person
import java.util.*

data class PersonDTO(
        var id: UUID? = null,
        var name: String? = "",
        var age: Int? = 0
) {
    constructor(person: Person) : this(id = person.id, name = person.name, age = person.age)

    fun toPerson() = Person(id = this.id,
                name = this.name ?: "",
                age = this.age ?: 0)
}