package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٞۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12017l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f23946l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C10304l f23947l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ long f23948l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f23949l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23950l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23951l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C8896l f23952l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12017l(float f, C10304l c10304l, boolean z, long j, C8896l c8896l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23946l = f;
        this.f23947l = c10304l;
        this.f23950l = z;
        this.f23948l = j;
        this.f23952l = c8896l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r9.yandex(r6, r8) == r5) goto L36;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f23951l
            lَٕؓ r1 = r8.f23947l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.f23949l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L52
        L21:
            defpackage.AbstractC2829l.crashlytics(r9)
            float r9 = r8.f23946l
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            lُٝۘ r9 = r1.f20997l
            r8.f23949l = r0
            r8.f23951l = r4
            java.lang.Object r9 = defpackage.AbstractC16817l.vip(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.f23950l
            if (r4 == 0) goto L91
            long r6 = r8.f23948l
            boolean r4 = defpackage.C12814l.amazon(r6)
            lٌٚۙ r6 = r8.f23952l
            if (r4 == 0) goto L84
            float r4 = r6.crashlytics
            float r7 = r6.yandex
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.crashlytics
            float r9 = r9 + r0
            r0 = 11
            lٌٚۙ r6 = defpackage.C8896l.loadAd(r6, r2, r9, r2, r0)
        L84:
            lَٕٟ r9 = r1.f20998l
            lٍؓٚ r9 = r9.mopub
            r8.f23951l = r3
            java.lang.Object r8 = r9.yandex(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12017l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C12017l(this.f23946l, this.f23947l, this.f23950l, this.f23948l, this.f23952l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12017l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
