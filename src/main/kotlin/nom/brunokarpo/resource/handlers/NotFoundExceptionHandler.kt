package nom.brunokarpo.resource.handlers

import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import nom.brunokarpo.exceptions.ErrorDTO
import nom.brunokarpo.exceptions.NotFoundException
import javax.inject.Singleton

@Produces
@Singleton
@Requires(classes = [NotFoundException::class])
class NotFoundExceptionHandler: ExceptionHandler<NotFoundException, HttpResponse<ErrorDTO>> {

    override fun handle(request: HttpRequest<*>, exception: NotFoundException): HttpResponse<ErrorDTO>
            = HttpResponse.notFound(ErrorDTO(exception))


}