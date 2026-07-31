package defpackage;

/* JADX INFO: renamed from: lًٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8137l {
    public final InterfaceC0844l loadAd;
    public final InterfaceC0844l yandex;

    public C8137l(InterfaceC0844l interfaceC0844l, InterfaceC0844l interfaceC0844l2) {
        this.yandex = interfaceC0844l;
        this.loadAd = interfaceC0844l2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.loadAd(r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(defpackage.AbstractC0283l r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C0748l
            if (r0 == 0) goto L13
            r0 = r7
            lؑۨۡ r0 = (defpackage.C0748l) r0
            int r1 = r0.f2252l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2252l = r1
            goto L18
        L13:
            lؑۨۡ r0 = new lؑۨۡ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f2253l
            int r1 = r0.f2252l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            lًٜۥ r6 = r0.f2254l
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L47
        L37:
            defpackage.AbstractC2829l.crashlytics(r7)
            r0.f2254l = r6
            r0.f2252l = r4
            lؒؖ۟ r7 = r6.yandex
            java.lang.Object r7 = r7.loadAd(r0)
            if (r7 != r5) goto L47
            goto L53
        L47:
            lؒؖ۟ r6 = r6.loadAd
            r0.f2254l = r2
            r0.f2252l = r3
            java.lang.Object r6 = r6.loadAd(r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8137l.loadAd(lّؑۧ):java.lang.Object");
    }

    public final double yandex() {
        Double dAmazon = this.yandex.amazon();
        if (dAmazon != null) {
            double dDoubleValue = dAmazon.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dAmazon2 = this.loadAd.amazon();
        if (dAmazon2 != null) {
            double dDoubleValue2 = dAmazon2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }
}
