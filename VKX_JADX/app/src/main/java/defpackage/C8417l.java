package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: lًۦۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8417l implements InterfaceC1029l {
    public static final C8309l billing;
    public int amazon;
    public final C10111l crashlytics;
    public final InterfaceC17673l loadAd;
    public final C3253l purchase;
    public final C11610l yandex;

    static {
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            C8339l.metrica("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                C8339l.metrica("Headers cannot be null");
                return;
            }
            strArr2[i2] = AbstractC12024l.m3330l(strArr[i2]).toString();
        }
        int iAmazon = AbstractC17764l.amazon(0, strArr2.length - 1, 2);
        if (iAmazon >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                AbstractC12081l.crashlytics(str);
                AbstractC12081l.amazon(str2, str);
                if (i == iAmazon) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        billing = new C8309l(strArr2);
    }

    public C8417l(C11610l c11610l, InterfaceC17673l interfaceC17673l, C10111l c10111l) {
        this.yandex = c11610l;
        this.loadAd = interfaceC17673l;
        this.crashlytics = c10111l;
        this.purchase = new C3253l((C1503l) c10111l.f20586l);
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC10506l admob(C17032l c17032l, long j) throws ProtocolException {
        AbstractC10033l abstractC10033l = c17032l.amazon;
        if (abstractC10033l != null && abstractC10033l.purchase()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c17032l.crashlytics.amazon("Transfer-Encoding"))) {
            if (this.amazon == 1) {
                this.amazon = 2;
                return new C1069l(this);
            }
            C11983l.tapsense(this.amazon, "state: ");
            return null;
        }
        if (j == -1) {
            C8339l.smaato("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.amazon == 1) {
            this.amazon = 2;
            return new C2781l(this);
        }
        C11983l.tapsense(this.amazon, "state: ");
        return null;
    }

    @Override // defpackage.InterfaceC1029l
    public final long amazon(C18389l c18389l) {
        if (!AbstractC0548l.yandex(c18389l)) {
            return 0L;
        }
        String strAmazon = c18389l.f35918l.amazon("Transfer-Encoding");
        if (strAmazon == null) {
            strAmazon = null;
        }
        if ("chunked".equalsIgnoreCase(strAmazon)) {
            return -1L;
        }
        return AbstractC11432l.purchase(c18389l);
    }

    @Override // defpackage.InterfaceC1029l
    public final void billing() {
        ((C7167l) this.crashlytics.f20589l).flush();
    }

    @Override // defpackage.InterfaceC1029l
    public final void cancel() {
        this.loadAd.cancel();
    }

    @Override // defpackage.InterfaceC1029l
    public final boolean crashlytics() {
        return this.amazon == 6;
    }

    public final C0789l firebase(C6705l c6705l, long j) {
        if (this.amazon == 4) {
            this.amazon = 5;
            return new C0789l(this, c6705l, j);
        }
        C11983l.tapsense(this.amazon, "state: ");
        return null;
    }

    @Override // defpackage.InterfaceC1029l
    public final void isPro(C17032l c17032l) {
        Proxy.Type type = this.loadAd.admob().loadAd.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c17032l.loadAd);
        sb.append(' ');
        C6705l c6705l = c17032l.yandex;
        if (AbstractC8576l.yandex(c6705l.yandex, "https") || type != Proxy.Type.HTTP) {
            String strLoadAd = c6705l.loadAd();
            String strAmazon = c6705l.amazon();
            if (strAmazon != null) {
                strLoadAd = AbstractC11043l.admob('?', strLoadAd, strAmazon);
            }
            sb.append(strLoadAd);
        } else {
            sb.append(c6705l);
        }
        sb.append(" HTTP/1.1");
        smaato(c17032l.crashlytics, sb.toString());
    }

    @Override // defpackage.InterfaceC1029l
    public final void loadAd() {
        ((C7167l) this.crashlytics.f20589l).flush();
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC1361l mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC1029l
    public final C10049l purchase(boolean z) {
        C3253l c3253l = this.purchase;
        int i = this.amazon;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            C11983l.tapsense(this.amazon, "state: ");
            return null;
        }
        try {
            String strMo724new = ((InterfaceC9473l) c3253l.f6947l).mo724new(c3253l.f6948l);
            c3253l.f6948l -= (long) strMo724new.length();
            C13698l c13698lBilling = AbstractC5832l.billing(strMo724new);
            int i2 = c13698lBilling.f26744l;
            C10049l c10049l = new C10049l();
            c10049l.loadAd = (EnumC9199l) c13698lBilling.f26743l;
            c10049l.crashlytics = i2;
            c10049l.amazon = (String) c13698lBilling.f26746l;
            c10049l.billing = c3253l.isVip().mopub();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.amazon = 3;
                return c10049l;
            }
            if (102 > i2 || i2 >= 200) {
                this.amazon = 4;
                return c10049l;
            }
            this.amazon = 3;
            return c10049l;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.loadAd.admob().yandex.admob.mopub()), e);
        }
    }

    public final void smaato(C8309l c8309l, String str) {
        if (this.amazon != 0) {
            C11983l.tapsense(this.amazon, "state: ");
            return;
        }
        C10111l c10111l = this.crashlytics;
        C7167l c7167l = (C7167l) c10111l.f20589l;
        c7167l.mo706finally(str);
        c7167l.mo706finally("\r\n");
        int size = c8309l.size();
        for (int i = 0; i < size; i++) {
            C7167l c7167l2 = (C7167l) c10111l.f20589l;
            c7167l2.mo706finally(c8309l.billing(i));
            c7167l2.mo706finally(": ");
            c7167l2.mo706finally(c8309l.firebase(i));
            c7167l2.mo706finally("\r\n");
        }
        ((C7167l) c10111l.f20589l).mo706finally("\r\n");
        this.amazon = 1;
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC17673l subs() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC1029l
    public final InterfaceC14991l yandex(C18389l c18389l) {
        C17032l c17032l = c18389l.f35911l;
        if (!AbstractC0548l.yandex(c18389l)) {
            return firebase(c17032l.yandex, 0L);
        }
        String strAmazon = c18389l.f35918l.amazon("Transfer-Encoding");
        if (strAmazon == null) {
            strAmazon = null;
        }
        if ("chunked".equalsIgnoreCase(strAmazon)) {
            C6705l c6705l = c17032l.yandex;
            if (this.amazon == 4) {
                this.amazon = 5;
                return new C13495l(this, c6705l);
            }
            C11983l.tapsense(this.amazon, "state: ");
            return null;
        }
        long jPurchase = AbstractC11432l.purchase(c18389l);
        if (jPurchase != -1) {
            return firebase(c17032l.yandex, jPurchase);
        }
        C6705l c6705l2 = c17032l.yandex;
        if (this.amazon != 4) {
            C11983l.tapsense(this.amazon, "state: ");
            return null;
        }
        this.amazon = 5;
        this.loadAd.purchase();
        return new C11984l(this, c6705l2);
    }
}
