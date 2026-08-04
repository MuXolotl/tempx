package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14006l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C17937l c17937l = (C17937l) obj;
        String str = c17937l.f34912l;
        String str2 = c17937l.f34911l;
        c1080l.m788class(c17937l.yandex());
        C17937l c17937l2 = c17937l.f34913l;
        if (c17937l2 != null) {
            C17937l.f34908l.subs(c1080l, 6, c17937l2);
        }
        C17937l.f34908l.yandex().subs(c1080l, 5, c17937l.f34910l);
        C10434l.f21246l.yandex().subs(c1080l, 4, c17937l.f34909l);
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
        ArrayList arrayList2 = new ArrayList();
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        Object objCrashlytics = null;
        String strSmaato2 = "";
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C17937l(strSmaato, strSmaato2, arrayList, arrayList2, (C17937l) objCrashlytics, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            if (iMopub == 1) {
                c16786l.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub == 2) {
                c16786l.getClass();
                strSmaato2 = c7084l.smaato();
            } else if (iMopub == 4) {
                arrayList.add(C10434l.f21246l.crashlytics(c7084l));
            } else if (iMopub == 5) {
                arrayList2.add(C17937l.f34908l.crashlytics(c7084l));
            } else if (iMopub != 6) {
                c7084l.remoteconfig(iMopub);
            } else {
                objCrashlytics = C17937l.f34908l.crashlytics(c7084l);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C17937l c17937l = (C17937l) obj;
        String str = c17937l.f34911l;
        int iPurchase = c17937l.yandex().purchase();
        String str2 = c17937l.f34912l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(2, str);
        }
        int iFirebase = C10434l.f21246l.yandex().firebase(4, c17937l.f34909l) + iPurchase;
        C14006l c14006l = C17937l.f34908l;
        int iFirebase2 = c14006l.yandex().firebase(5, c17937l.f34910l) + iFirebase;
        C17937l c17937l2 = c17937l.f34913l;
        return c17937l2 != null ? c14006l.firebase(6, c17937l2) + iFirebase2 : iFirebase2;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C17937l c17937l = (C17937l) obj;
        String str = c17937l.f34911l;
        String str2 = c17937l.f34912l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        C10434l.f21246l.yandex().admob(c13161l, 4, c17937l.f34909l);
        C14006l c14006l = C17937l.f34908l;
        c14006l.yandex().admob(c13161l, 5, c17937l.f34910l);
        C17937l c17937l2 = c17937l.f34913l;
        if (c17937l2 != null) {
            c14006l.admob(c13161l, 6, c17937l2);
        }
        c13161l.m3586switch(c17937l.yandex());
    }
}
