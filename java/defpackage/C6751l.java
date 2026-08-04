package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6751l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0358l f14152l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f14153l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14154l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6751l(C0358l c0358l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f14153l = i;
        this.f14152l = c0358l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f14153l;
        C0358l c0358l = this.f14152l;
        Object obj2 = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f14154l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f14154l = 1;
                    Object objBilling = AbstractC0622l.billing(new C13375l(c0358l.purchase, true), new C6751l(c0358l, interfaceC14029l, i2), this);
                    if (objBilling != obj2) {
                        objBilling = Unit.INSTANCE;
                    }
                    if (objBilling == obj2) {
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
            default:
                int i4 = this.f14154l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f14154l = 1;
                    if (AbstractC8532l.purchase(1500L, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c0358l.loadAd.premium(-1);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f14153l) {
            case 0:
                return new C6751l(this.f14152l, interfaceC14029l, 0);
            default:
                return new C6751l(this.f14152l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14153l) {
            case 0:
                return ((C6751l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C6751l) ads((InterfaceC14029l) obj2, (Unit) obj)).Signature(Unit.INSTANCE);
        }
    }
}
