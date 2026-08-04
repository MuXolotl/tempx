package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: l٘ؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17661l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C3278l c3278l = (C3278l) obj;
        String str = c3278l.f7018l;
        c1080l.m788class(c3278l.yandex());
        boolean z = c3278l.f7020l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 7, Boolean.valueOf(z));
        }
        boolean z2 = c3278l.f7016l;
        if (z2) {
            c16786l.subs(c1080l, 6, Boolean.valueOf(z2));
        }
        boolean z3 = c3278l.f7015l;
        if (z3) {
            c16786l.subs(c1080l, 5, Boolean.valueOf(z3));
        }
        boolean z4 = c3278l.f7021l;
        if (z4) {
            c16786l.subs(c1080l, 4, Boolean.valueOf(z4));
        }
        C1682l.f4044l.yandex().subs(c1080l, 3, c3278l.f7017l);
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 2, str);
        }
        boolean z5 = c3278l.f7019l;
        if (z5) {
            c16786l.subs(c1080l, 1, Boolean.valueOf(z5));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        String strSmaato = "";
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C3278l(zBooleanValue, strSmaato, arrayList, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            switch (iMopub) {
                case 1:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 2:
                    AbstractC7532l.startapp.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 3:
                    arrayList.add(C1682l.f4044l.crashlytics(c7084l));
                    break;
                case 4:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 5:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 6:
                    zBooleanValue4 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 7:
                    zBooleanValue5 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C3278l c3278l = (C3278l) obj;
        String str = c3278l.f7018l;
        int iPurchase = c3278l.yandex().purchase();
        boolean z = c3278l.f7019l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(2, str);
        }
        int iFirebase = C1682l.f4044l.yandex().firebase(3, c3278l.f7017l) + iPurchase;
        boolean z2 = c3278l.f7021l;
        if (z2) {
            iFirebase = AbstractC9029l.firebase(z2, c16786l, 4, iFirebase);
        }
        boolean z3 = c3278l.f7015l;
        if (z3) {
            iFirebase = AbstractC9029l.firebase(z3, c16786l, 5, iFirebase);
        }
        boolean z4 = c3278l.f7016l;
        if (z4) {
            iFirebase = AbstractC9029l.firebase(z4, c16786l, 6, iFirebase);
        }
        boolean z5 = c3278l.f7020l;
        return z5 ? AbstractC9029l.firebase(z5, c16786l, 7, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C3278l c3278l = (C3278l) obj;
        String str = c3278l.f7018l;
        boolean z = c3278l.f7019l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 2, str);
        }
        C1682l.f4044l.yandex().admob(c13161l, 3, c3278l.f7017l);
        boolean z2 = c3278l.f7021l;
        if (z2) {
            c16786l.admob(c13161l, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c3278l.f7015l;
        if (z3) {
            c16786l.admob(c13161l, 5, Boolean.valueOf(z3));
        }
        boolean z4 = c3278l.f7016l;
        if (z4) {
            c16786l.admob(c13161l, 6, Boolean.valueOf(z4));
        }
        boolean z5 = c3278l.f7020l;
        if (z5) {
            c16786l.admob(c13161l, 7, Boolean.valueOf(z5));
        }
        c13161l.m3586switch(c3278l.yandex());
    }
}
