package co.novu.springbootnovuclient.controller

import co.novu.springbootnovuclient.client.NovuClient
import co.novu.springbootnovuclient.model.NovuRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


//remove controller post testing
@RestController
class NovuTestController(
        private val novuClient: NovuClient
) {


    @PostMapping("/trigger")
    fun testNovuTrigger(@RequestBody novuRequest: NovuRequest):ResponseEntity<Any>{
        return ResponseEntity.ok(novuClient.trigger(novuRequest));
    }
}