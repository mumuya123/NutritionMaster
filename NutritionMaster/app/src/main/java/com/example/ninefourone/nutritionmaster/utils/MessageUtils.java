package com.example.ninefourone.nutritionmaster.utils;

import android.widget.Toast;

import com.example.ninefourone.nutritionmaster.NutritionMaster;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * Created by ScorpioMiku on 2018/8/26.
 */

public class MessageUtils {

    public static void MakeToast(String message) {
        Toast.makeText(NutritionMaster.getInstance(), message, Toast.LENGTH_SHORT).show();
    }


}
