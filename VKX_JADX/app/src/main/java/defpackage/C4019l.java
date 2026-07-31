package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4019l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C8884l f8260l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8261l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f8262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4019l(C8884l c8884l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f8261l = i;
        this.f8260l = c8884l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f8261l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C8884l c8884l = this.f8260l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f8262l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13568l c13568lM1817l = ((C5501l) ((C3585l) AbstractC16584l.yandex().isPro.f7481l).f7511l).m1817l(new C10111l("/PaymentsService/BuildPaymentUrl", C15646l.f30583l, C14462l.f28329l, 19));
                    String str = ((C13386l) AbstractC16901l.m4231native(c8884l.f18255l.f34228l.f4281l)).f26282l;
                    String str2 = ((C0247l) c8884l.f18256l.getValue()).f1243l;
                    Long l = new Long(((C4964l) c8884l.f18250l.getValue()).yandex);
                    long jLongValue = l.longValue();
                    C16287l.yandex.getClass();
                    C15646l c15646l = new C15646l(str, str2, jLongValue != C16287l.crashlytics() ? l : null, new Integer(200), null, C3844l.f7950l);
                    this.f8262l = 1;
                    obj = c13568lM1817l.smaato(c15646l, this);
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
                String str3 = ((C14462l) obj).f28330l;
                int i3 = C8884l.f18248l;
                c8884l.f5081l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                return Unit.INSTANCE;
            default:
                int i4 = this.f8262l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lIsPro = AbstractC0622l.isPro(AbstractC0622l.subs(c8884l.f18252l, 300L));
                    C17949l c17949l = new C17949l(c8884l, interfaceC14029l, 29);
                    this.f8262l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lIsPro, c17949l, this) == enumC9342l) {
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
        int i = this.f8261l;
        C8884l c8884l = this.f8260l;
        switch (i) {
            case 0:
                return new C4019l(c8884l, interfaceC14029l, 0);
            default:
                return new C4019l(c8884l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f8261l) {
            case 0:
                break;
        }
        return ((C4019l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
