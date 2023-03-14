package com.stc.filemanager.repository;

import com.stc.filemanager.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    Optional<Permission> findByUserEmail(String userEmail);
}
