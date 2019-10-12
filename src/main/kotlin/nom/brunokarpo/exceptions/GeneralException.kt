package nom.brunokarpo.exceptions

abstract class GeneralException(
        var reason: String,
        var details: String,
        var params: Array<Any>
): Exception()