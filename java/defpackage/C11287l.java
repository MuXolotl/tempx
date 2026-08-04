package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٍُۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11287l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f22723l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f22724l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22725l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22726l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f22727l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22728l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11287l(long j, C0708l c0708l, InterfaceC16983l interfaceC16983l, C9426l c9426l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22726l = 1;
        this.f22723l = j;
        this.f22724l = c0708l;
        this.f22727l = interfaceC16983l;
        this.f22725l = c9426l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (defpackage.AbstractC16336l.billing(r9) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (defpackage.AbstractC8532l.purchase((r7 - r5) / 1000000, r9) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object pro(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f22725l
            lؚٖٞ r0 = (defpackage.C16248l) r0
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            int r2 = r9.f22728l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L66
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            r9 = 0
            return r9
        L1b:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L3b
        L1f:
            defpackage.AbstractC2829l.crashlytics(r10)
            java.lang.Object r10 = r9.f22724l
            lّٗؖ r10 = (defpackage.C17078l) r10
            long r5 = r10.f33243l
            java.lang.Object r10 = r9.f22727l
            lّٗؖ r10 = (defpackage.C17078l) r10
            long r7 = r10.f33243l
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L58
            r9.f22728l = r4
            java.lang.Object r10 = defpackage.AbstractC16336l.billing(r9)
            if (r10 != r1) goto L3b
            goto L65
        L3b:
            long r9 = r9.f22723l
            lِٖؔ r1 = r0.f31796l
            java.lang.Object r1 = r1.f5556l
            lُِؗ r1 = (defpackage.C11644l) r1
            lؖٙؓ r2 = new lؖٙؓ
            r3 = 3
            r2.<init>(r9, r3)
            r1.m3163l(r2)
            java.lang.Object r1 = r0.f31801l
            monitor-enter(r1)
            r0.f31802l = r9     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L55
            monitor-exit(r1)
            goto L75
        L55:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L58:
            long r7 = r7 - r5
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r4
            r9.f22728l = r3
            java.lang.Object r9 = defpackage.AbstractC8532l.purchase(r7, r9)
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            lًۚ r9 = r0.f31798l
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            defpackage.C16248l.yandex(r0, r9)
        L75:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11287l.pro(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0273, code lost:
    
        if (defpackage.C5616l.loadAd(r0, r4, r2, null, r4, r14, 4) == r11) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0349, code lost:
    
        if (r0.yandex(r1, r14) == r4) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        if (r0.yandex(r8, r14) == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0171, code lost:
    
        if (r2.yandex(r3, r14) == r0) goto L83;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11287l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f22726l;
        Object obj2 = this.f22725l;
        Object obj3 = this.f22727l;
        switch (i) {
            case 0:
                return new C11287l((InterfaceC7042l) obj3, this.f22723l, (C2403l) obj2, interfaceC14029l, 0);
            case 1:
                return new C11287l(this.f22723l, (C0708l) this.f22724l, (InterfaceC16983l) obj3, (C9426l) obj2, interfaceC14029l);
            case 2:
                return new C11287l((C17078l) this.f22724l, (C17078l) obj3, (C16248l) obj2, this.f22723l, interfaceC14029l);
            case 3:
                return new C11287l((C7136l) obj3, (InterfaceC17807l) obj2, this.f22723l, interfaceC14029l);
            case 4:
                return new C11287l((C10507l) this.f22724l, (PlaybackService) obj3, this.f22723l, (InterfaceC17817l) obj2, interfaceC14029l, 4);
            case 5:
                C11287l c11287l = new C11287l((C4154l) obj3, this.f22723l, (C13250l) obj2, interfaceC14029l, 5);
                c11287l.f22724l = obj;
                return c11287l;
            case 6:
                return new C11287l((C7292l) this.f22724l, this.f22723l, (InterfaceC6474l) obj3, (C17233l) obj2, interfaceC14029l);
            case 7:
                return new C11287l((InterfaceC8714l) obj3, this.f22723l, (C2403l) obj2, interfaceC14029l, 7);
            case 8:
                return new C11287l((InterfaceC13515l) this.f22724l, (CharSequence) obj3, this.f22723l, (C12217l) obj2, interfaceC14029l, 8);
            default:
                return new C11287l((C12217l) obj3, this.f22723l, (C2403l) obj2, interfaceC14029l, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22726l) {
            case 0:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C11287l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11287l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11287l(C7136l c7136l, InterfaceC17807l interfaceC17807l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22726l = 3;
        this.f22727l = c7136l;
        this.f22725l = interfaceC17807l;
        this.f22723l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11287l(C17078l c17078l, C17078l c17078l2, C16248l c16248l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22726l = 2;
        this.f22724l = c17078l;
        this.f22727l = c17078l2;
        this.f22725l = c16248l;
        this.f22723l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11287l(C7292l c7292l, long j, InterfaceC6474l interfaceC6474l, C17233l c17233l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22726l = 6;
        this.f22724l = c7292l;
        this.f22723l = j;
        this.f22727l = interfaceC6474l;
        this.f22725l = c17233l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11287l(Object obj, long j, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22726l = i;
        this.f22727l = obj;
        this.f22723l = j;
        this.f22725l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11287l(Object obj, Object obj2, long j, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22726l = i;
        this.f22724l = obj;
        this.f22727l = obj2;
        this.f22723l = j;
        this.f22725l = obj3;
    }
}
