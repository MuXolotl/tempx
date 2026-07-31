package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14618l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15790l f28612l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28613l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14618l(C15790l c15790l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28613l = i;
        this.f28612l = c15790l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r1.m4116l(r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (defpackage.C15790l.m4115l(r1, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r4;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f28613l
            lٕٛٛ r1 = r7.f28612l
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            r5 = 1
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L3c;
                default: goto Ld;
            }
        Ld:
            int r0 = r7.f28614l
            r6 = 2
            if (r0 == 0) goto L1f
            if (r0 == r5) goto L1b
            if (r0 != r6) goto L17
            goto L1b
        L17:
            defpackage.C8339l.smaato(r3)
            goto L3b
        L1b:
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L39
        L1f:
            defpackage.AbstractC2829l.crashlytics(r8)
            boolean r8 = r1.f31007l
            if (r8 != 0) goto L2f
            r7.f28614l = r5
            java.lang.Object r7 = r1.m4116l(r7)
            if (r7 != r4) goto L39
            goto L37
        L2f:
            r7.f28614l = r6
            java.lang.Object r7 = defpackage.C15790l.m4115l(r1, r7)
            if (r7 != r4) goto L39
        L37:
            r2 = r4
            goto L3b
        L39:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L3b:
            return r2
        L3c:
            int r0 = r7.f28614l
            if (r0 == 0) goto L4a
            if (r0 != r5) goto L46
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L7b
        L46:
            defpackage.C8339l.smaato(r3)
            goto L7d
        L4a:
            defpackage.AbstractC2829l.crashlytics(r8)
            lًٜؗ r8 = r1.f31004l
            lؘُِ r8 = r8.yandex
            boolean r8 = r8.purchase()
            if (r8 != 0) goto L7b
            lًٜؗ r8 = r1.f31004l
            lْۣۧ r0 = r1.f31009l
            float r0 = r0.admob()
            int r1 = r1.m4119l()
            float r1 = (float) r1
            float r0 = r0 / r1
            r7.f28614l = r5
            lؘُِ r8 = r8.yandex
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            java.lang.Object r7 = r8.billing(r7, r1)
            if (r7 != r4) goto L75
            goto L77
        L75:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L77:
            if (r7 != r4) goto L7b
            r2 = r4
            goto L7d
        L7b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L7d:
            return r2
        L7e:
            int r0 = r7.f28614l
            if (r0 == 0) goto L8c
            if (r0 != r5) goto L88
            defpackage.AbstractC2829l.crashlytics(r8)
            goto Laf
        L88:
            defpackage.C8339l.smaato(r3)
            goto Lb1
        L8c:
            defpackage.AbstractC2829l.crashlytics(r8)
            lًٜؗ r8 = r1.f31004l
            boolean r0 = r1.f31007l
            if (r0 == 0) goto L98
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L99
        L98:
            r0 = 0
        L99:
            r7.f28614l = r5
            lؘُِ r8 = r8.yandex
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            java.lang.Object r7 = r8.billing(r7, r1)
            if (r7 != r4) goto La9
            goto Lab
        La9:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        Lab:
            if (r7 != r4) goto Laf
            r2 = r4
            goto Lb1
        Laf:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14618l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28613l;
        C15790l c15790l = this.f28612l;
        switch (i) {
            case 0:
                return new C14618l(c15790l, interfaceC14029l, 0);
            case 1:
                return new C14618l(c15790l, interfaceC14029l, 1);
            default:
                return new C14618l(c15790l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f28613l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C14618l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
