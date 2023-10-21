package hr.kingict.springbootakademija2023.config;

import com.amadeus.Amadeus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmadeusConfig {
@Bean
    public Amadeus getAmadeus(){
        return Amadeus
                .builder("XduTUFV4ImHciYs89X1OMpBZuvVR0Fp9","ddVp1bi7ASwDvE5V")
                .build();
    }
}
