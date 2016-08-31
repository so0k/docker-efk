package com.github.vspiewak.loggenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    private static final String LOG_SEPARATOR = ",";
    private static final Logger log = LoggerFactory.getLogger(Utils.class);
    private static final List<String> ips = new ArrayList<String>();
    private static final List<String> products = new ArrayList<String>();

    private static void readFromFile(String file, List<String> list) {
        try {
            InputStream is = Utils.class.getClassLoader().getResourceAsStream(file);
            Scanner scan = new Scanner(is);
            while (scan.hasNext()) {
                String line = scan.next().trim();
                if (line.length() > 0)
                    list.add(line);
            }
        } catch (Exception e) {
            log.error("Error during read/parse of file: ", file);
        }
    }

    public static String fmtE(Enum e) {
        return e.name().replaceAll("_", " ");
    }

    private static <E> E getRandomFromList(List<E> list) {
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }

    private static <E> E getRandomFromArray(E[] array) {
        int index = new Random().nextInt(array.length);
        return array[index];
    }

    private static String getRandomIP() {
        return getRandomFromList(ips);
    }

    private static double getRandomPrice() {
        int min = 30;
        int max = 99;
        return min + new Random().nextInt(max - min) + 0.99;
    }

    public static String getRandomClient(long id) {
        String sex = "M";
        if (id % 3 == 0) sex = "F";
        return new StringBuilder()
                .append("email=")
                .append("client").append((id % 1000) + 1).append("@gmail.com")
                .append(LOG_SEPARATOR)
                .append("sex=")
                .append(sex)
                .toString();
    }

    public static String getRandomSell(long id) {
        return new StringBuilder()
                .append("id=")
                .append(id)
                .append(LOG_SEPARATOR)
                .append("ip=")
                .append(getRandomIP())
                .append(LOG_SEPARATOR)
                .append(getRandomClient(id))
                .append(LOG_SEPARATOR)
                .append(getRandomFromList(Product.products))
                .toString();
    }

    public static String getRandomSearch(long id) {
        Product product = getRandomFromList(Product.products);

        StringBuilder sb = new StringBuilder()
                .append("id=")
                .append(id)
                .append(LOG_SEPARATOR)
                .append("ip=")
                .append(getRandomIP())
                .append(LOG_SEPARATOR);

        if(id % 4 == 0) {

            sb.append(product);

        } else {

            sb.append("category=")
              .append(fmtE(product.getCategorie()));

            if (id % 3 == 0) {
                sb.append(LOG_SEPARATOR)
                        .append("brand=")
                        .append(product.getBrand());
            }

            if (id % 2 == 0) {
                if(product.getColor() != null) {
                    sb.append(LOG_SEPARATOR);
                    sb.append("color=").append(fmtE(product.getColor()));
                }
                if(!product.getOptions().isEmpty()) {
                    sb.append(LOG_SEPARATOR);
                    sb.append("options=");
                    for(Product.Options o : product.getOptions()) {
                        sb.append(fmtE(o)).append("|");
                    }
                    sb.setLength(sb.length() - 1);
                }
            }

        }

        return sb.toString();
    }

    static {
        readFromFile("ips.txt", ips);
    }

}
