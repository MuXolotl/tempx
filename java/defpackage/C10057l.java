package defpackage;

import android.graphics.Color;

/* JADX INFO: renamed from: lَؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10057l {
    public final boolean admob;
    public final Integer amazon;
    public final boolean billing;
    public final Integer crashlytics;
    public final int isPro;
    public final int loadAd;
    public final boolean mopub;
    public final float purchase;
    public final boolean subs;
    public final String yandex;

    public C10057l(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = num;
        this.amazon = num2;
        this.purchase = f;
        this.billing = z;
        this.mopub = z2;
        this.admob = z3;
        this.subs = z4;
        this.isPro = i2;
    }

    public static Integer crashlytics(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC12442l.admob(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC9966l.loadAd(((j >> 24) & 255) ^ 255), AbstractC9966l.loadAd(j & 255), AbstractC9966l.loadAd((j >> 8) & 255), AbstractC9966l.loadAd((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC6427l.metrica("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static boolean loadAd(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC6427l.metrica("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static int yandex(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC11043l.remoteconfig("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }
}
