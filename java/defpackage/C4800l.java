package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: lَؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4800l {
    public static final C4800l billing;
    public static final C4800l purchase;
    public final String[] amazon;
    public final String[] crashlytics;
    public final boolean loadAd;
    public final boolean yandex;

    static {
        C5628l c5628l = C5628l.ads;
        C5628l c5628l2 = C5628l.subscription;
        C5628l c5628l3 = C5628l.tapsense;
        C5628l c5628l4 = C5628l.smaato;
        C5628l c5628l5 = C5628l.vip;
        C5628l c5628l6 = C5628l.remoteconfig;
        C5628l c5628l7 = C5628l.metrica;
        C5628l c5628l8 = C5628l.adcel;
        C5628l c5628l9 = C5628l.startapp;
        List listRemoteconfig = AbstractC14055l.remoteconfig(c5628l, c5628l2, c5628l3, c5628l4, c5628l5, c5628l6, c5628l7, c5628l8, c5628l9);
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(c5628l, c5628l2, c5628l3, c5628l4, c5628l5, c5628l6, c5628l7, c5628l8, c5628l9, C5628l.isPro, C5628l.firebase, C5628l.admob, C5628l.subs, C5628l.billing, C5628l.mopub, C5628l.purchase);
        C1298l c1298l = new C1298l();
        C5628l[] c5628lArr = (C5628l[]) listRemoteconfig.toArray(new C5628l[0]);
        c1298l.loadAd((C5628l[]) Arrays.copyOf(c5628lArr, c5628lArr.length));
        EnumC18016l enumC18016l = EnumC18016l.TLS_1_3;
        EnumC18016l enumC18016l2 = EnumC18016l.TLS_1_2;
        c1298l.billing(enumC18016l, enumC18016l2);
        c1298l.f3347l = true;
        c1298l.yandex();
        C1298l c1298l2 = new C1298l();
        C5628l[] c5628lArr2 = (C5628l[]) listRemoteconfig2.toArray(new C5628l[0]);
        c1298l2.loadAd((C5628l[]) Arrays.copyOf(c5628lArr2, c5628lArr2.length));
        c1298l2.billing(enumC18016l, enumC18016l2);
        c1298l2.f3347l = true;
        purchase = c1298l2.yandex();
        C1298l c1298l3 = new C1298l();
        C5628l[] c5628lArr3 = (C5628l[]) listRemoteconfig2.toArray(new C5628l[0]);
        c1298l3.loadAd((C5628l[]) Arrays.copyOf(c5628lArr3, c5628lArr3.length));
        c1298l3.billing(enumC18016l, enumC18016l2, EnumC18016l.TLS_1_1, EnumC18016l.TLS_1_0);
        c1298l3.f3347l = true;
        c1298l3.yandex();
        billing = new C4800l(false, false, null, null);
    }

    public C4800l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = strArr;
        this.amazon = strArr2;
    }

    public final ArrayList crashlytics() {
        String[] strArr = this.amazon;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC14905l.yandex(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4800l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4800l c4800l = (C4800l) obj;
        boolean z = c4800l.yandex;
        boolean z2 = this.yandex;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.crashlytics, c4800l.crashlytics) && Arrays.equals(this.amazon, c4800l.amazon) && this.loadAd == c4800l.loadAd;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.yandex) {
            return 17;
        }
        String[] strArr = this.crashlytics;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.amazon;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.loadAd ? 1 : 0);
    }

    public final ArrayList loadAd() {
        String[] strArr = this.crashlytics;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C5628l.loadAd.m4315l(str));
        }
        return arrayList;
    }

    public final String toString() {
        if (!this.yandex) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(loadAd(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(crashlytics(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0653l.tapsense(sb, this.loadAd, ')');
    }

    public final void yandex(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        String[] strArr = this.crashlytics;
        if (strArr != null) {
            enabledCipherSuites = AbstractC7712l.isPro(strArr, enabledCipherSuites, C5628l.crashlytics);
        }
        String[] strArr2 = this.amazon;
        String[] strArrIsPro = strArr2 != null ? AbstractC7712l.isPro(sSLSocket.getEnabledProtocols(), strArr2, C5298l.f11412l) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C13617l c13617l = C5628l.crashlytics;
        byte[] bArr = AbstractC7712l.yandex;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c13617l.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.yandex;
        if (!z2) {
            C8339l.metrica("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C8339l.metrica("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(strArrIsPro, strArrIsPro.length);
        if (!z2) {
            C8339l.metrica("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C8339l.metrica("At least one TLS version is required");
            return;
        }
        C4800l c4800l = new C4800l(z2, this.loadAd, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c4800l.crashlytics() != null) {
            sSLSocket.setEnabledProtocols(c4800l.amazon);
        }
        if (c4800l.loadAd() != null) {
            sSLSocket.setEnabledCipherSuites(c4800l.crashlytics);
        }
    }
}
