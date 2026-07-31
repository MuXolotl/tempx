package defpackage;

/* JADX INFO: renamed from: lٓؔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13915l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C8188l c8188l = (C8188l) obj;
        String str = c8188l.f17087l;
        c1080l.m788class(c8188l.yandex());
        Long l = c8188l.f17091l;
        C16786l c16786l = AbstractC7532l.firebase;
        c16786l.subs(c1080l, 8, l);
        boolean z = c8188l.f17086l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 7, Boolean.valueOf(z));
        }
        EnumC7878l enumC7878l = c8188l.f17089l;
        if (enumC7878l != EnumC7878l.GENERAL) {
            EnumC7878l.f16428l.subs(c1080l, 6, enumC7878l);
        }
        long j = c8188l.f17085l;
        if (j != 0) {
            c16786l.subs(c1080l, 5, Long.valueOf(j));
        }
        C18508l.f36132l.subs(c1080l, 4, c8188l.f17084l);
        C4426l c4426l = c8188l.f17090l;
        if (c4426l != null) {
            C4426l.f9013l.subs(c1080l, 3, c4426l);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.subs(c1080l, 2, str);
        }
        long j2 = c8188l.f17088l;
        if (j2 != 0) {
            c16786l.subs(c1080l, 1, Long.valueOf(j2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        EnumC7878l enumC7878l = EnumC7878l.GENERAL;
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        Object objCrashlytics = null;
        Object objCrashlytics2 = null;
        boolean zBooleanValue = false;
        Object objCrashlytics3 = enumC7878l;
        String strSmaato = "";
        Object objCrashlytics4 = null;
        long jLongValue2 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C8188l(jLongValue2, strSmaato, (C4426l) objCrashlytics4, (C18508l) objCrashlytics, jLongValue, (EnumC7878l) objCrashlytics3, zBooleanValue, (Long) objCrashlytics2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.firebase;
            switch (iMopub) {
                case 1:
                    jLongValue2 = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    objCrashlytics3 = objCrashlytics3;
                    objCrashlytics4 = objCrashlytics4;
                    break;
                case 2:
                    AbstractC7532l.startapp.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 3:
                    objCrashlytics4 = C4426l.f9013l.crashlytics(c7084l);
                    break;
                case 4:
                    objCrashlytics = C18508l.f36132l.crashlytics(c7084l);
                    break;
                case 5:
                    jLongValue = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    objCrashlytics3 = objCrashlytics3;
                    objCrashlytics4 = objCrashlytics4;
                    break;
                case 6:
                    try {
                        objCrashlytics3 = EnumC7878l.f16428l.crashlytics(c7084l);
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        objCrashlytics4 = objCrashlytics4;
                        objCrashlytics3 = objCrashlytics3;
                    }
                    break;
                case 7:
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    break;
                case 8:
                    objCrashlytics2 = c16786l.crashlytics(c7084l);
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    objCrashlytics4 = objCrashlytics4;
                    objCrashlytics3 = objCrashlytics3;
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C8188l c8188l = (C8188l) obj;
        String str = c8188l.f17087l;
        int iPurchase = c8188l.yandex().purchase();
        long j = c8188l.f17088l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            iPurchase += c16786l.firebase(1, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += AbstractC7532l.startapp.firebase(2, str);
        }
        C4426l c4426l = c8188l.f17090l;
        if (c4426l != null) {
            iPurchase += C4426l.f9013l.firebase(3, c4426l);
        }
        int iFirebase = C18508l.f36132l.firebase(4, c8188l.f17084l) + iPurchase;
        long j2 = c8188l.f17085l;
        if (j2 != 0) {
            iFirebase += c16786l.firebase(5, Long.valueOf(j2));
        }
        EnumC7878l enumC7878l = c8188l.f17089l;
        if (enumC7878l != EnumC7878l.GENERAL) {
            iFirebase += EnumC7878l.f16428l.firebase(6, enumC7878l);
        }
        boolean z = c8188l.f17086l;
        if (z) {
            iFirebase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 7, iFirebase);
        }
        return c16786l.firebase(8, c8188l.f17091l) + iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C8188l c8188l = (C8188l) obj;
        String str = c8188l.f17087l;
        long j = c8188l.f17088l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            c16786l.admob(c13161l, 1, Long.valueOf(j));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            AbstractC7532l.startapp.admob(c13161l, 2, str);
        }
        C4426l c4426l = c8188l.f17090l;
        if (c4426l != null) {
            C4426l.f9013l.admob(c13161l, 3, c4426l);
        }
        C18508l.f36132l.admob(c13161l, 4, c8188l.f17084l);
        long j2 = c8188l.f17085l;
        if (j2 != 0) {
            c16786l.admob(c13161l, 5, Long.valueOf(j2));
        }
        EnumC7878l enumC7878l = c8188l.f17089l;
        if (enumC7878l != EnumC7878l.GENERAL) {
            EnumC7878l.f16428l.admob(c13161l, 6, enumC7878l);
        }
        boolean z = c8188l.f17086l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 7, Boolean.valueOf(z));
        }
        c16786l.admob(c13161l, 8, c8188l.f17091l);
        c13161l.m3586switch(c8188l.yandex());
    }
}
