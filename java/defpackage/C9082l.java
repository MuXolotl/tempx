package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9082l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15581l f18664l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18665l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18666l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9082l(C15581l c15581l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18665l = i;
        this.f18664l = c15581l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objCrashlytics;
        int i = this.f18665l;
        C15581l c15581l = this.f18664l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f18666l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = c15581l.crashlytics.yandex();
                    this.f18666l = 1;
                    obj = AbstractC0622l.remoteconfig(interfaceC6942lYandex, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C16221l c16221l = (C16221l) obj;
                return c16221l != null ? c16221l.yandex() : C14054l.f27396l;
            default:
                int i3 = this.f18666l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex2 = c15581l.crashlytics.yandex();
                    this.f18666l = 1;
                    obj = AbstractC0622l.remoteconfig(interfaceC6942lYandex2, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C16221l c16221l2 = (C16221l) obj;
                if (c16221l2 == null || (objCrashlytics = c16221l2.crashlytics(C4595l.loadAd)) == null) {
                    return -1L;
                }
                return objCrashlytics;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f18665l) {
            case 0:
                return new C9082l(this.f18664l, interfaceC14029l, 0);
            default:
                return new C9082l(this.f18664l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18665l) {
            case 0:
                break;
        }
        return ((C9082l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
