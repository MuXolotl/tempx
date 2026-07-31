package defpackage;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3370l extends BufferedWriter {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public char[] f7175l;

    public final void yandex(C9926l c9926l) throws IOException {
        int i;
        String str = c9926l.yandex;
        write("-----BEGIN " + str + "-----");
        newLine();
        List list = c9926l.loadAd;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            newLine();
        }
        byte[] bArr = c9926l.crashlytics;
        char[] cArr = this.f7175l;
        C11547l c11547l = AbstractC13630l.yandex;
        int length = bArr.length;
        C11547l c11547l2 = AbstractC13630l.yandex;
        c11547l2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c11547l2.loadAd(bArr, 0, length, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int length2 = 0; length2 < byteArray.length; length2 += cArr.length) {
                int i2 = 0;
                while (i2 != cArr.length && (i = length2 + i2) < byteArray.length) {
                    cArr[i2] = (char) byteArray[i];
                    i2++;
                }
                write(cArr, 0, i2);
                newLine();
            }
            write("-----END " + str + "-----");
            newLine();
        } catch (Exception e) {
            throw new Celse(AbstractC12900l.admob(e, new StringBuilder("exception encoding base64 string: ")), e, 2);
        }
    }
}
