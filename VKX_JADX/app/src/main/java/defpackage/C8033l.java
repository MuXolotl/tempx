package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8033l {
    public final Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public C8033l(ArrayList arrayList) {
        this.loadAd = new ArrayList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final C9489l loadAd(C4421l c4421l, InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        long j;
        long jIsPro;
        int i;
        long jBilling = 0;
        switch (this.yandex) {
            case 0:
                ArrayList arrayList = new ArrayList((ArrayList) this.loadAd);
                HashSet hashSet = new HashSet();
                hashSet.add(c4421l);
                BigInteger bigIntegerCrashlytics = AbstractC3848l.crashlytics(inputStream);
                C4421l c4421lAmazon = AbstractC3848l.amazon(inputStream);
                int i2 = inputStream.read() | (inputStream.read() << 8);
                long jPurchase = AbstractC3848l.purchase(inputStream);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                C16045l c16045l = new C16045l(inputStream, 1);
                while (true) {
                    synchronized (c16045l) {
                        j = c16045l.f31436l;
                    }
                    if (j >= jPurchase) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C9489l c9489lLoadAd = ((C8033l) it.next()).loadAd(null, null, byteArrayOutputStream2);
                            jBilling += c9489lLoadAd.loadAd;
                            hashSet.addAll(new HashSet((HashSet) c9489lLoadAd.crashlytics));
                        }
                        byteArrayOutputStream.write(C4421l.subs.yandex());
                        AbstractC3848l.subs(bigIntegerCrashlytics.add(BigInteger.valueOf(jBilling)).longValue(), byteArrayOutputStream);
                        byteArrayOutputStream.write(c4421lAmazon.yandex());
                        AbstractC3848l.mopub(i2, byteArrayOutputStream);
                        AbstractC3848l.admob(jPurchase + jBilling, byteArrayOutputStream);
                        byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
                        C9489l c9489l = new C9489l();
                        HashSet hashSet2 = new HashSet();
                        c9489l.crashlytics = hashSet2;
                        c9489l.yandex = 0;
                        c9489l.loadAd = jBilling;
                        hashSet2.addAll(hashSet);
                        return c9489l;
                    }
                    C4421l c4421lAmazon2 = AbstractC3848l.amazon(c16045l);
                    boolean z = false;
                    for (int i3 = 0; i3 < arrayList.size() && !z; i3++) {
                        if (((C8033l) arrayList.get(i3)).yandex(c4421lAmazon2)) {
                            C9489l c9489lLoadAd2 = ((C8033l) arrayList.get(i3)).loadAd(c4421lAmazon2, c16045l, byteArrayOutputStream2);
                            long j2 = jBilling + c9489lLoadAd2.loadAd;
                            hashSet.addAll(new HashSet((HashSet) c9489lLoadAd2.crashlytics));
                            arrayList.remove(i3);
                            jBilling = j2;
                            z = true;
                        }
                    }
                    long j3 = jBilling;
                    if (!z) {
                        hashSet.add(c4421lAmazon2);
                        long jBilling2 = AbstractC3848l.billing(c16045l);
                        byteArrayOutputStream2.write(c4421lAmazon2.yandex());
                        AbstractC3848l.subs(jBilling2, byteArrayOutputStream2);
                        AbstractC3848l.yandex(c16045l, byteArrayOutputStream2, jBilling2 - 24);
                    }
                    jBilling = j3;
                }
                break;
            default:
                C5074l c5074l = (C5074l) this.loadAd;
                if (!c5074l.subs()) {
                    jIsPro = c5074l.isPro(byteArrayOutputStream);
                    i = c4421l == null ? 1 : 0;
                    if (c4421l != null) {
                        if (c5074l.subs()) {
                            i--;
                        }
                        jBilling = AbstractC3848l.billing(inputStream);
                        inputStream.skip(jBilling - 24);
                    }
                    C9489l c9489l2 = new C9489l();
                    HashSet hashSet3 = new HashSet();
                    c9489l2.crashlytics = hashSet3;
                    c9489l2.yandex = i;
                    c9489l2.loadAd = jIsPro - jBilling;
                    hashSet3.addAll(Arrays.asList(c4421l));
                    return c9489l2;
                }
                jIsPro = 0;
                if (c4421l != null) {
                    if (c5074l.subs()) {
                        i--;
                    }
                    jBilling = AbstractC3848l.billing(inputStream);
                    inputStream.skip(jBilling - 24);
                }
                C9489l c9489l3 = new C9489l();
                HashSet hashSet4 = new HashSet();
                c9489l3.crashlytics = hashSet4;
                c9489l3.yandex = i;
                c9489l3.loadAd = jIsPro - jBilling;
                hashSet4.addAll(Arrays.asList(c4421l));
                return c9489l3;
        }
    }

    public final boolean yandex(C4421l c4421l) {
        switch (this.yandex) {
            case 0:
                return C4421l.subs.equals(c4421l);
            default:
                return c4421l.equals(((C5074l) this.loadAd).loadAd);
        }
    }

    public C8033l(C5074l c5074l) {
        this.loadAd = c5074l;
    }
}
