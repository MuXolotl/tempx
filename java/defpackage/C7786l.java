package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًؕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7786l implements InterfaceC13131l {
    public byte[] crashlytics;
    public final C13384l loadAd;
    public final C2432l yandex;

    public C7786l(InterfaceC14090l interfaceC14090l, C2432l c2432l) {
        C13071l.mopub.getAndIncrement();
        this.yandex = c2432l;
        this.loadAd = new C13384l(interfaceC14090l);
    }

    @Override // defpackage.InterfaceC13131l
    public final void yandex() {
        C13384l c13384l = this.loadAd;
        c13384l.f26266l = 0L;
        try {
            c13384l.crashlytics(this.yandex);
            int i = 0;
            while (i != -1) {
                int i2 = (int) c13384l.f26266l;
                byte[] bArr = this.crashlytics;
                if (bArr == null) {
                    this.crashlytics = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.crashlytics = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.crashlytics;
                i = c13384l.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            AbstractC12366l.yandex(c13384l);
        }
    }

    @Override // defpackage.InterfaceC13131l
    public final void loadAd() {
    }
}
