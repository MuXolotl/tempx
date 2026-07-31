package defpackage;

/* JADX INFO: renamed from: lٖؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3430l extends AbstractC3594l {
    public boolean loadAd;
    public C3528l yandex;

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:7:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void crashlytics(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            lؕٞؔ r0 = r7.yandex
            j$.util.Objects.requireNonNull(r0)
            if (r8 != 0) goto L8
            return
        L8:
            boolean r0 = r7.loadAd
            r1 = 0
            if (r0 == 0) goto L41
            lؕٞؔ r0 = new lؕٞؔ
            lؕٞؔ r2 = r7.yandex
            r0.<init>()
            int r3 = r2.crashlytics
            r0.amazon(r3)
            int r3 = r2.crashlytics
            r4 = -1
            if (r3 != 0) goto L20
        L1e:
            r3 = r4
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 == r4) goto L3f
            int r5 = r2.crashlytics
            defpackage.AbstractC12442l.smaato(r3, r5)
            java.lang.Object[] r5 = r2.yandex
            r5 = r5[r3]
            int r6 = r2.crashlytics
            defpackage.AbstractC12442l.smaato(r3, r6)
            int[] r6 = r2.loadAd
            r6 = r6[r3]
            r0.purchase(r6, r5)
            int r3 = r3 + 1
            int r5 = r2.crashlytics
            if (r3 >= r5) goto L1e
            goto L21
        L3f:
            r7.yandex = r0
        L41:
            r7.loadAd = r1
            r9.getClass()
            lؕٞؔ r7 = r7.yandex
            int r0 = r7.loadAd(r9)
            int r0 = r0 + r8
            r7.purchase(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3430l.crashlytics(int, java.lang.Object):void");
    }

    @Override // defpackage.AbstractC3594l
    public final AbstractC3594l yandex(Object obj) {
        crashlytics(1, obj);
        return this;
    }
}
