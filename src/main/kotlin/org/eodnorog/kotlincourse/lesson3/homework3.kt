package com.cathrino.org.eodnorog.kotlincourse.lesson3

class Homework3 {
    //Название мероприятия
    val nameEvent: String = "Hackathon Survival"

    //Дата проведения
    var dateEvent: String = "12.12.2024"

    //Место проведения
    var placeEvent: String = "Moscow City"

    //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    private var budget: String = "50000"

    //Количество участников
    var members: Int = 0
        get() = field
        private set(value){
            field = value
        }

    //Длительность хакатона
    var durationEvent: Long = 8*60*60

    //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг
    private lateinit var contactsInformation: String

    //Текущее состояние хакатона (статус)
    var statusEvent: String = "Draft"

    //Список спонсоров
    var listSponsors: String = "Иван Иванович"

    //Текущий уровень доступа к интернету
    var internetAccess: Int = 0

    //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки
    private var informationTransportationResources: String = "Information about transportation resources"

    //Количество команд
    var numberTeam: Int = 0

    //Перечень задач
    val listTasks: String = "List"

    //План эвакуации
    val planEvacuation: String = "Plan"
}
