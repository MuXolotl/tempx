package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُٖٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC16326l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f31929l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f31930l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31931l;

    public RunnableC16326l(List list, int i, Throwable th) {
        this.f31931l = 1;
        AbstractC5641l.amazon(list, "initCallbacks cannot be null");
        this.f31929l = new ArrayList(list);
        this.f31930l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f31931l;
        int i2 = this.f31930l;
        Object obj = this.f31929l;
        switch (i) {
            case 0:
                AbstractC16763l abstractC16763l = (AbstractC16763l) ((C10685l) obj).f21690l;
                if (abstractC16763l != null) {
                    abstractC16763l.remoteconfig(i2);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((AbstractC2148l) arrayList.get(i3)).loadAd();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC2148l) arrayList.get(i3)).yandex();
                        i3++;
                    }
                }
                break;
            case 2:
                ((C3714l) obj).loadAd(i2);
                break;
            default:
                ((C16533l) obj).inmobi.loadAd(i2);
                break;
        }
    }

    public RunnableC16326l(BinderC2788l binderC2788l, C16533l c16533l, int i) {
        this.f31931l = 3;
        this.f31929l = c16533l;
        this.f31930l = i;
    }

    public /* synthetic */ RunnableC16326l(Object obj, int i, int i2) {
        this.f31931l = i2;
        this.f31929l = obj;
        this.f31930l = i;
    }
}
