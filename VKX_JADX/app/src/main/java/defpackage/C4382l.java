package defpackage;

/* JADX INFO: renamed from: lؖۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4382l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C2882l c2882l = (C2882l) obj;
        float f = c2882l.f6280l;
        c1080l.m788class(c2882l.yandex());
        float f2 = c2882l.f6279l;
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
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
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C2882l(fFloatValue, fFloatValue2, c7084l.purchase(jAmazon));
            }
            C16786l c16786l = AbstractC7532l.remoteconfig;
            if (iMopub == 1) {
                fFloatValue = ((Number) c16786l.crashlytics(c7084l)).floatValue();
            } else if (iMopub != 2) {
                c7084l.remoteconfig(iMopub);
            } else {
                fFloatValue2 = ((Number) c16786l.crashlytics(c7084l)).floatValue();
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C2882l c2882l = (C2882l) obj;
        float f = c2882l.f6279l;
        int iPurchase = c2882l.yandex().purchase();
        float f2 = c2882l.f6280l;
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            iPurchase += c16786l.firebase(1, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(fValueOf2) ? c16786l.firebase(2, Float.valueOf(f)) + iPurchase : iPurchase;
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C2882l c2882l = (C2882l) obj;
        float f = c2882l.f6279l;
        float f2 = c2882l.f6280l;
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(0.0f);
        boolean zEquals = fValueOf.equals(fValueOf2);
        C16786l c16786l = AbstractC7532l.remoteconfig;
        if (!zEquals) {
            c16786l.admob(c13161l, 1, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(fValueOf2)) {
            c16786l.admob(c13161l, 2, Float.valueOf(f));
        }
        c13161l.m3586switch(c2882l.yandex());
    }
}
