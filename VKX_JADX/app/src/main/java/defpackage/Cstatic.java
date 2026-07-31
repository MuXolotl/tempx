package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: static, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cstatic {
    public final Object amazon;
    public int crashlytics;
    public final int loadAd;
    public Serializable purchase;
    public final int yandex;

    public Cstatic(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.amazon = str;
        this.yandex = i2;
        this.loadAd = i3;
        this.crashlytics = RecyclerView.UNDEFINED_DURATION;
        this.purchase = "";
    }

    public void amazon() {
        if (this.crashlytics != Integer.MIN_VALUE) {
            return;
        }
        C8339l.smaato("generateNewId() must be called before retrieving ids.");
    }

    public C10411l crashlytics(int i, int i2) throws IOException {
        appmetrica appmetricaVarPurchase = purchase();
        int i3 = appmetricaVarPurchase.f489l;
        if (i3 == 1) {
            return new C10411l(3, i, i2, appmetricaVarPurchase.smaato(0));
        }
        C16472l c16472l = AbstractC1296l.yandex;
        return new C10411l(4, i, i2, i3 < 1 ? AbstractC1296l.yandex : new C16472l(appmetricaVarPurchase));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public applovin loadAd(int i) throws IOException {
        AbstractC10410l abstractC10410l = (AbstractC10410l) this.amazon;
        int i2 = this.crashlytics;
        int i3 = this.loadAd;
        if (i3 == i2) {
            C18262l.metrica(AbstractC15560l.tapsense("maximum nested construction level reached - increase org.bouncycastle.asn1.max_cons_depth (currently ", i2, ")"));
            return null;
        }
        byte b = 0;
        byte b2 = 0;
        if (abstractC10410l instanceof C18147l) {
            C18147l c18147l = (C18147l) abstractC10410l;
            c18147l.f35515l = false;
            c18147l.billing();
        }
        int iIsVip = Csynchronized.isVip(abstractC10410l, i);
        int i4 = 1;
        int i5 = 4;
        int i6 = 3;
        boolean z = iIsVip == 3 || iIsVip == 4 || iIsVip == 16 || iIsVip == 17 || iIsVip == 8;
        int i7 = this.yandex;
        int iAdcel = Csynchronized.adcel(abstractC10410l, i7, z);
        if (iAdcel < 0) {
            if ((i & 32) == 0) {
                C18262l.metrica("indefinite-length primitive encoding encountered");
                return null;
            }
            Cstatic cstatic = new Cstatic(new C18147l(abstractC10410l, i7), this.yandex, (byte[][]) this.purchase, i3 + 1, this.crashlytics);
            int i8 = i & 192;
            if (i8 != 0) {
                return new C17312l(i8, iIsVip, cstatic);
            }
            if (iIsVip == 3) {
                return new C3027l(cstatic);
            }
            if (iIsVip == 4) {
                return new C16273l(cstatic);
            }
            if (iIsVip == 8) {
                return new C2138l(cstatic);
            }
            if (iIsVip == 16) {
                C2138l c2138l = new C2138l(b2 == true ? 1 : 0);
                c2138l.f4778l = cstatic;
                return c2138l;
            }
            if (iIsVip != 17) {
                C3010l.firebase(Integer.toHexString(iIsVip), "unknown BER object encountered: 0x");
                return null;
            }
            C2138l c2138l2 = new C2138l(i4);
            c2138l2.f4778l = cstatic;
            return c2138l2;
        }
        C9774l c9774l = new C9774l(abstractC10410l, iAdcel, i7);
        if ((i & 224) == 0) {
            if (iIsVip == 3) {
                return new C1140l(c9774l);
            }
            if (iIsVip == 4) {
                C16273l c16273l = new C16273l();
                c16273l.f31844l = c9774l;
                return c16273l;
            }
            if (iIsVip == 8) {
                throw new Cthrows("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iIsVip == 16) {
                throw new Cthrows("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iIsVip == 17) {
                throw new Cthrows("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return Csynchronized.billing(iIsVip, c9774l, (byte[][]) this.purchase);
            } catch (IllegalArgumentException e) {
                throw new Cthrows("corrupted stream detected", e, b == true ? 1 : 0);
            }
        }
        Cstatic cstatic2 = new Cstatic(c9774l, c9774l.f21226l, (byte[][]) this.purchase, i3 + 1, this.crashlytics);
        int i9 = i & 192;
        if (i9 != 0) {
            return new C7576l(i9, iIsVip, (i & 32) != 0, cstatic2);
        }
        if (iIsVip == 3) {
            return new C3027l(cstatic2);
        }
        if (iIsVip == 4) {
            return new C16273l(cstatic2);
        }
        if (iIsVip == 8) {
            return new C2138l(cstatic2);
        }
        if (iIsVip == 16) {
            C2138l c2138l3 = new C2138l(i6);
            c2138l3.f4778l = cstatic2;
            return c2138l3;
        }
        if (iIsVip != 17) {
            C3010l.firebase(Integer.toHexString(iIsVip), "unknown DL object encountered: 0x");
            return null;
        }
        C2138l c2138l4 = new C2138l(i5);
        c2138l4.f4778l = cstatic2;
        return c2138l4;
    }

    public appmetrica purchase() throws IOException {
        AbstractC10410l abstractC10410l = (AbstractC10410l) this.amazon;
        int i = abstractC10410l.read();
        if (i < 0) {
            return new appmetrica(0, 0);
        }
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        do {
            applovin applovinVarLoadAd = loadAd(i);
            appmetricaVar.purchase(applovinVarLoadAd instanceof InterfaceC12254l ? ((InterfaceC12254l) applovinVarLoadAd).smaato() : applovinVarLoadAd.billing());
            i = abstractC10410l.read();
        } while (i >= 0);
        return appmetricaVar;
    }

    public void yandex() {
        int i = this.crashlytics;
        this.crashlytics = i == Integer.MIN_VALUE ? this.yandex : i + this.loadAd;
        this.purchase = ((String) this.amazon) + this.crashlytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cstatic(AbstractC10410l abstractC10410l, int i, byte[][] bArr, int i2, int i3) {
        this.amazon = abstractC10410l;
        this.yandex = i;
        this.purchase = bArr;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public Cstatic(int i, int i2) {
        this(RecyclerView.UNDEFINED_DURATION, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cstatic(C18147l c18147l, int i, byte[][] bArr) {
        this.amazon = c18147l;
        this.yandex = i;
        this.purchase = bArr;
        this.loadAd = 0;
        this.crashlytics = AbstractC8151l.yandex(32, "org.bouncycastle.asn1.max_cons_depth");
    }
}
