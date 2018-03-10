package config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configurable
@Import({DataConfig.class})
@ComponentScan({"service", "utils"})
public class RootConfig {

}


