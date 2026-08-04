package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14107l extends AbstractC5097l {
    public C14107l() {
        super(false, 3);
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(910969549);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                AbstractC18082l abstractC18082l = C7679l.f16101l;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(abstractC18082l, 10));
                Iterator<E> it = abstractC18082l.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14564l) it.next()).yandex));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).intValue() != R.drawable.vknext_logo) {
                        arrayList2.add(obj);
                    }
                }
                List listM4230l = AbstractC16901l.m4230l(arrayList2);
                Collections.shuffle(listM4230l);
                objM2132native = AbstractC16901l.m4232new(AbstractC16901l.m4218final(Integer.valueOf(R.drawable.ic_add_square_outline_28), AbstractC16901l.m4247try(listM4230l, 2)), AbstractC16901l.m4209break(2, listM4230l));
                c6956l.m2147try(objM2132native);
            }
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1921980264, new C2736l((List) objM2132native, this, 5), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 14);
        }
    }
}
