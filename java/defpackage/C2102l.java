package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؓۚۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2102l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C18364l c18364l = (C18364l) obj;
        c1080l.m788class(c18364l.yandex());
        C7117l.f14902l.yandex().subs(c1080l, 5, c18364l.f35876l);
        int i = c18364l.f35875l;
        C16786l c16786l = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l.subs(c1080l, 4, Integer.valueOf(i));
        }
        int i2 = c18364l.f35879l;
        if (i2 != 0) {
            c16786l.subs(c1080l, 3, Integer.valueOf(i2));
        }
        boolean z = c18364l.f35877l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.subs(c1080l, 2, Boolean.valueOf(z));
        }
        boolean z2 = c18364l.f35878l;
        if (z2) {
            c16786l2.subs(c1080l, 1, Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C18364l(zBooleanValue, zBooleanValue2, iIntValue, iIntValue2, arrayList, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
            } else if (iMopub != 2) {
                C16786l c16786l2 = AbstractC7532l.mopub;
                if (iMopub == 3) {
                    iIntValue = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                } else if (iMopub == 4) {
                    iIntValue2 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                } else if (iMopub != 5) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    arrayList.add(C7117l.f14902l.crashlytics(c7084l));
                }
            } else {
                zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C18364l c18364l = (C18364l) obj;
        int iPurchase = c18364l.yandex().purchase();
        boolean z = c18364l.f35878l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c18364l.f35877l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        int i = c18364l.f35879l;
        C16786l c16786l2 = AbstractC7532l.mopub;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, c16786l2, 3, iPurchase);
        }
        int i2 = c18364l.f35875l;
        if (i2 != 0) {
            iPurchase = AbstractC9029l.isPro(i2, c16786l2, 4, iPurchase);
        }
        return C7117l.f14902l.yandex().firebase(5, c18364l.f35876l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C18364l c18364l = (C18364l) obj;
        boolean z = c18364l.f35878l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c18364l.f35877l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        int i = c18364l.f35879l;
        C16786l c16786l2 = AbstractC7532l.mopub;
        if (i != 0) {
            c16786l2.admob(c13161l, 3, Integer.valueOf(i));
        }
        int i2 = c18364l.f35875l;
        if (i2 != 0) {
            c16786l2.admob(c13161l, 4, Integer.valueOf(i2));
        }
        C7117l.f14902l.yandex().admob(c13161l, 5, c18364l.f35876l);
        c13161l.m3586switch(c18364l.yandex());
    }
}
