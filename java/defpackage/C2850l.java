package defpackage;

/* JADX INFO: renamed from: lؔۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2850l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C7117l c7117l = (C7117l) obj;
        float f = c7117l.f14907l;
        float f2 = c7117l.f14906l;
        float f3 = c7117l.f14909l;
        float f4 = c7117l.f14903l;
        float f5 = c7117l.f14904l;
        float f6 = c7117l.f14908l;
        float f7 = c7117l.f14905l;
        c1080l.m788class(c7117l.yandex());
        float f8 = c7117l.f14910l;
        Float fValueOf = Float.valueOf(f8);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.subs(c1080l, 8, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(fValueOf2)) {
            c16786l.subs(c1080l, 7, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(fValueOf2)) {
            c16786l.subs(c1080l, 6, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(fValueOf2)) {
            c16786l.subs(c1080l, 5, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf2)) {
            c16786l.subs(c1080l, 4, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf2)) {
            c16786l.subs(c1080l, 3, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf2)) {
            c16786l.subs(c1080l, 2, Float.valueOf(f2));
        }
        if (Float.valueOf(f).equals(fValueOf2)) {
            return;
        }
        c16786l.subs(c1080l, 1, Float.valueOf(f));
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        float fFloatValue6 = 0.0f;
        float fFloatValue7 = 0.0f;
        float fFloatValue8 = 0.0f;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C7117l(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.remoteconfig;
            switch (iMopub) {
                case 1:
                    fFloatValue = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 2:
                    fFloatValue2 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 3:
                    fFloatValue3 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 4:
                    fFloatValue4 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 5:
                    fFloatValue5 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 6:
                    fFloatValue6 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 7:
                    fFloatValue7 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 8:
                    fFloatValue8 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C7117l c7117l = (C7117l) obj;
        float f = c7117l.f14910l;
        float f2 = c7117l.f14905l;
        float f3 = c7117l.f14908l;
        float f4 = c7117l.f14904l;
        float f5 = c7117l.f14903l;
        float f6 = c7117l.f14909l;
        float f7 = c7117l.f14906l;
        int iPurchase = c7117l.yandex().purchase();
        float f8 = c7117l.f14907l;
        Float fValueOf = Float.valueOf(f8);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            iPurchase += c16786l.firebase(1, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(2, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(3, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(4, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(6, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf2)) {
            iPurchase += c16786l.firebase(7, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(fValueOf2) ? c16786l.firebase(8, Float.valueOf(f)) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C7117l c7117l = (C7117l) obj;
        float f = c7117l.f14910l;
        float f2 = c7117l.f14905l;
        float f3 = c7117l.f14908l;
        float f4 = c7117l.f14904l;
        float f5 = c7117l.f14903l;
        float f6 = c7117l.f14909l;
        float f7 = c7117l.f14906l;
        float f8 = c7117l.f14907l;
        Float fValueOf = Float.valueOf(f8);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.admob(c13161l, 1, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(fValueOf2)) {
            c16786l.admob(c13161l, 2, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(fValueOf2)) {
            c16786l.admob(c13161l, 3, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(fValueOf2)) {
            c16786l.admob(c13161l, 4, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf2)) {
            c16786l.admob(c13161l, 5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf2)) {
            c16786l.admob(c13161l, 6, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf2)) {
            c16786l.admob(c13161l, 7, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf2)) {
            c16786l.admob(c13161l, 8, Float.valueOf(f));
        }
        c13161l.m3586switch(c7117l.yandex());
    }
}
