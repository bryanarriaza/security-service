package com.redkit.olimpo.securityservice.bs.service

import com.redkit.olimpo.securityservice.eis.bo.Menu

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:10
 */

interface MenuService {

    fun findById(_idMenu: String): Menu

    fun findAll(): ArrayList<Menu>

}