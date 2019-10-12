package nom.brunokarpo.exceptions

abstract class NotFoundException(reason: String, detail: String, params: Array<Any>)
    : GeneralException(reason, detail, params)