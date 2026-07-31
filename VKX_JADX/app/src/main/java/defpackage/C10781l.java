package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10781l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f21799l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21800l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f21801l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10781l(int i, InterfaceC14029l interfaceC14029l, C0360l c0360l) {
        super(1, interfaceC14029l);
        this.f21800l = i;
        this.f21799l = c0360l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f21800l;
        C0360l c0360l = this.f21799l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f21801l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC4335l interfaceC4335lMopub = c0360l.mopub();
                this.f21801l = 1;
                Object objYandex = interfaceC4335lMopub.yandex(this);
                return objYandex == enumC9342l ? enumC9342l : objYandex;
            default:
                int i3 = this.f21801l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC5137l interfaceC5137l = (InterfaceC5137l) c0360l.isPro.getValue();
                this.f21801l = 1;
                Object objAmazon = interfaceC5137l.amazon(new C14570l(3, (InterfaceC14029l) null), this);
                return objAmazon == enumC9342l ? enumC9342l : objAmazon;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f21800l;
        C0360l c0360l = this.f21799l;
        switch (i) {
            case 0:
                return new C10781l(0, interfaceC14029l, c0360l);
            default:
                return new C10781l(1, interfaceC14029l, c0360l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f21800l) {
            case 0:
                break;
        }
        return ((C10781l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
