package com.github.vspiewak.loggenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.github.vspiewak.loggenerator.Utils.fmtE;

public class Product {

    public static final String MODEL_SEPARATOR = " - ";
    public static final String TO_STRING_SEPARATOR = ",";

    public static List<Product> products = Arrays.asList(

            new Product().name("iPhone 4S").options(Options.Disque_8Go).color(Colors.Noir).categorie(Categories.Mobile).brand(Brand.Apple).price(399).model(),
            new Product().name("iPhone 4S").options(Options.Disque_8Go).color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Apple).price(399).model(),

            new Product().name("iPhone 5C").options(Options.Disque_16Go).color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Apple).price(599).model(),
            new Product().name("iPhone 5C").options(Options.Disque_16Go).color(Colors.Rose).categorie(Categories.Mobile).brand(Brand.Apple).price(599).model(),
            new Product().name("iPhone 5C").options(Options.Disque_16Go).color(Colors.Jaune).categorie(Categories.Mobile).brand(Brand.Apple).price(599).model(),
            new Product().name("iPhone 5C").options(Options.Disque_16Go).color(Colors.Bleu).categorie(Categories.Mobile).brand(Brand.Apple).price(599).model(),
            new Product().name("iPhone 5C").options(Options.Disque_16Go).color(Colors.Vert).categorie(Categories.Mobile).brand(Brand.Apple).price(599).model(),

            new Product().name("iPhone 5C").options(Options.Disque_32Go).color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5C").options(Options.Disque_32Go).color(Colors.Rose).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5C").options(Options.Disque_32Go).color(Colors.Jaune).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5C").options(Options.Disque_32Go).color(Colors.Bleu).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5C").options(Options.Disque_32Go).color(Colors.Vert).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),

            new Product().name("iPhone 5S").options(Options.Disque_16Go).color(Colors.Argent).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5S").options(Options.Disque_16Go).color(Colors.Gris_sideral).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),
            new Product().name("iPhone 5S").options(Options.Disque_16Go).color(Colors.Or).categorie(Categories.Mobile).brand(Brand.Apple).price(699).model(),

            new Product().name("iPhone 5S").options(Options.Disque_32Go).color(Colors.Argent).categorie(Categories.Mobile).brand(Brand.Apple).price(799).model(),
            new Product().name("iPhone 5S").options(Options.Disque_32Go).color(Colors.Gris_sideral).categorie(Categories.Mobile).brand(Brand.Apple).price(799).model(),
            new Product().name("iPhone 5S").options(Options.Disque_32Go).color(Colors.Or).categorie(Categories.Mobile).brand(Brand.Apple).price(799).model(),

            new Product().name("iPhone 5S").options(Options.Disque_64Go).color(Colors.Argent).categorie(Categories.Mobile).brand(Brand.Apple).price(899).model(),
            new Product().name("iPhone 5S").options(Options.Disque_64Go).color(Colors.Gris_sideral).categorie(Categories.Mobile).brand(Brand.Apple).price(899).model(),
            new Product().name("iPhone 5S").options(Options.Disque_64Go).color(Colors.Or).categorie(Categories.Mobile).brand(Brand.Apple).price(899).model(),

            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Gris_sideral).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Argent).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Violet).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Rose).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Jaune).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Bleu).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Vert).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),
            new Product().name("iPod Shuffle").options(Options.Disque_2Go).color(Colors.Product_RED).categorie(Categories.Baladeur).brand(Brand.Apple).price(55).model(),

            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Gris_sideral).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Argent).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Violet).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Rose).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Jaune).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Bleu).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Vert).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),
            new Product().name("iPod Nano").options(Options.Disque_16Go).color(Colors.Product_RED).categorie(Categories.Baladeur).brand(Brand.Apple).price(179).model(),

            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Gris_sideral).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Argent).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Violet).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Rose).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Jaune).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Bleu).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Vert).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),
            new Product().name("iPod Touch").options(Options.Disque_32Go).color(Colors.Product_RED).categorie(Categories.Baladeur).brand(Brand.Apple).price(329).model(),

            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Gris_sideral).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Argent).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Violet).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Rose).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Jaune).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Bleu).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Vert).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),
            new Product().name("iPod Touch").options(Options.Disque_64Go).color(Colors.Product_RED).categorie(Categories.Baladeur).brand(Brand.Apple).price(449).model(),

            new Product().name("iPod Touch").options(Options.Disque_16Go).color(Colors.Noir).categorie(Categories.Baladeur).brand(Brand.Apple).price(249).model(),

            new Product().name("iPod Classic").options(Options.Disque_160Go).color(Colors.Noir).categorie(Categories.Baladeur).brand(Brand.Apple).price(299).model(),
            new Product().name("iPod Classic").options(Options.Disque_160Go).color(Colors.Blanc).categorie(Categories.Baladeur).brand(Brand.Apple).price(299).model(),

            new Product().name("Macbook Air").options(Options.Ecran_11, Options.Disque_128Go).categorie(Categories.Portable).brand(Brand.Apple).price(999).model(),
            new Product().name("Macbook Air").options(Options.Ecran_11, Options.Disque_256Go).categorie(Categories.Portable).brand(Brand.Apple).price(1199).model(),
            new Product().name("Macbook Air").options(Options.Ecran_13, Options.Disque_128Go).categorie(Categories.Portable).brand(Brand.Apple).price(1099).model(),
            new Product().name("Macbook Air").options(Options.Ecran_13, Options.Disque_256Go).categorie(Categories.Portable).brand(Brand.Apple).price(1299).model(),

            new Product().name("Macbook Pro").options(Options.Ecran_13, Options.Core_i5).categorie(Categories.Portable).brand(Brand.Apple).price(1199).model(),
            new Product().name("Macbook Pro").options(Options.Ecran_13, Options.Core_i7).categorie(Categories.Portable).brand(Brand.Apple).price(1499).model(),
            new Product().name("Macbook Pro").options(Options.Ecran_15, Options.Core_i7_Quad).categorie(Categories.Portable).brand(Brand.Apple).price(1799).model(),

            new Product().name("Macbook Pro Rétina").options(Options.Ecran_13, Options.Core_i5, Options.Disque_128Go).categorie(Categories.Portable).brand(Brand.Apple).price(1499).model(),
            new Product().name("Macbook Pro Rétina").options(Options.Ecran_13, Options.Core_i5, Options.Disque_256Go).categorie(Categories.Portable).brand(Brand.Apple).price(1699).model(),
            new Product().name("Macbook Pro Rétina").options(Options.Ecran_15, Options.Core_i7_Quad, Options.Ram_8Go).categorie(Categories.Portable).brand(Brand.Apple).price(2199).model(),
            new Product().name("Macbook Pro Rétina").options(Options.Ecran_15, Options.Core_i7_Quad, Options.Ram_16Go).categorie(Categories.Portable).brand(Brand.Apple).price(2779).model(),

            new Product().name("Mac Mini").options(Options.Core_i5).categorie(Categories.Ordinateur).brand(Brand.Apple).price(629).model(),
            new Product().name("Mac Mini").options(Options.Core_i7).categorie(Categories.Ordinateur).brand(Brand.Apple).price(829).model(),
            new Product().name("Mac Mini").options(Options.Core_i7, Options.OS_X_Server).categorie(Categories.Ordinateur).brand(Brand.Apple).price(1029).model(),

            new Product().name("iMac").options(Options.Ecran_21, Options.Iris_Pro).categorie(Categories.Ordinateur).brand(Brand.Apple).price(1299).model(),
            new Product().name("iMac").options(Options.Ecran_21, Options.NVIDIA_GeForce_GT_750M).categorie(Categories.Ordinateur).brand(Brand.Apple).price(1499).model(),
            new Product().name("iMac").options(Options.Ecran_27, Options.NVIDIA_GeForce_GT_755M).categorie(Categories.Ordinateur).brand(Brand.Apple).price(1799).model(),
            new Product().name("iMac").options(Options.Ecran_27, Options.NVIDIA_GeForce_GTX_755M).categorie(Categories.Ordinateur).brand(Brand.Apple).price(1999).model(),

            new Product().name("iPad mini").color(Colors.Noir).categorie(Categories.Tablette).brand(Brand.Apple).price(339).model(),
            new Product().name("iPad mini").color(Colors.Blanc).categorie(Categories.Tablette).brand(Brand.Apple).price(339).model(),

            new Product().name("iPad 2").color(Colors.Noir).categorie(Categories.Tablette).brand(Brand.Apple).price(409).model(),
            new Product().name("iPad 2").color(Colors.Blanc).categorie(Categories.Tablette).brand(Brand.Apple).price(409).model(),

            new Product().name("iPad Rétina").color(Colors.Noir).categorie(Categories.Tablette).brand(Brand.Apple).price(509).model(),
            new Product().name("iPad Rétina").color(Colors.Blanc).categorie(Categories.Tablette).brand(Brand.Apple).price(509).model(),

            new Product().name("Nexus 4").options(Options.Disque_16Go).color(Colors.Noir).categorie(Categories.Mobile).brand(Brand.Google).price(199).model(),
            new Product().name("Nexus 4").options(Options.Disque_16Go).color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Google).price(199).model(),

            new Product().name("Nexus 4").options(Options.Disque_32Go).color(Colors.Noir).categorie(Categories.Mobile).brand(Brand.Google).price(249).model(),
            new Product().name("Nexus 4").options(Options.Disque_32Go).color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Google).price(249).model(),

            new Product().name("Nexus 7").options(Options.Disque_16Go).categorie(Categories.Tablette).brand(Brand.Google).price(229).model(),
            new Product().name("Nexus 7").options(Options.Disque_32Go).categorie(Categories.Tablette).brand(Brand.Google).price(269).model(),
            new Product().name("Nexus 7").options(Options.Disque_32Go, Options.LTE).categorie(Categories.Tablette).brand(Brand.Google).price(349).model(),

            new Product().name("Nexus 10").options(Options.Disque_16Go).categorie(Categories.Tablette).brand(Brand.Google).price(399).model(),
            new Product().name("Nexus 10").options(Options.Disque_32Go).categorie(Categories.Tablette).brand(Brand.Google).price(499).model(),

            new Product().name("Galaxy S4").color(Colors.Noir).categorie(Categories.Mobile).brand(Brand.Samsung).price(499).model(),
            new Product().name("Galaxy S4").color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Samsung).price(499).model(),

            new Product().name("Galaxy S3").color(Colors.Noir).categorie(Categories.Mobile).brand(Brand.Samsung).price(351.52).model(),
            new Product().name("Galaxy S3").color(Colors.Blanc).categorie(Categories.Mobile).brand(Brand.Samsung).price(351.52).model()
    );

    public enum Colors { Noir, Rose, Jaune, Bleu, Vert, Argent, Gris_sideral, Or, Violet, Product_RED, Blanc }

    public enum Categories { Baladeur, Ordinateur, Portable, Tablette, Mobile }

    public enum Options {
        Disque_16Go, Disque_32Go, Disque_2Go, Disque_64Go, Disque_160Go, Disque_8Go, Disque_256Go, Disque_128Go,
        Ecran_11, Ecran_13, Ecran_15, Ecran_21, Ecran_27,
        Core_i7, Core_i5, Core_i7_Quad,
        Ram_8Go, Ram_16Go,
        OS_X_Server,
        Iris_Pro, NVIDIA_GeForce_GT_750M, NVIDIA_GeForce_GTX_755M, NVIDIA_GeForce_GT_755M, LTE
    }

    public enum Brand {Google, Samsung, Apple }


    private String model;
    private String name;
    private Categories categorie;
    private Colors color;
    private List<Options> options = new ArrayList<Options>();
    private double price;
    private Brand brand;

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public Colors getColor() {
        return color;
    }

    public List<Options> getOptions() {
        return options;
    }

    public double getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public Product model(String model) {
        this.model = model;
        return this;
    }

    public Product categorie(Categories categorie) {
        this.categorie = categorie;
        return this;
    }

    public Product color(Colors color) {
        this.color = color;
        return this;
    }

    public Product options(Options... options) {
        for(Options o : options) {
            this.options.add(o);
        }
        return this;

    }

    public Product price(double price) {
        this.price = price;
        return this;

    }

    public Product brand(Brand brand) {
        this.brand = brand;
        return this;
    }


    public Product model() {
        StringBuilder sb = new StringBuilder(this.name);
        if(this.color != null) sb.append(MODEL_SEPARATOR).append(fmtE(color));
        if(!this.options.isEmpty()) {
            for(Options o : options)
                sb.append(MODEL_SEPARATOR).append(fmtE(o));
        }
        this.model = sb.toString();
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("brand=").append(fmtE(brand));
        sb.append(TO_STRING_SEPARATOR).append("name=").append(name);
        sb.append(TO_STRING_SEPARATOR).append("model=").append(model);
        sb.append(TO_STRING_SEPARATOR).append("category=").append(fmtE(categorie));

        if(color != null) {
            sb.append(TO_STRING_SEPARATOR).append("color=").append(fmtE(color));
        }

        if(!options.isEmpty()) {
        sb.append(TO_STRING_SEPARATOR).append("options=");
            for(Options o : options) {
                sb.append(fmtE(o)).append("|");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(TO_STRING_SEPARATOR).append("price=").append(price);

        return sb.toString();
    }

}
