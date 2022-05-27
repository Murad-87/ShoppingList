package com.example.myshoppinglist.presentetion

import androidx.recyclerview.widget.DiffUtil
import com.example.myshoppinglist.domain.ShopItem

class ShopItemCallback : DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
       return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }


}