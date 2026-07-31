package defpackage;

/* JADX INFO: renamed from: lًۜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8275l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C7968l c7968l = (C7968l) obj;
        c1080l.m788class(c7968l.yandex());
        C6170l.f13007l.subs(c1080l, 7, c7968l.f16620l);
        EnumC1518l.f3787l.subs(c1080l, 6, c7968l.f16616l);
        String str = c7968l.f16617l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 8, str);
        }
        boolean z = c7968l.f16615l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 5, Boolean.valueOf(z));
        }
        boolean z2 = c7968l.f16621l;
        if (z2) {
            c16786l.subs(c1080l, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c7968l.f16618l;
        if (z3) {
            c16786l.subs(c1080l, 2, Boolean.valueOf(z3));
        }
        boolean z4 = c7968l.f16619l;
        if (z4) {
            c16786l.subs(c1080l, 1, Boolean.valueOf(z4));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        Object objCrashlytics = null;
        String strSmaato = "";
        Object objCrashlytics2 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C7968l(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, (EnumC1518l) objCrashlytics, (C6170l) objCrashlytics2, strSmaato, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            switch (iMopub) {
                case 1:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 2:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 3:
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
                case 4:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 5:
                    zBooleanValue4 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 6:
                    try {
                        objCrashlytics = EnumC1518l.f3787l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                    }
                    break;
                case 7:
                    objCrashlytics2 = C6170l.f13007l.crashlytics(c7084l);
                    break;
                case 8:
                    AbstractC7532l.startapp.getClass();
                    strSmaato = c7084l.smaato();
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C7968l c7968l = (C7968l) obj;
        String str = c7968l.f16617l;
        int iPurchase = c7968l.yandex().purchase();
        boolean z = c7968l.f16619l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c7968l.f16618l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        boolean z3 = c7968l.f16621l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l, 4, iPurchase);
        }
        boolean z4 = c7968l.f16615l;
        if (z4) {
            iPurchase = AbstractC9029l.firebase(z4, c16786l, 5, iPurchase);
        }
        int iFirebase = C6170l.f13007l.firebase(7, c7968l.f16620l) + EnumC1518l.f3787l.firebase(6, c7968l.f16616l) + iPurchase;
        return !AbstractC8576l.yandex(str, "") ? AbstractC7532l.startapp.firebase(8, str) + iFirebase : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C7968l c7968l = (C7968l) obj;
        String str = c7968l.f16617l;
        boolean z = c7968l.f16619l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c7968l.f16618l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c7968l.f16621l;
        if (z3) {
            c16786l.admob(c13161l, 4, Boolean.valueOf(z3));
        }
        boolean z4 = c7968l.f16615l;
        if (z4) {
            c16786l.admob(c13161l, 5, Boolean.valueOf(z4));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 8, str);
        }
        EnumC1518l.f3787l.admob(c13161l, 6, c7968l.f16616l);
        C6170l.f13007l.admob(c13161l, 7, c7968l.f16620l);
        c13161l.m3586switch(c7968l.yandex());
    }
}
