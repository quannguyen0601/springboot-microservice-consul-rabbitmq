package com.citynow.revollet.revollet_auth_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    @NotEmpty
    private String code;
    @NotEmpty
    private String name;
    @NotEmpty
    private List<PrivilegeDto> privileges = new ArrayList<>();
}
