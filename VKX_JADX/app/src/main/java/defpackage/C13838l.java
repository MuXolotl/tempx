package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٓؐؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13838l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C5542l c5542l = (C5542l) obj;
        c1080l.m788class(c5542l.yandex());
        C15507l.f30306l.yandex().subs(c1080l, 4, c5542l.f11823l);
        C18482l c18482l = c5542l.f11826l;
        if (c18482l != null) {
            C18482l.f36093l.subs(c1080l, 3, c18482l);
        }
        C15589l c15589l = c5542l.f11824l;
        if (c15589l != null) {
            C15589l.f30433l.subs(c1080l, 2, c15589l);
        }
        long j = c5542l.f11825l;
        if (j != 0) {
            AbstractC7532l.firebase.subs(c1080l, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        Object objCrashlytics = null;
        long jLongValue = 0;
        Object objCrashlytics2 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C5542l(jLongValue, (C15589l) objCrashlytics, (C18482l) objCrashlytics2, arrayList, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                jLongValue = ((Number) AbstractC7532l.firebase.crashlytics(c7084l)).longValue();
            } else if (iMopub == 2) {
                objCrashlytics = C15589l.f30433l.crashlytics(c7084l);
            } else if (iMopub == 3) {
                objCrashlytics2 = C18482l.f36093l.crashlytics(c7084l);
            } else if (iMopub != 4) {
                c7084l.remoteconfig(iMopub);
            } else {
                arrayList.add(C15507l.f30306l.crashlytics(c7084l));
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C5542l c5542l = (C5542l) obj;
        int iPurchase = c5542l.yandex().purchase();
        long j = c5542l.f11825l;
        if (j != 0) {
            iPurchase += AbstractC7532l.firebase.firebase(1, Long.valueOf(j));
        }
        C15589l c15589l = c5542l.f11824l;
        if (c15589l != null) {
            iPurchase += C15589l.f30433l.firebase(2, c15589l);
        }
        C18482l c18482l = c5542l.f11826l;
        if (c18482l != null) {
            iPurchase += C18482l.f36093l.firebase(3, c18482l);
        }
        return C15507l.f30306l.yandex().firebase(4, c5542l.f11823l) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C5542l c5542l = (C5542l) obj;
        long j = c5542l.f11825l;
        if (j != 0) {
            AbstractC7532l.firebase.admob(c13161l, 1, Long.valueOf(j));
        }
        C15589l c15589l = c5542l.f11824l;
        if (c15589l != null) {
            C15589l.f30433l.admob(c13161l, 2, c15589l);
        }
        C18482l c18482l = c5542l.f11826l;
        if (c18482l != null) {
            C18482l.f36093l.admob(c13161l, 3, c18482l);
        }
        C15507l.f30306l.yandex().admob(c13161l, 4, c5542l.f11823l);
        c13161l.m3586switch(c5542l.yandex());
    }
}
