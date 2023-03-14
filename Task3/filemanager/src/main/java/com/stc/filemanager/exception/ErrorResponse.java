package com.stc.filemanager.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    Object data;
    String message;
    int runtimeCode;
}
