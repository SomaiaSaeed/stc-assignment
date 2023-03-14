package com.stc.filemanager.service;

import com.stc.filemanager.entity.Item;
import com.stc.filemanager.enums.ItemType;

import java.io.IOException;
import java.util.Map;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
public interface ItemService {
    Item createItem(Item item, ItemType itemType) throws IOException;
}
