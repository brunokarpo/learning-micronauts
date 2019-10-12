package nom.brunokarpo.repository

import nom.brunokarpo.model.Person

interface PersonRepository {

    fun save(person: Person): Person

}