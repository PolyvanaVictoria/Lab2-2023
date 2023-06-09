import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ApplicationConfig::class.java)
    val container = context.getBean(Container::class.java)

    val лік1 = Ліки("Лік1", "Таблетки", "ФармЕксперт", "2023-01-01", "2024-03-01", "52.0", "true")
    val лік2 = Ліки("Лік2", "Капсули", "МЕДІАФарм", "2023-04-03", "2026-05-01", "128.8", "false")
    val лік3 = Ліки("Лік3", "Суспензія", "FARMA", "2021-06-06", "2024-12-01", "258.7", "false")
    val лік4 = Ліки("Лік4", "Краплі", "ФармЕксперт", "2022-09-14", "2026-09-14", "370.0", "false")

    val лікарня1 = Лікарня("Міська", "Незалежності2", "Спеціалізована", "2015-01-01", 5, 100, true, listOf(лік1, лік2))
    val лікарня2 = Лікарня("Обласна", "Перемоги8", "Загальна", "1980-02-01", 3, 50, false, listOf(лік3, лік4))
    val лікарня3 = Лікарня("Приватна", "Кільцева75", "Спеціалізована", "2006-07-15", 6, 175, true, listOf(лік1, лік4))



    container.add(лікарня1)
    container.add(лікарня2)
    container.add(лікарня3)
    container.add(лік1)
    container.add(лік2)
    container.add(лік3)
    container.add(лік4)

    val entity = container.get(3)
    container.remove(4)

}
