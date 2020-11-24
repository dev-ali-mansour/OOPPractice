/**
 * OOPPractice Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOPPractice IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        ImageButton imageButton = new ImageButton();

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button is clicked");
            }
        });

        imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Image Button is clicked");
            }
        });

        button.click();
        imageButton.click();
    }
}
