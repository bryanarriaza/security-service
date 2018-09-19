package com.redkit.olimpo.securityservice.bs.service.impl

import com.redkit.olimpo.securityservice.bs.repository.MenuRepository
import com.redkit.olimpo.securityservice.bs.service.MenuService
import com.redkit.olimpo.securityservice.eis.bo.Menu
import org.springframework.stereotype.Service

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:11
 */

@Service
class MenuServiceImpl(val menuRepository: MenuRepository) : MenuService {

    override fun findById(_idMenu: String) = menuRepository.findById(_idMenu)

    override fun findAll(): ArrayList<Menu> = menuRepository.findAll()

}