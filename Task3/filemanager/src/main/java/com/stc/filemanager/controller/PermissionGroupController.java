package com.stc.filemanager.controller;

import com.stc.filemanager.entity.Item;
import com.stc.filemanager.entity.PermissionGroup;
import com.stc.filemanager.enums.ItemType;
import com.stc.filemanager.service.ItemService;
import com.stc.filemanager.service.PermissionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@RestController
@RequestMapping("/group")
public class PermissionGroupController {
    @Autowired
    PermissionGroupService permissionGroupService;

    @PostMapping(path = "/permissionGroup")
    public ResponseEntity<PermissionGroup> CreatePermissionGroup(@RequestBody PermissionGroup permissionGroup)  {
        PermissionGroup savedPermissionGroup = permissionGroupService.createPermissionGroup(permissionGroup);

        if (savedPermissionGroup != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(savedPermissionGroup);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

}