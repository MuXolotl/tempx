package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lًُۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11286l extends AbstractC7995l {
    public volatile boolean firebase;
    public byte[] isPro;
    public byte[] smaato;

    @Override // defpackage.InterfaceC13131l
    public final void loadAd() {
        this.firebase = true;
    }

    @Override // defpackage.InterfaceC13131l
    public final void yandex() {
        try {
            this.subs.crashlytics(this.loadAd);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.firebase) {
                byte[] bArr = this.isPro;
                if (bArr.length < i2 + 16384) {
                    this.isPro = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.subs.read(this.isPro, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.firebase) {
                this.smaato = Arrays.copyOf(this.isPro, i2);
            }
        } finally {
            AbstractC12366l.yandex(this.subs);
        }
    }
}
