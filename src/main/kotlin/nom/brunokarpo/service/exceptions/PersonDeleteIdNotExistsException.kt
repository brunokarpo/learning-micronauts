package nom.brunokarpo.service.exceptions

import nom.brunokarpo.exceptions.GeneralException
import java.util.*

class PersonDeleteIdNotExistsException(id: UUID)
    : GeneralException("person.delete.id.not.exists", "person.delete.id.not.exists.details", arrayOf(id))
