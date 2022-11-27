package co.novu.springbootnovuclient.client

import co.novu.springbootnovuclient.model.NovuRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name = "novu-client", url = "https://api.novu.co", path = "/v1")
interface NovuClient {

    @PostMapping("/events/trigger")
    fun trigger(novuRequest: NovuRequest):Any
}