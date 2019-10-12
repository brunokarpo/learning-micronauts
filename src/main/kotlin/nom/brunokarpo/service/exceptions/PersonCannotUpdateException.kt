package nom.brunokarpo.service.exceptions

import nom.brunokarpo.exceptions.GeneralException
import java.util.*

class PersonCannotUpdateException(id: UUID)
    : GeneralException("person.cannot.update", "person.cannot.update.details", arrayOf(id))
