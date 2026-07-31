package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: lٌّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8742l {
    public final C9280l crashlytics;
    public final C5648l loadAd;
    public final C3307l yandex;

    static {
        C14513l.applovin("WMFgUpdater");
    }

    public C8742l(WorkDatabase workDatabase, C5648l c5648l, C3307l c3307l) {
        this.loadAd = c5648l;
        this.yandex = c3307l;
        this.crashlytics = workDatabase.Signature();
    }
}
