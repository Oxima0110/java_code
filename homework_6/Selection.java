package homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selection {

    private List<Notebook> notebooks; // = new ArrayList<>();

    public Selection() {
        notebooks = new ArrayList<>(Arrays.asList(new Notebook("Lenovo IdeaPad 3 15IGL05 FullHD",
                "Platinum Grey", 15.6, "Celeron N4020",
                4, 4, 256, "Intel UHD Graphics 600"),
                new Notebook("HP 250 G8 HD",
                        "Dark Ash Silver", 15.6, "Celeron 4020",
                        4, 4, 128, "Intel UHD Graphics 600"),
                new Notebook("Asus E410MA HD",
                        "Blue", 14.0, "Celeron N4020",
                        4, 4, 256, "Intel UHD Graphics"),
                new Notebook("Lenovo IdeaPad 3 15IGL05 FullHD TN",
                        "Platinum Grey", 15.6, "Pentium N5030",
                        4, 4, 256, "Intel UHD Graphics 605"),
                new Notebook("Asus X409FA HD",
                        "Transparent Silver", 14.0, "Intel i3-10110U",
                        4, 8, 256, "Intel UHD Graphics"),
                new Notebook("HP 255 G8 FullHD",
                        "Dark Ash Silver", 15.6, "AMD Ryzen 3 5300U",
                        4, 8, 256, "AMD Radeon Graphics"),
                new Notebook("Asus K413EA FullHD",
                        "Indie Black", 14.0, "Intel  i3-1115G4",
                        4, 8, 256, "Intel UHD Graphics"),
                new Notebook("Dell XPS 17 9720 FullHD+",
                        "Silver/Black", 17.0, "Intel  i7-12700H",
                        8, 16, 512, "GeForce RTX 3050 4Gb"),
                new Notebook("Asus ROG Strix G17 G713RW WideQuadHD",
                        "Eclipse Gray", 17.3, "AMD Ryzen 7 6800H",
                        8, 16, 512, "GeForce RTX 3070 Ti 8Gb")));
    }

    public List<Notebook> getByBrend(String input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getBrend().contains(input)) {
                result.add(item);
                // System.out.println(item);
            }
        }
        return result;
    }

    public List<Notebook> getByColor(String input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getColor().contains(input)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByScrean(Double input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getScreen() >= input) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByBrendCpu(String input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getBrendCpu().contains(input)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByNumCores(int input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getNumCores() >= input) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByRam(int input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getRam() >= input) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByMemory(int input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getMemory() >= input) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Notebook> getByBrendVideo(String input) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook item : notebooks) {
            if (item.getBrendVideo().contains(input)) {
                result.add(item);
            }
        }
        return result;
    }
}
