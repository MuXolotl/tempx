package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13478l {
    public final C8688l amazon;
    public final List crashlytics;
    public final C5628l loadAd;
    public final EnumC18016l yandex;

    public C13478l(EnumC18016l enumC18016l, C5628l c5628l, List list, Function0 function0) {
        this.yandex = enumC18016l;
        this.loadAd = c5628l;
        this.crashlytics = list;
        this.amazon = new C8688l(new C5583l(5, function0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13478l)) {
            return false;
        }
        C13478l c13478l = (C13478l) obj;
        return c13478l.yandex == this.yandex && c13478l.loadAd == this.loadAd && AbstractC8576l.yandex(c13478l.yandex(), yandex()) && c13478l.crashlytics.equals(this.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((yandex().hashCode() + ((this.loadAd.hashCode() + ((this.yandex.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listYandex = yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        for (Certificate certificate : listYandex) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.yandex);
        sb.append(" cipherSuite=");
        sb.append(this.loadAd);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.crashlytics;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public final List yandex() {
        return (List) this.amazon.getValue();
    }
}
