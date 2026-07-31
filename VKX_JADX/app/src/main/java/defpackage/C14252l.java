package defpackage;

/* JADX INFO: renamed from: lؘٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14252l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C12985l c12985l = (C12985l) obj;
        c1080l.m788class(c12985l.yandex());
        AbstractC7532l.firebase.subs(c1080l, 4, c12985l.f25450l);
        String str = c12985l.f25453l;
        C16786l c16786l = AbstractC7532l.startapp;
        c16786l.subs(c1080l, 3, str);
        c16786l.subs(c1080l, 2, c12985l.f25451l);
        EnumC13392l enumC13392l = c12985l.f25452l;
        if (enumC13392l != EnumC13392l.SUCCESS) {
            EnumC13392l.f26295l.subs(c1080l, 1, enumC13392l);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        Object objCrashlytics = EnumC13392l.SUCCESS;
        long jAmazon = c7084l.amazon();
        Object objCrashlytics2 = null;
        String strSmaato = null;
        String strSmaato2 = null;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C12985l((EnumC13392l) objCrashlytics, strSmaato, strSmaato2, (Long) objCrashlytics2, c7084l.purchase(jAmazon));
            }
            if (iMopub != 1) {
                C16786l c16786l = AbstractC7532l.startapp;
                if (iMopub == 2) {
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                } else if (iMopub == 3) {
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                } else if (iMopub != 4) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    objCrashlytics2 = AbstractC7532l.firebase.crashlytics(c7084l);
                }
            } else {
                try {
                    objCrashlytics = EnumC13392l.f26295l.crashlytics(c7084l);
                } catch (C12016l e) {
                    c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                }
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C12985l c12985l = (C12985l) obj;
        int iPurchase = c12985l.yandex().purchase();
        EnumC13392l enumC13392l = c12985l.f25452l;
        if (enumC13392l != EnumC13392l.SUCCESS) {
            iPurchase += EnumC13392l.f26295l.firebase(1, enumC13392l);
        }
        String str = c12985l.f25451l;
        C16786l c16786l = AbstractC7532l.startapp;
        return AbstractC7532l.firebase.firebase(4, c12985l.f25450l) + c16786l.firebase(3, c12985l.f25453l) + c16786l.firebase(2, str) + iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C12985l c12985l = (C12985l) obj;
        EnumC13392l enumC13392l = c12985l.f25452l;
        if (enumC13392l != EnumC13392l.SUCCESS) {
            EnumC13392l.f26295l.admob(c13161l, 1, enumC13392l);
        }
        String str = c12985l.f25451l;
        C16786l c16786l = AbstractC7532l.startapp;
        c16786l.admob(c13161l, 2, str);
        c16786l.admob(c13161l, 3, c12985l.f25453l);
        AbstractC7532l.firebase.admob(c13161l, 4, c12985l.f25450l);
        c13161l.m3586switch(c12985l.yandex());
    }
}
