package hibernate.config;

import hibernate.dao.AccountDaoImpl;
import hibernate.service.AccountServiceImpl;
import hibernate.service.serv.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class TestConfig {

    @Bean
    public AccountServiceImpl accountDao(){
        return new AccountServiceImpl();
    }

    @Bean
    public AccountService accountService(){
        return mock(AccountService.class);
    }
}
