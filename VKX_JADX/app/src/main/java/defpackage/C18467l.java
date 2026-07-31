package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18467l implements InterfaceC15871l, InterfaceC3012l {
    public C8114l crashlytics;
    public final AbstractC4383l loadAd;
    public final C9950l yandex;

    public C18467l(C9950l c9950l, AbstractC10437l abstractC10437l, C1655l c1655l) {
        this.yandex = c9950l;
        AbstractC4383l abstractC4383lMo1225l = c1655l.yandex.mo1225l();
        this.loadAd = abstractC4383lMo1225l;
        abstractC10437l.amazon(abstractC4383lMo1225l);
        abstractC4383lMo1225l.yandex(this);
    }

    public static int amazon(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.yandex.invalidateSelf();
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
    }
}
