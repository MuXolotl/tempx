package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؘٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14706l implements InterfaceC10110l, InterfaceC12841l, InterfaceC15283l, InterfaceC0643l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14706l f28764l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C14706l f28765l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C14706l f28766l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f28767l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28768l;

    static {
        boolean z = true;
        f28764l = new C14706l(z, 0);
        int i = 1;
        f28766l = new C14706l(z, i);
        f28765l = new C14706l(false, i);
    }

    public C14706l(C11121l c11121l, C6915l c6915l) throws C1886l {
        this.f28768l = 3;
        int i = c6915l.yandex;
        ByteBuffer byteBuffer = c6915l.loadAd;
        AbstractC12442l.admob(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C5257l c5257l = new C5257l(bArr, iMin);
        if (c11121l.yandex) {
            throw new C1886l();
        }
        if (c5257l.billing()) {
            this.f28767l = false;
            return;
        }
        int iMopub = c5257l.mopub(2);
        boolean zBilling = c5257l.billing();
        if (c11121l.loadAd) {
            throw new C1886l();
        }
        if (!zBilling) {
            this.f28767l = true;
            return;
        }
        boolean zBilling2 = (iMopub == 3 || iMopub == 0) ? true : c5257l.billing();
        c5257l.vip();
        if (!c11121l.amazon) {
            throw new C1886l();
        }
        if (c5257l.billing()) {
            if (!c11121l.purchase) {
                throw new C1886l();
            }
            c5257l.vip();
        }
        if (c11121l.crashlytics) {
            throw new C1886l();
        }
        if (iMopub != 3) {
            c5257l.vip();
        }
        c5257l.metrica(c11121l.billing);
        if (iMopub != 2 && iMopub != 0 && !zBilling2) {
            c5257l.metrica(3);
        }
        this.f28767l = ((iMopub == 3 || iMopub == 0) ? 255 : c5257l.mopub(8)) != 0;
    }

    @Override // defpackage.InterfaceC15283l
    public AbstractC8831l isVip(ByteArrayInputStream byteArrayInputStream) {
        boolean z = this.f28767l;
        int i = z ? 32 : 56;
        byte[] bArr = new byte[i];
        AbstractC7016l.amazon(byteArrayInputStream, bArr, 0, i);
        return z ? new C15654l(bArr, 0) : new C14685l(bArr, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0643l
    public /* bridge */ /* synthetic */ Object loadAd(C1381l c1381l) {
        C0444l c0444lYandex;
        InputStream inputStreamRemoteconfig = AbstractC6660l.remoteconfig(c1381l);
        try {
            int i = 4096;
            if (this.f28767l) {
                if (inputStreamRemoteconfig instanceof InterfaceC4202l) {
                    long length = ((InterfaceC4202l) inputStreamRemoteconfig).zza().length();
                    if (length == 0) {
                        i = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                c0444lYandex = C0444l.yandex(AbstractC9284l.m2630package(inputStreamRemoteconfig, i), true);
            } else {
                c0444lYandex = C0444l.yandex(AbstractC9284l.m2630package(inputStreamRemoteconfig, 4096), false);
            }
            AbstractC7876l.loadAd(inputStreamRemoteconfig, null);
            return c0444lYandex;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(inputStreamRemoteconfig, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC12841l
    public boolean mopub() {
        return this.f28767l;
    }

    public String toString() {
        switch (this.f28768l) {
            case 1:
                return AbstractC5020l.Signature(new StringBuilder("IncorrectFragmentation{expected="), !this.f28767l, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC12841l
    public boolean yandex(C9192l c9192l) {
        return this.f28767l;
    }

    public C14706l(int i) {
        this.f28768l = i;
        switch (i) {
            case 10:
                break;
            default:
                this.f28767l = AbstractC18532l.yandex.loadAd(SurfaceOrderQuirk.class) != null;
                break;
        }
    }

    public /* synthetic */ C14706l(boolean z, int i) {
        this.f28768l = i;
        this.f28767l = z;
    }
}
