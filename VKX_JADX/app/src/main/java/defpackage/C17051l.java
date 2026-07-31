package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17051l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5172l f33210l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33211l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33212l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17051l(C5172l c5172l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33211l = i;
        this.f33210l = c5172l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f33211l;
        C5172l c5172l = this.f33210l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f33212l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    InterfaceC7042l interfaceC7042l = c5172l.yandex;
                    this.f33212l = 1;
                    if (AbstractC11174l.amazon(interfaceC7042l, this) == enumC9342l) {
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
                int i3 = this.f33212l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C17051l c17051l = new C17051l(c5172l, interfaceC14029l, 0);
                this.f33212l = 1;
                Object objAdmob = AbstractC15342l.admob(3000L, c17051l, this);
                return objAdmob == enumC9342l ? enumC9342l : objAdmob;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f33211l;
        C5172l c5172l = this.f33210l;
        switch (i) {
            case 0:
                return new C17051l(c5172l, interfaceC14029l, 0);
            default:
                return new C17051l(c5172l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f33211l) {
            case 0:
                break;
        }
        return ((C17051l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
