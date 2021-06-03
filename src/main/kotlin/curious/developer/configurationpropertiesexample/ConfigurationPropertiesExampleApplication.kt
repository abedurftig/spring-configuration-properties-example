package curious.developer.configurationpropertiesexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["curious.developer.configurationpropertiesexample"])
@ConfigurationPropertiesScan
class ConfigurationPropertiesExampleApplication

fun main(args: Array<String>) {
	runApplication<ConfigurationPropertiesExampleApplication>(*args)
}

@ConfigurationProperties(prefix = "cpe.notroot")
class ApplicationProperties {

	var someProperty: String? = null
	var someOtherProperty: String? = null
}
