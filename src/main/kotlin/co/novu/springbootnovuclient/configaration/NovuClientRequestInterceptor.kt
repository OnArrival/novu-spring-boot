package co.novu.springbootnovuclient.configaration

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
open class NovuClientRequestInterceptor : RequestInterceptor {
    private val AUTHORIZATION_HEADER = "Authorization"
    private val TOKEN_TYPE = "ApiKey"


    //need to interface for getting auth

    override fun apply(requestTemplate: RequestTemplate) {
        requestTemplate.header(AUTHORIZATION_HEADER, String.format("%s %s", TOKEN_TYPE, "{{key form config bean}}"))
    }
}
