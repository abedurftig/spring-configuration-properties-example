package curious.developer.configurationpropertiesexample

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class ConfigurationPropertiesExampleApplicationTests {

	@Autowired
	private lateinit var applicationProperties: ApplicationProperties

	@Autowired
	private lateinit var applicationContext: ApplicationContext

	@Test
	fun contextLoads() {

		Assertions.assertEquals("src/main/resources", applicationProperties.someProperty, "someProperty should be populated")
		Assertions.assertEquals("src/test/resources", applicationProperties.someOtherProperty, "someOtherProperty should be populated")
	}
}
