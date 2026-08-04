package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؙٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6530l extends AbstractC4317l {
    public C6530l(AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2, int i) {
        super(abstractC15211l, abstractC15211l2);
        InterfaceC17975l.yandex.loadAd(abstractC15211l, abstractC15211l2);
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public static final ArrayList m2019l(C10822l c10822l, AbstractC18041l abstractC18041l) throws IOException {
        List<AbstractC4946l> listInmobi = abstractC18041l.inmobi();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listInmobi, 10));
        for (AbstractC4946l abstractC4946l : listInmobi) {
            StringBuilder sb = new StringBuilder();
            AbstractC16901l.m4216else(Collections.singletonList(abstractC4946l), sb, ", ", null, null, new C14474l(c10822l, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public static final String m2020l(String str, String str2) {
        if (!AbstractC12024l.inmobi(str, '<')) {
            return str;
        }
        return AbstractC12024l.m3351while(str, '<') + '<' + str2 + '>' + AbstractC12024l.m3348transient('>', str, str);
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: abstract */
    public final AbstractC14318l mo686abstract(C16017l c16017l) {
        return new C6530l(this.f8857l.mo686abstract(c16017l), this.f8856l.mo686abstract(c16017l), 0);
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo1else(C14945l c14945l) {
        return new C6530l(this.f8857l, this.f8856l);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return new C6530l(this.f8857l, this.f8856l);
    }

    @Override // defpackage.AbstractC4317l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo687implements() {
        return this.f8857l;
    }

    @Override // defpackage.AbstractC4317l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final String mo688l(C10822l c10822l, C10822l c10822l2) throws IOException {
        AbstractC15211l abstractC15211l = this.f8857l;
        String strM2996interface = c10822l.m2996interface(abstractC15211l);
        AbstractC15211l abstractC15211l2 = this.f8856l;
        String strM2996interface2 = c10822l.m2996interface(abstractC15211l2);
        if (c10822l2.yandex.vip()) {
            return "raw (" + strM2996interface + ".." + strM2996interface2 + ')';
        }
        if (abstractC15211l2.inmobi().isEmpty()) {
            return c10822l.inmobi(strM2996interface, strM2996interface2, AbstractC12300l.billing(this));
        }
        ArrayList arrayListM2019l = m2019l(c10822l, abstractC15211l);
        ArrayList arrayListM2019l2 = m2019l(c10822l, abstractC15211l2);
        String strM4210case = AbstractC16901l.m4210case(arrayListM2019l, ", ", null, null, C1490l.f3714l, 30);
        ArrayList arrayListM4226l = AbstractC16901l.m4226l(arrayListM2019l2, arrayListM2019l);
        if (!arrayListM4226l.isEmpty()) {
            Iterator it = arrayListM4226l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM2996interface2 = m2020l(strM2996interface2, strM4210case);
                    break;
                }
                C8195l c8195l = (C8195l) it.next();
                String str = (String) c8195l.f17098l;
                String str2 = (String) c8195l.f17097l;
                if (!AbstractC8576l.yandex(str, AbstractC12024l.m3334new(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strM2996interface2 = m2020l(strM2996interface2, strM4210case);
            break;
        }
        String strM2020l = m2020l(strM2996interface, strM4210case);
        return strM2020l.equals(strM2996interface2) ? strM2020l : c10822l.inmobi(strM2020l, strM2996interface2, AbstractC12300l.billing(this));
    }

    @Override // defpackage.AbstractC4317l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        InterfaceC15234l interfaceC15234lPro = mo1339native().pro();
        InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
        if (interfaceC17477l != null) {
            return interfaceC17477l.mo2889instanceof(new C11720l());
        }
        C11983l.advert(mo1339native().pro(), "Incorrect classifier: ");
        return null;
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: static */
    public final AbstractC14318l mo8static(boolean z) {
        return new C6530l(this.f8857l.mo8static(z), this.f8856l.mo8static(z), 0);
    }
}
