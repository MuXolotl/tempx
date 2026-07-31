package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُۚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11304l {
    public final C4220l admob;
    public final String amazon;
    public final C15617l billing;
    public final int crashlytics;
    public final List firebase;
    public final C5959l isPro;
    public final Size loadAd;
    public final C8259l mopub;
    public final Integer purchase;
    public final ArrayList smaato = new ArrayList();
    public final C5565l subs;
    public final int yandex;

    public C11304l(int i, Size size, int i2, String str, Integer num, C15617l c15617l, C8259l c8259l, C4220l c4220l, C5565l c5565l, C5959l c5959l, List list) {
        this.yandex = i;
        this.loadAd = size;
        this.crashlytics = i2;
        this.amazon = str;
        this.purchase = num;
        this.billing = c15617l;
        this.mopub = c8259l;
        this.admob = c4220l;
        this.subs = c5565l;
        this.isPro = c5959l;
        this.firebase = list;
    }

    public final String toString() {
        return AbstractC0653l.vip(this.yandex, "OutputConfig-");
    }
}
