package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؓٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC1890l implements Callable {
    public final /* synthetic */ BinderC15526l amazon;
    public final /* synthetic */ Bundle crashlytics;
    public final /* synthetic */ C10462l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC1890l(BinderC15526l binderC15526l, C10462l c10462l, Bundle bundle, int i) {
        this.yandex = i;
        this.loadAd = c10462l;
        this.crashlytics = bundle;
        this.amazon = binderC15526l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.yandex;
        Bundle bundle = this.crashlytics;
        C10462l c10462l = this.loadAd;
        BinderC15526l binderC15526l = this.amazon;
        switch (i) {
            case 0:
                binderC15526l.purchase.m2089continue();
                break;
            default:
                binderC15526l.purchase.m2089continue();
                break;
        }
        return binderC15526l.purchase.m2108super(bundle, c10462l);
    }
}
