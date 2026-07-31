package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٖٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2650l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C17584l c17584l = (C17584l) obj;
        String str = c17584l.f34225l;
        String str2 = c17584l.f34230l;
        String str3 = c17584l.f34226l;
        c1080l.m788class(c17584l.yandex());
        String str4 = c17584l.f34232l;
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 9, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.subs(c1080l, 8, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.subs(c1080l, 7, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 6, str);
        }
        boolean z = c17584l.f34224l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.subs(c1080l, 5, Boolean.valueOf(z));
        }
        boolean z2 = c17584l.f34231l;
        if (z2) {
            c16786l2.subs(c1080l, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c17584l.f34227l;
        if (z3) {
            c16786l2.subs(c1080l, 3, Boolean.valueOf(z3));
        }
        C0247l.f1238l.yandex().subs(c1080l, 2, c17584l.f34229l);
        C1864l c1864l = c17584l.f34228l;
        if (c1864l != null) {
            C1864l.f4276l.subs(c1080l, 1, c1864l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        String strSmaato4 = strSmaato3;
        boolean zBooleanValue3 = false;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C17584l((C1864l) objCrashlytics, arrayList, zBooleanValue, zBooleanValue3, zBooleanValue2, strSmaato, strSmaato2, strSmaato3, strSmaato4, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            C16786l c16786l2 = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    objCrashlytics = C1864l.f4276l.crashlytics(c7084l);
                    break;
                case 2:
                    arrayList.add(C0247l.f1238l.crashlytics(c7084l));
                    break;
                case 3:
                    zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 4:
                    zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 5:
                    zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
                    break;
                case 6:
                    c16786l2.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 7:
                    c16786l2.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 8:
                    c16786l2.getClass();
                    strSmaato3 = c7084l.smaato();
                    break;
                case 9:
                    c16786l2.getClass();
                    strSmaato4 = c7084l.smaato();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C17584l c17584l = (C17584l) obj;
        String str = c17584l.f34232l;
        String str2 = c17584l.f34226l;
        String str3 = c17584l.f34230l;
        String str4 = c17584l.f34225l;
        int iPurchase = c17584l.yandex().purchase();
        C1864l c1864l = c17584l.f34228l;
        if (c1864l != null) {
            iPurchase += C1864l.f4276l.firebase(1, c1864l);
        }
        int iFirebase = C0247l.f1238l.yandex().firebase(2, c17584l.f34229l) + iPurchase;
        boolean z = c17584l.f34227l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iFirebase = AbstractC9029l.firebase(z, c16786l, 3, iFirebase);
        }
        boolean z2 = c17584l.f34231l;
        if (z2) {
            iFirebase = AbstractC9029l.firebase(z2, c16786l, 4, iFirebase);
        }
        boolean z3 = c17584l.f34224l;
        if (z3) {
            iFirebase = AbstractC9029l.firebase(z3, c16786l, 5, iFirebase);
        }
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            iFirebase += c16786l2.firebase(6, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            iFirebase += c16786l2.firebase(7, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iFirebase += c16786l2.firebase(8, str2);
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l2.firebase(9, str) + iFirebase : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C17584l c17584l = (C17584l) obj;
        String str = c17584l.f34232l;
        String str2 = c17584l.f34226l;
        String str3 = c17584l.f34230l;
        String str4 = c17584l.f34225l;
        C1864l c1864l = c17584l.f34228l;
        if (c1864l != null) {
            C1864l.f4276l.admob(c13161l, 1, c1864l);
        }
        C0247l.f1238l.yandex().admob(c13161l, 2, c17584l.f34229l);
        boolean z = c17584l.f34227l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 3, Boolean.valueOf(z));
        }
        boolean z2 = c17584l.f34231l;
        if (z2) {
            c16786l.admob(c13161l, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c17584l.f34224l;
        if (z3) {
            c16786l.admob(c13161l, 5, Boolean.valueOf(z3));
        }
        boolean zYandex = AbstractC8576l.yandex(str4, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.admob(c13161l, 6, str4);
        }
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l2.admob(c13161l, 7, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l2.admob(c13161l, 8, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l2.admob(c13161l, 9, str);
        }
        c13161l.m3586switch(c17584l.yandex());
    }
}
