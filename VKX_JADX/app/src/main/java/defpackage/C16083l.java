package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۧٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16083l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0936l f31527l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31528l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ EnumC3503l f31529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16083l(EnumC3503l enumC3503l, C0936l c0936l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f31529l = enumC3503l;
        this.f31527l = c0936l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r10, r0, r9) == r7) goto L24;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f31528l
            lٍؒؒ r1 = r9.f31527l
            lْؕٛ r2 = r9.f31529l
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L18
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L6f
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r6
        L1e:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L59
        L22:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L42
        L26:
            defpackage.AbstractC2829l.crashlytics(r10)
            lؒۢۦ r10 = ua.itaysonlab.vkx.VKXApplication.f36627l
            if (r10 == 0) goto L2e
            goto L2f
        L2e:
            r10 = r6
        L2f:
            java.lang.Object r10 = r10.f3603l
            lٕٝۢ r10 = (defpackage.InterfaceC15829l) r10
            r9.f31528l = r5
            lٍْؗ r0 = new lٍْؗ
            r5 = 6
            r0.<init>(r2, r6, r5)
            java.lang.Object r10 = r10.loadAd(r0, r9)
            if (r10 != r7) goto L42
            goto L6e
        L42:
            lَؕۖ r10 = new lَؕۖ
            r10.<init>()
            android.content.Context r0 = r1.f34617l
            lٔۖؑ r5 = new lٔۖؑ
            r8 = 29
            r5.<init>(r8, r2)
            r9.f31528l = r4
            java.lang.Object r10 = r10.remoteconfig(r0, r5, r9)
            if (r10 != r7) goto L59
            goto L6e
        L59:
            lٖۖ r10 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r10 = defpackage.AbstractC17278l.yandex
            lؔۢؒ r10 = r10.f6462l
            lّٔ٘ r0 = new lّٔ٘
            r2 = 23
            r0.<init>(r1, r6, r2)
            r9.f31528l = r3
            java.lang.Object r9 = defpackage.AbstractC10999l.firebase(r10, r0, r9)
            if (r9 != r7) goto L6f
        L6e:
            return r7
        L6f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16083l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C16083l(this.f31529l, this.f31527l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16083l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
