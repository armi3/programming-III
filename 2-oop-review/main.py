import dog_walking as dw

philo = dw.Dog("Philo", 5)
mikey = dw.Dog("Mikey", 6)
laika = dw.Dog("Laika", 7)
my_dogs = dw.Pets([philo, mikey, laika])
my_dogs.report()