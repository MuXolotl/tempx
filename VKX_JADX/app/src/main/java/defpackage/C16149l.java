package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٖٜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16149l implements InterfaceC16090l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f31626l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31627l;

    public /* synthetic */ C16149l(int i, Object obj) {
        this.f31627l = i;
        this.f31626l = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.f31627l;
        Object obj = this.f31626l;
        switch (i) {
            case 0:
                AbstractC5170l.loadAd((InterfaceC9354l) obj);
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // defpackage.InterfaceC16090l
    /* JADX INFO: renamed from: extends */
    public final long mo1064extends(C18476l c18476l, long j) {
        int i = this.f31627l;
        Object obj = this.f31626l;
        switch (i) {
            case 0:
                InterfaceC9354l interfaceC9354l = (InterfaceC9354l) obj;
                if (interfaceC9354l.mopub().subs()) {
                    AbstractC10999l.subs(C17218l.f33421l, new C11039l(this, null, 9));
                }
                if (interfaceC9354l.mopub().subs()) {
                    return -1L;
                }
                return interfaceC9354l.mopub().mo1064extends(c18476l, j);
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
                    return 0L;
                }
                boolean z = false;
                try {
                    C2139l c2139lInmobi = c18476l.inmobi(1);
                    byte[] bArr = c2139lInmobi.yandex;
                    int i2 = c2139lInmobi.crashlytics;
                    long j2 = ((InputStream) obj).read(bArr, i2, (int) Math.min(j, bArr.length - i2));
                    int i3 = j2 == -1 ? 0 : (int) j2;
                    if (i3 == 1) {
                        c2139lInmobi.crashlytics += i3;
                        c18476l.f36079l += (long) i3;
                    } else {
                        if (i3 < 0 || i3 > c2139lInmobi.yandex()) {
                            throw new IllegalStateException(("Invalid number of bytes written: " + i3 + ". Should be in 0.." + c2139lInmobi.yandex()).toString());
                        }
                        if (i3 != 0) {
                            c2139lInmobi.crashlytics += i3;
                            c18476l.f36079l += (long) i3;
                        } else if (AbstractC2044l.billing(c2139lInmobi)) {
                            c18476l.adcel();
                        }
                    }
                    return j2;
                } catch (AssertionError e) {
                    if (e.getCause() != null) {
                        String message = e.getMessage();
                        if (message != null ? AbstractC12024l.appmetrica(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (z) {
                        throw new IOException(e);
                    }
                    throw e;
                }
        }
    }

    public String toString() {
        switch (this.f31627l) {
            case 1:
                return "RawSource(" + ((InputStream) this.f31626l) + ')';
            default:
                return super.toString();
        }
    }
}
