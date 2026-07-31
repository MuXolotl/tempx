package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8055l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f16780l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C5655l f16781l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16782l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8055l(InterfaceC6942l interfaceC6942l, C5655l c5655l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16782l = i;
        this.f16780l = interfaceC6942l;
        this.f16781l = c5655l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f16782l;
        C5655l c5655l = this.f16781l;
        InterfaceC6942l interfaceC6942l = this.f16780l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f16783l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C10863l c10863l = new C10863l(c5655l, 1);
                    this.f16783l = 1;
                    if (interfaceC6942l.yandex(c10863l, this) == enumC9342l) {
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
                int i3 = this.f16783l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C10863l c10863l2 = new C10863l(c5655l, 3);
                    this.f16783l = 1;
                    if (interfaceC6942l.yandex(c10863l2, this) == enumC9342l) {
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
        switch (this.f16782l) {
            case 0:
                return new C8055l(this.f16780l, this.f16781l, interfaceC14029l, 0);
            default:
                return new C8055l(this.f16780l, this.f16781l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f16782l) {
            case 0:
                break;
        }
        return ((C8055l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
