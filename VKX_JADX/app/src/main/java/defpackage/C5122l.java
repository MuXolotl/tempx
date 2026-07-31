package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5122l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f11118l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C12428l f11119l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11120l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5122l(InterfaceC6942l interfaceC6942l, C12428l c12428l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11120l = i;
        this.f11118l = interfaceC6942l;
        this.f11119l = c12428l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11120l;
        C12428l c12428l = this.f11119l;
        InterfaceC6942l interfaceC6942l = this.f11118l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f11121l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C10034l c10034l = new C10034l(c12428l, 0);
                    this.f11121l = 1;
                    if (interfaceC6942l.yandex(c10034l, this) == enumC9342l) {
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
                int i3 = this.f11121l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C10034l c10034l2 = new C10034l(c12428l, 2);
                    this.f11121l = 1;
                    if (interfaceC6942l.yandex(c10034l2, this) == enumC9342l) {
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
        int i = this.f11120l;
        C12428l c12428l = this.f11119l;
        InterfaceC6942l interfaceC6942l = this.f11118l;
        switch (i) {
            case 0:
                return new C5122l(interfaceC6942l, c12428l, interfaceC14029l, 0);
            default:
                return new C5122l(interfaceC6942l, c12428l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f11120l) {
            case 0:
                break;
        }
        return ((C5122l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
