package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1772l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ int f4181l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f4182l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f4183l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f4184l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1601l f4185l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ long f4186l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f4187l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C14451l f4188l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C14451l f4189l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772l(C14451l c14451l, long j, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f4189l = c14451l;
        this.f4186l = j;
        this.f4181l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (defpackage.C14451l.inmobi(r9, (java.util.List) r4, r17) == r7) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [lٍؓؕ] */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f4184l
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L51
            if (r1 == r5) goto L3d
            if (r1 == r4) goto L27
            if (r1 != r3) goto L21
            lٓ۟ۜ r1 = r0.f4188l
            java.util.List r1 = (java.util.List) r1
            lٍؓؕ r1 = r0.f4185l
            defpackage.AbstractC2829l.crashlytics(r18)     // Catch: java.lang.Throwable -> L1e
            goto L9e
        L1e:
            r0 = move-exception
            goto La6
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            return r6
        L27:
            int r2 = r0.f4187l
            int r1 = r0.f4183l
            lٓ۟ۜ r4 = r0.f4188l
            lٍؓؕ r5 = r0.f4185l
            defpackage.AbstractC2829l.crashlytics(r18)     // Catch: java.lang.Throwable -> L39
            r9 = r5
            r5 = r1
            r1 = r9
            r9 = r4
            r4 = r18
            goto L8b
        L39:
            r0 = move-exception
            r1 = r5
            goto La6
        L3d:
            int r1 = r0.f4187l
            int r5 = r0.f4183l
            long r8 = r0.f4182l
            lٓ۟ۜ r10 = r0.f4188l
            lٍؓؕ r11 = r0.f4185l
            defpackage.AbstractC2829l.crashlytics(r18)
            r12 = r5
            r5 = r1
            r1 = r11
        L4d:
            r15 = r8
            r9 = r10
            r10 = r15
            goto L72
        L51:
            defpackage.AbstractC2829l.crashlytics(r18)
            lٓ۟ۜ r10 = r0.f4189l
            lٖؗؓ r1 = r10.f28314l
            r0.f4185l = r1
            r0.f4188l = r10
            long r8 = r0.f4186l
            r0.f4182l = r8
            int r11 = r0.f4181l
            r0.f4183l = r11
            r0.f4187l = r2
            r0.f4184l = r5
            java.lang.Object r5 = r1.yandex(r0)
            if (r5 != r7) goto L6f
            goto L9d
        L6f:
            r5 = r2
            r12 = r11
            goto L4d
        L72:
            lٖۖ r14 = defpackage.AbstractC11463l.yandex     // Catch: java.lang.Throwable -> L1e
            lٗۛؒ r8 = new lٗۛؒ     // Catch: java.lang.Throwable -> L1e
            r13 = 0
            r8.<init>(r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L1e
            r0.f4185l = r1     // Catch: java.lang.Throwable -> L1e
            r0.f4188l = r9     // Catch: java.lang.Throwable -> L1e
            r0.f4183l = r5     // Catch: java.lang.Throwable -> L1e
            r0.f4187l = r2     // Catch: java.lang.Throwable -> L1e
            r0.f4184l = r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = defpackage.AbstractC10999l.firebase(r14, r8, r0)     // Catch: java.lang.Throwable -> L1e
            if (r4 != r7) goto L8b
            goto L9d
        L8b:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1e
            r0.f4185l = r1     // Catch: java.lang.Throwable -> L1e
            r0.f4188l = r6     // Catch: java.lang.Throwable -> L1e
            r0.f4183l = r5     // Catch: java.lang.Throwable -> L1e
            r0.f4187l = r2     // Catch: java.lang.Throwable -> L1e
            r0.f4184l = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = defpackage.C14451l.inmobi(r9, r4, r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r7) goto L9e
        L9d:
            return r7
        L9e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1e
            r1.billing(r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La6:
            r1.billing(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1772l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C1772l(this.f4189l, this.f4186l, this.f4181l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1772l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
