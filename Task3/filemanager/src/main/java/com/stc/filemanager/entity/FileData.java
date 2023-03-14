package com.stc.filemanager.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Data
@Entity
@Table(name = "files")
public class FileData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "binaryData")
    private byte[] binary;

    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;

}