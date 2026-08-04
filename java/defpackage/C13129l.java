package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13129l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f25675l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17408l f25676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13129l(C17408l c17408l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25676l = c17408l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f25675l;
        InterfaceC14029l interfaceC14029l = null;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C1424l c1424l = VKXApplication.f36627l;
            if (c1424l == null) {
                c1424l = null;
            }
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) c1424l.f3602l;
            EnumC14810l enumC14810l = EnumC14810l.DARK;
            this.f25675l = 1;
            Object objLoadAd = interfaceC15829l.loadAd(new C4781l(enumC14810l, interfaceC14029l, 9), this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        this.f25676l.m4324finally(false);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C13129l(this.f25676l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13129l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
