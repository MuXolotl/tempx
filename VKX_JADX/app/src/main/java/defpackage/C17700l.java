package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17700l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1682l f34483l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34484l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34485l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17700l(C1682l c1682l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34484l = i;
        this.f34483l = c1682l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f34484l;
        C1682l c1682l = this.f34483l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f34485l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3604l;
                    this.f34485l = 1;
                    if (interfaceC15829l.loadAd(new C1727l(c1682l, interfaceC14029l, 0), this) == enumC9342l) {
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
            case 1:
                int i4 = this.f34485l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3604l;
                    this.f34485l = 1;
                    if (interfaceC15829l2.loadAd(new C1727l(c1682l, interfaceC14029l, i2), this) == enumC9342l) {
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
            case 2:
                int i5 = this.f34485l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l3 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3604l;
                    String str = c1682l.f4048l;
                    this.f34485l = 1;
                    if (interfaceC15829l3.loadAd(new C0588l(str, null, 1), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i6 = this.f34485l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l4 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3604l;
                    String str2 = c1682l.f4048l;
                    this.f34485l = 1;
                    if (interfaceC15829l4.loadAd(new C0588l(str2, null, 1), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
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
        switch (this.f34484l) {
            case 0:
                return new C17700l(this.f34483l, interfaceC14029l, 0);
            case 1:
                return new C17700l(this.f34483l, interfaceC14029l, 1);
            case 2:
                return new C17700l(this.f34483l, interfaceC14029l, 2);
            default:
                return new C17700l(this.f34483l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34484l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C17700l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
