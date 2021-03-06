 package com.example.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.CustomUser;
import com.example.repositories.CustomUserRepository;
/**
 * @author Mouhamadou Saliou Diallo
 *
 */
@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        CustomUser user = userRepository.findByEmail(userName)
       .orElseThrow(() -> new UsernameNotFoundException("Email " + userName + " not found"));
         return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
         getAuthorities(user));
    }

    private static Collection<? extends GrantedAuthority> getAuthorities(CustomUser user) {
        String[] userRoles = user.getCustomRoles().stream().map((role) -> role.getName()).toArray(String[]::new);
        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
        return authorities;
    }
}
