package defpackage;

import android.text.Layout;

/* JADX INFO: renamed from: lؘٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5900l {
    public String Signature;
    public C4171l ads;
    public int amazon;
    public boolean crashlytics;
    public float firebase;
    public int loadAd;
    public Layout.Alignment metrica;
    public boolean purchase;
    public String smaato;
    public Layout.Alignment startapp;
    public String tapsense;
    public String yandex;
    public int billing = -1;
    public int mopub = -1;
    public int admob = -1;
    public int subs = -1;
    public int isPro = -1;
    public int remoteconfig = -1;
    public int vip = -1;
    public int adcel = -1;
    public float subscription = Float.MAX_VALUE;

    public final void yandex(C5900l c5900l) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c5900l != null) {
            if (!this.crashlytics && c5900l.crashlytics) {
                this.loadAd = c5900l.loadAd;
                this.crashlytics = true;
            }
            if (this.admob == -1) {
                this.admob = c5900l.admob;
            }
            if (this.subs == -1) {
                this.subs = c5900l.subs;
            }
            if (this.yandex == null && (str = c5900l.yandex) != null) {
                this.yandex = str;
            }
            if (this.billing == -1) {
                this.billing = c5900l.billing;
            }
            if (this.mopub == -1) {
                this.mopub = c5900l.mopub;
            }
            if (this.vip == -1) {
                this.vip = c5900l.vip;
            }
            if (this.metrica == null && (alignment2 = c5900l.metrica) != null) {
                this.metrica = alignment2;
            }
            if (this.startapp == null && (alignment = c5900l.startapp) != null) {
                this.startapp = alignment;
            }
            if (this.adcel == -1) {
                this.adcel = c5900l.adcel;
            }
            if (this.isPro == -1) {
                this.isPro = c5900l.isPro;
                this.firebase = c5900l.firebase;
            }
            if (this.ads == null) {
                this.ads = c5900l.ads;
            }
            if (this.subscription == Float.MAX_VALUE) {
                this.subscription = c5900l.subscription;
            }
            if (this.tapsense == null) {
                this.tapsense = c5900l.tapsense;
            }
            if (this.Signature == null) {
                this.Signature = c5900l.Signature;
            }
            if (!this.purchase && c5900l.purchase) {
                this.amazon = c5900l.amazon;
                this.purchase = true;
            }
            if (this.remoteconfig != -1 || (i = c5900l.remoteconfig) == -1) {
                return;
            }
            this.remoteconfig = i;
        }
    }
}
