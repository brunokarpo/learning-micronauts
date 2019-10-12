package nom.brunokarpo.service

import nom.brunokarpo.model.Person
import nom.brunokarpo.repository.PersonRepository
import nom.brunokarpo.service.exceptions.PersonNotFoundException
import java.util.*
import javax.inject.Singleton

@Singleton
class PersonService(
        private val repository: PersonRepository
) {

    fun create(person: Person): Person {
        person.id = UUID.randomUUID()
        return repository.save(person)
    }

    fun findByIdentifier(identifier: UUID): Person {
        return repository.findByIdentifier(identifier) ?: throw PersonNotFoundException(identifier)
    }

}