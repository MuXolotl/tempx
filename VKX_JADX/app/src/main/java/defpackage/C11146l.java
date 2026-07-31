package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11146l extends AbstractC17054l implements InterfaceC9014l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C1565l f22397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11146l(C1565l c1565l) {
        super(10);
        this.f22397l = c1565l;
    }

    @Override // defpackage.InterfaceC9014l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final void mo272l(Object obj) {
        Object obj2;
        EnumC18034l enumC18034l;
        ((C9426l) this.f33214l).m3885new(new C14845l(obj));
        C1565l c1565l = this.f22397l;
        EnumC18034l enumC18034l2 = EnumC18034l.f35322l;
        C11561l c11561l = c1565l.billing;
        do {
            obj2 = c11561l.yandex;
            EnumC18034l enumC18034l3 = (EnumC18034l) obj2;
            int iOrdinal = enumC18034l3.ordinal();
            if (iOrdinal == 0) {
                enumC18034l = EnumC18034l.f35319l;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + c1565l + "! State is " + enumC18034l3 + ' ');
                }
                enumC18034l = enumC18034l2;
            }
        } while (!c11561l.yandex(obj2, enumC18034l));
        Iterator it = c1565l.admob.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        if (enumC18034l == enumC18034l2) {
            Iterator it2 = c1565l.admob.iterator();
            if (it2.hasNext()) {
                throw AbstractC15560l.adcel(it2);
            }
        }
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC9814l
    public final void release() {
    }
}
