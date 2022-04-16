import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableAutoConfiguration
@EnableNeo4jRepositories(basePackages = {"org.erlking.springboot.neo4j.repository."})
@EntityScan(basePackages = {"org.erlking.springboot.neo4j.entity."})
@EnableTransactionManagement
@ComponentScan
@Configuration
public class Configure {

    public static final String URI = "http://neo4j:123456@localhost:7474";

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration(){
        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
        config.driverConfiguration()
                .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
                .setURI(URI);
        return config;
    }
}