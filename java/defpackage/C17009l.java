package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17009l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractServiceC5477l f33142l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33143l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33144l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17009l(AbstractServiceC5477l abstractServiceC5477l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33143l = i;
        this.f33142l = abstractServiceC5477l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f33143l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        boolean z = true;
        AbstractServiceC5477l abstractServiceC5477l = this.f33142l;
        switch (i) {
            case 0:
                int i2 = this.f33144l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7119l c7119l = abstractServiceC5477l.f11727l;
                    C9475l c9475l = new C9475l("_synth_", "Do not show!", C2580l.f5619l);
                    this.f33144l = 1;
                    if (c7119l.loadAd(this, c9475l) == enumC9342l) {
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
                int i3 = this.f33144l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13375l c13375l = new C13375l(abstractServiceC5477l.f11727l, z);
                    C2354l c2354l = new C2354l(3, abstractServiceC5477l);
                    this.f33144l = 1;
                    if (c13375l.yandex(c2354l, this) == enumC9342l) {
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
        int i = this.f33143l;
        AbstractServiceC5477l abstractServiceC5477l = this.f33142l;
        switch (i) {
            case 0:
                return new C17009l(abstractServiceC5477l, interfaceC14029l, 0);
            default:
                return new C17009l(abstractServiceC5477l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f33143l) {
            case 0:
                break;
        }
        return ((C17009l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
