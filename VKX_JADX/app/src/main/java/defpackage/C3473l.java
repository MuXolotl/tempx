package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕٙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3473l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15308l f7359l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7360l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3473l(C15308l c15308l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f7360l = i;
        this.f7359l = c15308l;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006c -> B:29:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f7360l
            lٖٟۛ r1 = defpackage.EnumC16636l.SECONDS
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            r5 = 1
            lٔۦؙ r6 = r7.f7359l
            switch(r0) {
                case 0: goto L47;
                default: goto Lf;
            }
        Lf:
            int r0 = r7.f7361l
            if (r0 == 0) goto L1d
            if (r0 != r5) goto L19
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L38
        L19:
            defpackage.C8339l.smaato(r3)
            goto L46
        L1d:
            defpackage.AbstractC2829l.crashlytics(r8)
        L20:
            int r8 = defpackage.C16942l.f33027l
            int r8 = r6.admob()
            if (r8 <= 0) goto L44
            lؙۜٔ r8 = defpackage.C9658l.f19699l
            long r2 = defpackage.AbstractC15918l.tapsense(r5, r1)
            r7.f7361l = r5
            java.lang.Object r8 = defpackage.AbstractC8532l.billing(r2, r7)
            if (r8 != r4) goto L38
            r2 = r4
            goto L46
        L38:
            int r8 = defpackage.C16942l.f33027l
            int r8 = r6.admob()
            int r8 = r8 + (-1)
            r6.subs(r8)
            goto L20
        L44:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L46:
            return r2
        L47:
            int r0 = r7.f7361l
            if (r0 == 0) goto L55
            if (r0 != r5) goto L51
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L70
        L51:
            defpackage.C8339l.smaato(r3)
            goto L7e
        L55:
            defpackage.AbstractC2829l.crashlytics(r8)
        L58:
            int r8 = defpackage.C8948l.f18428l
            int r8 = r6.admob()
            if (r8 <= 0) goto L7c
            lؙۜٔ r8 = defpackage.C9658l.f19699l
            long r2 = defpackage.AbstractC15918l.tapsense(r5, r1)
            r7.f7361l = r5
            java.lang.Object r8 = defpackage.AbstractC8532l.billing(r2, r7)
            if (r8 != r4) goto L70
            r2 = r4
            goto L7e
        L70:
            int r8 = defpackage.C8948l.f18428l
            int r8 = r6.admob()
            int r8 = r8 + (-1)
            r6.subs(r8)
            goto L58
        L7c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3473l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f7360l) {
            case 0:
                return new C3473l(this.f7359l, interfaceC14029l, 0);
            default:
                return new C3473l(this.f7359l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7360l) {
            case 0:
                break;
        }
        return ((C3473l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
