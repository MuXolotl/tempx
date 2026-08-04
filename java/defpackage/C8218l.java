package defpackage;

/* JADX INFO: renamed from: lًًۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8218l implements InterfaceC8639l {
    public final C13954l crashlytics;
    public final C4993l loadAd;

    public C8218l(C4993l c4993l, C13954l c13954l) {
        this.loadAd = c4993l;
        this.crashlytics = c13954l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.crashlytics.invoke(r0) == r4) goto L21;
     */
    @Override // defpackage.InterfaceC8639l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object billing(defpackage.InterfaceC14029l r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C13024l
            if (r0 == 0) goto L13
            r0 = r6
            lّٖۨ r0 = (defpackage.C13024l) r0
            int r1 = r0.f25509l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25509l = r1
            goto L18
        L13:
            lّٖۨ r0 = new lّٖۨ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f25508l
            int r1 = r0.f25509l
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L31:
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L43
        L35:
            defpackage.AbstractC2829l.crashlytics(r6)
            r0.f25509l = r3
            lؗٚۥ r6 = r5.loadAd
            java.lang.Object r6 = r6.billing(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.f25509l = r2
            lًٓؗ r5 = r5.crashlytics
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8218l.billing(lٌؚٓ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8639l
    public final Object crashlytics(AbstractC0283l abstractC0283l) {
        return this.loadAd.crashlytics(abstractC0283l);
    }

    @Override // defpackage.InterfaceC8639l
    public final Throwable loadAd() {
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC8639l
    public final C18476l purchase() {
        return this.loadAd.purchase();
    }

    @Override // defpackage.InterfaceC8639l
    public final boolean subs() {
        return this.loadAd.loadAd;
    }

    @Override // defpackage.InterfaceC8639l
    public final void yandex(Throwable th) {
        this.loadAd.yandex(th);
    }
}
