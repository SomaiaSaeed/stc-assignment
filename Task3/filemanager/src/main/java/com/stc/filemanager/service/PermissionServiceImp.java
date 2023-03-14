package com.stc.filemanager.service;

import com.stc.filemanager.entity.Permission;
import com.stc.filemanager.entity.PermissionGroup;
import com.stc.filemanager.exception.ResourceNotFoundException;
import com.stc.filemanager.repository.PermissionGroupRepository;
import com.stc.filemanager.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Service
public class PermissionServiceImp implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Autowired
    PermissionGroupRepository groupRepository;
    @Override
    public Permission createPermission(Permission permission, long groupId) {
        return permissionRepository.save(permission);
    }
}
