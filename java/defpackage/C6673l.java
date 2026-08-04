package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lؙۖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6673l {
    public int amazon;
    public int crashlytics;
    public long loadAd;
    public int purchase;
    public int yandex;
    public final int[] billing = new int[255];
    public final C13143l mopub = new C13143l(255);

    public final boolean loadAd(InterfaceC10430l interfaceC10430l, long j) {
        boolean zBilling;
        AbstractC12442l.admob(interfaceC10430l.getPosition() == interfaceC10430l.mopub());
        C13143l c13143l = this.mopub;
        c13143l.m3563native(4);
        while (true) {
            if (j != -1 && interfaceC10430l.getPosition() + 4 >= j) {
                break;
            }
            try {
                zBilling = interfaceC10430l.billing(c13143l.yandex, 0, 4, true);
            } catch (EOFException unused) {
                zBilling = false;
            }
            if (!zBilling) {
                break;
            }
            c13143l.m3562for(0);
            if (c13143l.applovin() == 1332176723) {
                interfaceC10430l.smaato();
                return true;
            }
            interfaceC10430l.remoteconfig(1);
        }
        do {
            if (j != -1 && interfaceC10430l.getPosition() >= j) {
                break;
            }
        } while (interfaceC10430l.subs(1) != -1);
        return false;
    }

    public final boolean yandex(InterfaceC10430l interfaceC10430l, boolean z) throws C17655l, EOFException {
        boolean zBilling;
        boolean zBilling2;
        this.yandex = 0;
        this.loadAd = 0L;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = 0;
        C13143l c13143l = this.mopub;
        c13143l.m3563native(27);
        try {
            zBilling = interfaceC10430l.billing(c13143l.yandex, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zBilling = false;
        }
        if (zBilling && c13143l.applovin() == 1332176723) {
            if (c13143l.signatures() == 0) {
                this.yandex = c13143l.signatures();
                this.loadAd = c13143l.startapp();
                c13143l.ads();
                c13143l.ads();
                c13143l.ads();
                int iSignatures = c13143l.signatures();
                this.crashlytics = iSignatures;
                this.amazon = iSignatures + 27;
                c13143l.m3563native(iSignatures);
                try {
                    zBilling2 = interfaceC10430l.billing(c13143l.yandex, 0, this.crashlytics, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zBilling2 = false;
                }
                if (zBilling2) {
                    for (int i = 0; i < this.crashlytics; i++) {
                        int iSignatures2 = c13143l.signatures();
                        this.billing[i] = iSignatures2;
                        this.purchase += iSignatures2;
                    }
                    return true;
                }
            } else if (!z) {
                throw C17655l.crashlytics("unsupported bit stream revision");
            }
        }
        return false;
    }
}
