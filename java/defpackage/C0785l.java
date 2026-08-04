package defpackage;

import java.io.EOFException;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* JADX INFO: renamed from: lْؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0785l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f2365l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cipher f2366l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1503l f2367l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f2368l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0869l f2369l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f2370l;

    public C0785l(C1503l c1503l, Cipher cipher) {
        this.f2367l = c1503l;
        this.f2366l = cipher;
        int blockSize = cipher.getBlockSize();
        this.f2365l = blockSize;
        this.f2369l = new C0869l();
        if (blockSize > 0) {
            return;
        }
        C8936l.smaato(cipher, "Block cipher required ");
        throw null;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws BadPaddingException, IllegalBlockSizeException, EOFException, ShortBufferException {
        C0869l c0869l2;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f2370l) {
            C8339l.smaato("closed");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        while (true) {
            c0869l2 = this.f2369l;
            if (c0869l2.f2526l == 0 && !this.f2368l) {
                C1503l c1503l = this.f2367l;
                boolean zSubs = c1503l.subs();
                Cipher cipher = this.f2366l;
                if (!zSubs) {
                    C18346l c18346l = c1503l.f3755l.f2527l;
                    int i = c18346l.crashlytics - c18346l.loadAd;
                    int i2 = i;
                    int outputSize = cipher.getOutputSize(i);
                    while (true) {
                        if (outputSize <= 8192) {
                            C18346l c18346lM730super = c0869l2.m730super(outputSize);
                            int iUpdate = cipher.update(c18346l.yandex, c18346l.loadAd, i2, c18346lM730super.yandex, c18346lM730super.loadAd);
                            c1503l.skip(i2);
                            int i3 = c18346lM730super.crashlytics + iUpdate;
                            c18346lM730super.crashlytics = i3;
                            c0869l2.f2526l += (long) iUpdate;
                            if (c18346lM730super.loadAd != i3) {
                                break;
                            }
                            c0869l2.f2527l = c18346lM730super.yandex();
                            AbstractC18391l.yandex(c18346lM730super);
                            break;
                        }
                        int i4 = this.f2365l;
                        if (i2 <= i4) {
                            this.f2368l = true;
                            c0869l2.m738write(cipher.doFinal(c1503l.mo723native()));
                            break;
                        }
                        i2 -= i4;
                        outputSize = cipher.getOutputSize(i2);
                    }
                } else {
                    this.f2368l = true;
                    int outputSize2 = cipher.getOutputSize(0);
                    if (outputSize2 == 0) {
                        break;
                    }
                    C18346l c18346lM730super2 = c0869l2.m730super(outputSize2);
                    int iDoFinal = cipher.doFinal(c18346lM730super2.yandex, c18346lM730super2.loadAd);
                    int i5 = c18346lM730super2.crashlytics + iDoFinal;
                    c18346lM730super2.crashlytics = i5;
                    c0869l2.f2526l += (long) iDoFinal;
                    if (c18346lM730super2.loadAd != i5) {
                        break;
                    }
                    c0869l2.f2527l = c18346lM730super2.yandex();
                    AbstractC18391l.yandex(c18346lM730super2);
                    break;
                }
            } else {
                break;
            }
        }
        return c0869l2.ad(c0869l, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2370l = true;
        this.f2367l.close();
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f2367l.f3756l.isPro();
    }
}
