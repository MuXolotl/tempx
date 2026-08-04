package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lً۟ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8306l implements InterfaceC13362l {
    public final /* synthetic */ C13734l loadAd;
    public final int yandex;

    public C8306l(C13734l c13734l, int i) {
        this.loadAd = c13734l;
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC13362l
    public final boolean yandex(ArrayList arrayList, ArrayList arrayList2) {
        C13734l c13734l = this.loadAd;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c13734l.isVip;
        int i = this.yandex;
        if (abstractComponentCallbacksC4411l == null || i >= 0 || !abstractComponentCallbacksC4411l.billing().m3734else()) {
            return c13734l.m3729case(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
