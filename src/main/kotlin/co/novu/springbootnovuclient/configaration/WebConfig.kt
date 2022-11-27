package co.novu.springbootnovuclient.configaration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer



//remove  post testing
@Configuration
open class WebConfig {
    @Bean
    open fun webSecurityCustomizer(): WebSecurityCustomizer? {
        return WebSecurityCustomizer { web: WebSecurity ->
            web.ignoring()
                    .antMatchers("/**")
        }
    }
}