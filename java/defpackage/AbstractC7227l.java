package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: lؚؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7227l {
    public static final void adcel(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimenAttr(i, str, i2);
    }

    public static final void admob(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList) {
        remoteViews.setColorStateList(i, str, colorStateList);
    }

    public static final void amazon(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColor(i, str, i2);
    }

    public static final void billing(RemoteViews remoteViews, int i, String str, int i2, int i3) {
        remoteViews.setColorInt(i, str, i2, i3);
    }

    public static final void crashlytics(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequenceAttr(i, str, i2);
    }

    public static final void firebase(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setFloatDimen(i, str, f, i2);
    }

    public static final void isPro(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateListAttr(i, str, i2);
    }

    public static final void loadAd(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequence(i, str, i2);
    }

    public static final void metrica(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setIntDimen(i, str, f, i2);
    }

    public static final void mopub(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateList(i, str, i2);
    }

    public static final void purchase(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorAttr(i, str, i2);
    }

    public static final void remoteconfig(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimenAttr(i, str, i2);
    }

    public static final void smaato(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimen(i, str, i2);
    }

    public static final void startapp(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimen(i, str, i2);
    }

    public static final void subs(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList, ColorStateList colorStateList2) {
        remoteViews.setColorStateList(i, str, colorStateList, colorStateList2);
    }

    public static final void vip(RemoteViews remoteViews, int i, String str, Icon icon, Icon icon2) {
        remoteViews.setIcon(i, str, icon, icon2);
    }

    public static final void yandex(RemoteViews remoteViews, int i, String str, BlendMode blendMode) {
        remoteViews.setBlendMode(i, str, blendMode);
    }
}
