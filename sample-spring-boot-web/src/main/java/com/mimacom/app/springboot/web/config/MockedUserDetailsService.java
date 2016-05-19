package com.mimacom.app.springboot.web.config;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

class MockedUserDetailsService implements UserDetailsService {

    private static final String MOCKED_USERNAME = "user";

    private static final String MOCKED_USER_PASSOWRD = "secret";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!username.equalsIgnoreCase(MOCKED_USERNAME)) {
            throw new UsernameNotFoundException("");
        }
        return new User(MOCKED_USERNAME, MOCKED_USER_PASSOWRD, AuthorityUtils.commaSeparatedStringToAuthorityList("user"));
    }
}
