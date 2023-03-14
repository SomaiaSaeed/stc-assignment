package com.stc.filemanager.entity;

import com.stc.filemanager.enums.PermissionLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;

    @Enumerated(EnumType.STRING)
    private PermissionLevel permissionLevel;

//    @ManyToOne(targetEntity = PermissionGroup.class, fetch = FetchType.LAZY)
//    @Cascade({org.hibernate.annotations.CascadeType.ALL})
//    @JoinColumns(value = {@JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)}, foreignKey = @ForeignKey(name = "GroupDefinedBy"))
//    @LazyToOne(value = LazyToOneOption.NO_PROXY)
//    private PermissionGroup permissionGroup;

}