import kotlin.random.Random

fun main(){
    abstract class Animal(name: String, age: Int){
        abstract fun talk()
    }
    class Dogs(val name: String, val age: Int): Animal(name, age){
        override fun talk() {
            println("$name: Woof'")
        }
    }
    class Cats(val name: String, val age: Int): Animal(name, age){
        override fun talk() {
            println("$name: Meow")
        }
    }

    val animal_ages = listOf(2,3,6,7,9,10,8,4)

    val cats = listOf<Cats>(
        Cats("Lili", animal_ages[Random.nextInt(animal_ages.size)]),
        Cats("Meep", animal_ages[Random.nextInt(animal_ages.size)]),
        Cats("Patchy", animal_ages[Random.nextInt(animal_ages.size)]),
        Cats("Furball", animal_ages[Random.nextInt(animal_ages.size)]),
        Cats("Snowball", animal_ages[Random.nextInt(animal_ages.size)])
    )

    val dogs = listOf<Dogs>(
        Dogs("Fluffy", animal_ages[Random.nextInt(animal_ages.size)]),
        Dogs("Rufus", animal_ages[Random.nextInt(animal_ages.size)]),
        Dogs("Brian", animal_ages[Random.nextInt(animal_ages.size)]),
        Dogs("Fred", animal_ages[Random.nextInt(animal_ages.size)]),
        Dogs("Spot", animal_ages[Random.nextInt(animal_ages.size)])
    )

    for(cat in cats){
        cat.talk()
        for(dog in dogs){
            if(cat.age < dog.age){
                dog.talk()
            }
        }
    }
}