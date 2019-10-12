package nom.brunokarpo.resource

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloWorldResource {

    @Get
    fun sayHello(): HttpResponse<String> =
            HttpResponse.ok("Hello World")

}