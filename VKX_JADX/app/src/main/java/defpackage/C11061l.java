package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11061l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22262l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22263l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f22264l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5835l f22265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11061l(C5835l c5835l, int i, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22265l = c5835l;
        this.f22262l = i;
        this.f22263l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22264l;
        if (i != 0) {
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        int i2 = this.f22262l;
        int i3 = this.f22263l;
        C5835l c5835l = this.f22265l;
        C9820l c9820l = new C9820l(c5835l, i2, i3, null);
        this.f22264l = 1;
        Object objYandex = C5835l.yandex(c5835l, c9820l, this);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objYandex == enumC9342l ? enumC9342l : objYandex;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C11061l(this.f22265l, this.f22262l, this.f22263l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11061l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
