package defpackage;

/* JADX INFO: renamed from: lُِۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12034l implements InterfaceC11164l {
    public final C7504l loadAd;
    public final C8218l yandex;

    public C12034l(C8218l c8218l, C7504l c7504l) {
        this.yandex = c8218l;
        this.loadAd = c7504l;
    }

    @Override // defpackage.InterfaceC11164l
    public final InterfaceC7042l crashlytics() {
        return this.loadAd;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r7.yandex.billing(r0) == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(defpackage.AbstractC0283l r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C6602l
            if (r0 == 0) goto L13
            r0 = r8
            lؙٝؔ r0 = (defpackage.C6602l) r0
            int r1 = r0.f13830l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13830l = r1
            goto L18
        L13:
            lؙٝؔ r0 = new lؙٝؔ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f13833l
            int r1 = r0.f13830l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L95
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L2f:
            int r1 = r0.f13831l
            java.util.Iterator r5 = r0.f13832l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L6a
        L37:
            defpackage.AbstractC2829l.crashlytics(r8)
            lؚٜۚ r8 = r7.loadAd
            lَُٖ r1 = r8.m3892volatile()
            lٌ٘ۢ r1 = (defpackage.C17798l) r1
            java.lang.Object r1 = r1.loadAd
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            lُٙۛ r1 = defpackage.AbstractC6900l.purchase(r1)
        L4a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            lٌؚؖ r5 = (defpackage.InterfaceC7042l) r5
            r5.ads(r4)
            goto L4a
        L5a:
            lَُٖ r8 = r8.m3892volatile()
            lٌ٘ۢ r8 = (defpackage.C17798l) r8
            java.lang.Object r8 = r8.loadAd
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            lُٙۛ r8 = defpackage.AbstractC6900l.purchase(r8)
            r1 = 0
            r5 = r8
        L6a:
            boolean r8 = r5.hasNext()
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r8 == 0) goto L88
            java.lang.Object r8 = r5.next()
            lٌؚؖ r8 = (defpackage.InterfaceC7042l) r8
            r8.ads(r4)
            r0.f13832l = r5
            r0.f13831l = r1
            r0.f13830l = r3
            java.lang.Object r8 = r8.mo2158switch(r0)
            if (r8 != r6) goto L6a
            goto L94
        L88:
            r0.f13832l = r4
            r0.f13830l = r2
            lًًۘ r7 = r7.yandex
            java.lang.Object r7 = r7.billing(r0)
            if (r7 != r6) goto L95
        L94:
            return r6
        L95:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12034l.yandex(lّؑۧ):java.lang.Object");
    }
}
