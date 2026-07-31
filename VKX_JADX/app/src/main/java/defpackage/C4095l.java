package defpackage;

/* JADX INFO: renamed from: lؖٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4095l {
    public final int amazon;
    public final long crashlytics;
    public final C6609l loadAd;
    public final int purchase;
    public final int yandex;

    public C4095l(int i, C6609l c6609l, long j, int i2, int i3) {
        this.yandex = i;
        this.loadAd = c6609l;
        this.crashlytics = j;
        this.amazon = i2;
        this.purchase = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if ((((int) (r23 >> 32)) - ((int) (r5 >> 32))) < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C11280l loadAd(boolean r21, int r22, long r23, defpackage.C18142l r25, int r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4095l.loadAd(boolean, int, long, l٘ۗۢ, int, int, int, boolean, boolean):lُۘۙ");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    public final C5331l yandex(C11280l c11280l, boolean z, int i, int i2, int i3, int i4) {
        C5331l c5331l;
        InterfaceC6357l interfaceC6357l;
        C18142l c18142l;
        AbstractC10113l abstractC10113l;
        if (c11280l.f22717l) {
            C6609l c6609l = this.loadAd;
            c6609l.getClass();
            int iInmobi = AbstractC5020l.inmobi(2);
            boolean z2 = true;
            if (iInmobi == 0 || iInmobi == 1) {
                c5331l = null;
            } else {
                if (iInmobi != 2 && iInmobi != 3) {
                    C18725l.billing();
                    return null;
                }
                if (z) {
                    interfaceC6357l = c6609l.yandex;
                    c18142l = c6609l.purchase;
                    abstractC10113l = c6609l.loadAd;
                } else {
                    interfaceC6357l = (i < -1 || i2 < 0) ? null : c6609l.crashlytics;
                    c18142l = c6609l.billing;
                    abstractC10113l = c6609l.amazon;
                }
                if (interfaceC6357l == null) {
                    c5331l = null;
                } else {
                    c5331l = new C5331l(interfaceC6357l, abstractC10113l, c18142l.yandex);
                }
            }
            if (c5331l != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (c5331l.crashlytics >> 32)) < 0 || i4 >= this.yandex))) {
                    z2 = false;
                }
                c5331l.amazon = z2;
                return c5331l;
            }
        }
        return null;
    }
}
