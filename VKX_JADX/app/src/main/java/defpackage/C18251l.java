package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lْ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18251l implements InterfaceC3012l, InterfaceC15871l {
    public final C10017l amazon;
    public final C10017l billing;
    public final int crashlytics;
    public final ArrayList loadAd = new ArrayList();
    public final C10017l purchase;
    public final boolean yandex;

    public C18251l(AbstractC10437l abstractC10437l, C11283l c11283l) {
        this.yandex = c11283l.purchase;
        this.crashlytics = c11283l.yandex;
        C10017l c10017lMo1225l = c11283l.loadAd.mo1225l();
        this.amazon = c10017lMo1225l;
        C10017l c10017lMo1225l2 = c11283l.crashlytics.mo1225l();
        this.purchase = c10017lMo1225l2;
        C10017l c10017lMo1225l3 = c11283l.amazon.mo1225l();
        this.billing = c10017lMo1225l3;
        abstractC10437l.amazon(c10017lMo1225l);
        abstractC10437l.amazon(c10017lMo1225l2);
        abstractC10437l.amazon(c10017lMo1225l3);
        c10017lMo1225l.yandex(this);
        c10017lMo1225l2.yandex(this);
        c10017lMo1225l3.yandex(this);
    }

    public final void amazon(InterfaceC15871l interfaceC15871l) {
        this.loadAd.add(interfaceC15871l);
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.loadAd;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC15871l) arrayList.get(i)).yandex();
            i++;
        }
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
    }
}
