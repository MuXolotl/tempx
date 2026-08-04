package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9243l extends AbstractC11726l implements InterfaceC2224l, InterfaceC13199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f19006l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC16902l f19007l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f19008l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public volatile List f19009l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9243l(InterfaceC0965l interfaceC0965l, InterfaceC16902l interfaceC16902l, C6702l c6702l) {
        int i;
        String strLoadAd = interfaceC16902l.getName().loadAd();
        int iInmobi = AbstractC5020l.inmobi(interfaceC16902l.mo2182l());
        if (iInmobi != 0) {
            i = 2;
            if (iInmobi != 1) {
                if (iInmobi != 2) {
                    C18725l.billing();
                    throw null;
                }
                i = 3;
            }
        } else {
            i = 1;
        }
        interfaceC16902l.mo2180extends();
        this(interfaceC16902l, interfaceC0965l, strLoadAd, i);
        List upperBounds = interfaceC16902l.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            C5380l c5380l = new C5380l((AbstractC18041l) it.next());
            C6702l c6702l2 = C6702l.loadAd;
            InterfaceC13012l interfaceC13012l = c6702l.yandex(1, c5380l).loadAd;
            if (interfaceC13012l == null) {
                AbstractC4769l.billing(interfaceC0965l);
                throw null;
            }
            arrayList.add(interfaceC13012l);
        }
        this.f19009l = arrayList;
    }

    @Override // defpackage.AbstractC11726l
    public final int amazon() {
        return this.f19008l;
    }

    @Override // defpackage.AbstractC11726l
    public final String crashlytics() {
        return this.f19006l;
    }

    @Override // defpackage.AbstractC11726l
    public final List getUpperBounds() {
        List list = this.f19009l;
        if (list != null) {
            return list;
        }
        return null;
    }

    public C9243l(InterfaceC16902l interfaceC16902l, InterfaceC0965l interfaceC0965l, String str, int i) {
        super(interfaceC0965l);
        this.f19006l = str;
        this.f19008l = i;
        this.f19007l = interfaceC16902l;
    }

    public C9243l(InterfaceC0965l interfaceC0965l, InterfaceC16902l interfaceC16902l) {
        this(interfaceC0965l, interfaceC16902l, C6702l.loadAd);
    }
}
