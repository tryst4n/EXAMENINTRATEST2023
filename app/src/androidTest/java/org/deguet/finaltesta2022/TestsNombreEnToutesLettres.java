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

    @Test
    public void nombreEnToutesLettresOk5() {
        ServiceNombre service = new ServiceNombre();
        String s = service.leNombreEnToutesLettres(5L);
        Assert.assertEquals("cinq", s);
    }

    @Test
    public void nombreEnToutesLettresOk10() {
        ServiceNombre service = new ServiceNombre();
        String s = service.leNombreEnToutesLettres(10L);
        Assert.assertEquals("dix", s);
    }

    @Test
    public void nombreEnToutesLettresOk15() {
        ServiceNombre service = new ServiceNombre();
        String s = service.leNombreEnToutesLettres(15L);
        Assert.assertEquals("quinze", s);
    }

    @Test
    public void testAccordCentPlurielPour3500() {
        ServiceNombre service = new ServiceNombre();
        assertEquals("trois mille cinq cents", service.leNombreEnToutesLettres(3500L));
    }

    @Test
    public void testAccordCentPlurielPour3501() {
        ServiceNombre service = new ServiceNombre();
        assertEquals("trois mille cinq cent un", service.leNombreEnToutesLettres(3501L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametreNull() {
        ServiceNombre service = new ServiceNombre();
        service.leNombreEnToutesLettres(null);
    }

    @Test
    public void testRepresentationCorrectePourZero() {
        ServiceNombre service = new ServiceNombre();
        assertEquals("zéro", service.leNombreEnToutesLettres(0L));
    }

    @Test
    public void testRepresentationCorrectePourNombreNegatif() {
        ServiceNombre service = new ServiceNombre();
        assertEquals("moins dix", service.leNombreEnToutesLettres(-10L));
    }

}