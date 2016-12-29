package com.gm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest
{

    private IMessage messageService;

    @Before
    public void setUp() {
        messageService = new MessageImpl();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello gm", messageService.sayHello());
    }
}
