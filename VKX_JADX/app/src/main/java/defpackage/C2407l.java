package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2407l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f5171l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5172l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2407l(C0360l c0360l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f5171l = c0360l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r10 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r10 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0.m3152l(r9) == r7) goto L31;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f5173l
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            lٖؑۖ r6 = r9.f5171l
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L27
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1d
            int r9 = r9.f5172l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Throwable -> L1b
            goto L78
        L1b:
            r10 = move-exception
            goto L7f
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r5
        L23:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L65
        L27:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L51
        L2b:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L47
        L2f:
            defpackage.AbstractC2829l.crashlytics(r10)
            lٌٌَ r10 = r6.firebase
            boolean r10 = r10.yandex()
            if (r10 == 0) goto L4e
            lؖۗٓ r10 = r6.mopub()
            r9.f5173l = r4
            java.lang.Object r10 = r10.yandex(r9)
            if (r10 != r7) goto L47
            goto L77
        L47:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L6b
        L4e:
            r9.f5173l = r3
            r10 = r5
        L51:
            lًٍۜ r10 = (defpackage.InterfaceC8282l) r10
            lۣۛ r0 = r6.crashlytics
            lّۢٚ r0 = r0.f36440l
            lْؔٙ r3 = new lْؔٙ
            r3.<init>(r6, r10, r5)
            r9.f5173l = r2
            java.lang.Object r10 = defpackage.AbstractC10999l.firebase(r0, r3, r9)
            if (r10 != r7) goto L65
            goto L77
        L65:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L6b:
            lُِؗ r0 = r6.subs     // Catch: java.lang.Throwable -> L7b
            r9.f5172l = r10     // Catch: java.lang.Throwable -> L7b
            r9.f5173l = r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r0.m3152l(r9)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r7) goto L78
        L77:
            return r7
        L78:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L7b:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7f:
            lَۤۖ r0 = r6.admob
            lؙؒٔ r1 = new lؙؒٔ
            r1.<init>(r9, r10)
            r0.m2959public(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2407l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C2407l(this.f5171l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2407l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
