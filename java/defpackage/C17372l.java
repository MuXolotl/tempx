package defpackage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٗۙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17372l {
    public static final int[] ad;
    public static final int[] advert;
    public static final int[] applovin;
    public static final int[] appmetrica;
    public static final int[] inmobi;
    public static final int[] isVip;
    public static final int license = crashlytics(2, 2, 2, 0);
    public static final int[] premium;
    public static final int pro;
    public static final boolean[] signatures;
    public int Signature;
    public int adcel;
    public int admob;
    public int ads;
    public boolean amazon;
    public boolean billing;
    public boolean crashlytics;
    public int firebase;
    public int isPro;
    public int metrica;
    public int mopub;
    public int purchase;
    public int remoteconfig;
    public int smaato;
    public int startapp;
    public int subs;
    public int subscription;
    public int tapsense;
    public int vip;
    public final ArrayList yandex = new ArrayList();
    public final SpannableStringBuilder loadAd = new SpannableStringBuilder();

    static {
        int iCrashlytics = crashlytics(0, 0, 0, 0);
        pro = iCrashlytics;
        int iCrashlytics2 = crashlytics(0, 0, 0, 3);
        ad = new int[]{0, 0, 0, 0, 0, 2, 0};
        advert = new int[]{0, 0, 0, 0, 0, 0, 2};
        isVip = new int[]{3, 3, 3, 3, 3, 3, 1};
        signatures = new boolean[]{false, false, false, true, true, true, false};
        premium = new int[]{iCrashlytics, iCrashlytics2, iCrashlytics, iCrashlytics, iCrashlytics2, iCrashlytics, iCrashlytics};
        applovin = new int[]{0, 1, 2, 3, 4, 3, 4};
        appmetrica = new int[]{0, 0, 0, 0, 0, 3, 3};
        inmobi = new int[]{iCrashlytics, iCrashlytics, iCrashlytics, iCrashlytics, iCrashlytics, iCrashlytics2, iCrashlytics2};
    }

    public C17372l() {
        amazon();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int crashlytics(int i, int i2, int i3, int i4) {
        int i5;
        AbstractC12442l.smaato(i, 4);
        AbstractC12442l.smaato(i2, 4);
        AbstractC12442l.smaato(i3, 4);
        AbstractC12442l.smaato(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    public final void amazon() {
        this.yandex.clear();
        this.loadAd.clear();
        this.metrica = -1;
        this.startapp = -1;
        this.adcel = -1;
        this.subscription = -1;
        this.Signature = 0;
        this.crashlytics = false;
        this.amazon = false;
        this.purchase = 4;
        this.billing = false;
        this.mopub = 0;
        this.admob = 0;
        this.subs = 0;
        this.isPro = 15;
        this.firebase = 0;
        this.smaato = 0;
        this.remoteconfig = 0;
        int i = pro;
        this.vip = i;
        this.ads = license;
        this.tapsense = i;
    }

    public final void billing(int i, int i2) {
        int i3 = this.adcel;
        SpannableStringBuilder spannableStringBuilder = this.loadAd;
        if (i3 != -1 && this.ads != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.ads), this.adcel, spannableStringBuilder.length(), 33);
        }
        if (i != license) {
            this.adcel = spannableStringBuilder.length();
            this.ads = i;
        }
        if (this.subscription != -1 && this.tapsense != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.tapsense), this.subscription, spannableStringBuilder.length(), 33);
        }
        if (i2 != pro) {
            this.subscription = spannableStringBuilder.length();
            this.tapsense = i2;
        }
    }

    public final SpannableString loadAd() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.loadAd);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.metrica != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.metrica, length, 33);
            }
            if (this.startapp != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.startapp, length, 33);
            }
            if (this.adcel != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.ads), this.adcel, length, 33);
            }
            if (this.subscription != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.tapsense), this.subscription, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void purchase(boolean z, boolean z2) {
        int i = this.metrica;
        SpannableStringBuilder spannableStringBuilder = this.loadAd;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.metrica, spannableStringBuilder.length(), 33);
                this.metrica = -1;
            }
        } else if (z) {
            this.metrica = spannableStringBuilder.length();
        }
        if (this.startapp == -1) {
            if (z2) {
                this.startapp = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.startapp, spannableStringBuilder.length(), 33);
            this.startapp = -1;
        }
    }

    public final void yandex(char c) {
        SpannableStringBuilder spannableStringBuilder = this.loadAd;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        SpannableString spannableStringLoadAd = loadAd();
        ArrayList arrayList = this.yandex;
        arrayList.add(spannableStringLoadAd);
        spannableStringBuilder.clear();
        if (this.metrica != -1) {
            this.metrica = 0;
        }
        if (this.startapp != -1) {
            this.startapp = 0;
        }
        if (this.adcel != -1) {
            this.adcel = 0;
        }
        if (this.subscription != -1) {
            this.subscription = 0;
        }
        while (true) {
            if (arrayList.size() < this.isPro && arrayList.size() < 15) {
                this.Signature = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }
}
