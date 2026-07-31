package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14688l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6272l f28748l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28749l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28750l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f28751l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14688l(InterfaceC6272l interfaceC6272l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f28748l = interfaceC6272l;
        this.f28749l = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r7 == r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r1.vip(r3, r7) == r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [lِۣٖ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [lِۣٖ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٌؚٓ, lٔؗؑ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [lّؑۧ, lٔؗؑ] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r8) {
        /*
            r7 = this;
            lِۙ r0 = r7.f28751l
            int r1 = r7.f28750l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L14
            defpackage.AbstractC2829l.crashlytics(r8)
            goto La4
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L1a:
            defpackage.AbstractC2829l.crashlytics(r8)     // Catch: java.lang.Throwable -> L1f
            goto La4
        L1f:
            r8 = move-exception
            goto L30
        L21:
            defpackage.AbstractC2829l.crashlytics(r8)
            r7.f28751l = r0     // Catch: java.lang.Throwable -> L1f
            r7.f28750l = r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r7 = r0.amazon(r7)     // Catch: java.lang.Throwable -> L1f
            if (r7 != r5) goto La4
            goto La3
        L30:
            java.lang.Object r0 = r0.f24000l
            r1 = r0
            lٍۦۖ r1 = (defpackage.InterfaceC9955l) r1
            lَِ٘ r3 = defpackage.AbstractC11626l.yandex
            lٗۖؕ r1 = r1.adcel()
            boolean r1 = r1.smaato()
            if (r1 == 0) goto L44
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled server error: \""
            r1.<init>(r3)
            java.lang.String r3 = r8.getMessage()
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            lؙؗ٘ r3 = r7.f28748l
            r3.amazon(r1, r8)
            lٍۦۖ r0 = (defpackage.InterfaceC9955l) r0
            lؙٛٞ r1 = r0.adcel()
            boolean r3 = r1 instanceof defpackage.C12210l
            if (r3 == 0) goto L6d
            lِۣٖ r1 = (defpackage.C12210l) r1
            goto L6e
        L6d:
            r1 = r4
        L6e:
            if (r1 != 0) goto L7c
            lٗۥٓ r1 = r0.getAttributes()
            lَِ٘ r3 = defpackage.C12210l.f24263l
            java.lang.Object r1 = r1.crashlytics(r3)
            lِۣٖ r1 = (defpackage.C12210l) r1
        L7c:
            java.lang.String r3 = r8.getMessage()
            boolean r6 = r7.f28749l
            if (r6 == 0) goto L8a
            lؖۛۥ r3 = new lؖۛۥ
            r3.<init>(r0, r8)
            goto L99
        L8a:
            if (r3 == 0) goto L97
            lٕؔ r8 = new lٕؔ
            lۣؗۨ r0 = defpackage.AbstractC2460l.loadAd
            lٜؔٔ r6 = defpackage.C2759l.f5974l
            r8.<init>(r3, r0, r6)
            r3 = r8
            goto L99
        L97:
            lؒ۟٘ r3 = defpackage.AbstractC3002l.yandex
        L99:
            r7.f28751l = r4
            r7.f28750l = r2
            java.lang.Object r7 = r1.vip(r3, r7)
            if (r7 != r5) goto La4
        La3:
            return r5
        La4:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14688l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C14688l c14688l = new C14688l(this.f28748l, this.f28749l, (InterfaceC14029l) obj3);
        c14688l.f28751l = (AbstractC12074l) obj;
        return c14688l.Signature(Unit.INSTANCE);
    }
}
