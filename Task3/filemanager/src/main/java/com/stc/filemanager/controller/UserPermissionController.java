package com.stc.filemanager.controller;

import com.stc.filemanager.entity.Permission;
import com.stc.filemanager.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@RestController
@RequestMapping("/user")
public class UserPermissionController {
    @Autowired
    PermissionService permissionService;

    @PostMapping(path = "/permission/{groupId}")
    public ResponseEntity<Permission> CreatePermission(@RequestBody Permission permission,
                                                       @PathVariable long groupId )  {
        Permission savedPermission = permissionService.createPermission(permission,groupId);

        if (savedPermission != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(savedPermission);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}