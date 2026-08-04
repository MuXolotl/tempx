package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;

/* JADX INFO: renamed from: lَۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10732l {
    public boolean admob;
    public int amazon;
    public int billing;
    public final HashSet crashlytics;
    public C8081l firebase;
    public boolean isPro;
    public final HashSet loadAd;
    public boolean mopub;
    public int purchase;
    public boolean subs;
    public final HashSet yandex;

    public C10732l(C9310l c9310l) {
        HashSet hashSet = new HashSet();
        this.yandex = hashSet;
        HashSet hashSet2 = new HashSet();
        this.loadAd = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.crashlytics = hashSet3;
        this.amazon = Alert.DURATION_SHOW_INDEFINITELY;
        this.purchase = 0;
        this.isPro = false;
        C8081l c8081l = C8081l.loadAd;
        this.amazon = c9310l.yandex;
        this.purchase = c9310l.loadAd;
        this.billing = c9310l.crashlytics;
        this.firebase = c9310l.admob;
        hashSet.addAll(c9310l.subs);
        hashSet2.addAll(c9310l.isPro);
        hashSet3.addAll(c9310l.firebase);
        this.mopub = c9310l.amazon;
        this.admob = c9310l.purchase;
        this.subs = c9310l.billing;
        this.isPro = c9310l.mopub;
    }

    public final void loadAd() {
        new C9310l(this);
    }

    public final void yandex(int i) {
        this.crashlytics.add(Integer.valueOf(i));
    }

    public C10732l() {
        this.yandex = new HashSet();
        this.loadAd = new HashSet();
        this.crashlytics = new HashSet();
        this.amazon = Alert.DURATION_SHOW_INDEFINITELY;
        this.purchase = 0;
        this.isPro = false;
        this.firebase = C8081l.crashlytics;
    }
}
