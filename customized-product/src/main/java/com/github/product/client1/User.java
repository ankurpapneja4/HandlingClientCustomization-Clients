package com.github.product.client1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends com.github.product.core.User {


    private String organization;

    public User( com.github.product.core.User  parent){
        super( parent );
    }

    public static final User fromParent(com.github.product.core.User parent){
        return new User( parent );
    }
}
