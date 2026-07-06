package fr.diginamic.gson;

import com.google.gson.Gson;

public class TransformeVilleEnJson {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Personne p = new Personne("Durand", 25);

        String json = gson.toJson(p);

        System.out.println(json);
    }
}
