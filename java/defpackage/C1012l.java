package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1012l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f2756l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f2757l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2758l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C6523l f2759l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6523l f2760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1012l(C6523l c6523l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2758l = i;
        this.f2759l = c6523l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2758l;
        C6523l c6523l = this.f2759l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f2756l;
                try {
                    if (i2 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f2757l = null;
                        this.f2760l = c6523l;
                        this.f2756l = 1;
                        if (AbstractC8532l.purchase(250L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i2 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6523l = this.f2760l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    C6523l.loadAd(c6523l);
                    break;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f2756l;
                try {
                    if (i3 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f2757l = null;
                        this.f2760l = c6523l;
                        this.f2756l = 1;
                        if (AbstractC8532l.purchase(250L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i3 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6523l = this.f2760l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    C6523l.loadAd(c6523l);
                    break;
                } catch (Throwable unused2) {
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f2756l;
                try {
                    if (i4 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f2757l = null;
                        this.f2760l = c6523l;
                        this.f2756l = 1;
                        if (AbstractC8532l.purchase(250L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i4 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6523l = this.f2760l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    C6523l.loadAd(c6523l);
                    break;
                } catch (Throwable unused3) {
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f2756l;
                try {
                    if (i5 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f2757l = null;
                        this.f2760l = c6523l;
                        this.f2756l = 1;
                        if (AbstractC8532l.purchase(250L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i5 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6523l = this.f2760l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    C6523l.loadAd(c6523l);
                    break;
                } catch (Throwable unused4) {
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f2758l;
        C6523l c6523l = this.f2759l;
        switch (i) {
            case 0:
                C1012l c1012l = new C1012l(c6523l, interfaceC14029l, 0);
                c1012l.f2757l = obj;
                return c1012l;
            case 1:
                C1012l c1012l2 = new C1012l(c6523l, interfaceC14029l, 1);
                c1012l2.f2757l = obj;
                return c1012l2;
            case 2:
                C1012l c1012l3 = new C1012l(c6523l, interfaceC14029l, 2);
                c1012l3.f2757l = obj;
                return c1012l3;
            default:
                C1012l c1012l4 = new C1012l(c6523l, interfaceC14029l, 3);
                c1012l4.f2757l = obj;
                return c1012l4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f2758l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C1012l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
