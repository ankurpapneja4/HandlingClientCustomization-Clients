package com.github.product.client1;

import com.github.product.core.UserService;
import com.github.product.core.UserServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserServiceClient1Impl
        extends UserServiceImpl
        implements UserService {

    @Override
    public User getUser(){
        User user = User.fromParent(super.getUser());
                    user.setOrganization( "Client1" );

        return user;
    }
}
