package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13955l implements InterfaceC7658l {
    public final String loadAd;
    public final boolean yandex;

    public C13955l(String str, boolean z) {
        this.yandex = z;
        this.loadAd = str;
    }

    public final String toString() {
        return this.yandex ? AbstractC15560l.Signature("only-of-type <", this.loadAd, ">") : "only-child";
    }

    @Override // defpackage.InterfaceC7658l
    public final boolean yandex(AbstractC12707l abstractC12707l) {
        int i;
        boolean z = this.yandex;
        String strVip = this.loadAd;
        if (z && strVip == null) {
            strVip = abstractC12707l.vip();
        }
        InterfaceC0308l interfaceC0308l = abstractC12707l.loadAd;
        if (interfaceC0308l != null) {
            Iterator it = interfaceC0308l.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC12707l abstractC12707l2 = (AbstractC12707l) ((AbstractC15046l) it.next());
                if (strVip == null || abstractC12707l2.vip().equals(strVip)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }
}
