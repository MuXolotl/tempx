package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٌۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9050l {
    public static final Charset amazon;
    public static volatile Charset billing;
    public static final Charset crashlytics;
    public static final Charset loadAd;
    public static volatile Charset purchase;
    public static final Charset yandex = Charset.forName("UTF-8");

    static {
        Charset.forName("UTF-16");
        loadAd = Charset.forName("UTF-16BE");
        crashlytics = Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        amazon = Charset.forName("ISO-8859-1");
    }
}
