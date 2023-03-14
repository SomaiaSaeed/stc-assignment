package com.stc.filemanager.service;

import com.stc.filemanager.entity.Permission;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
public interface PermissionService {
    Permission createPermission(Permission permission, long groupId);
}
