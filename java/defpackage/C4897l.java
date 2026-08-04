package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4897l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C18233l f9988l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9989l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9990l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4897l(C18233l c18233l, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9990l = i;
        this.f9988l = c18233l;
        this.f9989l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f9990l;
        int i2 = 2;
        boolean z = this.f9989l;
        C18233l c18233l = this.f9988l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f9991l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3603l;
                    EnumC14435l enumC14435l = c18233l.f35744l;
                    this.f9991l = 1;
                    if (interfaceC15829l.loadAd(new C9239l(enumC14435l, z, interfaceC14029l, i2), this) == enumC9342l) {
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
            default:
                int i4 = this.f9991l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3603l;
                    EnumC14435l enumC14435l2 = c18233l.f35744l;
                    this.f9991l = 1;
                    if (interfaceC15829l2.loadAd(new C9239l(enumC14435l2, z, interfaceC14029l, i2), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
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
        int i = this.f9990l;
        boolean z = this.f9989l;
        C18233l c18233l = this.f9988l;
        switch (i) {
            case 0:
                return new C4897l(c18233l, z, interfaceC14029l, 0);
            default:
                return new C4897l(c18233l, z, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f9990l) {
            case 0:
                break;
        }
        return ((C4897l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
