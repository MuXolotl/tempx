package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗۛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5165l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10581l f11217l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11218l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f11219l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5165l(AbstractC10581l abstractC10581l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11218l = i;
        this.f11217l = abstractC10581l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11218l;
        AbstractC10581l abstractC10581l = this.f11217l;
        Object obj2 = this.f11219l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                abstractC10581l.f21495l.setValue(((C1725l) obj2).yandex.loadAd);
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                abstractC10581l.f21496l.setValue(((C11134l) obj2).yandex);
                break;
            case 2:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                abstractC10581l.f21497l.setValue(c14759l.yandex);
                abstractC10581l.f21493l.setValue(Boolean.valueOf(c14759l.loadAd));
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                abstractC10581l.f21494l.setValue(((C5075l) obj2).yandex);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f11218l;
        AbstractC10581l abstractC10581l = this.f11217l;
        switch (i) {
            case 0:
                C5165l c5165l = new C5165l(abstractC10581l, interfaceC14029l, 0);
                c5165l.f11219l = obj;
                return c5165l;
            case 1:
                C5165l c5165l2 = new C5165l(abstractC10581l, interfaceC14029l, 1);
                c5165l2.f11219l = obj;
                return c5165l2;
            case 2:
                C5165l c5165l3 = new C5165l(abstractC10581l, interfaceC14029l, 2);
                c5165l3.f11219l = obj;
                return c5165l3;
            default:
                C5165l c5165l4 = new C5165l(abstractC10581l, interfaceC14029l, 3);
                c5165l4.f11219l = obj;
                return c5165l4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11218l) {
            case 0:
                return ((C5165l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C5165l) ads((InterfaceC14029l) obj2, (C11134l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C5165l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C5165l) ads((InterfaceC14029l) obj2, (C5075l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
