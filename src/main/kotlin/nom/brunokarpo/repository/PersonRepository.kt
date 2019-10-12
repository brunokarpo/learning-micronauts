package nom.brunokarpo.repository

import nom.brunokarpo.model.Person
import java.util.*

interface PersonRepository {

    fun save(person: Person): Person
    fun findByIdentifier(identifier: UUID): Person?

}