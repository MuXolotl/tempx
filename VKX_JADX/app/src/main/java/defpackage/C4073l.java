package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4073l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f8371l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ EnumC11447l f8372l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4073l(EnumC11447l enumC11447l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f8372l = enumC11447l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f8371l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            VKXApplication vKXApplication = VKXApplication.f36631l;
            VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
            this.f8371l = 1;
            Object objAmazon = C1602l.amazon(vKXApplication2, this.f8372l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
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
        return new C4073l(this.f8372l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4073l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
