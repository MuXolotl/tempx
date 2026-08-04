package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒٚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1148l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C11686l f3112l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C17991l f3113l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f3114l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f3115l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f3116l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long[] f3117l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C11686l f3118l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public /* synthetic */ Object f3119l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f3120l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3121l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f3122l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ C17991l f3123l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148l(C11686l c11686l, C17991l c17991l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f3112l = c11686l;
        this.f3123l = c17991l;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f3122l
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.f3120l
            int r5 = r0.f3115l
            long r6 = r0.f3116l
            int r8 = r0.f3114l
            int r9 = r0.f3121l
            long[] r10 = r0.f3117l
            lٍِؚ r11 = r0.f3118l
            lٜ٘٘ r12 = r0.f3113l
            java.lang.Object r13 = r0.f3119l
            lُٙۛ r13 = (defpackage.C11129l) r13
            defpackage.AbstractC2829l.crashlytics(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.AbstractC2829l.crashlytics(r21)
            java.lang.Object r1 = r0.f3119l
            lُٙۛ r1 = (defpackage.C11129l) r1
            lٍِؚ r5 = r0.f3112l
            lؘؙ۠ r6 = r5.f23430l
            long[] r6 = r6.yandex
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            lٜ٘٘ r8 = r0.f3123l
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f35177l = r2
            lؘؙ۠ r3 = r11.f23430l
            java.lang.Object[] r3 = r3.loadAd
            r2 = r3[r2]
            r0.f3119l = r13
            r0.f3113l = r12
            r0.f3118l = r11
            r0.f3117l = r10
            r0.f3121l = r9
            r0.f3114l = r8
            r0.f3116l = r6
            r0.f3115l = r5
            r0.f3120l = r1
            r0.f3122l = r4
            r13.amazon(r0, r2)
            lٍؗؐ r0 = defpackage.EnumC9342l.f19165l
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1148l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1148l c1148l = new C1148l(this.f3112l, this.f3123l, interfaceC14029l);
        c1148l.f3119l = obj;
        return c1148l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1148l) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
    }
}
