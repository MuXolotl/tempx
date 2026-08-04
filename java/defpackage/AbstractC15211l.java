package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15211l extends AbstractC14318l implements InterfaceC6913l, InterfaceC6440l {
    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: implements, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC15211l mo8static(boolean z);

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: lؔٙؕ, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC15211l mo686abstract(C16017l c16017l);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C10822l.purchase.pro((InterfaceC1910l) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo1339native());
        if (!inmobi().isEmpty()) {
            AbstractC16901l.m4216else(inmobi(), sb, ", ", "<", ">", null, 112);
        }
        if (mo1342throw()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
