package com.stc.filemanager.repository;

import com.stc.filemanager.entity.PermissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Repository
    public interface PermissionGroupRepository extends JpaRepository<PermissionGroup, Long> {
}
