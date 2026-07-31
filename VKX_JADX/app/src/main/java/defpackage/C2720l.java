package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔٙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2720l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11383l f5910l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5911l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5912l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2720l(AbstractC11383l abstractC11383l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f5911l = i;
        this.f5910l = abstractC11383l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f5911l;
        AbstractC11383l abstractC11383l = this.f5910l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f5912l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    String str = (String) abstractC11383l.f22965l.getValue();
                    this.f5912l = 1;
                    if (AbstractC11383l.m3075break(abstractC11383l, str, this) == enumC9342l) {
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
                int i3 = this.f5912l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    String str2 = (String) abstractC11383l.f22965l.getValue();
                    this.f5912l = 1;
                    if (AbstractC11383l.m3075break(abstractC11383l, str2, this) == enumC9342l) {
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
        int i = this.f5911l;
        AbstractC11383l abstractC11383l = this.f5910l;
        switch (i) {
            case 0:
                return new C2720l(abstractC11383l, interfaceC14029l, 0);
            default:
                return new C2720l(abstractC11383l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f5911l) {
            case 0:
                break;
        }
        return ((C2720l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
