package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؘٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC14486l implements Callable {
    public final /* synthetic */ int yandex;
    public static final /* synthetic */ CallableC14486l loadAd = new CallableC14486l(0);
    public static final /* synthetic */ CallableC14486l crashlytics = new CallableC14486l(1);
    public static final /* synthetic */ CallableC14486l amazon = new CallableC14486l(2);

    public /* synthetic */ CallableC14486l(int i) {
        this.yandex = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.yandex) {
            case 0:
                C3797l c3797l = AbstractC3940l.f8113l;
                return null;
            case 1:
                C7869l c7869l = new C7869l("internal.platform", 4);
                c7869l.f21268l.put("getVersion", new C7869l("getVersion", 3));
                return c7869l;
            default:
                return null;
        }
    }
}
