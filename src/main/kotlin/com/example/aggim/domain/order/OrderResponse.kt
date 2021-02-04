package com.example.aggim.domain.order

import com.example.aggim.common.AggimException
import com.example.aggim.domain.product.Product

data class OrderResponse(
    val name: String,
    val products: List<Product>,
    val userId: Long
)

fun Order.toOrderResponse() = id?.let {
    OrderResponse(
        name,
        products,
        userId
    )
} ?: throw AggimException("주문 정보를 찾을 수 없습니다.")