package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lُؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10895l extends AbstractC8233l {
    @Override // defpackage.AbstractC8233l
    public final void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        purchase(new C0966l(true), randomAccessFile, randomAccessFile2);
    }

    @Override // defpackage.AbstractC8233l
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        long j;
        C5074l c4229l;
        C4421l[] c4421lArr = C13102l.amazon;
        C14465l c14465l = new C14465l(new BufferedInputStream(new C11270l(randomAccessFile)));
        C4616l c4616l = (C4616l) C13102l.billing.loadAd(AbstractC3848l.amazon(c14465l), c14465l, 0L);
        randomAccessFile.seek(0L);
        C0966l c0966l = new C0966l(interfaceC13280l);
        if (!c0966l.f2669l) {
            C8339l.smaato("Since the field conversion is not enabled, this method cannot be executed");
            return;
        }
        Iterator itIsPro = c0966l.isPro();
        int i = 2;
        char c = 3;
        EnumC0678l[] enumC0678lArr = {EnumC0678l.CONTENT_DESCRIPTION, EnumC0678l.CONTENT_BRANDING, EnumC0678l.EXTENDED_CONTENT, EnumC0678l.METADATA_OBJECT, EnumC0678l.METADATA_LIBRARY_OBJECT};
        C5074l[] c5074lArr = new C5074l[5];
        for (int i2 = 0; i2 < 5; i2++) {
            EnumC0678l enumC0678l = enumC0678lArr[i2];
            BigInteger bigInteger = BigInteger.ZERO;
            EnumC0678l enumC0678l2 = EnumC0678l.CONTENT_DESCRIPTION;
            if (enumC0678l == enumC0678l2) {
                c4229l = new C3692l(enumC0678l2);
            } else {
                EnumC0678l enumC0678l3 = EnumC0678l.CONTENT_BRANDING;
                c4229l = enumC0678l == enumC0678l3 ? new C4229l(enumC0678l3) : new C5074l(enumC0678l);
            }
            c5074lArr[i2] = c4229l;
        }
        while (true) {
            C5191l c5191l = (C5191l) itIsPro;
            if (!c5191l.hasNext()) {
                break;
            }
            C4357l c4357l = (C4357l) c5191l.next();
            boolean z = false;
            int i3 = 0;
            while (!z && i3 < 5) {
                EnumC0678l enumC0678l4 = c5074lArr[i3].amazon;
                C12645l c12645l = c4357l.f8893l;
                EnumC0678l enumC0678l5 = EnumC14116l.yandex(c12645l.f24877l).f27614l;
                char c2 = c;
                EnumC0678l[] enumC0678lArr2 = new EnumC0678l[5];
                enumC0678lArr2[0] = EnumC0678l.CONTENT_DESCRIPTION;
                enumC0678lArr2[1] = EnumC0678l.CONTENT_BRANDING;
                enumC0678lArr2[2] = EnumC0678l.EXTENDED_CONTENT;
                enumC0678lArr2[c2] = EnumC0678l.METADATA_OBJECT;
                enumC0678lArr2[4] = EnumC0678l.METADATA_LIBRARY_OBJECT;
                List listAsList = Arrays.asList(enumC0678lArr2);
                if (listAsList.indexOf(enumC0678l4) <= listAsList.indexOf(enumC0678l5) && c5074lArr[i3].admob(c12645l)) {
                    c5074lArr[i3].loadAd(c12645l);
                    z = true;
                }
                i3++;
                c = c2;
            }
            c = c;
        }
        boolean[] zArr = new boolean[5];
        for (int i4 = 0; i4 < 5; i4++) {
            zArr[i4] = c4616l.amazon.containsKey(c5074lArr[i4].amazon.f2165l);
        }
        C17217l c17217l = (C17217l) c4616l.loadAd(C4421l.subs, C17217l.class);
        boolean[] zArr2 = new boolean[5];
        for (int i5 = 0; i5 < 5; i5++) {
            zArr2[i5] = c17217l.amazon.containsKey(c5074lArr[i5].amazon.f2165l);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < 5; i6++) {
            C8033l c8033l = new C8033l(c5074lArr[i6]);
            if (zArr[i6]) {
                arrayList.add(c8033l);
            } else if (zArr2[i6]) {
                arrayList2.add(c8033l);
            } else if (i6 == 0 || i6 == 2 || i6 == 1) {
                arrayList.add(c8033l);
            } else {
                arrayList2.add(c8033l);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C8033l(arrayList2));
        }
        C11270l c11270l = new C11270l(randomAccessFile);
        RandomAccessFile randomAccessFile3 = (RandomAccessFile) c11270l.f22704l;
        C16145l c16145l = new C16145l(i, randomAccessFile2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        C4421l c4421lAmazon = AbstractC3848l.amazon(c11270l);
        if (!C4421l.admob.equals(c4421lAmazon)) {
            C8339l.metrica("No ASF header object.");
            return;
        }
        long jBilling = AbstractC3848l.billing(c11270l);
        long jPurchase = AbstractC3848l.purchase(c11270l);
        byte[] bArr = {(byte) (randomAccessFile3.read() & 255), (byte) (randomAccessFile3.read() & 255)};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 0;
        byte[] byteArray = null;
        long j3 = 0;
        long j4 = 0;
        while (j3 < jPurchase) {
            C4421l c4421lAmazon2 = AbstractC3848l.amazon(c11270l);
            if (C4421l.mopub.equals(c4421lAmazon2)) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                j = jBilling;
                long jBilling2 = AbstractC3848l.billing(c11270l);
                AbstractC3848l.subs(jBilling2, byteArrayOutputStream2);
                AbstractC3848l.yandex(c11270l, byteArrayOutputStream2, jBilling2 - 24);
                byteArray = byteArrayOutputStream2.toByteArray();
            } else {
                j = jBilling;
                boolean z2 = false;
                for (int i7 = 0; i7 < arrayList3.size() && !z2; i7++) {
                    if (((C8033l) arrayList3.get(i7)).yandex(c4421lAmazon2)) {
                        C9489l c9489lLoadAd = ((C8033l) arrayList3.get(i7)).loadAd(c4421lAmazon2, c11270l, byteArrayOutputStream);
                        j4 += (long) c9489lLoadAd.yandex;
                        j2 += c9489lLoadAd.loadAd;
                        arrayList3.remove(i7);
                        z2 = true;
                    }
                }
                if (!z2) {
                    long jBilling3 = AbstractC3848l.billing(c11270l);
                    byteArrayOutputStream.write(c4421lAmazon2.yandex());
                    AbstractC3848l.subs(jBilling3, byteArrayOutputStream);
                    AbstractC3848l.yandex(c11270l, byteArrayOutputStream, jBilling3 - 24);
                }
            }
            j3++;
            jBilling = j;
        }
        long j5 = jBilling;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            C9489l c9489lLoadAd2 = ((C8033l) it.next()).loadAd(null, null, byteArrayOutputStream);
            j4 += (long) c9489lLoadAd2.yandex;
            j2 += c9489lLoadAd2.loadAd;
        }
        c16145l.write(c4421lAmazon.yandex());
        AbstractC3848l.subs(j5 + j2, c16145l);
        AbstractC3848l.admob(jPurchase + j4, c16145l);
        c16145l.write(bArr);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        c16145l.write(C4421l.mopub.yandex());
        long jBilling4 = AbstractC3848l.billing(byteArrayInputStream);
        AbstractC3848l.subs(jBilling4, c16145l);
        c16145l.write(AbstractC3848l.amazon(byteArrayInputStream).yandex());
        AbstractC3848l.subs(AbstractC3848l.billing(byteArrayInputStream) + j2, c16145l);
        AbstractC3848l.yandex(byteArrayInputStream, c16145l, jBilling4 - 48);
        c16145l.write(byteArrayOutputStream.toByteArray());
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i8 = c11270l.read(bArr2);
            if (i8 == -1) {
                return;
            } else {
                c16145l.write(bArr2, 0, i8);
            }
        }
    }
}
