package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog
    {
        @Test
        public void it_should_have_a_name() throws Exception
            {
            LocalDateTime birthday = LocalDateTime.now();

            //Dog fido = new Dog("Fido", "Poodle", birthday);
            Dog fido = Dog.called("Fido")
                        .ofBreed("Poodle")
                        .ofColor("black")
                        .withFavoriteFood("pizza")
                        .bornOn(birthday);

            Assert.assertEquals("Fido", fido.getName());
            Assert.assertEquals("Poodle", fido.getBreed());
            Assert.assertEquals(birthday, fido.getDateOfBirth());
            Assert.assertEquals("pizza", fido.getFavoriteFood());
            Assert.assertEquals("black", fido.getColor());
            }
    }
