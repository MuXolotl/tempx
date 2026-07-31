package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٌؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2127l {
    public final C1424l yandex;
    public static final C3844l loadAd = new C3844l(Arrays.copyOf(new byte[]{42}, 1));
    public static final List crashlytics = Collections.singletonList("*");
    public static final C2127l amazon = new C2127l(new C1424l(4));

    public C2127l(C1424l c1424l) {
        this.yandex = c1424l;
    }

    public static List loadAd(String str) {
        List listM3323finally = AbstractC12024l.m3323finally(str, new char[]{'.'});
        return AbstractC8576l.yandex(AbstractC16901l.m4214continue(listM3323finally), "") ? AbstractC16901l.m4242synchronized(1, listM3323finally) : listM3323finally;
    }

    public final String yandex(String str) {
        String strAmazon;
        String strAmazon2;
        String strAmazon3;
        List listM3323finally;
        int size;
        int size2;
        List listLoadAd = loadAd(IDN.toUnicode(str));
        C1424l c1424l = this.yandex;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c1424l.f3603l;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c1424l.f3602l).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        c1424l.m936l();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        c1424l.f3604l = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((C3844l) c1424l.f3601l) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c1424l.f3606l);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c1424l.f3604l);
            throw illegalStateException;
        }
        int size3 = listLoadAd.size();
        C3844l[] c3844lArr = new C3844l[size3];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listLoadAd.get(i);
            C3844l c3844l = new C3844l(str2.getBytes(AbstractC9050l.yandex));
            c3844l.f7951l = str2;
            c3844lArr[i] = c3844l;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strAmazon = null;
                break;
            }
            C3844l c3844l2 = (C3844l) c1424l.f3601l;
            if (c3844l2 == null) {
                c3844l2 = null;
            }
            strAmazon = C13975l.amazon(c3844l2, c3844lArr, i2);
            if (strAmazon != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strAmazon2 = null;
            break;
        }
        C3844l[] c3844lArr2 = (C3844l[]) c3844lArr.clone();
        int length = c3844lArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strAmazon2 = null;
                break;
            }
            c3844lArr2[i3] = loadAd;
            C3844l c3844l3 = (C3844l) c1424l.f3601l;
            if (c3844l3 == null) {
                c3844l3 = null;
            }
            strAmazon2 = C13975l.amazon(c3844l3, c3844lArr2, i3);
            if (strAmazon2 != null) {
                break;
            }
            i3++;
        }
        if (strAmazon2 == null) {
            strAmazon3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strAmazon3 = null;
                break;
            }
            C3844l c3844l4 = (C3844l) c1424l.f3605l;
            if (c3844l4 == null) {
                c3844l4 = null;
            }
            strAmazon3 = C13975l.amazon(c3844l4, c3844lArr, i5);
            if (strAmazon3 != null) {
                break;
            }
            i5++;
        }
        if (strAmazon3 != null) {
            listM3323finally = AbstractC12024l.m3323finally("!".concat(strAmazon3), new char[]{'.'});
        } else if (strAmazon == null && strAmazon2 == null) {
            listM3323finally = crashlytics;
        } else {
            List listM3323finally2 = C2580l.f5619l;
            List listM3323finally3 = strAmazon != null ? AbstractC12024l.m3323finally(strAmazon, new char[]{'.'}) : listM3323finally2;
            if (strAmazon2 != null) {
                listM3323finally2 = AbstractC12024l.m3323finally(strAmazon2, new char[]{'.'});
            }
            listM3323finally = listM3323finally3.size() > listM3323finally2.size() ? listM3323finally3 : listM3323finally2;
        }
        if (listLoadAd.size() == listM3323finally.size() && ((String) listM3323finally.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM3323finally.get(0)).charAt(0) == '!') {
            size = listLoadAd.size();
            size2 = listM3323finally.size();
        } else {
            size = listLoadAd.size();
            size2 = listM3323finally.size() + 1;
        }
        return AbstractC17587l.vip(AbstractC17587l.isPro(new C17798l(1, loadAd(str)), size - size2), ".");
    }
}
