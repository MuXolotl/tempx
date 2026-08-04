package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lُۥؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11465l extends AbstractC18135l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC6942l f23052l;

    public AbstractC11465l(int i, int i2, InterfaceC12932l interfaceC12932l, InterfaceC6942l interfaceC6942l) {
        super(interfaceC12932l, i, i2);
        this.f23052l = interfaceC6942l;
    }

    @Override // defpackage.AbstractC18135l
    public final Object amazon(C12428l c12428l, InterfaceC14029l interfaceC14029l) {
        Object objIsPro = isPro(new C7173l(c12428l), interfaceC14029l);
        return objIsPro == EnumC9342l.f19165l ? objIsPro : Unit.INSTANCE;
    }

    public abstract Object isPro(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l);

    @Override // defpackage.AbstractC18135l
    public final String toString() {
        return this.f23052l + " -> " + super.toString();
    }

    @Override // defpackage.AbstractC18135l, defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        int i = this.f35448l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == -3) {
            InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l.metrica();
            Boolean bool = Boolean.FALSE;
            C8337l c8337l = new C8337l(29);
            InterfaceC12932l interfaceC12932l = this.f35449l;
            InterfaceC12932l interfaceC12932lMo246l = !((Boolean) interfaceC12932l.mo247l(bool, c8337l)).booleanValue() ? interfaceC12932lMetrica.mo246l(interfaceC12932l) : AbstractC14425l.loadAd(interfaceC12932lMetrica, interfaceC12932l, false);
            if (AbstractC8576l.yandex(interfaceC12932lMo246l, interfaceC12932lMetrica)) {
                Object objIsPro = isPro(interfaceC9427l, interfaceC14029l);
                return objIsPro == enumC9342l ? objIsPro : Unit.INSTANCE;
            }
            C6168l c6168l = C6168l.f13001l;
            if (AbstractC8576l.yandex(interfaceC12932lMo246l.mo245l(c6168l), interfaceC12932lMetrica.mo245l(c6168l))) {
                InterfaceC12932l interfaceC12932lMetrica2 = interfaceC14029l.metrica();
                if (!(interfaceC9427l instanceof C7173l) && !(interfaceC9427l instanceof C1077l)) {
                    interfaceC9427l = new C17354l(interfaceC9427l, interfaceC12932lMetrica2);
                }
                Object objMopub = AbstractC5712l.mopub(interfaceC12932lMo246l, interfaceC9427l, interfaceC12932lMo246l.mo247l(0, AbstractC7999l.loadAd), new C5163l(this, null, 28), interfaceC14029l);
                return objMopub == enumC9342l ? objMopub : Unit.INSTANCE;
            }
        }
        Object objYandex = super.yandex(interfaceC9427l, interfaceC14029l);
        return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
    }
}
