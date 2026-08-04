package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lَٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15597l implements InterfaceC1720l {
    public int crashlytics;
    public int loadAd;
    public final WeakReference yandex;

    public C15597l(C1194l c1194l) {
        this.yandex = new WeakReference(c1194l);
    }

    @Override // defpackage.InterfaceC1720l
    public final void crashlytics(int i, float f) {
        C1194l c1194l = (C1194l) this.yandex.get();
        if (c1194l != null) {
            int i2 = this.crashlytics;
            c1194l.admob(i, f, i2 != 2 || this.loadAd == 1, (i2 == 2 && this.loadAd == 0) ? false : true);
        }
    }

    @Override // defpackage.InterfaceC1720l
    public final void loadAd(int i) {
        C1194l c1194l = (C1194l) this.yandex.get();
        if (c1194l == null || c1194l.getSelectedTabPosition() == i || i >= c1194l.getTabCount()) {
            return;
        }
        int i2 = this.crashlytics;
        c1194l.billing((i < 0 || i >= c1194l.getTabCount()) ? null : (C3766l) c1194l.f3193l.get(i), i2 == 0 || (i2 == 2 && this.loadAd == 0));
    }

    @Override // defpackage.InterfaceC1720l
    public final void yandex(int i) {
        this.loadAd = this.crashlytics;
        this.crashlytics = i;
    }
}
