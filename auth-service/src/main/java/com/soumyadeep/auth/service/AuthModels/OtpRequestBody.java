package com.soumyadeep.auth.service.AuthModels;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtpRequestBody {
    @NotNull(message = "Mobile cannot be null")
    @NotBlank(message= "Mobile cannot be blank")
    private String mobile;
}
