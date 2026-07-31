package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؙؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6897l implements Closeable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C8552l f14438l;

    static {
        C0869l c0869l = new C0869l();
        C3844l c3844l = C3844l.f7950l;
        c0869l.m708import(c3844l);
        f14438l = new C8552l(null, c3844l.f7953l.length, c0869l);
    }

    public abstract long billing();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC7712l.loadAd(mo1516l());
    }

    /* JADX INFO: renamed from: lؙٗۛ */
    public abstract InterfaceC9473l mo1516l();

    public abstract C12105l mopub();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String vip() {
        Charset charsetYandex;
        InterfaceC9473l interfaceC9473lMo1516l = mo1516l();
        String th = null;
        try {
            C12105l c12105lMopub = mopub();
            if (c12105lMopub == null || (charsetYandex = C12105l.yandex(c12105lMopub)) == null) {
                charsetYandex = AbstractC9050l.yandex;
            }
            String strMo735transient = interfaceC9473lMo1516l.mo735transient(AbstractC11432l.billing(interfaceC9473lMo1516l, charsetYandex));
            try {
                interfaceC9473lMo1516l.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo735transient;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC9473lMo1516l != null) {
                try {
                    interfaceC9473lMo1516l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] yandex() throws IOException {
        long jBilling = billing();
        byte[] th = null;
        if (jBilling > 2147483647L) {
            C18262l.metrica(AbstractC2812l.ads(jBilling, "Cannot buffer entire body for content length: "));
            return null;
        }
        InterfaceC9473l interfaceC9473lMo1516l = mo1516l();
        try {
            byte[] bArrMo723native = interfaceC9473lMo1516l.mo723native();
            try {
                interfaceC9473lMo1516l.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrMo723native;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC9473lMo1516l != null) {
                try {
                    interfaceC9473lMo1516l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jBilling == -1 || jBilling == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jBilling + ") and stream length (" + length + ") disagree");
    }
}
