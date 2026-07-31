package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4405l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f8930l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12951l f8931l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8932l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14569l f8933l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f8934l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4405l(C2403l c2403l, C12951l c12951l, AbstractC14569l abstractC14569l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f8932l = i;
        this.f8930l = c2403l;
        this.f8931l = c12951l;
        this.f8933l = abstractC14569l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.yandex(r8, r9) == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r2.yandex(r8, r9) == r5) goto L31;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f8932l
            lٖٓۧ r1 = r9.f8933l
            lٕؔؖ r2 = r9.f8930l
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            r6 = 1
            r7 = 2
            lّۣۦ r8 = r9.f8931l
            switch(r0) {
                case 0: goto L43;
                default: goto L12;
            }
        L12:
            int r0 = r9.f8934l
            if (r0 == 0) goto L26
            if (r0 == r6) goto L22
            if (r0 != r7) goto L1e
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L3e
        L1e:
            defpackage.C8339l.smaato(r4)
            goto L42
        L22:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L34
        L26:
            defpackage.AbstractC2829l.crashlytics(r10)
            long r3 = defpackage.AbstractC1587l.yandex
            r9.f8934l = r6
            java.lang.Object r10 = defpackage.AbstractC8532l.purchase(r3, r9)
            if (r10 != r5) goto L34
            goto L3c
        L34:
            r9.f8934l = r7
            java.lang.Object r9 = r2.yandex(r8, r9)
            if (r9 != r5) goto L3e
        L3c:
            r3 = r5
            goto L42
        L3e:
            r1.f28525l = r8
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L42:
            return r3
        L43:
            int r0 = r9.f8934l
            if (r0 == 0) goto L57
            if (r0 == r6) goto L53
            if (r0 != r7) goto L4f
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L6f
        L4f:
            defpackage.C8339l.smaato(r4)
            goto L73
        L53:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L65
        L57:
            defpackage.AbstractC2829l.crashlytics(r10)
            long r3 = defpackage.AbstractC1587l.yandex
            r9.f8934l = r6
            java.lang.Object r10 = defpackage.AbstractC8532l.purchase(r3, r9)
            if (r10 != r5) goto L65
            goto L6d
        L65:
            r9.f8934l = r7
            java.lang.Object r9 = r2.yandex(r8, r9)
            if (r9 != r5) goto L6f
        L6d:
            r3 = r5
            goto L73
        L6f:
            r1.f28512l = r8
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4405l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f8932l) {
            case 0:
                return new C4405l(this.f8930l, this.f8931l, this.f8933l, interfaceC14029l, 0);
            default:
                return new C4405l(this.f8930l, this.f8931l, this.f8933l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f8932l) {
            case 0:
                break;
        }
        return ((C4405l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
