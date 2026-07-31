package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14847l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f29073l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC1814l f29074l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ List f29075l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29076l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Throwable f29077l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Throwable f29078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14847l(int i, InterfaceC14029l interfaceC14029l, List list) {
        super(3, interfaceC14029l);
        this.f29076l = i;
        this.f29075l = list;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f29076l;
        List list = this.f29075l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                InterfaceC1814l interfaceC1814l = this.f29074l;
                Throwable th = this.f29077l;
                int i2 = this.f29073l;
                if (i2 != 0) {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = this.f29078l;
                    AbstractC2829l.crashlytics(obj);
                    return th2;
                }
                AbstractC2829l.crashlytics(obj);
                Throwable thPurchase = AbstractC15852l.purchase(th);
                this.f29074l = null;
                this.f29077l = null;
                this.f29078l = thPurchase;
                this.f29073l = 1;
                return AbstractC8486l.yandex(list, thPurchase, interfaceC1814l, this) == enumC9342l ? enumC9342l : thPurchase;
            default:
                InterfaceC1814l interfaceC1814l2 = this.f29074l;
                Throwable th3 = this.f29077l;
                int i3 = this.f29073l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th4 = this.f29078l;
                    AbstractC2829l.crashlytics(obj);
                    return th4;
                }
                AbstractC2829l.crashlytics(obj);
                Throwable thPurchase2 = AbstractC15852l.purchase(th3);
                this.f29074l = null;
                this.f29077l = null;
                this.f29078l = thPurchase2;
                this.f29073l = 1;
                return AbstractC8486l.yandex(list, thPurchase2, interfaceC1814l2, this) == enumC9342l ? enumC9342l : thPurchase2;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f29076l;
        List list = this.f29075l;
        InterfaceC1814l interfaceC1814l = (InterfaceC1814l) obj;
        Throwable th = (Throwable) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (i) {
            case 0:
                C14847l c14847l = new C14847l(0, interfaceC14029l, list);
                c14847l.f29074l = interfaceC1814l;
                c14847l.f29077l = th;
                return c14847l.Signature(Unit.INSTANCE);
            default:
                C14847l c14847l2 = new C14847l(1, interfaceC14029l, list);
                c14847l2.f29074l = interfaceC1814l;
                c14847l2.f29077l = th;
                return c14847l2.Signature(Unit.INSTANCE);
        }
    }
}
