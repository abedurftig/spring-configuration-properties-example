package curious.developer.configurationpropertiesexample

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles(value = ["test"])
class ConfigurationPropertiesExampleApplicationTests {

	@Autowired
	private lateinit var applicationProperties: ApplicationProperties

	@Autowired
	private lateinit var applicationContext: ApplicationContext

	@Test
	fun contextLoads() {

		Assertions.assertTrue(applicationContext.environment.activeProfiles.contains("test"))
		Assertions.assertEquals("src/main/resources", applicationProperties.someProperty, "someProperty should be populated")
		Assertions.assertEquals("src/test/resources", applicationProperties.someOtherProperty, "someOtherProperty should be populated")
	}
}
