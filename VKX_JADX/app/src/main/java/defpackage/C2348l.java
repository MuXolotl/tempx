package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2348l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C1864l c1864l = (C1864l) obj;
        String str = c1864l.f4280l;
        c1080l.m788class(c1864l.yandex());
        boolean z = c1864l.f4278l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.subs(c1080l, 9, Boolean.valueOf(z));
        }
        AbstractC7532l.admob.subs(c1080l, 5, c1864l.f4277l);
        C13386l.f26277l.yandex().subs(c1080l, 4, c1864l.f4281l);
        boolean z2 = c1864l.f4282l;
        if (z2) {
            c16786l.subs(c1080l, 3, Boolean.valueOf(z2));
        }
        boolean z3 = c1864l.f4279l;
        if (z3) {
            c16786l.subs(c1080l, 2, Boolean.valueOf(z3));
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        AbstractC7532l.startapp.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        Object objCrashlytics = null;
        boolean zBooleanValue3 = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C1864l(strSmaato, zBooleanValue, zBooleanValue3, arrayList, (Integer) objCrashlytics, zBooleanValue2, c7084l.purchase(jAmazon));
            }
            if (iMopub != 1) {
                C16786l c16786l = AbstractC7532l.billing;
                if (iMopub == 2) {
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                } else if (iMopub == 3) {
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                } else if (iMopub == 4) {
                    arrayList.add(C13386l.f26277l.crashlytics(c7084l));
                } else if (iMopub == 5) {
                    objCrashlytics = AbstractC7532l.admob.crashlytics(c7084l);
                } else if (iMopub != 9) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                }
            } else {
                AbstractC7532l.startapp.getClass();
                strSmaato = c7084l.smaato();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C1864l c1864l = (C1864l) obj;
        int iPurchase = c1864l.yandex().purchase();
        String str = c1864l.f4280l;
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(1, str);
        }
        boolean z = c1864l.f4279l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 2, iPurchase);
        }
        boolean z2 = c1864l.f4282l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 3, iPurchase);
        }
        int iFirebase = AbstractC7532l.admob.firebase(5, c1864l.f4277l) + C13386l.f26277l.yandex().firebase(4, c1864l.f4281l) + iPurchase;
        boolean z3 = c1864l.f4278l;
        return z3 ? AbstractC9029l.firebase(z3, c16786l, 9, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C1864l c1864l = (C1864l) obj;
        String str = c1864l.f4280l;
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 1, str);
        }
        boolean z = c1864l.f4279l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z));
        }
        boolean z2 = c1864l.f4282l;
        if (z2) {
            c16786l.admob(c13161l, 3, Boolean.valueOf(z2));
        }
        C13386l.f26277l.yandex().admob(c13161l, 4, c1864l.f4281l);
        AbstractC7532l.admob.admob(c13161l, 5, c1864l.f4277l);
        boolean z3 = c1864l.f4278l;
        if (z3) {
            c16786l.admob(c13161l, 9, Boolean.valueOf(z3));
        }
        c13161l.m3586switch(c1864l.yandex());
    }
}
