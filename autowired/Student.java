package com.full.fullexa;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

        int id;
        MathCheat mathcheat;

        public void setId(int id) {
            this.id = id;
        }
    @Autowired
        public void setMathcheat(MathCheat mathcheat) {
            this.mathcheat = mathcheat;
        }
//    @Autowired
        public void cheating() {
            mathcheat.mathCheat();
            System.out.println("id is : "+ id);
        }
    }
