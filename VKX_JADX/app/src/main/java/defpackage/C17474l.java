package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17474l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f34040l = 0;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34041l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f34042l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f34043l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f34044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17474l(long j, C17078l c17078l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f34043l = j;
        this.f34041l = c17078l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f34040l
            r1 = 3
            java.lang.Object r2 = r10.f34041l
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            r6 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Le;
            }
        Le:
            int r0 = r10.f34042l
            if (r0 == 0) goto L22
            if (r0 != r6) goto L1e
            long r2 = r10.f34043l
            java.lang.Object r0 = r10.f34044l
            lٜٗؒ r0 = (defpackage.C17249l) r0
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L47
        L1e:
            defpackage.C8339l.smaato(r4)
            goto L50
        L22:
            defpackage.AbstractC2829l.crashlytics(r11)
            java.lang.Object r11 = r10.f34044l
            lٜٗؒ r11 = (defpackage.C17249l) r11
            lَٕٗ r2 = (defpackage.C15730l) r2
            long r2 = r2.loadAd
            lؙؕؑ r0 = r11.purchase()
            r0.getClass()
            r7 = 40
            long r7 = r7 + r2
            r0 = r11
            r2 = r7
        L39:
            r10.f34044l = r0
            r10.f34043l = r2
            r10.f34042l = r6
            java.lang.Object r11 = defpackage.AbstractC18112l.loadAd(r0, r10, r1)
            if (r11 != r5) goto L47
            r3 = r5
            goto L50
        L47:
            lَٕٗ r11 = (defpackage.C15730l) r11
            long r7 = r11.loadAd
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L39
            r3 = r11
        L50:
            return r3
        L51:
            lّٗؖ r2 = (defpackage.C17078l) r2
            int r0 = r10.f34042l
            if (r0 == 0) goto L65
            if (r0 != r6) goto L61
            java.lang.Object r10 = r10.f34044l
            lٜٗؒ r10 = (defpackage.C17249l) r10
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L82
        L61:
            defpackage.C8339l.smaato(r4)
            goto Lb4
        L65:
            defpackage.AbstractC2829l.crashlytics(r11)
            java.lang.Object r11 = r10.f34044l
            lٜٗؒ r11 = (defpackage.C17249l) r11
            long r3 = r10.f34043l
            lٜؓؗ r0 = new lٜؓؗ
            r0.<init>(r1, r2)
            r10.f34044l = r11
            r10.f34042l = r6
            java.lang.Object r10 = defpackage.AbstractC7289l.amazon(r11, r3, r0, r10)
            if (r10 != r5) goto L7f
            r3 = r5
            goto Lb4
        L7f:
            r9 = r11
            r11 = r10
            r10 = r9
        L82:
            lَٕٗ r11 = (defpackage.C15730l) r11
            if (r11 == 0) goto L9a
            long r0 = r2.f33243l
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L9a
            lؗٝۖ r3 = defpackage.EnumC5037l.f10301l
            goto Lb4
        L9a:
            lؚؗؐ r10 = r10.f33476l
            lٌۦ r10 = r10.f9255l
            java.util.List r10 = r10.yandex
            java.lang.Object r10 = defpackage.AbstractC16901l.m4231native(r10)
            lَٕٗ r10 = (defpackage.C15730l) r10
            boolean r11 = defpackage.AbstractC3474l.billing(r10)
            if (r11 == 0) goto Lb2
            r10.yandex()
            lؗٝۖ r3 = defpackage.EnumC5037l.f10302l
            goto Lb4
        Lb2:
            lؗٝۖ r3 = defpackage.EnumC5037l.f10304l
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17474l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34040l;
        Object obj2 = this.f34041l;
        switch (i) {
            case 0:
                C17474l c17474l = new C17474l(this.f34043l, (C17078l) obj2, interfaceC14029l);
                c17474l.f34044l = obj;
                return c17474l;
            default:
                C17474l c17474l2 = new C17474l((C15730l) obj2, interfaceC14029l);
                c17474l2.f34044l = obj;
                return c17474l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C17249l c17249l = (C17249l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34040l) {
            case 0:
                break;
        }
        return ((C17474l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17474l(C15730l c15730l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f34041l = c15730l;
    }
}
