package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۥۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9180l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f18884l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C5371l f18885l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18886l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C5371l f18887l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9180l(C5056l c5056l, C5371l c5371l, C5371l c5371l2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18886l = i;
        this.f18884l = c5056l;
        this.f18885l = c5371l;
        this.f18887l = c5371l2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f18886l;
        C5371l c5371l = this.f18887l;
        C5371l c5371l2 = this.f18885l;
        C5056l c5056l = this.f18884l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f18888l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18888l = 1;
                    if (C5056l.loadAd(c5056l, c5371l2, c5371l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f18888l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18888l = 1;
                    if (C5056l.loadAd(c5056l, c5371l2, c5371l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f18886l) {
            case 0:
                return new C9180l(this.f18884l, this.f18885l, this.f18887l, interfaceC14029l, 0);
            default:
                return new C9180l(this.f18884l, this.f18885l, this.f18887l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18886l) {
            case 0:
                break;
        }
        return ((C9180l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
