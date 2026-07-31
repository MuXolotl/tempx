package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lۤۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18684l {
    public final HashMap crashlytics = new HashMap();
    public final double loadAd;
    public final double yandex;

    public C18684l(double d, double d2) {
        this.yandex = d;
        this.loadAd = d2;
    }

    public final double yandex(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.crashlytics;
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(new C14997l(AbstractC6889l.firebase(this.yandex, 200.0d, i)).crashlytics);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
