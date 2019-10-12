package nom.brunokarpo.service

import nom.brunokarpo.model.Person
import nom.brunokarpo.repository.PersonRepository
import nom.brunokarpo.service.exceptions.PersonCannotUpdateException
import nom.brunokarpo.service.exceptions.PersonNotFoundException
import nom.brunokarpo.service.exceptions.PersonUpdateWithoutIdException
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

    fun update(person: Person): Person {
        if (person.id == null) {
            throw PersonUpdateWithoutIdException()
        }
        repository.findByIdentifier(person.id!!) ?: throw PersonCannotUpdateException(person.id!!)
        return repository.update(person)
    }

}