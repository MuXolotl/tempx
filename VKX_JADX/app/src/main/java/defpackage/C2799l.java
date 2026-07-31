package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔٞۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2799l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2072l f6092l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f6093l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f6094l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2799l(C2072l c2072l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f6093l = i;
        this.f6092l = c2072l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f6093l;
        C2072l c2072l = this.f6092l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f6094l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = c2072l.loadAd.yandex();
                    C13483l c13483l = new C13483l(i2, c2072l.crashlytics);
                    this.f6094l = 1;
                    if (interfaceC6942lYandex.yandex(c13483l, this) == enumC9342l) {
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
            default:
                int i4 = this.f6094l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC6942l interfaceC6942lYandex2 = c2072l.loadAd.yandex();
                this.f6094l = 1;
                Object objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex2, this);
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f6093l;
        C2072l c2072l = this.f6092l;
        switch (i) {
            case 0:
                return new C2799l(c2072l, interfaceC14029l, 0);
            default:
                return new C2799l(c2072l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f6093l) {
            case 0:
                break;
        }
        return ((C2799l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
