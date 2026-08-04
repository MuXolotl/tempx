package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٕٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15900l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f31196l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AutoCloseable f31197l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31198l;

    public C15900l(InterfaceC16090l interfaceC16090l) {
        this.f31198l = 1;
        this.f31196l = interfaceC16090l;
        this.f31197l = new C18476l();
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        int i = this.f31198l;
        Object obj = this.f31196l;
        AutoCloseable autoCloseable = this.f31197l;
        long j2 = -1;
        switch (i) {
            case 0:
                if (j != 0) {
                    if (j >= 0) {
                        try {
                            ((C3446l) obj).billing();
                            C18346l c18346lM730super = c0869l.m730super(1);
                            int i2 = ((InputStream) autoCloseable).read(c18346lM730super.yandex, c18346lM730super.crashlytics, (int) Math.min(j, 8192 - c18346lM730super.crashlytics));
                            if (i2 != -1) {
                                c18346lM730super.crashlytics += i2;
                                j2 = i2;
                                c0869l.f2526l += j2;
                            } else if (c18346lM730super.loadAd == c18346lM730super.crashlytics) {
                                c0869l.f2527l = c18346lM730super.yandex();
                                AbstractC18391l.yandex(c18346lM730super);
                            }
                            return j2;
                        } catch (AssertionError e) {
                            if (AbstractC7169l.yandex(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                    C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
                }
                return 0L;
            default:
                C18476l c18476l = (C18476l) autoCloseable;
                long jMo1064extends = ((InterfaceC16090l) obj).mo1064extends(c18476l, j);
                if (jMo1064extends == -1) {
                    return -1L;
                }
                long j3 = jMo1064extends;
                while (j3 > 0) {
                    if (c18476l.subs()) {
                        C8339l.metrica("Buffer is empty");
                    } else {
                        C2139l c2139l = c18476l.f36081l;
                        byte[] bArr = c2139l.yandex;
                        int i3 = c2139l.loadAd;
                        int i4 = c2139l.crashlytics - i3;
                        c0869l.write(bArr, i3, i4);
                        if (i4 != 0) {
                            if (i4 < 0) {
                                C8339l.smaato("Returned negative read bytes count");
                            } else if (i4 <= c2139l.loadAd()) {
                                c18476l.skip(i4);
                            } else {
                                C8339l.smaato("Returned too many bytes");
                            }
                        }
                        j3 -= (long) i4;
                    }
                    return 0L;
                }
                return jMo1064extends;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        switch (this.f31198l) {
            case 0:
                ((InputStream) this.f31197l).close();
                break;
            default:
                ((InterfaceC16090l) this.f31196l).close();
                break;
        }
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        switch (this.f31198l) {
            case 0:
                return (C3446l) this.f31196l;
            default:
                return C3446l.amazon;
        }
    }

    public String toString() {
        switch (this.f31198l) {
            case 0:
                return "source(" + ((InputStream) this.f31197l) + ')';
            default:
                return super.toString();
        }
    }

    public C15900l(InputStream inputStream, C3446l c3446l) {
        this.f31198l = 0;
        this.f31197l = inputStream;
        this.f31196l = c3446l;
    }
}
