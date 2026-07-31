package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lَُۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11432l {
    public static final TimeZone yandex = DesugarTimeZone.getTimeZone("GMT");
    public static final String loadAd = AbstractC12024l.m3325goto(AbstractC12024l.m3334new(C11610l.class.getName(), "okhttp3."), "Client");

    public static final C8309l admob(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18464l c18464l = (C18464l) it.next();
            C3844l c3844l = c18464l.yandex;
            C3844l c3844l2 = c18464l.loadAd;
            String strTapsense = c3844l.tapsense();
            String strTapsense2 = c3844l2.tapsense();
            arrayList.add(strTapsense);
            arrayList.add(AbstractC12024l.m3330l(strTapsense2).toString());
        }
        return new C8309l((String[]) arrayList.toArray(new String[0]));
    }

    public static final String amazon(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final Charset billing(InterfaceC9473l interfaceC9473l, Charset charset) {
        int iMo705else = interfaceC9473l.mo705else(AbstractC7712l.loadAd);
        if (iMo705else == -1) {
            return charset;
        }
        if (iMo705else == 0) {
            return AbstractC9050l.yandex;
        }
        if (iMo705else == 1) {
            return AbstractC9050l.loadAd;
        }
        if (iMo705else == 2) {
            Charset charset2 = AbstractC9050l.yandex;
            Charset charset3 = AbstractC9050l.purchase;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            AbstractC9050l.purchase = charsetForName;
            return charsetForName;
        }
        if (iMo705else == 3) {
            return AbstractC9050l.crashlytics;
        }
        if (iMo705else != 4) {
            C11586l.yandex();
            return null;
        }
        Charset charset4 = AbstractC9050l.yandex;
        Charset charset5 = AbstractC9050l.billing;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        AbstractC9050l.billing = charsetForName2;
        return charsetForName2;
    }

    public static final void crashlytics(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC8576l.yandex(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final List firebase(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C2580l.f5619l;
        }
        return objArr.length == 1 ? Collections.singletonList(objArr[0]) : DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static final List isPro(List list) {
        if (list.isEmpty()) {
            return C2580l.f5619l;
        }
        return list.size() == 1 ? Collections.singletonList(list.get(0)) : DesugarCollections.unmodifiableList(Arrays.asList(list.toArray()));
    }

    public static final int loadAd(long j, TimeUnit timeUnit) {
        if (j < 0) {
            C8936l.subs("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            C10754l.metrica("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C10754l.metrica("timeout".concat(" too small"));
        return 0;
    }

    public static final boolean mopub(InterfaceC14991l interfaceC14991l, int i) {
        long jNanoTime = System.nanoTime();
        long jCrashlytics = interfaceC14991l.isPro().purchase() ? interfaceC14991l.isPro().crashlytics() - jNanoTime : Long.MAX_VALUE;
        interfaceC14991l.isPro().amazon(Math.min(jCrashlytics, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            C0869l c0869l = new C0869l();
            while (interfaceC14991l.ad(c0869l, 8192L) != -1) {
                c0869l.yandex();
            }
            if (jCrashlytics == Long.MAX_VALUE) {
                interfaceC14991l.isPro().yandex();
                return true;
            }
            interfaceC14991l.isPro().amazon(jNanoTime + jCrashlytics);
            return true;
        } catch (InterruptedIOException unused) {
            if (jCrashlytics == Long.MAX_VALUE) {
                interfaceC14991l.isPro().yandex();
                return false;
            }
            interfaceC14991l.isPro().amazon(jNanoTime + jCrashlytics);
            return false;
        } catch (Throwable th) {
            if (jCrashlytics == Long.MAX_VALUE) {
                interfaceC14991l.isPro().yandex();
            } else {
                interfaceC14991l.isPro().amazon(jNanoTime + jCrashlytics);
            }
            throw th;
        }
    }

    public static final long purchase(C18389l c18389l) {
        String strAmazon = c18389l.f35918l.amazon("Content-Length");
        if (strAmazon == null) {
            return -1L;
        }
        byte[] bArr = AbstractC7712l.yandex;
        try {
            return Long.parseLong(strAmazon);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String subs(C6705l c6705l, boolean z) {
        int i;
        int i2 = c6705l.purchase;
        String strSmaato = c6705l.amazon;
        if (AbstractC12024l.appmetrica(strSmaato, ":", false)) {
            strSmaato = AbstractC14814l.smaato(']', "[", strSmaato);
        }
        if (!z) {
            String str = c6705l.yandex;
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strSmaato;
            }
        }
        return strSmaato + ':' + i2;
    }

    public static final boolean yandex(C6705l c6705l, C6705l c6705l2) {
        return AbstractC8576l.yandex(c6705l.amazon, c6705l2.amazon) && c6705l.purchase == c6705l2.purchase && AbstractC8576l.yandex(c6705l.yandex, c6705l2.yandex);
    }
}
