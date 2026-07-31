package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒۘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1289l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f3336l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3337l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1289l(C6111l c6111l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3337l = i;
        this.f3336l = c6111l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3337l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C6111l c6111l = this.f3336l;
        switch (i) {
            case 0:
                int i2 = this.f3338l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC8576l.yandex(c6111l.m1943l(), C3729l.mopub)) {
                        this.f3338l = 1;
                        if (c6111l.m1946l(this) == enumC9342l) {
                            return enumC9342l;
                        }
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
                int i3 = this.f3338l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c6111l.f12896l.setValue(Boolean.FALSE);
                    this.f3338l = 1;
                    c6111l.f12901l.setValue(C3729l.mopub);
                    Object objM1946l = c6111l.m1946l(this);
                    if (objM1946l != enumC9342l) {
                        objM1946l = Unit.INSTANCE;
                    }
                    if (objM1946l == enumC9342l) {
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
        int i = this.f3337l;
        C6111l c6111l = this.f3336l;
        switch (i) {
            case 0:
                return new C1289l(c6111l, interfaceC14029l, 0);
            default:
                return new C1289l(c6111l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3337l) {
            case 0:
                return ((C1289l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C1289l) ads((InterfaceC14029l) obj2, (C15021l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
