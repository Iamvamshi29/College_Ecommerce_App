package com.merp.my.book.shor.app.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.merp.my.book.shor.app.R;
import com.merp.my.book.shor.app.model.BookDetail;

import java.io.ByteArrayOutputStream;

public class MyConstants {
    public static final String NAME_1 = "apron";
    public static final String NAME_2 = "C lang Notes";
    public static final String NAME_3 = "DM Spectrum";
    public static final String NAME_4 = "Drafter";
    public static final String NAME_5 = "Laptop";
    public static final String NAME_6 = "3-2 Spectrum";

    public static final String BRANCH_1 = "cse";
    public static final String  BRANCH_2= "cse";
    public static final String BRANCH_3 = "cse";
    public static final String BRANCH_4 = "cse";
    public static final String BRANCH_5 = "cse";
    public static final String BRANCH_6 = "cse";

    public static final String DESC_1 = "Enginering workshop,pratical labs(BEE &chemistry).";
    public static final String DESC_2 = "C language hand writing notes .";
    public static final String DESC_3 = "DM spectrum 3-2";
    public static final String DESC_4 = "Engineering Drafter ";
    public static final String DESC_5 = "second hand laptop.";
    public static final String DESC_6 = "spectrum 3-2 all in one .";

    public static final String PRICE_1 = "250";
    public static final String PRICE_2 = "180";
    public static final String PRICE_3 = "479";
    public static final String PRICE_4 = "210";
    public static final String PRICE_5 = "299";
    public static final String PRICE_6 = "279";

    public static final String CONTACT_1 = "9000468453";
    public static final String CONTACT_2 = "9966076432";
    public static final String CONTACT_3 = "974152963";
    public static final String CONTACT_4 = "9873369870";
    public static final String CONTACT_5 = "4590135270";
    public static final String CONTACT_6 = "8896320772";


    public static byte[] getByte(Drawable d){
        Bitmap bitmap = ((BitmapDrawable)d).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        return stream.toByteArray();
    }
}
