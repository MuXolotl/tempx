package defpackage;

/* JADX INFO: renamed from: lؚّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7397l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C15968l c15968l = (C15968l) obj;
        String str = c15968l.f31337l;
        String str2 = c15968l.f31338l;
        c1080l.m788class(c15968l.yandex());
        String str3 = c15968l.f31344l;
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.subs(c1080l, 8, str3);
        }
        int i = c15968l.f31339l;
        if (i != 0) {
            AbstractC7532l.admob.subs(c1080l, 7, Integer.valueOf(i));
        }
        Long l = c15968l.f31342l;
        C16786l c16786l2 = AbstractC7532l.firebase;
        c16786l2.subs(c1080l, 6, l);
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l.subs(c1080l, 5, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.subs(c1080l, 4, str);
        }
        long j = c15968l.f31343l;
        if (j != 0) {
            c16786l2.subs(c1080l, 3, Long.valueOf(j));
        }
        EnumC11976l enumC11976l = c15968l.f31340l;
        if (enumC11976l != EnumC11976l.IN_PROGRESS) {
            EnumC11976l.f23864l.subs(c1080l, 2, enumC11976l);
        }
        long j2 = c15968l.f31341l;
        if (j2 != 0) {
            c16786l2.subs(c1080l, 1, Long.valueOf(j2));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        EnumC11976l enumC11976l = EnumC11976l.IN_PROGRESS;
        long jAmazon = c7084l.amazon();
        long jLongValue = 0;
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        String strSmaato3 = strSmaato2;
        int iIntValue = 0;
        Object objCrashlytics = enumC11976l;
        Object objCrashlytics2 = null;
        long jLongValue2 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C15968l(jLongValue2, (EnumC11976l) objCrashlytics, jLongValue, strSmaato, strSmaato2, (Long) objCrashlytics2, iIntValue, strSmaato3, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.firebase;
            C16786l c16786l2 = AbstractC7532l.startapp;
            switch (iMopub) {
                case 1:
                    jLongValue2 = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    objCrashlytics = objCrashlytics;
                    objCrashlytics2 = objCrashlytics2;
                    continue;
                case 2:
                    try {
                        objCrashlytics = EnumC11976l.f23864l.crashlytics(c7084l);
                        continue;
                    } catch (C12016l e) {
                        c7084l.yandex(iMopub, 1, Long.valueOf(e.f23945l));
                        objCrashlytics2 = objCrashlytics2;
                        objCrashlytics = objCrashlytics;
                    }
                    break;
                case 3:
                    jLongValue = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    continue;
                case 4:
                    c16786l2.getClass();
                    strSmaato = c7084l.smaato();
                    continue;
                case 5:
                    c16786l2.getClass();
                    strSmaato2 = c7084l.smaato();
                    continue;
                case 6:
                    objCrashlytics2 = c16786l.crashlytics(c7084l);
                    continue;
                case 7:
                    iIntValue = ((Number) AbstractC7532l.admob.crashlytics(c7084l)).intValue();
                    continue;
                case 8:
                    c16786l2.getClass();
                    strSmaato3 = c7084l.smaato();
                    continue;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
            objCrashlytics2 = objCrashlytics2;
            objCrashlytics = objCrashlytics;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C15968l c15968l = (C15968l) obj;
        String str = c15968l.f31344l;
        String str2 = c15968l.f31338l;
        String str3 = c15968l.f31337l;
        int iPurchase = c15968l.yandex().purchase();
        long j = c15968l.f31341l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            iPurchase += c16786l.firebase(1, Long.valueOf(j));
        }
        EnumC11976l enumC11976l = c15968l.f31340l;
        if (enumC11976l != EnumC11976l.IN_PROGRESS) {
            iPurchase += EnumC11976l.f23864l.firebase(2, enumC11976l);
        }
        long j2 = c15968l.f31343l;
        if (j2 != 0) {
            iPurchase += c16786l.firebase(3, Long.valueOf(j2));
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l2.firebase(4, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            iPurchase += c16786l2.firebase(5, str2);
        }
        int iFirebase = c16786l.firebase(6, c15968l.f31342l) + iPurchase;
        int i = c15968l.f31339l;
        if (i != 0) {
            iFirebase += AbstractC7532l.admob.firebase(7, Integer.valueOf(i));
        }
        return !AbstractC8576l.yandex(str, "") ? c16786l2.firebase(8, str) + iFirebase : iFirebase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C15968l c15968l = (C15968l) obj;
        String str = c15968l.f31344l;
        String str2 = c15968l.f31338l;
        String str3 = c15968l.f31337l;
        long j = c15968l.f31341l;
        C16786l c16786l = AbstractC7532l.firebase;
        if (j != 0) {
            c16786l.admob(c13161l, 1, Long.valueOf(j));
        }
        EnumC11976l enumC11976l = c15968l.f31340l;
        if (enumC11976l != EnumC11976l.IN_PROGRESS) {
            EnumC11976l.f23864l.admob(c13161l, 2, enumC11976l);
        }
        long j2 = c15968l.f31343l;
        if (j2 != 0) {
            c16786l.admob(c13161l, 3, Long.valueOf(j2));
        }
        boolean zYandex = AbstractC8576l.yandex(str3, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.admob(c13161l, 4, str3);
        }
        if (!AbstractC8576l.yandex(str2, "")) {
            c16786l2.admob(c13161l, 5, str2);
        }
        c16786l.admob(c13161l, 6, c15968l.f31342l);
        int i = c15968l.f31339l;
        if (i != 0) {
            AbstractC7532l.admob.admob(c13161l, 7, Integer.valueOf(i));
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l2.admob(c13161l, 8, str);
        }
        c13161l.m3586switch(c15968l.yandex());
    }
}
