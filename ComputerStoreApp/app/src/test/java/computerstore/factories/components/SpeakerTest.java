package com.computerstore.factories.components;

/**
 * Created by Aidem on 2016/04/17.
 */

import org.junit.Test;
import com.computerstore.factories.components.SpeakerFactory;
import com.computerstore.domain.components.Speaker;
import junit.framework.Assert;

public class SpeakerTest {

    private SpeakerFactory factory;

    @Test
    public void testSpeakerCreation() throws Exception {
        Speaker speaker = factory.createSpeaker("PN 980-000354",50,"LOGITECH Z323",699.00);
        Assert.assertEquals(speaker.getDescription(),"LOGITECH Z323");
        Assert.assertEquals(speaker.getProductNumber(),"PN 980-000354");
        Assert.assertNotNull(speaker.getId());
    }

    @Test
    public void testSpeakerUpdate() throws Exception {
        Speaker speaker = factory.createSpeaker("PN 980-000354",50,"LOGITECH Z323",699.00);
        Assert.assertEquals(speaker.getDescription(),"LOGITECH Z323");
        Assert.assertEquals(speaker.getProductNumber(),"PN 980-000354");
        Assert.assertNotNull(speaker.getId());

        // Updated Description

        Speaker updateSpeaker = new Speaker.Builder()
                .Speaker(speaker)
                .price(899.00)
                .build();

        Assert.assertEquals(updateSpeaker.getPrice(),899.00);
        Assert.assertEquals(speaker.getProductNumber(),updateSpeaker.getProductNumber());
        Assert.assertEquals(speaker.getId(),updateSpeaker.getId());




    }

}

