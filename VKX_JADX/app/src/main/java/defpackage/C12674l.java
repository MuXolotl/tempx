package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12674l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f24960l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f24961l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24962l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9987l f24963l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12316l f24964l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24965l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12674l(C9987l c9987l, C0360l c0360l, InterfaceC12316l interfaceC12316l, Object obj, boolean z, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f24960l = c9987l;
        this.f24961l = c0360l;
        this.f24964l = interfaceC12316l;
        this.f24962l = obj;
        this.f24966l = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r8.f24964l.loadAd(r8, r2) == r7) goto L16;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f24965l
            r1 = 0
            java.lang.Object r2 = r8.f24962l
            lٖؑۖ r3 = r8.f24961l
            lٍۨۦ r4 = r8.f24960l
            r5 = 2
            r6 = 1
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L23
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L4b
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r1
        L1d:
            lٍۨۦ r0 = r8.f24963l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L36
        L23:
            defpackage.AbstractC2829l.crashlytics(r9)
            lؖۗٓ r9 = r3.mopub()
            r8.f24963l = r4
            r8.f24965l = r6
            java.lang.Object r9 = r9.crashlytics(r8)
            if (r9 != r7) goto L35
            goto L4a
        L35:
            r0 = r4
        L36:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.f20387l = r9
            r8.f24963l = r1
            r8.f24965l = r5
            lّؒؒ r9 = r8.f24964l
            java.lang.Object r9 = r9.loadAd(r8, r2)
            if (r9 != r7) goto L4b
        L4a:
            return r7
        L4b:
            boolean r8 = r8.f24966l
            if (r8 == 0) goto L63
            lَۤۖ r8 = r3.admob
            lٍؔۘ r9 = new lٍؔۘ
            if (r2 == 0) goto L5a
            int r0 = r2.hashCode()
            goto L5b
        L5a:
            r0 = 0
        L5b:
            int r1 = r4.f20387l
            r9.<init>(r2, r0, r1)
            r8.m2959public(r9)
        L63:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12674l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C12674l(this.f24960l, this.f24961l, this.f24964l, this.f24962l, this.f24966l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12674l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
