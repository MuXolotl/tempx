package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٓؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13895l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C10542l c10542l = (C10542l) obj;
        c1080l.m788class(c10542l.yandex());
        AbstractC7532l.startapp.yandex().subs(c1080l, 3, c10542l.f21453l);
        C13654l c13654l = c10542l.f21451l;
        if (c13654l != null) {
            C13654l.f26680l.subs(c1080l, 2, c13654l);
        }
        int i = c10542l.f21452l;
        if (i != 0) {
            AbstractC7532l.mopub.subs(c1080l, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        int iIntValue = 0;
        Object objCrashlytics = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C10542l(iIntValue, (C13654l) objCrashlytics, arrayList, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                iIntValue = ((Number) AbstractC7532l.mopub.crashlytics(c7084l)).intValue();
            } else if (iMopub == 2) {
                objCrashlytics = C13654l.f26680l.crashlytics(c7084l);
            } else if (iMopub != 3) {
                c7084l.remoteconfig(iMopub);
            } else {
                AbstractC7532l.startapp.getClass();
                arrayList.add(c7084l.smaato());
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C10542l c10542l = (C10542l) obj;
        int iPurchase = c10542l.yandex().purchase();
        int i = c10542l.f21452l;
        if (i != 0) {
            iPurchase = AbstractC9029l.isPro(i, AbstractC7532l.mopub, 1, iPurchase);
        }
        C13654l c13654l = c10542l.f21451l;
        if (c13654l != null) {
            iPurchase += C13654l.f26680l.firebase(2, c13654l);
        }
        return AbstractC7532l.startapp.yandex().firebase(3, c10542l.f21453l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C10542l c10542l = (C10542l) obj;
        int i = c10542l.f21452l;
        if (i != 0) {
            AbstractC7532l.mopub.admob(c13161l, 1, Integer.valueOf(i));
        }
        C13654l c13654l = c10542l.f21451l;
        if (c13654l != null) {
            C13654l.f26680l.admob(c13161l, 2, c13654l);
        }
        AbstractC7532l.startapp.yandex().admob(c13161l, 3, c10542l.f21453l);
        c13161l.m3586switch(c10542l.yandex());
    }
}
