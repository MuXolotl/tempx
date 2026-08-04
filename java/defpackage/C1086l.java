package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1086l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C17869l f3002l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11925l f3003l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3004l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C13250l f3005l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3006l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1086l(C17869l c17869l, C11925l c11925l, C13250l c13250l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3004l = i;
        this.f3002l = c17869l;
        this.f3003l = c11925l;
        this.f3005l = c13250l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3004l;
        C13250l c13250l = this.f3005l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C17869l c17869l = this.f3002l;
        C11925l c11925l = this.f3003l;
        switch (i) {
            case 0:
                int i2 = this.f3006l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float f = c13250l.f26029l;
                    this.f3006l = 1;
                    if (C17869l.crashlytics(c17869l, c11925l, f, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                ((InterfaceC3685l) AbstractC13402l.loadAd(c17869l.yandex, AbstractC4751l.mopub)).yandex(c11925l);
                return Unit.INSTANCE;
            default:
                C11183l c11183l = c17869l.yandex;
                int i3 = this.f3006l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float f2 = c13250l.f26029l;
                    this.f3006l = 1;
                    if (C17869l.crashlytics(c17869l, c11925l, f2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                ((InterfaceC3685l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.mopub)).yandex(c11925l);
                if (c17869l.billing) {
                    AbstractC2697l.firebase(c11183l);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f3004l) {
            case 0:
                return new C1086l(this.f3002l, this.f3003l, this.f3005l, interfaceC14029l, 0);
            default:
                return new C1086l(this.f3002l, this.f3003l, this.f3005l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f3004l) {
            case 0:
                break;
        }
        return ((C1086l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
