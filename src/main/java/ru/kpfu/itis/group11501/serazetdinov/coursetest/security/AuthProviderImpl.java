package ru.kpfu.itis.group11501.serazetdinov.coursetest.security;

/**
 * Created by 1 on 29.05.2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.Status;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.model.User;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthProviderImpl implements AuthenticationProvider {

    private static final PasswordEncoder encoder = new BCryptPasswordEncoder();

    private final UserService userService;

    @Autowired
    public AuthProviderImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        User user = userService.getUser(login);
        if (user == null) {
            throw new UsernameNotFoundException("Пользователь не найден!");
        }

        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("Неверный пароль!");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getStatus().getName()));
        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }

}
