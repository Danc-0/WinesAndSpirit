package com.example.databindingdrinks.util;

import com.example.databindingdrinks.R;
import com.example.databindingdrinks.models.Product;

import java.math.BigDecimal;
import java.util.HashMap;


/**
 * Created by User on 2/6/2018.
 */

public class Products {

  public Product[] PRODUCTS = {SMIRNOFF, KENYA_CANE, BLACK_LABEL, TUSKER_MALT, CHROME_VODKA, ChROME_VODKA_LEMON, KIBAO_MZINGA, KIBAO_VODKA_QUATER, GRANTS, VAT_69, VAT_69_350ml,
          EIGHT_PM, GILBEYS, JAMESONS, GLENFIDECH, CRAZYCOCK, CRAZYCOCK250,
          HUNTERS250, HUNTERS750, LEGEND_BRANDY, LEGEND_BRANDY250, BLUEMOON, BLUEMOON_MANGO, BLUEMOON_APPLE
          , KIBAO_VODKA_250, KIBAO_VODKA_750, KENYA_CANE, KENYA_CANE_750, KENYA_CANE_250ml,
          SMIRNOFF, SMIRNOFF_BLACK, SMIRNOFF_BLUE, SMIRNOFF_CITRUS, SMIRNOFF_ESSPRESSO, SMIRNOFF_RED, BLACK_AND_WHITE};

  public HashMap<String, Product> PRODUCT_MAP = new HashMap<>();

  public Products() {
    for(Product product : PRODUCTS){
      PRODUCT_MAP.put(String.valueOf(product.getSerial_number()), product);
    }

  }

  public static final Product KENYA_CANE = new Product("Kenya Cane", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.kenya_kane_quater, new BigDecimal(200), new BigDecimal(0), 6,
          new BigDecimal(5), 772527771);

  public static final Product BLACK_LABEL = new Product("Black Label", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.jw_black_label, new BigDecimal(2000), new BigDecimal(0), 6,
          new BigDecimal(5), 772527772);

  public static final Product CHROME_VODKA = new Product("Chrome Vodka 750ml", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.chrome1, new BigDecimal(600), new BigDecimal(0), 6,
          new BigDecimal(5), 772527773);

  public static final Product ChROME_VODKA_LEMON = new Product("Chrome Vodka Lemon 250ml", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.chrome_vodka_lemon, new BigDecimal(200), new BigDecimal(0), 6,
          new BigDecimal(5), 772527774);

  public static final Product SMIRNOFF = new Product("Smirnoff 750ml", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.smirnoff_mzinga, new BigDecimal(1100), new BigDecimal(0), 6,
          new BigDecimal(5), 772527775);

  public static final Product KIBAO_MZINGA = new Product("Kibao Vodka 750ml", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.kibao_vodka_mzinga, new BigDecimal(620), new BigDecimal(0), 6,
          new BigDecimal(5), 772527776);

  public static final Product KIBAO_VODKA_QUATER = new Product("Kibao Vodka 250ml", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.kibao_vodka, new BigDecimal(210), new BigDecimal(0), 6,
          new BigDecimal(5), 772527778);

  public static final Product TUSKER_MALT = new Product("Tusker Malt Lager", "Smooth taste of the EABL, " +
          "perfect for the Friday night", R.drawable.tusker_malt_lager, new BigDecimal(180), new BigDecimal(0), 6,
          new BigDecimal(5), 772527779);

  //Originals

  public static final Product GRANTS = new Product("GRANTS 750ml", "Smooth drink that makes you relax and feel comfortable for your money " +
          "enjoy the taste.", R.drawable.grants750ml, new BigDecimal(1550), new BigDecimal(1400), 161,
          new BigDecimal(4.5), 1515611);

  public static final Product VAT_69 = new Product("VAT 69 750ml", "Made especially for you and your friends " +
          "grab this and enjoy", R.drawable.vat69750, new BigDecimal(1800), new BigDecimal(1750), 6,
          new BigDecimal(5), 77252778);

  public static final Product VAT_69_350ml = new Product("VAT 69 350ml", "Made especially for you and your friends grab this and enjoy",
          R.drawable.vat69350ml, new BigDecimal(1000), new BigDecimal(900), 66,
          new BigDecimal(3.5), 2141515);

  public static final Product EIGHT_PM = new Product("EIGHT PM 750ml", "Enjoy the blend of kings",
          R.drawable.eightpm750, new BigDecimal(800), new BigDecimal(0), 7,
          new BigDecimal(4), 9704833);

  public static final Product GILBEYS = new Product("GILBEYS 750ml", "Get the taste of royalty vodka",
          R.drawable.gilbeys750, new BigDecimal(900), new BigDecimal(0), 157, new BigDecimal(4.5), 9377376);

  public static final Product JAMESONS = new Product("JAMESON'S 750ml", "When is comes to taste we got you covered",
          R.drawable.jameson750, new BigDecimal(2200), new BigDecimal(0), 121, new BigDecimal(3.5), 6626622);

  public static final Product GLENFIDECH = new Product("GLENFIDECH 750ml", "Feel how legends feel and enjoy how the royals enjoys",
          R.drawable.glenfidech750, new BigDecimal(1500), new BigDecimal(0), 67, new BigDecimal(4.5), 7837367);

  public static final Product CRAZYCOCK= new Product("Crazy cock 750ml", "Taste and enjoy the feeling",
          R.drawable.crazycook750, new BigDecimal(650), new BigDecimal(550), 88, new BigDecimal(2.5), 7695085);

  public static final Product CRAZYCOCK250 = new Product("Crazy Cock 250ml", "Taste and enjoy the feeling",
          R.drawable.crazycock250ml, new BigDecimal(400), new BigDecimal(350), 23, new BigDecimal(4), 9084728);

  public static final Product HUNTERS750 = new Product("HUNTERS CHOICE 750ml", "Hunt the hunter and enjoy the taste of hunting",
          R.drawable.hunters750, new BigDecimal(600), new BigDecimal(550), 98, new BigDecimal(5)
          , 7265405);

  public static final Product HUNTERS250 = new Product("HUNTERS CHOICE 250ml", "Hunt the hunter and enjoy the taste of hunting",
          R.drawable.hunters250ml, new BigDecimal(300), new BigDecimal(0), 11, new BigDecimal(3)
          , 9575721);

  public static final Product LEGEND_BRANDY = new Product("LEGEND BRANDY 750ml", "Be a legend you and your crew by taking legend brandy made for legends",
          R.drawable.legendbrandy750, new BigDecimal(550), new BigDecimal(0), 51, new BigDecimal(4.5)
          , 5776336);

  public static final Product LEGEND_BRANDY250 = new Product("LEGEND BRANDY 250ml", "Be a legend you and your crew by taking legend brandy made for legends",
          R.drawable.legendbrandy250ml, new BigDecimal(200), new BigDecimal(0), 616, new BigDecimal(5)
          , 1408483);

  public static final Product BLUEMOON = new Product("BLUE MOON NORMAL 750ml", "Feel the astronauts feeling of the blue moon in earth",
          R.drawable.bluemoon750, new BigDecimal(520), new BigDecimal(500)
          , 37, new BigDecimal(4.5), 8830303);

  public static final Product BLUEMOON_MANGO = new Product("BLUEMOON MANGO 250ml","Feel the astronauts feeling of the blue moon in earth",
          R.drawable.bluemoonmango250ml, new BigDecimal(180), new BigDecimal(0)
          , 3, new BigDecimal(4), 9082727);

  public static final Product BLUEMOON_APPLE = new Product("BLUEMOON APPLE 750ml", "Feel the astronauts feeling of the blue moon in earth",
          R.drawable.bluemoonapple750, new BigDecimal(550), new BigDecimal(500), 43,
          new BigDecimal(4.8), 6638393);

  public static final Product KENYA_CANE_250ml = new Product("KENYA CANE", "Here is an incredible drink" +
          " of the weeks hustle.", R.drawable.kenyacake250, new BigDecimal(220), new BigDecimal(200), 22,
          new BigDecimal(3.2), 8093475);

  public static final Product KENYA_CANE_750 = new Product("KENYA CANE 750ml", "Here is an incredible drink" +
          "of the weeks hustle.", R.drawable.kenyacane750, new BigDecimal(620), new BigDecimal(600), 79,
          new BigDecimal(4.1), 1485032);

  public static final Product KIBAO_VODKA_750 = new Product("KIBAO VODKA 750ML", "Drink and feel it down your self",
          R.drawable.kibaovodka750, new BigDecimal(750), new BigDecimal(700), 81,
          new BigDecimal(4.9), 8041414);

  public static final Product KIBAO_VODKA_250 = new Product("KIBAO VODKA 250ml", "Drink and feel it down your self",
          R.drawable.kibao250ml, new BigDecimal(250), new BigDecimal(0), 37,
          new BigDecimal(3.3), 1145614);

  public static final Product SMIRNOFF_ESSPRESSO = new Product("SMIRNOFF ESPRESSO 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.smirnoff_espresso, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 11456140);

  public static final Product SMIRNOFF_RED = new Product("SMIRNOFF RED 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.smirnoff_vodka_red, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 11456142);

  public static final Product SMIRNOFF_BLACK= new Product("SMIRNOFF BLACK 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.smirnoff_black, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 11456143);

  public static final Product SMIRNOFF_BLUE = new Product("SMIRNOFF BLUE 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.smirnoff_blue, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 11456144);

  public static final Product SMIRNOFF_CITRUS = new Product("SMIRNOFF CITRUS 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.smirnoff_citrus, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 11456145);

  public static final Product BLACK_AND_WHITE = new Product("BLACK AND WHITE 750ml", "Smooth taste of vodka for the smooth throat of you",
          R.drawable.black_and_white, new BigDecimal(1100), new BigDecimal(0), 37,
          new BigDecimal(3.3), 114561456);

}

















