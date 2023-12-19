package org.deguet.finaltesta2022;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TestsNombreEnToutesLettres {
    @Test
    public void nombreEnToutesLettresOk0() {
        ServiceNombre service = new ServiceNombre();
        String s = service.leNombreEnToutesLettres(0L);
        Assert.assertEquals("zéro", s);
    }

}