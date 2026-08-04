package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1274l extends AbstractC18135l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f3304l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f3305l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1274l(Object obj, InterfaceC12932l interfaceC12932l, int i, int i2, int i3) {
        super(interfaceC12932l, i, i2);
        this.f3305l = i3;
        this.f3304l = obj;
    }

    @Override // defpackage.AbstractC18135l
    public Object amazon(C12428l c12428l, InterfaceC14029l interfaceC14029l) {
        int i = this.f3305l;
        Object obj = this.f3304l;
        switch (i) {
            case 0:
                Object objInvoke = ((Function2) obj).invoke(c12428l, interfaceC14029l);
                return objInvoke == EnumC9342l.f19165l ? objInvoke : Unit.INSTANCE;
            default:
                C7173l c7173l = new C7173l(c12428l);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    AbstractC10999l.mopub(c12428l, null, 0, new C5163l((InterfaceC6942l) it.next(), c7173l, null, 29), 3);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC18135l
    public AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2) {
        int i3 = this.f3305l;
        Object obj = this.f3304l;
        switch (i3) {
            case 0:
                return new C1274l((Function2) obj, interfaceC12932l, i, i2, 0);
            default:
                return new C1274l((Iterable) obj, interfaceC12932l, i, i2, 1);
        }
    }

    @Override // defpackage.AbstractC18135l
    public InterfaceC14592l subs(InterfaceC2262l interfaceC2262l) {
        switch (this.f3305l) {
            case 1:
                Function2 c5163l = new C5163l(this, null, 27);
                C12428l c12428l = new C12428l(AbstractC14425l.smaato(interfaceC2262l, this.f35449l), AbstractC12098l.yandex(this.f35448l, 1, null, 4));
                c12428l.m3751l(1, c12428l, c5163l);
                return c12428l;
            default:
                return super.subs(interfaceC2262l);
        }
    }

    @Override // defpackage.AbstractC18135l
    public String toString() {
        switch (this.f3305l) {
            case 0:
                return "block[" + ((Function2) this.f3304l) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
