package nom.brunokarpo.service.exceptions

import nom.brunokarpo.exceptions.NotFoundException
import java.util.*

class PersonNotFoundException(identifier: UUID)
    : NotFoundException("person.not.found", "person.not.found.details", arrayOf(identifier))
