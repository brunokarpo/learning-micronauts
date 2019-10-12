package nom.brunokarpo.resource

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import nom.brunokarpo.resource.dto.PersonDTO
import nom.brunokarpo.service.PersonService
import java.net.URI
import java.util.*
import javax.inject.Inject

@Controller("/person")
class PersonResource(
        @Inject private val service: PersonService
) {

    @Post
    fun create(personDTO: PersonDTO): HttpResponse<PersonDTO> {
        val person = service.create(personDTO.toPerson())
        return HttpResponse.created(PersonDTO(person), URI("/person/${person.id}"))
    }

    @Get
    fun findByIdentifier(@QueryValue("id") id: UUID): HttpResponse<PersonDTO> {
        val person = service.findByIdentifier(id)
        return HttpResponse.ok(PersonDTO(person))
    }

    @Put
    fun update(personDTO: PersonDTO): HttpResponse<PersonDTO> {
        val person = service.update(personDTO.toPerson())
        return HttpResponse.ok(PersonDTO(person))
    }
}