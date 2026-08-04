package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lؓۨؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2285l implements InterfaceC8979l {
    public C5978l admob;
    public final InterfaceC5304l loadAd;
    public InterfaceC17215l mopub;
    public boolean subs;
    public final InterfaceC8979l yandex;
    public int amazon = 0;
    public int purchase = 0;
    public byte[] billing = AbstractC15323l.loadAd;
    public final C13143l crashlytics = new C13143l();

    public C2285l(InterfaceC8979l interfaceC8979l, InterfaceC5304l interfaceC5304l) {
        this.yandex = interfaceC8979l;
        this.loadAd = interfaceC5304l;
    }

    public final void admob(int i) {
        int length = this.billing.length;
        int i2 = this.purchase;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.amazon;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.billing;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.amazon, bArr2, 0, i3);
        this.amazon = 0;
        this.purchase = i3;
        this.billing = bArr2;
    }

    @Override // defpackage.InterfaceC8979l
    public final int billing(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return crashlytics(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final int crashlytics(InterfaceC5802l interfaceC5802l, int i, boolean z) throws EOFException {
        if (this.mopub == null) {
            return this.yandex.crashlytics(interfaceC5802l, i, z);
        }
        admob(i);
        int i2 = interfaceC5802l.read(this.billing, this.purchase, i);
        if (i2 != -1) {
            this.purchase += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        C8339l.vip();
        return 0;
    }

    @Override // defpackage.InterfaceC8979l
    public final void loadAd(C13143l c13143l, int i, int i2) {
        if (this.mopub == null) {
            this.yandex.loadAd(c13143l, i, i2);
            return;
        }
        admob(i);
        c13143l.firebase(this.purchase, i, this.billing);
        this.purchase += i;
    }

    @Override // defpackage.InterfaceC8979l
    public final void mopub(C5978l c5978l) {
        c5978l.metrica.getClass();
        String str = c5978l.metrica;
        AbstractC12442l.admob(AbstractC3825l.admob(str) == 3);
        boolean zEquals = c5978l.equals(this.admob);
        InterfaceC5304l interfaceC5304l = this.loadAd;
        if (!zEquals) {
            this.admob = c5978l;
            this.mopub = interfaceC5304l.mopub(c5978l) ? interfaceC5304l.isPro(c5978l) : null;
        }
        InterfaceC17215l interfaceC17215l = this.mopub;
        InterfaceC8979l interfaceC8979l = this.yandex;
        if (interfaceC17215l == null) {
            interfaceC8979l.mopub(c5978l);
            return;
        }
        C12984l c12984lYandex = c5978l.yandex();
        c12984lYandex.vip = AbstractC3825l.vip("application/x-media3-cues");
        c12984lYandex.isPro = str;
        c12984lYandex.subscription = Long.MAX_VALUE;
        c12984lYandex.f25443private = interfaceC5304l.metrica(c5978l);
        AbstractC9029l.license(c12984lYandex, interfaceC8979l);
    }

    @Override // defpackage.InterfaceC8979l
    public final void purchase(int i, C13143l c13143l) {
        loadAd(c13143l, i, 0);
    }

    @Override // defpackage.InterfaceC8979l
    public final void yandex(long j, int i, int i2, int i3, C0472l c0472l) {
        int i4;
        if (this.mopub == null) {
            this.yandex.yandex(j, i, i2, i3, c0472l);
            return;
        }
        AbstractC12442l.subs(c0472l == null, "DRM on subtitles is not supported");
        int i5 = (this.purchase - i3) - i2;
        try {
            i4 = i5;
            try {
                this.mopub.startapp(this.billing, i4, i2, C8807l.crashlytics, new C10213l(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.subs) {
                    throw runtimeException;
                }
                AbstractC6427l.metrica("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.amazon = i6;
        if (i6 == this.purchase) {
            this.amazon = 0;
            this.purchase = 0;
        }
    }

    @Override // defpackage.InterfaceC8979l
    public final /* synthetic */ void amazon(long j) {
    }
}
