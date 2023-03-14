package com.stc.filemanager.service;

import com.stc.filemanager.entity.FileData;
import com.stc.filemanager.entity.Item;
import com.stc.filemanager.entity.Permission;
import com.stc.filemanager.entity.PermissionGroup;
import com.stc.filemanager.enums.ItemType;
import com.stc.filemanager.exception.ResourceNotFoundException;
import com.stc.filemanager.repository.FileRepository;
import com.stc.filemanager.repository.ItemRepository;
import com.stc.filemanager.repository.PermissionGroupRepository;
import com.stc.filemanager.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Service
public class PermissionGroupServiceImp implements PermissionGroupService {

    @Autowired
    PermissionGroupRepository groupRepository;

    @Override
    public PermissionGroup createPermissionGroup(PermissionGroup permissionGroup) {
        return groupRepository.save(permissionGroup);
    }
}
