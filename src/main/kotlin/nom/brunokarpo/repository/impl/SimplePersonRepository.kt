package nom.brunokarpo.repository.impl

import nom.brunokarpo.model.Person
import nom.brunokarpo.repository.PersonRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class SimplePersonRepository: PersonRepository {

    private val inMemory = mutableListOf<Person>()

    override fun save(person: Person): Person {
        inMemory.add(person)
        return person
    }

    override fun findByIdentifier(identifier: UUID): Person? {
        return inMemory.firstOrNull() {
            it.id == identifier
        }
    }

    override fun update(person: Person): Person {
        val removed = inMemory.removeIf {
            it.id == person.id
        }
        if (removed) {
            inMemory.add(person)
        }
        return person
    }

    override fun delete(id: UUID): Boolean {
        return inMemory.removeIf {
            it.id == id
        }
    }
}