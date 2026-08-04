package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؖٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4106l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C3554l c3554l = (C3554l) obj;
        String str = c3554l.f7471l;
        String str2 = c3554l.f7470l;
        c1080l.m788class(c3554l.yandex());
        boolean z = c3554l.f7472l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 4, Boolean.valueOf(z));
        }
        C2882l.f6278l.yandex().subs(c1080l, 3, c3554l.f7469l);
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 2, str2);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        boolean zBooleanValue = false;
        String strSmaato2 = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C3554l(strSmaato, strSmaato2, arrayList, zBooleanValue, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            if (iMopub == 1) {
                c16786l.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub == 2) {
                c16786l.getClass();
                strSmaato2 = c7084l.smaato();
            } else if (iMopub == 3) {
                arrayList.add(C2882l.f6278l.crashlytics(c7084l));
            } else if (iMopub != 4) {
                c7084l.remoteconfig(iMopub);
            } else {
                zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C3554l c3554l = (C3554l) obj;
        String str = c3554l.f7470l;
        int iPurchase = c3554l.yandex().purchase();
        String str2 = c3554l.f7471l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(2, str);
        }
        int iFirebase = C2882l.f6278l.yandex().firebase(3, c3554l.f7469l) + iPurchase;
        boolean z = c3554l.f7472l;
        return z ? AbstractC9029l.firebase(z, AbstractC7532l.billing, 4, iFirebase) : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C3554l c3554l = (C3554l) obj;
        String str = c3554l.f7470l;
        String str2 = c3554l.f7471l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        C2882l.f6278l.yandex().admob(c13161l, 3, c3554l.f7469l);
        boolean z = c3554l.f7472l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 4, Boolean.valueOf(z));
        }
        c13161l.m3586switch(c3554l.yandex());
    }
}
