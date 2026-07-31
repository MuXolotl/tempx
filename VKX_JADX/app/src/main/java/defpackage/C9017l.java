package defpackage;

/* JADX INFO: renamed from: lٌِۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9017l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C7315l c7315l = (C7315l) obj;
        float f = c7315l.f15168l;
        c1080l.m788class(c7315l.yandex());
        float f2 = c7315l.f15169l;
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.subs(c1080l, 5, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf2)) {
            c16786l.subs(c1080l, 4, Float.valueOf(f));
        }
        boolean z = c7315l.f15172l;
        C16786l c16786l2 = AbstractC7532l.billing;
        if (z) {
            c16786l2.subs(c1080l, 3, Boolean.valueOf(z));
        }
        boolean z2 = c7315l.f15170l;
        if (z2) {
            c16786l2.subs(c1080l, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c7315l.f15171l;
        if (z3) {
            c16786l2.subs(c1080l, 1, Boolean.valueOf(z3));
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        long jAmazon = c7084l.amazon();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C7315l(zBooleanValue, zBooleanValue2, zBooleanValue3, fFloatValue, fFloatValue2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.billing;
            if (iMopub == 1) {
                zBooleanValue = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
            } else if (iMopub == 2) {
                zBooleanValue2 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
            } else if (iMopub != 3) {
                C16786l c16786l2 = AbstractC7532l.remoteconfig;
                if (iMopub == 4) {
                    fFloatValue = ((Number) c16786l2.crashlytics(c7084l)).floatValue();
                } else if (iMopub != 5) {
                    c7084l.remoteconfig(iMopub);
                } else {
                    fFloatValue2 = ((Number) c16786l2.crashlytics(c7084l)).floatValue();
                }
            } else {
                zBooleanValue3 = ((Boolean) c16786l.crashlytics(c7084l)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C7315l c7315l = (C7315l) obj;
        Float fValueOf = Float.valueOf(0.0f);
        float f = c7315l.f15169l;
        float f2 = c7315l.f15168l;
        int iPurchase = c7315l.yandex().purchase();
        boolean z = c7315l.f15171l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            iPurchase = AbstractC9029l.firebase(z, c16786l, 1, iPurchase);
        }
        boolean z2 = c7315l.f15170l;
        if (z2) {
            iPurchase = AbstractC9029l.firebase(z2, c16786l, 2, iPurchase);
        }
        boolean z3 = c7315l.f15172l;
        if (z3) {
            iPurchase = AbstractC9029l.firebase(z3, c16786l, 3, iPurchase);
        }
        boolean zEquals = Float.valueOf(f2).equals(fValueOf);
        C16786l c16786l2 = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            iPurchase += c16786l2.firebase(4, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(fValueOf) ? c16786l2.firebase(5, Float.valueOf(f)) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C7315l c7315l = (C7315l) obj;
        Float fValueOf = Float.valueOf(0.0f);
        float f = c7315l.f15169l;
        float f2 = c7315l.f15168l;
        boolean z = c7315l.f15171l;
        C16786l c16786l = AbstractC7532l.billing;
        if (z) {
            c16786l.admob(c13161l, 1, Boolean.valueOf(z));
        }
        boolean z2 = c7315l.f15170l;
        if (z2) {
            c16786l.admob(c13161l, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c7315l.f15172l;
        if (z3) {
            c16786l.admob(c13161l, 3, Boolean.valueOf(z3));
        }
        boolean zEquals = Float.valueOf(f2).equals(fValueOf);
        C16786l c16786l2 = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l2.admob(c13161l, 4, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf)) {
            c16786l2.admob(c13161l, 5, Float.valueOf(f));
        }
        c13161l.m3586switch(c7315l.yandex());
    }
}
