package com.citynow.revollet.revollet_auth_service.dto.mapper;

import com.citynow.revollet.revollet_auth_service.dto.PrivilegeDto;
import com.citynow.revollet.revollet_auth_service.dto.RoleDto;
import com.citynow.revollet.revollet_auth_service.dto.UserDto;
import com.citynow.revollet.revollet_auth_service.model.Privilege;
import com.citynow.revollet.revollet_auth_service.model.Role;
import com.citynow.revollet.revollet_auth_service.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-03-10T11:26:13+0700",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_192 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmail( user.getEmail() );
        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setRole( roleToRoleDto( user.getRole() ) );

        return userDto;
    }

    @Override
    public List<UserDto> usersToUserDtos(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( userToUserDto( user ) );
        }

        return list;
    }

    protected PrivilegeDto privilegeToPrivilegeDto(Privilege privilege) {
        if ( privilege == null ) {
            return null;
        }

        PrivilegeDto privilegeDto = new PrivilegeDto();

        privilegeDto.setCode( privilege.getCode() );
        privilegeDto.setName( privilege.getName() );

        return privilegeDto;
    }

    protected List<PrivilegeDto> privilegeListToPrivilegeDtoList(List<Privilege> list) {
        if ( list == null ) {
            return null;
        }

        List<PrivilegeDto> list1 = new ArrayList<PrivilegeDto>( list.size() );
        for ( Privilege privilege : list ) {
            list1.add( privilegeToPrivilegeDto( privilege ) );
        }

        return list1;
    }

    protected RoleDto roleToRoleDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setCode( role.getCode() );
        roleDto.setName( role.getName() );
        roleDto.setPrivileges( privilegeListToPrivilegeDtoList( role.getPrivileges() ) );

        return roleDto;
    }
}
