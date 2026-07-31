package defpackage;

/* JADX INFO: renamed from: lَ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18614l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C13386l c13386l = (C13386l) obj;
        String str = c13386l.f26282l;
        String str2 = c13386l.f26281l;
        c1080l.m788class(c13386l.yandex());
        int i = c13386l.f26285l;
        C16786l c16786l = AbstractC7532l.admob;
        if (i != 0) {
            c16786l.subs(c1080l, 8, Integer.valueOf(i));
        }
        int i2 = c13386l.f26280l;
        if (i2 != 0) {
            c16786l.subs(c1080l, 7, Integer.valueOf(i2));
        }
        int i3 = c13386l.f26283l;
        if (i3 != 0) {
            c16786l.subs(c1080l, 6, Integer.valueOf(i3));
        }
        int i4 = c13386l.f26279l;
        if (i4 != 0) {
            c16786l.subs(c1080l, 5, Integer.valueOf(i4));
        }
        int i5 = c13386l.f26278l;
        if (i5 != 0) {
            c16786l.subs(c1080l, 4, Integer.valueOf(i5));
        }
        int i6 = c13386l.f26284l;
        if (i6 != 0) {
            c16786l.subs(c1080l, 3, Integer.valueOf(i6));
        }
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l2 = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l2.subs(c1080l, 2, str2);
        }
        if (AbstractC8576l.yandex(str, "")) {
            return;
        }
        c16786l2.subs(c1080l, 1, str);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        String strSmaato = "";
        String strSmaato2 = strSmaato;
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        int iIntValue6 = 0;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C13386l(strSmaato, strSmaato2, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.startapp;
            C16786l c16786l2 = AbstractC7532l.admob;
            switch (iMopub) {
                case 1:
                    c16786l.getClass();
                    strSmaato = c7084l.smaato();
                    break;
                case 2:
                    c16786l.getClass();
                    strSmaato2 = c7084l.smaato();
                    break;
                case 3:
                    iIntValue = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                case 4:
                    iIntValue2 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                case 5:
                    iIntValue3 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                case 6:
                    iIntValue4 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                case 7:
                    iIntValue5 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                case 8:
                    iIntValue6 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C13386l c13386l = (C13386l) obj;
        String str = c13386l.f26281l;
        int iPurchase = c13386l.yandex().purchase();
        String str2 = c13386l.f26282l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            iPurchase += c16786l.firebase(1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            iPurchase += c16786l.firebase(2, str);
        }
        int i = c13386l.f26284l;
        C16786l c16786l2 = AbstractC7532l.admob;
        if (i != 0) {
            iPurchase += c16786l2.firebase(3, Integer.valueOf(i));
        }
        int i2 = c13386l.f26278l;
        if (i2 != 0) {
            iPurchase += c16786l2.firebase(4, Integer.valueOf(i2));
        }
        int i3 = c13386l.f26279l;
        if (i3 != 0) {
            iPurchase += c16786l2.firebase(5, Integer.valueOf(i3));
        }
        int i4 = c13386l.f26283l;
        if (i4 != 0) {
            iPurchase += c16786l2.firebase(6, Integer.valueOf(i4));
        }
        int i5 = c13386l.f26280l;
        if (i5 != 0) {
            iPurchase += c16786l2.firebase(7, Integer.valueOf(i5));
        }
        int i6 = c13386l.f26285l;
        return i6 != 0 ? c16786l2.firebase(8, Integer.valueOf(i6)) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C13386l c13386l = (C13386l) obj;
        String str = c13386l.f26281l;
        String str2 = c13386l.f26282l;
        boolean zYandex = AbstractC8576l.yandex(str2, "");
        C16786l c16786l = AbstractC7532l.startapp;
        if (!zYandex) {
            c16786l.admob(c13161l, 1, str2);
        }
        if (!AbstractC8576l.yandex(str, "")) {
            c16786l.admob(c13161l, 2, str);
        }
        int i = c13386l.f26284l;
        C16786l c16786l2 = AbstractC7532l.admob;
        if (i != 0) {
            c16786l2.admob(c13161l, 3, Integer.valueOf(i));
        }
        int i2 = c13386l.f26278l;
        if (i2 != 0) {
            c16786l2.admob(c13161l, 4, Integer.valueOf(i2));
        }
        int i3 = c13386l.f26279l;
        if (i3 != 0) {
            c16786l2.admob(c13161l, 5, Integer.valueOf(i3));
        }
        int i4 = c13386l.f26283l;
        if (i4 != 0) {
            c16786l2.admob(c13161l, 6, Integer.valueOf(i4));
        }
        int i5 = c13386l.f26280l;
        if (i5 != 0) {
            c16786l2.admob(c13161l, 7, Integer.valueOf(i5));
        }
        int i6 = c13386l.f26285l;
        if (i6 != 0) {
            c16786l2.admob(c13161l, 8, Integer.valueOf(i6));
        }
        c13161l.m3586switch(c13386l.yandex());
    }
}
