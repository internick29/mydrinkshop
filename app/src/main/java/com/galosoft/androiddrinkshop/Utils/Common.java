package com.galosoft.androiddrinkshop.Utils;

import com.galosoft.androiddrinkshop.Model.User;
import com.galosoft.androiddrinkshop.Retrofit.IDrinkShopApi;
import com.galosoft.androiddrinkshop.Retrofit.RetrofitClient;

public class Common {

    private static final String BASE_URL = "http://10.0.3.2/drinkshop/";

    public static User currentUser = null;

    public static IDrinkShopApi getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopApi.class);
    }
}
