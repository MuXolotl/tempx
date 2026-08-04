package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16501l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f32241l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32242l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32243l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16501l(int i, InterfaceC14029l interfaceC14029l, AbstractC13264l abstractC13264l) {
        super(2, interfaceC14029l);
        this.f32242l = i;
        this.f32241l = abstractC13264l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objBilling;
        Object objBilling2;
        int i = this.f32242l;
        AbstractC13264l abstractC13264l = this.f32241l;
        Object obj2 = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f32243l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32243l = 1;
                    C6157l c6157l = AbstractC10521l.yandex;
                    if (((C15308l) abstractC13264l.amazon.f32506l).admob() - 1 < 0 || (objBilling = abstractC13264l.billing(((C15308l) abstractC13264l.amazon.f32506l).admob() - 1, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this)) != obj2) {
                        objBilling = Unit.INSTANCE;
                    }
                    if (objBilling == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f32243l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32243l = 1;
                    C6157l c6157l2 = AbstractC10521l.yandex;
                    if (((C15308l) abstractC13264l.amazon.f32506l).admob() + 1 >= abstractC13264l.smaato() || (objBilling2 = abstractC13264l.billing(((C15308l) abstractC13264l.amazon.f32506l).admob() + 1, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this)) != obj2) {
                        objBilling2 = Unit.INSTANCE;
                    }
                    if (objBilling2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f32243l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32243l = 1;
                    C0071l c0071l = new C0071l(2, interfaceC14029l, 7);
                    abstractC13264l.getClass();
                    Object objAds = AbstractC13264l.ads(abstractC13264l, EnumC11011l.f22182l, c0071l, this);
                    if (objAds != obj2) {
                        objAds = Unit.INSTANCE;
                    }
                    if (objAds == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f32243l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32243l = 1;
                    if (abstractC13264l.billing(5, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i6 = this.f32243l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int iAdmob = ((C15308l) abstractC13264l.amazon.f32506l).admob() - 1;
                    this.f32243l = 1;
                    if (abstractC13264l.billing(iAdmob, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i7 = this.f32243l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int iAdmob2 = ((C15308l) abstractC13264l.amazon.f32506l).admob() + 1;
                    this.f32243l = 1;
                    if (abstractC13264l.billing(iAdmob2, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
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
        switch (this.f32242l) {
            case 0:
                return new C16501l(0, interfaceC14029l, this.f32241l);
            case 1:
                return new C16501l(1, interfaceC14029l, this.f32241l);
            case 2:
                return new C16501l(2, interfaceC14029l, this.f32241l);
            case 3:
                return new C16501l(3, interfaceC14029l, this.f32241l);
            case 4:
                return new C16501l(4, interfaceC14029l, this.f32241l);
            default:
                return new C16501l(5, interfaceC14029l, this.f32241l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32242l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C16501l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
