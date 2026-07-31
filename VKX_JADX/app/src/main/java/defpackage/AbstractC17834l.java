package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;

/* JADX INFO: renamed from: lَ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17834l {
    public static final C15578l yandex = new C15578l(-1381980787, false, new C2464l(5));

    public static void admob(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] amazon(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C8339l.smaato(AbstractC0653l.vip(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] billing(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static byte[] crashlytics(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static void loadAd(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static long mopub(InputStream inputStream, int i) {
        byte[] bArrAmazon = amazon(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrAmazon[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static ByteBuffer purchase(FileChannel fileChannel, C16528l c16528l) throws IOException {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) c16528l.f32303l);
        byteBufferAllocateDirect.order(ByteOrder.BIG_ENDIAN);
        fileChannel.read(byteBufferAllocateDirect);
        byteBufferAllocateDirect.position(0);
        return byteBufferAllocateDirect;
    }

    public static void subs(int i, ByteArrayOutputStream byteArrayOutputStream) {
        admob(byteArrayOutputStream, i, 2);
    }

    public static final void yandex(List list, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(1068626853);
        int i2 = (c6956l.admob(list) ? 4 : 2) | i | (c6956l.admob(function1) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean zBilling = c6956l.billing(list);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    Integer num = ((Catalog2ReplacementOption) it.next()).amazon;
                    if (num != null && num.intValue() == 1) {
                        break;
                    } else {
                        i3++;
                    }
                }
                objM2132native = Integer.valueOf(i3);
                c6956l.m2147try(objM2132native);
            }
            int iIntValue = ((Number) objM2132native).intValue();
            AbstractC3951l.yandex(iIntValue, AbstractC3605l.startapp(AbstractC15042l.adcel(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), AbstractC15042l.pro()), 0.0f, 8.0f, 0.0f, 0.0f, 13), C9735l.isPro, 0L, 16.0f, 0.0f, 8.0f, AbstractC14566l.amazon(-1214928892, new C8821l(iIntValue, i4), c6956l), AbstractC14566l.amazon(383748163, new C3763l(list, function1), c6956l), c6956l, 115040640);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3763l(list, function1, i);
        }
    }
}
