package nom.brunokarpo.service.exceptions

import nom.brunokarpo.exceptions.GeneralException

class PersonUpdateWithoutIdException
    : GeneralException("person.update.without.id", "person.update.without.id.details", emptyArray())