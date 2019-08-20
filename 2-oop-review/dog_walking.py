class Animal:

    def __init__(self, species):
        self.is_hungry = True
        self.species = species

    def eat(self):
        self.is_hungry = False


class Dog(Animal):

    def __init__(self, name, age):
        self.name = name
        self.age = age
        Animal.__init__(self, "mammal")

    @staticmethod
    def talk(name, predicate):
        print("\n" + name + " is " + str(predicate) + ".")

    def present(self):
        self.talk(self.name, self.age)

    @classmethod
    def walk(cls, name):
        cls.talk(name, "walking")


class Pets:

    def __init__(self, all_pets):
        self.all_pets = all_pets

    def feed(self, name):
        for pet in self.all_pets:
            if pet.name == name:
                pet.eat()

    def report(self):
        print("\nI have " + str(len(self.all_pets)) + " pets.")
        all_mammals = True
        for pet in self.all_pets:
            pet.present()
            if pet.species != 'mammal':
                all_mammals = False
        if all_mammals: print("\nThey are all mammals, ofc.")
        self.check_hunger_all()

    def check_hunger_all(self):
        for pet in self.all_pets:
            if pet.is_hungry:
                all_not_hungry = False
        if all_not_hungry: print("\nThey are not hungry.")

    def walk_all(self):
        for pet in self.all_pets:
            pet.walk(pet.name)