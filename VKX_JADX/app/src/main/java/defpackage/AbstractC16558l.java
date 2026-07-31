package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16558l {
    public static final LayerDrawable yandex(Context context, boolean z, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        gradientDrawable.setCornerRadius(VKXApplication.Companion.yandex(z ? 32.0f : 8.0f));
        gradientDrawable.setBounds(0, 0, 10, 10);
        Unit unit = Unit.INSTANCE;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = AbstractC7525l.yandex;
        Drawable drawable = resources.getDrawable(i3, theme);
        drawable.mutate();
        drawable.setTintList(ColorStateList.valueOf(i2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawable});
        layerDrawable.mutate();
        int iYandex = VKXApplication.Companion.yandex(i3 == R.drawable.ic_playlist_outline_56 ? 12.0f : 8.0f);
        layerDrawable.setLayerInset(1, iYandex, iYandex, iYandex, iYandex);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }
}
