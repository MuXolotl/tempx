package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌؙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6339l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C7814l c7814l = (C7814l) obj;
        String str = c7814l.f16327l;
        c1080l.m788class(c7814l.yandex());
        EnumC3503l enumC3503l = c7814l.f16334l;
        if (enumC3503l != EnumC3503l.BLUR_ARTWORK) {
            EnumC3503l.f7397l.subs(c1080l, 9, enumC3503l);
        }
        boolean z = c7814l.f16328l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 8, Boolean.valueOf(z));
        }
        long j = c7814l.f16332l;
        if (j != 0) {
            AbstractC7532l.isPro.subs(c1080l, 5, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 4, str);
        }
        C18233l.f35742l.yandex().subs(c1080l, 7, c7814l.f16331l);
        boolean z2 = c7814l.f16326l;
        if (z2) {
            c16786l.subs(c1080l, 6, Boolean.valueOf(z2));
        }
        boolean z3 = c7814l.f16333l;
        if (z3) {
            c16786l.subs(c1080l, 3, Boolean.valueOf(z3));
        }
        boolean z4 = c7814l.f16329l;
        if (z4) {
            c16786l.subs(c1080l, 2, Boolean.valueOf(z4));
        }
        boolean z5 = c7814l.f16330l;
        if (z5) {
            c16786l.subs(c1080l, 1, Boolean.valueOf(z5));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        EnumC3503l enumC3503l = EnumC3503l.BLUR_ARTWORK;
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        String strSmaato = "";
        long jLongValue = 0;
        Object objCrashlytics = enumC3503l;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C7814l(zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue, arrayList, strSmaato, jLongValue, zBooleanValue2, (EnumC3503l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            switch (iMopub) {
                case 1:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    continue;
                case 2:
                    zBooleanValue4 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    continue;
                case 3:
                    zBooleanValue5 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    continue;
                case 4:
                    AbstractC7532l.startapp.getClass();
                    strSmaato = c7084l.smaato();
                    continue;
                case 5:
                    jLongValue = ((Number) AbstractC7532l.isPro.crashlytics(c7084l)).longValue();
                    zBooleanValue4 = zBooleanValue4;
                    zBooleanValue3 = zBooleanValue3;
                    continue;
                case 6:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    continue;
                case 7:
                    arrayList.add(C18233l.f35742l.crashlytics(c7084l));
                    break;
                case 8:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    continue;
                case 9:
                    try {
                        objCrashlytics = EnumC3503l.f7397l.crashlytics(c7084l);
                        continue;
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        zBooleanValue3 = zBooleanValue3;
                        zBooleanValue4 = zBooleanValue4;
                    }
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
            zBooleanValue3 = zBooleanValue3;
            zBooleanValue4 = zBooleanValue4;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C7814l c7814l = (C7814l) obj;
        String str = c7814l.f16327l;
        int iPurchase = c7814l.yandex().purchase();
        boolean z = c7814l.f16330l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c7814l.f16329l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        boolean z3 = c7814l.f16333l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l, 3, iPurchase);
        }
        boolean z4 = c7814l.f16326l;
        if (z4) {
            iPurchase = AbstractC9029l.firebase(z4, c16786l, 6, iPurchase);
        }
        int iFirebase = C18233l.f35742l.yandex().firebase(7, c7814l.f16331l) + iPurchase;
        if (!AbstractC8576l.yandex(str, "")) {
            iFirebase += AbstractC7532l.startapp.firebase(4, str);
        }
        long j = c7814l.f16332l;
        if (j != 0) {
            iFirebase += AbstractC7532l.isPro.firebase(5, Long.valueOf(j));
        }
        boolean z5 = c7814l.f16328l;
        if (z5) {
            iFirebase = AbstractC9029l.firebase(z5, c16786l, 8, iFirebase);
        }
        EnumC3503l enumC3503l = c7814l.f16334l;
        return enumC3503l != EnumC3503l.BLUR_ARTWORK ? EnumC3503l.f7397l.firebase(9, enumC3503l) + iFirebase : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C7814l c7814l = (C7814l) obj;
        String str = c7814l.f16327l;
        boolean z = c7814l.f16330l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c7814l.f16329l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c7814l.f16333l;
        if (z3) {
            c16786l.admob(c13161l, 3, Boolean.valueOf(z3));
        }
        boolean z4 = c7814l.f16326l;
        if (z4) {
            c16786l.admob(c13161l, 6, Boolean.valueOf(z4));
        }
        C18233l.f35742l.yandex().admob(c13161l, 7, c7814l.f16331l);
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 4, str);
        }
        long j = c7814l.f16332l;
        if (j != 0) {
            AbstractC7532l.isPro.admob(c13161l, 5, Long.valueOf(j));
        }
        boolean z5 = c7814l.f16328l;
        if (z5) {
            c16786l.admob(c13161l, 8, Boolean.valueOf(z5));
        }
        EnumC3503l enumC3503l = c7814l.f16334l;
        if (enumC3503l != EnumC3503l.BLUR_ARTWORK) {
            EnumC3503l.f7397l.admob(c13161l, 9, enumC3503l);
        }
        c13161l.m3586switch(c7814l.yandex());
    }
}
