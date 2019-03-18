package com.citynow.revollet.revollet_auth_service.dto.mapper;

import com.citynow.revollet.revollet_auth_service.dto.UserDto;
import com.citynow.revollet.revollet_auth_service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    //UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "email", target = "email")
    UserDto userToUserDto(User user);

    List<UserDto> usersToUserDtos(List<User> users);
}
