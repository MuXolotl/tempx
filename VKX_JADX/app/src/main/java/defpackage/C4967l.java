package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؗ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4967l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f10114l;

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f10114l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C7644l c7644l = VKXApplication.f36633l;
            if (c7644l == null) {
                c7644l = null;
            }
            this.f10114l = 1;
            Object objAdcel = c7644l.adcel(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdcel == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        VKXApplication vKXApplication = VKXApplication.f36631l;
        return AbstractC12832l.mopub(C7541l.yandex, vKXApplication != null ? vKXApplication : null);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C4967l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4967l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
