package hibernate.service.serv;

import hibernate.config.TestConfig;
import hibernate.dao.serv.AccountDao;
import hibernate.model.Account;
import hibernate.service.AccountServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.validation.Errors;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class, loader = AnnotationConfigContextLoader.class)
class AccountServiceTest {

    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @Autowired
    private AccountService accountService;

    private static final int userId = 232;
    private static final Account account = mock(Account.class);

    @BeforeAll
    public static void setup() {
        when(account.getId()).thenReturn(userId);
    }

    @Test
    public void validateShouldAcceptUserWithNewEmail() {
        when(accountService.getAccountById(userId)).thenReturn(null);
        Errors errors = mock(Errors.class);
        verify(errors, never()).rejectValue(eq("email"), any(), any());
    }
}