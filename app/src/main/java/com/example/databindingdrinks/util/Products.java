package com.example.databindingdrinks.util;

import com.example.databindingdrinks.R;
import com.example.databindingdrinks.models.Product;

import java.math.BigDecimal;
import java.util.HashMap;


/**
 * Created by User on 2/6/2018.
 */

public class Products {

    public Product[] PRODUCTS = {SMIRNOFF, KENYA_CANE, BLACK_LABEL, TUSKER_MALT, CHROME_VODKA, ChROME_VODKA_LEMON, KIBAO_MZINGA, KIBAO_VODKA_QUATER, RED_LAMP, YELLOW_LAMP, BLUE_MUG, WHITE_MUG, RED_MUG, BLACK_HAT, BLUE_HAT, WHITE_HAT, ORANGE_HAT,
    WHITE_SHIRT_MALE, WHITE_SHIRT_FEMALE, BLACK_SHIRT_FEMALE, BLACK_SHIRT_MALE, GREY_FIDGET_SPINNER, GREEN_FIDGET_SPINNER, ICELAND_PICTURE
    , ICEY_COAST_PICTURE, HAVASU_FALLS_PICTURE, FRANCE_MOUNTAINS_PICTURE, GREEN_HILLS_PICTURE,

            RED_LAMP1, YELLOW_LAMP2, BLUE_MUG3, WHITE_MUG4, RED_MUG5, BLACK_HAT6, BLUE_HAT7, WHITE_HAT8, ORANGE_HAT9,
            WHITE_SHIRT_MALE11, WHITE_SHIRT_FEMALE10, BLACK_SHIRT_FEMALE12, BLACK_SHIRT_MALE13, GREY_FIDGET_SPINNER14, GREEN_FIDGET_SPINNER15, ICELAND_PICTURE16
            , ICEY_COAST_PICTURE20, HAVASU_FALLS_PICTURE19, FRANCE_MOUNTAINS_PICTURE17, GREEN_HILLS_PICTURE18};

    public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

    public Products() {
        for(Product product : PRODUCTS){
            PRODUCT_MAP.put(String.valueOf(product.getSerial_number()), product);
        }

    }

        public static final Product KENYA_CANE = new Product("Kenya Cane", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.kenya_kane_quater, new BigDecimal(2.5), new BigDecimal(0), 6,
                new BigDecimal(5), 772527771);

        public static final Product BLACK_LABEL = new Product("Black Label", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.jw_black_label, new BigDecimal(15.5), new BigDecimal(0), 6,
                new BigDecimal(5), 772527772);

        public static final Product CHROME_VODKA = new Product("Chrome Vodka 750ml", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.chrome1, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527773);

        public static final Product ChROME_VODKA_LEMON = new Product("Chrome Vodka Lemon 250ml", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.chrome_vodka_lemon, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527774);

        public static final Product SMIRNOFF = new Product("Smirnoff 750ml", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.smirnoff_mzinga, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527775);

        public static final Product KIBAO_MZINGA = new Product("Kibao Vodka 750ml", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.kibao_vodka_mzinga, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527776);

        public static final Product KIBAO_VODKA_QUATER = new Product("Kibao Vodka 250ml", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.kibao_vodka, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527778);

        public static final Product TUSKER_MALT = new Product("Tusker Malt Lager", "Smooth taste of the EABL, " +
                "perfect for the Friday night", R.drawable.tusker_malt_lager, new BigDecimal(2.0), new BigDecimal(0), 6,
                new BigDecimal(5), 772527779);

        //Originals

        public static final Product RED_LAMP = new Product("Red Lamp", "Red colored lamp, perfect for lighting up a room " +
                "and matching any red furniture.", R.drawable.red_lamp, new BigDecimal(10.99), new BigDecimal(9.50), 161,
                new BigDecimal(4.5), 1515611);

        public static final Product YELLOW_LAMP = new Product("Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room " +
                "and matching any Yellow furniture.", R.drawable.yellow_lamp, new BigDecimal(11.99), new BigDecimal(0), 6,
                new BigDecimal(5), 77252778);

        public static final Product BLUE_MUG = new Product("Blue Coffee Mug", "Blue Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.blue_mug, new BigDecimal(5.99), new BigDecimal(0), 66,
                new BigDecimal(3.5), 2141515);

        public static final Product WHITE_MUG = new Product("White Coffee Mug", "White Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.white_mug, new BigDecimal(6.99), new BigDecimal(0), 7,
                new BigDecimal(4), 9704833);

        public static final Product RED_MUG = new Product("Red Coffee Mug Red", "Red Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.red_mug, new BigDecimal(8.99), new BigDecimal(0), 157, new BigDecimal(4.5), 9377376);

        public static final Product BLACK_HAT = new Product("Black Baseball Hat", "Black Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.black_hat, new BigDecimal(20.99), new BigDecimal(0), 121, new BigDecimal(3.5), 6626622);

        public static final Product BLUE_HAT = new Product("Blue Baseball Hat", "Blue Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.blue_hat, new BigDecimal(22.99), new BigDecimal(0), 67, new BigDecimal(4.5), 7837367);

        public static final Product WHITE_HAT = new Product("White Baseball Hat", "White Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.white_hat, new BigDecimal(18.99), new BigDecimal(15.99), 88, new BigDecimal(2.5), 7695085);

        public static final Product ORANGE_HAT = new Product("Orange Baseball Hat", "Orange Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.orange_hat, new BigDecimal(23.99), new BigDecimal(0), 23, new BigDecimal(4), 9084728);

        public static final Product WHITE_SHIRT_FEMALE = new Product("White Shirt", "White T-Shirt made of 100% cotton. Made for " +
                "females.", R.drawable.white_shirt_female, new BigDecimal(25.99), new BigDecimal(0), 98, new BigDecimal(5)
                , 7265405);

        public static final Product WHITE_SHIRT_MALE = new Product("White Shirt", "White T-Shirt made of 100% cotton. Made for " +
                "males.", R.drawable.white_shirt_male, new BigDecimal(26.99), new BigDecimal(0), 11, new BigDecimal(3)
                , 9575721);

        public static final Product BLACK_SHIRT_FEMALE = new Product("Black Shirt", "Black T-Shirt made of 100% cotton. Made for " +
                "females.", R.drawable.black_shirt_female, new BigDecimal(25.99), new BigDecimal(0), 51, new BigDecimal(4.5)
                , 5776336);

        public static final Product BLACK_SHIRT_MALE = new Product("Black Shirt", "Black T-Shirt made of 100% cotton. Made for " +
                "males.", R.drawable.black_shirt_male, new BigDecimal(26.99), new BigDecimal(0), 616, new BigDecimal(5)
                , 1408483);

        public static final Product GREY_FIDGET_SPINNER = new Product("Grey Fidget Spinner", "Grey Fidget Spinner. High quality" +
                " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_grey, new BigDecimal(100), new BigDecimal(59.99)
                , 37, new BigDecimal(4.5), 8830303);

        public static final Product GREEN_FIDGET_SPINNER = new Product("Green Fidget Spinner", "Green Fidget Spinner. High quality" +
                " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_green, new BigDecimal(100), new BigDecimal(0)
                , 3, new BigDecimal(4), 9082727);

        public static final Product ICELAND_PICTURE = new Product("Picture of Water in Iceland", "Beautiful picture of Iceland and its " +
                "cold waters.", R.drawable.foggy_iceland, new BigDecimal(189.50), new BigDecimal(100), 43,
                new BigDecimal(4.8), 6638393);

        public static final Product FRANCE_MOUNTAINS_PICTURE = new Product("Picture of the Mountains in France", "Here is an incredible picture" +
                " of the mountains in France.", R.drawable.france_mtn, new BigDecimal(356), new BigDecimal(315), 22,
                new BigDecimal(3.2), 8093475);

        public static final Product GREEN_HILLS_PICTURE = new Product("Picture of green hills in GreenLand", "A calming image of a sunset in " +
                "Greenland.", R.drawable.green_hills, new BigDecimal(99), new BigDecimal(50), 79,
                new BigDecimal(4.1), 1485032);

        public static final Product HAVASU_FALLS_PICTURE = new Product("A Very Famous Picture of Havasu Falls", "Check out this famous picture " +
                "of Havasu Falls.", R.drawable.havasu_falls, new BigDecimal(76), new BigDecimal(0), 81,
                new BigDecimal(4.9), 8041414);

        public static final Product ICEY_COAST_PICTURE = new Product("An Image of the Icy Coast of Iceland", "Looking at this picture practically " +
                "makes you shiver! But it makes me appreciate warm weather.", R.drawable.icedfglrjioz, new BigDecimal(120), new BigDecimal(0), 37,
                new BigDecimal(3.3), 1145614);


        // Added to See Operations

        public static final Product RED_LAMP1 = new Product("Red Lamp", "Red colored lamp, perfect for lighting up a room " +
                "and matching any red furniture.", R.drawable.red_lamp, new BigDecimal(10.99), new BigDecimal(9.50), 161,
                new BigDecimal(4.5), 15156111);

        public static final Product YELLOW_LAMP2 = new Product("Yellow Lamp", "Yellow colored lamp, perfect for lighting up a room " +
                "and matching any Yellow furniture.", R.drawable.yellow_lamp, new BigDecimal(11.99), new BigDecimal(0), 6,
                new BigDecimal(5), 77252277);

        public static final Product BLUE_MUG3 = new Product("Blue Coffee Mug", "Blue Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.blue_mug, new BigDecimal(5.99), new BigDecimal(0), 66,
                new BigDecimal(3.5), 21415155);

        public static final Product WHITE_MUG4 = new Product("White Coffee Mug", "White Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.white_mug, new BigDecimal(6.99), new BigDecimal(0), 7, new BigDecimal(4), 9704833);

        public static final Product RED_MUG5 = new Product("Red Coffee Mug Red", "Red Coffee Mug for drinking coffee. 100% ceramic.",
                R.drawable.red_mug, new BigDecimal(8.99), new BigDecimal(0), 157,
                new BigDecimal(4.5), 93773766);

        public static final Product BLACK_HAT6 = new Product("Black Baseball Hat", "Black Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.black_hat, new BigDecimal(20.99), new BigDecimal(0), 121,
                new BigDecimal(3.5), 66266222);

        public static final Product BLUE_HAT7 = new Product("Blue Baseball Hat", "Blue Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.blue_hat, new BigDecimal(22.99), new BigDecimal(0), 67,
                new BigDecimal(4.5), 78373677);

        public static final Product WHITE_HAT8 = new Product("White Baseball Hat", "White Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.white_hat, new BigDecimal(18.99), new BigDecimal(15.99), 88,
                new BigDecimal(2.5), 76950855);

        public static final Product ORANGE_HAT9 = new Product("Orange Baseball Hat", "Orange Baseball Hat made of 100% authentic " +
                "baseball hat material.",
                R.drawable.orange_hat, new BigDecimal(23.99), new BigDecimal(0), 23,
                new BigDecimal(4), 90847288);

        public static final Product WHITE_SHIRT_FEMALE10 = new Product("White Shirt", "White T-Shirt made of 100% cotton. Made for " +
                "females.", R.drawable.white_shirt_female, new BigDecimal(25.99), new BigDecimal(0), 98, new BigDecimal(5)
                , 72654055);

        public static final Product WHITE_SHIRT_MALE11 = new Product("White Shirt", "White T-Shirt made of 100% cotton. Made for " +
                "males.", R.drawable.white_shirt_male, new BigDecimal(26.99), new BigDecimal(0), 11, new BigDecimal(3)
                , 95757211);

        public static final Product BLACK_SHIRT_FEMALE12 = new Product("Black Shirt", "Black T-Shirt made of 100% cotton. Made for " +
                "females.", R.drawable.black_shirt_female, new BigDecimal(25.99), new BigDecimal(0), 51, new BigDecimal(4.5)
                , 57763366);

        public static final Product BLACK_SHIRT_MALE13 = new Product("Black Shirt", "Black T-Shirt made of 100% cotton. Made for " +
                "males.", R.drawable.black_shirt_male, new BigDecimal(26.99), new BigDecimal(0), 616, new BigDecimal(5)
                , 14084833);

        public static final Product GREY_FIDGET_SPINNER14 = new Product("Grey Fidget Spinner", "Grey Fidget Spinner. High quality" +
                " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_grey, new BigDecimal(100), new BigDecimal(59.99)
                , 37, new BigDecimal(4.5), 88303033);

        public static final Product GREEN_FIDGET_SPINNER15 = new Product("Green Fidget Spinner", "Green Fidget Spinner. High quality" +
                " bearing for long spin time. Light and portable.", R.drawable.fidget_spinner_green, new BigDecimal(100), new BigDecimal(0)
                , 3, new BigDecimal(4), 90827277);

        public static final Product ICELAND_PICTURE16 = new Product("Picture of Water in Iceland", "Beautiful picture of Iceland and its " +
                "cold waters.", R.drawable.foggy_iceland, new BigDecimal(189.50), new BigDecimal(100), 43,
                new BigDecimal(4.8), 66383933);

        public static final Product FRANCE_MOUNTAINS_PICTURE17 = new Product("Picture of the Mountains in France", "Here is an incredible picture" +
                " of the mountains in France.", R.drawable.france_mtn, new BigDecimal(356), new BigDecimal(315), 22,
                new BigDecimal(3.2), 80934755);

        public static final Product GREEN_HILLS_PICTURE18 = new Product("Picture of green hills in GreenLand", "A calming image of a sunset in " +
                "Greenland.", R.drawable.green_hills, new BigDecimal(99), new BigDecimal(50), 79,
                new BigDecimal(4.1), 14850322);

        public static final Product HAVASU_FALLS_PICTURE19 = new Product("A Very Famous Picture of Havasu Falls", "Check out this famous picture " +
                "of Havasu Falls.", R.drawable.havasu_falls, new BigDecimal(76), new BigDecimal(0), 81,
                new BigDecimal(4.9), 80414144);

        public static final Product ICEY_COAST_PICTURE20 = new Product("An Image of the Icy Coast of Iceland", "Looking at this picture practically " +
                "makes you shiver! But it makes me appreciate warm weather.", R.drawable.icedfglrjioz, new BigDecimal(120), new BigDecimal(0), 37,
                new BigDecimal(3.3), 11456144);

    }

















