package com.redkit.olimpo.securityservice.eis.bo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.io.Serializable

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 19/03/18 14:31
 */

@Document(collection = "menus")
data class Menu(
        @Id @Field var id: String,
        @Field var description: String,
        @Field var type: String
) : Serializable
