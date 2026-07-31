package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚۛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7520l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f15531l;

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f15531l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C5374l c5374l = VKXApplication.f36626l;
            C5374l c5374l2 = c5374l != null ? c5374l : null;
            this.f15531l = 1;
            Object objBilling = AbstractC12754l.billing(c5374l2.amazon, this);
            Object obj2 = EnumC9342l.f19165l;
            if (objBilling != obj2) {
                objBilling = Unit.INSTANCE;
            }
            if (objBilling == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C7520l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7520l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
