package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12103l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C3399l f24050l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C4043l f24051l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4791l f24052l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C1008l f24053l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f24054l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24055l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C14524l f24056l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C17078l f24057l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f24058l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Context f24059l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ C15428l f24060l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12103l(C4043l c4043l, C4791l c4791l, C17078l c17078l, C1008l c1008l, Context context, C14524l c14524l, C3399l c3399l, C15428l c15428l, InterfaceC2262l interfaceC2262l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f24051l = c4043l;
        this.f24052l = c4791l;
        this.f24057l = c17078l;
        this.f24053l = c1008l;
        this.f24059l = context;
        this.f24056l = c14524l;
        this.f24050l = c3399l;
        this.f24060l = c15428l;
        this.f24054l = interfaceC2262l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (kotlin.Unit.INSTANCE == r7) goto L27;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.f24055l
            r1 = 0
            lّٗؖ r2 = r12.f24057l
            lَؗ r3 = r12.f24052l
            r4 = 2
            lّؒٓ r5 = r12.f24053l
            r6 = 1
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L21
            if (r0 == r6) goto L1d
            if (r0 != r4) goto L17
            defpackage.AbstractC2829l.crashlytics(r13)
            goto L7e
        L17:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r1
        L1d:
            defpackage.AbstractC2829l.crashlytics(r13)
            goto L5e
        L21:
            defpackage.AbstractC2829l.crashlytics(r13)
            java.lang.Object r13 = r12.f24058l
            lؙۜ۟ r13 = (defpackage.EnumC6767l) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L8c
            r0 = 4
            if (r13 == r0) goto L32
            goto L91
        L32:
            long r8 = r3.yandex
            long r10 = r2.f33243l
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L46
            java.lang.Object r13 = r5.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L87
        L46:
            lْٓۤ r13 = r12.f24056l
            lٍٝٚ r13 = r13.yandex()
            lِٖؒ r13 = (defpackage.AbstractC11563l) r13
            r12.f24055l = r6
            lَُؖ r0 = r12.f24051l
            r0.getClass()
            android.content.Context r6 = r12.f24059l
            java.lang.Object r13 = defpackage.C4043l.loadAd(r0, r6, r13, r12)
            if (r13 != r7) goto L5e
            goto L7d
        L5e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L87
            if (r13 == 0) goto L87
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.f24055l = r4
            r5.remoteconfig(r1, r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            if (r13 != r7) goto L7e
        L7d:
            return r7
        L7e:
            lّٕؔ r13 = r12.f24060l
            long r0 = r13.yandex
            lؕٔۤ r12 = r12.f24050l
            r12.loadAd(r0)
        L87:
            long r12 = r3.yandex
            r2.f33243l = r12
            goto L91
        L8c:
            lؓۦۨ r12 = r12.f24054l
            defpackage.AbstractC11990l.billing(r12, r1)
        L91:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12103l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C12103l c12103l = new C12103l(this.f24051l, this.f24052l, this.f24057l, this.f24053l, this.f24059l, this.f24056l, this.f24050l, this.f24060l, this.f24054l, interfaceC14029l);
        c12103l.f24058l = obj;
        return c12103l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12103l) ads((InterfaceC14029l) obj2, (EnumC6767l) obj)).Signature(Unit.INSTANCE);
    }
}
