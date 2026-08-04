package defpackage;

/* JADX INFO: renamed from: lٍُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9461l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15646l c15646l = (C15646l) obj;
        String str = c15646l.f30587l;
        c1080l.m788class(c15646l.yandex());
        String str2 = c15646l.f30585l;
        C16786l c16786l = AbstractC7532l.startapp;
        c16786l.subs(c1080l, 5, str2);
        AbstractC7532l.admob.subs(c1080l, 4, c15646l.f30584l);
        AbstractC7532l.firebase.subs(c1080l, 3, c15646l.f30588l);
        String str3 = c15646l.f30586l;
        if (!AbstractC8576l.yandex(str3, "")) {
            c16786l.subs(c1080l, 2, str3);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        Object objCrashlytics2 = null;
        String strSmaato3 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15646l(strSmaato, strSmaato2, (Long) objCrashlytics, (Integer) objCrashlytics2, strSmaato3, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            if (iMopub == 1) {
                c16786l.getClass();
                strSmaato = c7084l.smaato();
            } else if (iMopub == 2) {
                c16786l.getClass();
                strSmaato2 = c7084l.smaato();
            } else if (iMopub == 3) {
                objCrashlytics = AbstractC7532l.firebase.crashlytics(c7084l);
            } else if (iMopub == 4) {
                objCrashlytics2 = AbstractC7532l.admob.crashlytics(c7084l);
            } else if (iMopub != 5) {
                c7084l.remoteconfig(iMopub);
            } else {
                c16786l.getClass();
                strSmaato3 = c7084l.smaato();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15646l c15646l = (C15646l) obj;
        String str = c15646l.f30586l;
        int iPurchase = c15646l.yandex().purchase();
        String str2 = c15646l.f30587l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(2, str);
        }
        return c16786l.firebase(5, c15646l.f30585l) + AbstractC7532l.admob.firebase(4, c15646l.f30584l) + AbstractC7532l.firebase.firebase(3, c15646l.f30588l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15646l c15646l = (C15646l) obj;
        String str = c15646l.f30586l;
        String str2 = c15646l.f30587l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        AbstractC7532l.firebase.admob(c13161l, 3, c15646l.f30588l);
        AbstractC7532l.admob.admob(c13161l, 4, c15646l.f30584l);
        c16786l.admob(c13161l, 5, c15646l.f30585l);
        c13161l.m3586switch(c15646l.yandex());
    }
}
