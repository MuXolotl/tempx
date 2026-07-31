package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1316l {
    public C7504l amazon;
    public final C4307l crashlytics;
    public final InterfaceC2262l loadAd;
    public final C7119l purchase = AbstractC12098l.yandex(-1, 0, null, 6);
    public final InterfaceC17955l yandex;

    public C1316l(C5866l c5866l, InterfaceC2262l interfaceC2262l, C4307l c4307l) {
        this.yandex = c5866l;
        this.loadAd = interfaceC2262l;
        this.crashlytics = c4307l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C1316l r18, defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1316l.yandex(lٕؒۚ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (defpackage.AbstractC11174l.amazon(r7, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.AbstractC0283l r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C17492l
            if (r0 == 0) goto L13
            r0 = r7
            lٗۢۚ r0 = (defpackage.C17492l) r0
            int r1 = r0.f34077l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34077l = r1
            goto L18
        L13:
            lٗۢۚ r0 = new lٗۢۚ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f34078l
            int r1 = r0.f34077l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            lٕؒۚ r6 = r0.f34079l
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L5a
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L33:
            lٕؒۚ r6 = r0.f34079l
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L4b
        L39:
            defpackage.AbstractC2829l.crashlytics(r7)
            lْۙ r7 = defpackage.C13614l.purchase
            r0.f34079l = r6
            r0.f34077l = r4
            lؚؚۖ r1 = r6.purchase
            java.lang.Object r7 = r1.loadAd(r0, r7)
            if (r7 != r5) goto L4b
            goto L59
        L4b:
            lؚٜۚ r7 = r6.amazon
            if (r7 == 0) goto L5a
            r0.f34079l = r6
            r0.f34077l = r3
            java.lang.Object r7 = defpackage.AbstractC11174l.amazon(r7, r0)
            if (r7 != r5) goto L5a
        L59:
            return r5
        L5a:
            r6.amazon = r2
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1316l.crashlytics(lّؑۧ):java.lang.Object");
    }

    public final boolean loadAd(EnumC18610l enumC18610l, float f, Function0 function0, Function1 function1) {
        boolean zCrashlytics;
        int iOrdinal = enumC18610l.ordinal();
        InterfaceC17955l interfaceC17955l = this.yandex;
        if (iOrdinal == 0) {
            zCrashlytics = interfaceC17955l.crashlytics();
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return false;
            }
            zCrashlytics = interfaceC17955l.amazon();
        }
        if (!zCrashlytics) {
            return false;
        }
        if (this.amazon == null) {
            this.amazon = AbstractC10999l.mopub(this.loadAd, null, 0, new C5629l(this, null, 0), 3);
        }
        this.purchase.amazon(new C13614l(enumC18610l, f, function0, function1));
        return true;
    }
}
