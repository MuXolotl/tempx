package defpackage;

/* JADX INFO: renamed from: lؙۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6888l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C1887l c1887l = (C1887l) obj;
        float f = c1887l.f4315l;
        float f2 = c1887l.f4318l;
        float f3 = c1887l.f4313l;
        float f4 = c1887l.f4314l;
        c1080l.m788class(c1887l.yandex());
        float f5 = c1887l.f4317l;
        Float fValueOf = Float.valueOf(f5);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.subs(c1080l, 6, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf2)) {
            c16786l.subs(c1080l, 5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf2)) {
            c16786l.subs(c1080l, 4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf2)) {
            c16786l.subs(c1080l, 3, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf2)) {
            c16786l.subs(c1080l, 2, Float.valueOf(f));
        }
        boolean z = c1887l.f4316l;
        if (z) {
            AbstractC7532l.billing.subs(c1080l, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C1887l(zBooleanValue, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.remoteconfig;
            switch (iMopub) {
                case 1:
                    zBooleanValue = ((Boolean) AbstractC7532l.billing.crashlytics(c7084l)).booleanValue();
                    break;
                case 2:
                    fFloatValue = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 3:
                    fFloatValue2 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 4:
                    fFloatValue3 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 5:
                    fFloatValue4 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                case 6:
                    fFloatValue5 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
                    break;
                default:
                    c7084l.remoteconfig(iMopub);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C1887l c1887l = (C1887l) obj;
        Float fValueOf = Float.valueOf(0.0f);
        float f = c1887l.f4317l;
        float f2 = c1887l.f4314l;
        float f3 = c1887l.f4313l;
        float f4 = c1887l.f4318l;
        float f5 = c1887l.f4315l;
        int iPurchase = c1887l.yandex().purchase();
        boolean z = c1887l.f4316l;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, AbstractC7532l.billing, 1, iPurchase);
        }
        boolean zEquals = Float.valueOf(f5).equals(fValueOf);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            iPurchase += c16786l.firebase(2, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf)) {
            iPurchase += c16786l.firebase(3, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf)) {
            iPurchase += c16786l.firebase(4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf)) {
            iPurchase += c16786l.firebase(5, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(fValueOf) ? c16786l.firebase(6, Float.valueOf(f)) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C1887l c1887l = (C1887l) obj;
        Float fValueOf = Float.valueOf(0.0f);
        float f = c1887l.f4317l;
        float f2 = c1887l.f4314l;
        float f3 = c1887l.f4313l;
        float f4 = c1887l.f4318l;
        float f5 = c1887l.f4315l;
        boolean z = c1887l.f4316l;
        if (z) {
            AbstractC7532l.billing.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean zEquals = Float.valueOf(f5).equals(fValueOf);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.admob(c13161l, 2, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(fValueOf)) {
            c16786l.admob(c13161l, 3, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(fValueOf)) {
            c16786l.admob(c13161l, 4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(fValueOf)) {
            c16786l.admob(c13161l, 5, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf)) {
            c16786l.admob(c13161l, 6, Float.valueOf(f));
        }
        c13161l.m3586switch(c1887l.yandex());
    }
}
