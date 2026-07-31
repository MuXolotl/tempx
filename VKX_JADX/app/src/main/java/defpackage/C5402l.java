package defpackage;

import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: lؘؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5402l {
    public boolean admob;
    public boolean amazon;
    public int billing;
    public AudioDeviceInfo crashlytics;
    public C13736l loadAd;
    public int mopub;
    public boolean purchase;
    public int subs;
    public final C5978l yandex;

    public C5402l(C5402l c5402l) {
        this.yandex = c5402l.yandex;
        this.loadAd = c5402l.loadAd;
        this.crashlytics = c5402l.crashlytics;
        this.amazon = c5402l.amazon;
        this.purchase = c5402l.purchase;
        this.billing = c5402l.billing;
        this.mopub = c5402l.mopub;
        this.admob = c5402l.admob;
        this.subs = c5402l.subs;
    }

    public C5402l(C5978l c5978l) {
        this.yandex = c5978l;
        this.loadAd = C13736l.subs;
        this.billing = 0;
        this.mopub = -1;
        this.subs = -1;
    }
}
