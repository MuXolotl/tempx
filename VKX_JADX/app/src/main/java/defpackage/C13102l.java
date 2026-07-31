package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13102l extends AbstractC15992l {
    public static final C4421l[] amazon = {C4421l.admob};
    public static final C13102l billing;
    public static final C13102l purchase;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0433l.class);
        arrayList.add(AbstractC13877l.class);
        purchase = new C13102l(arrayList, true);
        arrayList.clear();
        arrayList.add(AbstractC5055l.class);
        arrayList.add(AbstractC4532l.class);
        arrayList.add(AbstractC15286l.class);
        arrayList.add(AbstractC9951l.class);
        C15376l c15376l = new C15376l(arrayList, true);
        C15376l c15376l2 = new C15376l(arrayList, true);
        C13102l c13102l = new C13102l(arrayList, true);
        billing = c13102l;
        c13102l.purchase(c15376l);
        arrayList.add(AbstractC0433l.class);
        arrayList.add(AbstractC13877l.class);
        arrayList.add(AbstractC16984l.class);
        arrayList.add(AbstractC15216l.class);
        arrayList.add(AbstractC17605l.class);
        new C13102l(arrayList, false).purchase(c15376l2);
    }

    @Override // defpackage.AbstractC15992l
    public final AbstractC2058l crashlytics(long j, BigInteger bigInteger, C16045l c16045l) throws IOException {
        long jPurchase = AbstractC3848l.purchase(c16045l);
        if (c16045l.read() != 1) {
            C18262l.metrica("No ASF");
            return null;
        }
        if (c16045l.read() == 2) {
            return new C4616l(j, bigInteger, jPurchase);
        }
        C18262l.metrica("No ASF");
        return null;
    }

    public final void purchase(C15376l c15376l) {
        for (C4421l c4421l : c15376l.yandex()) {
            this.loadAd.put(c4421l, c15376l);
        }
    }

    @Override // defpackage.InterfaceC11455l
    public final C4421l[] yandex() {
        return (C4421l[]) amazon.clone();
    }
}
