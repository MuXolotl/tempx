package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۤۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18321l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C17274l f35825l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC12352l f35826l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f35827l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f35828l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC0952l[] f35829l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0952l[] f35830l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f35831l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C17274l f35832l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f35833l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12352l f35834l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18321l(EnumC0952l[] enumC0952lArr, C17274l c17274l, InterfaceC12352l interfaceC12352l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f35830l = enumC0952lArr;
        this.f35825l = c17274l;
        this.f35834l = interfaceC12352l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f35833l
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.f35828l
            int r4 = r11.f35831l
            int r5 = r11.f35827l
            lّؓۦ r6 = r11.f35826l
            lٍٗٝ r7 = r11.f35832l
            lَؘؒ[] r8 = r11.f35829l
            defpackage.AbstractC2829l.crashlytics(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r11)
            return r1
        L21:
            defpackage.AbstractC2829l.crashlytics(r12)
            lَؘؒ[] r12 = r11.f35830l
            int r0 = r12.length
            r4 = 0
            lٍٗٝ r5 = r11.f35825l
            lّؓۦ r6 = r11.f35834l
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            lٍؗؐ r10 = defpackage.EnumC9342l.f19165l
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.f35829l = r8
            r11.f35832l = r7
            r11.f35826l = r6
            r11.f35827l = r9
            r11.f35831l = r4
            r11.f35828l = r0
            r11.f35833l = r2
            java.lang.Object r12 = defpackage.C17274l.amazon(r7, r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.C18725l.billing()
            return r1
        L5d:
            r11.f35829l = r8
            r11.f35832l = r7
            r11.f35826l = r6
            r11.f35827l = r9
            r11.f35831l = r4
            r11.f35828l = r0
            r11.f35833l = r3
            java.lang.Object r12 = defpackage.C17274l.crashlytics(r7, r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18321l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C18321l(this.f35830l, this.f35825l, this.f35834l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C18321l) ads((InterfaceC14029l) obj2, (C10595l) obj)).Signature(Unit.INSTANCE);
    }
}
