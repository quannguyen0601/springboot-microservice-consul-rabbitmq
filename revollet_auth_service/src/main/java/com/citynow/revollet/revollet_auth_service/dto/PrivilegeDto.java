package com.citynow.revollet.revollet_auth_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegeDto {
    @NotEmpty
    private String code;
    @NotEmpty
    private String name;
}
