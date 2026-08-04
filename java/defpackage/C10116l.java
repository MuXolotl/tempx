package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10116l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5616l f20595l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f20596l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12553l f20597l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20598l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20599l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20600l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f20601l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10116l(C5616l c5616l, float f, boolean z, InterfaceC12553l interfaceC12553l, InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20598l = i;
        this.f20595l = c5616l;
        this.f20596l = f;
        this.f20599l = z;
        this.f20597l = interfaceC12553l;
        this.f20601l = interfaceC8714l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r5.billing(r11, r12) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (defpackage.AbstractC2327l.yandex(r5, r6, r12, r10, r11) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r5.billing(r11, r12) == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (defpackage.AbstractC2327l.yandex(r5, r6, r12, r10, r11) == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r4;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f20598l
            boolean r1 = r11.f20599l
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            lؘُِ r5 = r11.f20595l
            float r6 = r11.f20596l
            r7 = 1
            r8 = 2
            lٌؙِ r9 = r11.f20601l
            lِّۘ r10 = r11.f20597l
            switch(r0) {
                case 0: goto L60;
                default: goto L16;
            }
        L16:
            int r0 = r11.f20600l
            if (r0 == 0) goto L27
            if (r0 == r7) goto L23
            if (r0 != r8) goto L1f
            goto L23
        L1f:
            defpackage.C8339l.smaato(r3)
            goto L5f
        L23:
            defpackage.AbstractC2829l.crashlytics(r12)
            goto L5a
        L27:
            defpackage.AbstractC2829l.crashlytics(r12)
            lََؖ r12 = r5.purchase
            java.lang.Object r12 = r12.getValue()
            lٓۡؖ r12 = (defpackage.C14467l) r12
            float r12 = r12.f28331l
            boolean r12 = defpackage.C14467l.loadAd(r12, r6)
            if (r12 != 0) goto L5d
            if (r1 != 0) goto L4a
            lٓۡؖ r12 = new lٓۡؖ
            r12.<init>(r6)
            r11.f20600l = r7
            java.lang.Object r11 = r5.billing(r11, r12)
            if (r11 != r4) goto L5a
            goto L58
        L4a:
            java.lang.Object r12 = r9.getValue()
            lِّۘ r12 = (defpackage.InterfaceC12553l) r12
            r11.f20600l = r8
            java.lang.Object r11 = defpackage.AbstractC2327l.yandex(r5, r6, r12, r10, r11)
            if (r11 != r4) goto L5a
        L58:
            r2 = r4
            goto L5f
        L5a:
            r9.setValue(r10)
        L5d:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L5f:
            return r2
        L60:
            int r0 = r11.f20600l
            if (r0 == 0) goto L71
            if (r0 == r7) goto L6d
            if (r0 != r8) goto L69
            goto L6d
        L69:
            defpackage.C8339l.smaato(r3)
            goto La9
        L6d:
            defpackage.AbstractC2829l.crashlytics(r12)
            goto La4
        L71:
            defpackage.AbstractC2829l.crashlytics(r12)
            lََؖ r12 = r5.purchase
            java.lang.Object r12 = r12.getValue()
            lٓۡؖ r12 = (defpackage.C14467l) r12
            float r12 = r12.f28331l
            boolean r12 = defpackage.C14467l.loadAd(r12, r6)
            if (r12 != 0) goto La7
            if (r1 != 0) goto L94
            lٓۡؖ r12 = new lٓۡؖ
            r12.<init>(r6)
            r11.f20600l = r7
            java.lang.Object r11 = r5.billing(r11, r12)
            if (r11 != r4) goto La4
            goto La2
        L94:
            java.lang.Object r12 = r9.getValue()
            lِّۘ r12 = (defpackage.InterfaceC12553l) r12
            r11.f20600l = r8
            java.lang.Object r11 = defpackage.AbstractC2327l.yandex(r5, r6, r12, r10, r11)
            if (r11 != r4) goto La4
        La2:
            r2 = r4
            goto La9
        La4:
            r9.setValue(r10)
        La7:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10116l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f20598l) {
            case 0:
                return new C10116l(this.f20595l, this.f20596l, this.f20599l, this.f20597l, this.f20601l, interfaceC14029l, 0);
            default:
                return new C10116l(this.f20595l, this.f20596l, this.f20599l, this.f20597l, this.f20601l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20598l) {
            case 0:
                break;
        }
        return ((C10116l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
