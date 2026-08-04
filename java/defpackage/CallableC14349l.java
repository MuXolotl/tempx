package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lَٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC14349l implements Callable {
    public final /* synthetic */ String amazon;
    public final /* synthetic */ String crashlytics;
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ BinderC15526l purchase;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC14349l(BinderC15526l binderC15526l, String str, String str2, String str3, int i) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = binderC15526l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.yandex;
        String str = this.amazon;
        String str2 = this.crashlytics;
        String str3 = this.loadAd;
        BinderC15526l binderC15526l = this.purchase;
        switch (i) {
            case 0:
                binderC15526l.purchase.m2089continue();
                C8648l c8648l = binderC15526l.purchase.f14451l;
                C6901l.m2082case(c8648l);
                return c8648l.m2380l(str3, str2, str);
            case 1:
                binderC15526l.purchase.m2089continue();
                C8648l c8648l2 = binderC15526l.purchase.f14451l;
                C6901l.m2082case(c8648l2);
                return c8648l2.m2380l(str3, str2, str);
            case 2:
                binderC15526l.purchase.m2089continue();
                C8648l c8648l3 = binderC15526l.purchase.f14451l;
                C6901l.m2082case(c8648l3);
                return c8648l3.m2358l(str3, str2, str);
            default:
                binderC15526l.purchase.m2089continue();
                C8648l c8648l4 = binderC15526l.purchase.f14451l;
                C6901l.m2082case(c8648l4);
                return c8648l4.m2358l(str3, str2, str);
        }
    }
}
