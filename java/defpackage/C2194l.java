package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lّؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2194l implements InterfaceC7658l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final int loadAd;
    public final String purchase;
    public final int yandex;

    public C2194l(int i, int i2, boolean z, boolean z2, String str) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = str;
    }

    public final String toString() {
        String str = this.crashlytics ? "" : "last-";
        int i = this.loadAd;
        boolean z = this.amazon;
        int i2 = this.yandex;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.purchase) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // defpackage.InterfaceC7658l
    public final boolean yandex(AbstractC12707l abstractC12707l) {
        int i;
        int i2;
        boolean z = this.amazon;
        String strVip = this.purchase;
        if (z && strVip == null) {
            strVip = abstractC12707l.vip();
        }
        InterfaceC0308l interfaceC0308l = abstractC12707l.loadAd;
        if (interfaceC0308l != null) {
            Iterator it = interfaceC0308l.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                AbstractC12707l abstractC12707l2 = (AbstractC12707l) ((AbstractC15046l) it.next());
                if (abstractC12707l2 == abstractC12707l) {
                    i = i2;
                }
                if (strVip == null || abstractC12707l2.vip().equals(strVip)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.crashlytics ? i + 1 : i2 - i;
        int i4 = this.loadAd;
        int i5 = this.yandex;
        if (i5 == 0) {
            if (i3 == i4) {
                return true;
            }
            return false;
        }
        int i6 = i3 - i4;
        if (i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i5))) {
            return true;
        }
        return false;
    }
}
