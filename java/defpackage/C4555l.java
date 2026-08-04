package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4555l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C10703l f9208l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f9209l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9210l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ float[] f9211l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10703l f9212l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f9213l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float[] f9214l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9215l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8097l[] f9216l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4555l(boolean z, float[] fArr, float[] fArr2, InterfaceC8097l[] interfaceC8097lArr, InterfaceC8714l interfaceC8714l, C10703l c10703l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9210l = z;
        this.f9214l = fArr;
        this.f9211l = fArr2;
        this.f9216l = interfaceC8097lArr;
        this.f9213l = interfaceC8714l;
        this.f9208l = c10703l;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[PHI: r1 r14
  0x0056: PHI (r1v1 lَۦ) = (r1v10 lَۦ), (r1v12 lَۦ) binds: [B:16:0x0053, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r14v1 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:16:0x0053, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (defpackage.AbstractC8532l.purchase(150, r13) == r6) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a1 -> B:33:0x00a4). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f9209l
            lؓۦۨ r0 = (defpackage.InterfaceC2262l) r0
            int r1 = r13.f9215l
            r2 = 0
            r3 = 2
            boolean r4 = r13.f9210l
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1e
            if (r1 != r3) goto L18
            defpackage.AbstractC2829l.crashlytics(r14)
            goto La4
        L18:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r13)
            return r2
        L1e:
            lَۦ r1 = r13.f9212l
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L56
        L24:
            defpackage.AbstractC2829l.crashlytics(r14)
        L27:
            lّۢٚ r14 = r0.vip()
            boolean r14 = defpackage.AbstractC11174l.isPro(r14)
            if (r14 == 0) goto La6
            if (r4 == 0) goto L3a
            lٌؙِ r14 = r13.f9213l
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.setValue(r1)
        L3a:
            lّؖٓ r14 = new lّؖٓ
            r1 = 18
            r14.<init>(r1)
            r13.f9209l = r0
            lَۦ r1 = r13.f9208l
            r13.f9212l = r1
            r13.f9215l = r5
            lّۢٚ r7 = r13.f1295l
            lٓؐۡ r7 = defpackage.AbstractC1789l.amazon(r7)
            java.lang.Object r14 = r7.mo1226super(r14, r13)
            if (r14 != r6) goto L56
            goto La3
        L56:
            java.lang.Number r14 = (java.lang.Number) r14
            long r7 = r14.longValue()
            r1.subs(r7)
            r14 = 0
        L60:
            r1 = 4
            if (r14 >= r1) goto L95
            float[] r1 = r13.f9211l
            r7 = r1[r14]
            float[] r8 = r13.f9214l
            r8[r14] = r7
            if (r4 == 0) goto L80
            r7 = 1000000(0xf4240, float:1.401298E-39)
            lٌؒٝ r9 = defpackage.AbstractC4777l.f9804l
            int r7 = r9.isPro(r7)
            double r9 = (double) r7
            double r9 = java.lang.Math.cbrt(r9)
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 / r11
            float r7 = (float) r9
            goto L81
        L80:
            r7 = 0
        L81:
            r1[r14] = r7
            r1 = r8[r14]
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8c
            lؙۜٙ r1 = defpackage.AbstractC5355l.loadAd
            goto L8e
        L8c:
            lؙۜٙ r1 = defpackage.AbstractC5355l.yandex
        L8e:
            lًٕٚ[] r7 = r13.f9216l
            r7[r14] = r1
            int r14 = r14 + 1
            goto L60
        L95:
            r13.f9209l = r0
            r13.f9212l = r2
            r13.f9215l = r3
            r7 = 150(0x96, double:7.4E-322)
            java.lang.Object r14 = defpackage.AbstractC8532l.purchase(r7, r13)
            if (r14 != r6) goto La4
        La3:
            return r6
        La4:
            if (r4 != 0) goto L27
        La6:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4555l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C4555l c4555l = new C4555l(this.f9210l, this.f9214l, this.f9211l, this.f9216l, this.f9213l, this.f9208l, interfaceC14029l);
        c4555l.f9209l = obj;
        return c4555l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4555l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
