package com.codeinpython.codeinpython;


 class codeSampleClass {

    private String codeTitle;
    private int codeImage;

    codeSampleClass(int codeImage, String codeTitle)
    {
        this.codeImage = codeImage;
        this.codeTitle = codeTitle;
    }

      int getCodeImage() {
         return codeImage;
     }

      String getCodeTitle() {
         return codeTitle;
     }
 }
