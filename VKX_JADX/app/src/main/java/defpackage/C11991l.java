package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11991l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23898l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f23899l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f23900l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Serializable f23901l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23902l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f23903l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C9987l f23904l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f23905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11991l(C10700l c10700l, C0360l c0360l, C9987l c9987l, Function2 function2, boolean z, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f23899l = c10700l;
        this.f23903l = c0360l;
        this.f23900l = c9987l;
        this.f23905l = function2;
        this.f23902l = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r10 == r8) goto L29;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f23898l
            r1 = 0
            lٍۨۦ r2 = r9.f23900l
            lٖؑۖ r3 = r9.f23903l
            lَۥۚ r4 = r9.f23899l
            r5 = 3
            r6 = 2
            r7 = 1
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L36
            if (r0 == r7) goto L2e
            if (r0 == r6) goto L26
            if (r0 != r5) goto L20
            lٍۨۦ r2 = r9.f23904l
            java.io.Serializable r9 = r9.f23901l
            lٗؗٓ r9 = (defpackage.C16916l) r9
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L78
        L20:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r1
        L26:
            java.io.Serializable r0 = r9.f23901l
            lٍۨۦ r0 = (defpackage.C9987l) r0
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: defpackage.C16916l -> L69
            goto L60
        L2e:
            java.io.Serializable r0 = r9.f23901l
            lَۥۚ r0 = (defpackage.C10700l) r0
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: defpackage.C16916l -> L69
            goto L4a
        L36:
            defpackage.AbstractC2829l.crashlytics(r10)
            r9.f23901l = r4     // Catch: defpackage.C16916l -> L69
            r9.f23898l = r7     // Catch: defpackage.C16916l -> L69
            lُؒؐ r10 = new lُؒؐ     // Catch: defpackage.C16916l -> L69
            r10.<init>(r7, r1, r3)     // Catch: defpackage.C16916l -> L69
            java.lang.Object r10 = defpackage.AbstractC5088l.ads(r10, r9)     // Catch: defpackage.C16916l -> L69
            if (r10 != r8) goto L49
            goto L77
        L49:
            r0 = r4
        L4a:
            r0.f21708l = r10     // Catch: defpackage.C16916l -> L69
            kotlin.jvm.functions.Function2 r10 = r9.f23905l     // Catch: defpackage.C16916l -> L69
            boolean r0 = r9.f23902l     // Catch: defpackage.C16916l -> L69
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: defpackage.C16916l -> L69
            r9.f23901l = r2     // Catch: defpackage.C16916l -> L69
            r9.f23898l = r6     // Catch: defpackage.C16916l -> L69
            java.lang.Object r10 = r10.invoke(r0, r9)     // Catch: defpackage.C16916l -> L69
            if (r10 != r8) goto L5f
            goto L77
        L5f:
            r0 = r2
        L60:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: defpackage.C16916l -> L69
            int r10 = r10.intValue()     // Catch: defpackage.C16916l -> L69
            r0.f20387l = r10     // Catch: defpackage.C16916l -> L69
            goto L80
        L69:
            java.lang.Object r10 = r4.f21708l
            r9.f23901l = r1
            r9.f23904l = r2
            r9.f23898l = r5
            java.lang.Object r10 = r3.subs(r10, r7, r9)
            if (r10 != r8) goto L78
        L77:
            return r8
        L78:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            r2.f20387l = r9
        L80:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11991l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C11991l(this.f23899l, this.f23903l, this.f23900l, this.f23905l, this.f23902l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11991l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
