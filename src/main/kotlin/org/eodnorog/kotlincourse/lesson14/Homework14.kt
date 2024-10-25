package org.eodnorog.kotlincourse.lesson14

fun main() {
//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.

//1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val autoTestSuits = mapOf(
        "AutoTest_1" to 0.75,
        "AutoTest_2" to 0.76,
        "AutoTest_3" to 0.98,
        "AutoTest_4" to 0.65,
        "AutoTest_5" to 0.90
    )
    val averageTimeSec = autoTestSuits.values.average()
    println("1 - $averageTimeSec")

//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val mapMeta = mapOf(
        "AutoTest_1" to "User",
        "AutoTest_2" to "Password",
        "AutoTest_3" to "Number",
        "AutoTest_4" to "Pin",
        "AutoTest_5" to "Phone"
    )
    println("2 - ${mapMeta.keys}")

//3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val mapMutaMeta = mutableMapOf(
        "AutoTestSuite_1" to "User",
        "AutoTestSuite_2" to "Password",
        "AutoTestSuite_3" to "Number",
    )
    mapMutaMeta["AutoTestSuite_4"] = "PIN!!!"
    println("3 - $mapMutaMeta")

//4. Посчитайте количество успешных тестов в словаре с результатами.
    val mapSuccessTests = mutableMapOf(
        "AutoTest_1" to "Pass",
        "AutoTest_2" to "Fail",
        "AutoTest_3" to "Pass",
        "AutoTest_4" to "Pass",
        "AutoTest_5" to "Fail",
    )
    val count = mapSuccessTests.count { it.value.contains("Pass") }
    println("4 - $count")

//5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val mapDelete = mutableMapOf(
        "Bag1" to "Fix",
        "Bag2" to "Progress",
        "Bag3" to "Progress",
    )
    mapDelete.remove("Bag1")
    println("5 - $mapDelete")

//6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val webTests = mutableMapOf(
        "URL_Login" to 200,
        "URL_Password" to 400,
        "URL_Main" to 300,
    )
    webTests.forEach {
        print("| 6 - ${it.key} status ${it.value} ")
    }

//7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val mapWebTests = mutableMapOf(
        "URL_Login" to 1.54,
        "URL_Password" to 4.56,
        "URL_Main" to 2.5,
        "AutoTest_4" to 0.8,
        "AutoTest_5" to 1.42,
    )
    val time = mapWebTests.filter { it.value > 2 }
    println("")
    println("7 - $time")

//8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val mapAPITests = mutableMapOf(
        "endpoint_Login" to 300,
        "endpoint_Password" to 201,
        "endpoint_Main" to 404,
        "endpoint_Settings" to 500,
        "endpoint_Chat" to 201,
    )
    val new = mapAPITests.getOrDefault("", "не был протестирован")
    println("8 - $new")

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для "browserType". Ответ не может быть null.
    val mapConfigEnviroments = mutableMapOf(
        "conf_Login" to 300,
        "conf_Password" to 201,
        "conf_Main" to 404,
        "conf_Settings" to 500,
        "conf_Chat" to 201,
    )
    val newConf = mapConfigEnviroments.getOrDefault("browserType", "")
    println("9 - $newConf")

//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val copyMapWithDate = mapConfigEnviroments + ("conf_Store" to 300)
    println("10 - $copyMapWithDate")

//11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства), получите настройки для конкретной модели или верните настройки по умолчанию.
    val settingMobyVersion = mutableMapOf(
        "phone_one" to "One_Set",
        "phone_xiomi" to "Xiomi_Set",
        "phone_iPhone" to "iPhone_Set",
    )
    val returnSettingMobyVersion = settingMobyVersion.getOrDefault("phone_xiomi", "настройки по умолчанию")
    println("11 - $returnSettingMobyVersion")

//12. Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val newMapConfigEnviroments: Boolean = mapConfigEnviroments.containsValue(404)
    println("12 - $newMapConfigEnviroments")

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val testIDVersion = mapOf(
        "TestID_Version_001" to "Passed",
        "TestID_Version_002" to "Failed",
        "TestID_Version_003" to "Skipped",
        "TestID_Version_004" to "Passed",
        "TestID_Version_005" to "Failed"
    )
    val newTestIDVersion = testIDVersion.filter { it.key.contains("TestID_Version_001") }
    println("13 - $newTestIDVersion")

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val failTestIDVersion = testIDVersion.filter { it.value.contains("Failed") }
    print("14 - $failTestIDVersion ")
    println()

//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    settingMobyVersion.putAll(testIDVersion)
    println("15 - $settingMobyVersion")

//16. Объедините два неизменяемых словаря с данными о багах.
    val newSettingMobyVersion = mapMeta + testIDVersion
    println("16 - $newSettingMobyVersion")

//17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    mapWebTests.clear()
    println("17 - $mapWebTests")

//18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    println("18 - ${testIDVersion.filterNot { it.value == "Skipped" }}")

//19. Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    mapConfigEnviroments.remove("conf_Login")
    println("19 - $mapConfigEnviroments")

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val reportTest =
        mutableMapOf(
            "Test_1001" to "Pass",
            "Test_1002" to "Pass",
            "Test_1003" to "Fail",
            "Test_1004" to "Skip",
            "Test_1004" to "Skip",
        )
    println("20 - " + reportTest.map { "${it.key}: ${it.value}" })

//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    println("21 - ${reportTest.toMap()}")

    //22. Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
    fun getNameById(id: String): String {
        return when (id) {
            "Test_1001" -> "conf_Login"
            "Test_1002" -> "conf_Password"
            "Test_1003" -> "conf_Main"
            "Test_1004" -> "conf_Settings"
            else -> "UNKNOW"
        }
    }
    println("22 - ${reportTest.mapKeys { getNameById(it.key) }}")

//23. Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val newMapWebTests = autoTestSuits.mapValues { it.value + 0.1 }
    println("23 - $newMapWebTests")

//24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    println("24 - ${mapWebTests.isEmpty()}")

//25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    println("25 - ${autoTestSuits.isNotEmpty()}")

//26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    println("26 - ${reportTest.all { it.value.contains("Pass") }}")

//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    println("27 - ${reportTest.any { it.value.contains("Fail") }}")

//28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    println("28 - ${reportTest.filterNot { it.value.contains("Pass") || it.key.contains("optional") }}")
}
