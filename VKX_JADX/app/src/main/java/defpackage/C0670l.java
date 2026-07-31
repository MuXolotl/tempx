package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lۣؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0670l {
    public boolean adcel;
    public int admob;
    public String amazon;
    public int billing;
    public Set crashlytics;
    public int firebase;
    public int isPro;
    public String loadAd;
    public float metrica;
    public boolean mopub;
    public String purchase;
    public int remoteconfig;
    public int smaato;
    public int startapp;
    public boolean subs;
    public int vip;
    public String yandex;

    public static int yandex(int i, int i2, String str, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
