package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog
    {
        private  final String name;
        private  final String breed;
        private  final LocalDateTime dateOfBirth;
        private  final String favoriteFood;
        private  final String color;


        private Dog(String name, String breed, LocalDateTime dateOfBirth, String favoriteFood, String color)
            {
            this.name = name;
            this.breed = breed;
            this.dateOfBirth = dateOfBirth;
            this.favoriteFood = favoriteFood;
            this.color = color;
            }

        public String getName()
            {
            return name;
            }

        public String getBreed()
            {
            return breed;
            }

        public LocalDateTime getDateOfBirth()
            {
            return dateOfBirth;
            }

        public String getFavoriteFood()
            {
            return favoriteFood;
            }

        public static WithBreed called(String name)
            {
            return new DogBuilder(name);
            }


        public String getColor()
            {
            return color;
            }

        interface WithBreed
            {
                OfColor ofBreed(String breed);
            }

        interface OfColor
            {
                DogBuilder ofColor(String color);
            }


        public static class DogBuilder implements WithBreed, OfColor
            {
                private String name;
                private String breed;
                private LocalDateTime birthday;
                private String favoriteFood;
                private String color;


                public DogBuilder(String name)
                    {
                    this.name = name;
                    }

                public DogBuilder ofBreed(String breed)
                    {
                    this.breed = breed;
                    return this;
                    }

                public Dog bornOn(LocalDateTime birthday)
                    {
                    return new Dog(name, breed, birthday, favoriteFood, color);
                    }

                public DogBuilder withFavoriteFood(String favoriteFood)
                    {
                    this.favoriteFood = favoriteFood;
                    return this;
                    }

                public DogBuilder ofColor(String color)
                    {
                    this.color = color;
                    return this;
                    }
            }
    }
