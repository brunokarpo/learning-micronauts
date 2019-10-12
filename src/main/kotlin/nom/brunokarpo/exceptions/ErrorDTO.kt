package nom.brunokarpo.exceptions

data class ErrorDTO(
        var reason: String,
        var detail: String,
        var params: Array<Any>
) {
    constructor(generalException: GeneralException)
            : this(reason = generalException.reason, detail = generalException.details, params = generalException.params)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ErrorDTO

        if (reason != other.reason) return false
        if (detail != other.detail) return false
        if (!params.contentEquals(other.params)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = reason.hashCode()
        result = 31 * result + detail.hashCode()
        result = 31 * result + params.contentHashCode()
        return result
    }
}