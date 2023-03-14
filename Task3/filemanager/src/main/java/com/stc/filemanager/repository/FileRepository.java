package com.stc.filemanager.repository;

import com.stc.filemanager.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Repository
public interface FileRepository extends JpaRepository<FileData, Long> {
}
