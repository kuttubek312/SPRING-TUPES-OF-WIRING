package com.peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 duck5;

    @Autowired
    public Rabbit4(Duck5 duck5) {
        this.duck5 = duck5;
    }

    @Override
    public String toString() {
        return ", в зайце утка \uD83E\uDD86" + duck5.toString();
    }
}
