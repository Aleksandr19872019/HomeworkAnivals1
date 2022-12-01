fun main(args: Array<String>) {
    println("Класс травоядные : ")
    println("""Жираф - вес 1000 кг; 
Заяц - вес 5 кг.""")
    val herbivore1 = Herbivore1("Жираф", 1000)
    val herbivore2= Herbivore2("hare", 5)
    println("Класс плотоядные : ")
    println("""Бурый медведь - вес 400 кг;
Гепард - вес 40 кг.""")
    val carnivores1 = Carnivores1("Brown Bear", 400)
    val carnivores2 = Carnivores2("cheetah", 40)
}


