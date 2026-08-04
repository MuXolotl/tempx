package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18630l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f36402l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36403l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36404l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18630l(AbstractC13264l abstractC13264l, int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f36404l = i2;
        this.f36402l = abstractC13264l;
        this.f36403l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f36404l;
        int i2 = this.f36403l;
        AbstractC13264l abstractC13264l = this.f36402l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i3 = this.f36405l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f36405l = 1;
                    if (abstractC13264l.subs(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                abstractC13264l.subscription(0.0f, abstractC13264l.isPro(i2), true);
                return Unit.INSTANCE;
            default:
                int i4 = this.f36405l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f36405l = 1;
                    if (abstractC13264l.billing(i2, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this) == enumC9342l) {
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
        switch (this.f36404l) {
            case 0:
                return new C18630l(this.f36402l, this.f36403l, interfaceC14029l, 0);
            default:
                return new C18630l(this.f36402l, this.f36403l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36404l) {
            case 0:
                return ((C18630l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C18630l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
