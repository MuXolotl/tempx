package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: lؔٝۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2781l implements InterfaceC10506l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f6045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f6046l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6047l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f6048l;

    public C2781l(C8417l c8417l) {
        this.f6047l = 2;
        this.f6048l = c8417l;
        this.f6045l = new C7013l(((C7167l) c8417l.crashlytics.f20589l).f14999l.isPro());
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        int i = this.f6047l;
        Object obj = this.f6048l;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                AbstractC9334l.crashlytics(c0869l.f2526l, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    C18346l c18346l = c0869l.f2527l;
                    int iMin = (int) Math.min(j2, c18346l.crashlytics - c18346l.loadAd);
                    deflater.setInput(c18346l.yandex, c18346l.loadAd, iMin);
                    yandex(false);
                    long j3 = iMin;
                    c0869l.f2526l -= j3;
                    int i2 = c18346l.loadAd + iMin;
                    c18346l.loadAd = i2;
                    if (i2 == c18346l.crashlytics) {
                        c0869l.f2527l = c18346l.yandex();
                        AbstractC18391l.yandex(c18346l);
                    }
                    j2 -= j3;
                }
                deflater.setInput(C0516l.f1834l, 0, 0);
                break;
            case 1:
                if (this.f6046l) {
                    c0869l.skip(j);
                } else {
                    try {
                        ((InterfaceC10506l) this.f6045l).mo390break(c0869l, j);
                    } catch (IOException e) {
                        this.f6046l = true;
                        ((C15079l) obj).invoke(e);
                        return;
                    }
                }
                break;
            default:
                if (!this.f6046l) {
                    AbstractC7712l.yandex(c0869l.f2526l, 0L, j);
                    ((C7167l) ((C8417l) obj).crashlytics.f20589l).mo390break(c0869l, j);
                } else {
                    C8339l.smaato("closed");
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int i = this.f6047l;
        Object obj = this.f6045l;
        Object obj2 = this.f6048l;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj2;
                if (this.f6046l) {
                    return;
                }
                deflater.finish();
                yandex(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((C7167l) obj).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.f6046l = true;
                if (th != null) {
                    throw th;
                }
                return;
            case 1:
                try {
                    ((InterfaceC10506l) obj).close();
                    return;
                } catch (IOException e) {
                    this.f6046l = true;
                    ((C15079l) obj2).invoke(e);
                    return;
                }
            default:
                C8417l c8417l = (C8417l) obj2;
                if (this.f6046l) {
                    return;
                }
                this.f6046l = true;
                C7013l c7013l = (C7013l) obj;
                C3446l c3446l = c7013l.purchase;
                c7013l.purchase = C3446l.amazon;
                c3446l.yandex();
                c3446l.loadAd();
                c8417l.amazon = 3;
                return;
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f6047l;
        Object obj = this.f6045l;
        Object obj2 = this.f6048l;
        switch (i) {
            case 0:
                yandex(true);
                ((C7167l) obj).flush();
                break;
            case 1:
                try {
                    ((InterfaceC10506l) obj).flush();
                } catch (IOException e) {
                    this.f6046l = true;
                    ((C15079l) obj2).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.f6046l) {
                    ((C7167l) ((C8417l) obj2).crashlytics.f20589l).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        int i = this.f6047l;
        Object obj = this.f6045l;
        switch (i) {
            case 0:
                return ((C7167l) obj).f14999l.isPro();
            case 1:
                return ((InterfaceC10506l) obj).isPro();
            default:
                return (C7013l) obj;
        }
    }

    public String toString() {
        switch (this.f6047l) {
            case 0:
                return "DeflaterSink(" + ((C7167l) this.f6045l) + ')';
            default:
                return super.toString();
        }
    }

    public void yandex(boolean z) throws IOException {
        C18346l c18346lM730super;
        int iDeflate;
        Deflater deflater = (Deflater) this.f6048l;
        C7167l c7167l = (C7167l) this.f6045l;
        C0869l c0869l = c7167l.f14998l;
        while (true) {
            c18346lM730super = c0869l.m730super(1);
            byte[] bArr = c18346lM730super.yandex;
            int i = c18346lM730super.crashlytics;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                c18346lM730super.crashlytics += iDeflate;
                c0869l.f2526l += (long) iDeflate;
                c7167l.yandex();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c18346lM730super.loadAd == c18346lM730super.crashlytics) {
            c0869l.f2527l = c18346lM730super.yandex();
            AbstractC18391l.yandex(c18346lM730super);
        }
    }

    public /* synthetic */ C2781l(InterfaceC10506l interfaceC10506l, Object obj, int i) {
        this.f6047l = i;
        this.f6045l = interfaceC10506l;
        this.f6048l = obj;
    }
}
