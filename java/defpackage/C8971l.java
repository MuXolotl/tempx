package defpackage;

import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٟۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8971l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f18506l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f18507l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18508l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C4456l f18509l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8971l(C4456l c4456l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18508l = i;
        this.f18507l = c4456l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C4456l c4456l;
        int i = this.f18508l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C4456l c4456l2 = this.f18507l;
        switch (i) {
            case 0:
                int i2 = this.f18506l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
                    this.f18509l = c4456l2;
                    this.f18506l = 1;
                    obj = AbstractC0622l.firebase(interfaceC6942lYandex, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c4456l2 = this.f18509l;
                    AbstractC2829l.crashlytics(obj);
                }
                c4456l2.f9067l.setValue(Boolean.valueOf(((C18554l) obj).f36218l));
                return Unit.INSTANCE;
            default:
                int i3 = this.f18506l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC13508l interfaceC13508l = c4456l2.f9075l;
                    this.f18509l = c4456l2;
                    this.f18506l = 1;
                    obj = interfaceC13508l.adcel(this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                    c4456l = c4456l2;
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c4456l = this.f18509l;
                    AbstractC2829l.crashlytics(obj);
                }
                c4456l.f9066l.subs(((Number) obj).longValue());
                c4456l2.f9072l.setValue(Formatter.formatFileSize(c4456l2.f5081l, c4456l2.f9066l.admob()));
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18508l;
        C4456l c4456l = this.f18507l;
        switch (i) {
            case 0:
                return new C8971l(c4456l, interfaceC14029l, 0);
            default:
                return new C8971l(c4456l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18508l) {
            case 0:
                break;
        }
        return ((C8971l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
