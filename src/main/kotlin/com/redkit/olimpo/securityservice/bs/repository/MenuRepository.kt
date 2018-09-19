package com.redkit.olimpo.securityservice.bs.repository

import com.redkit.olimpo.securityservice.eis.bo.Menu
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:04
 */

@Repository
interface MenuRepository : MongoRepository<Menu, String> {

    fun findById(_idMenu: String): Menu

    override fun findAll(): ArrayList<Menu>

}