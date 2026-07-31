package defpackage;

/* JADX INFO: renamed from: lۣۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18552l {
    public static final C11608l Companion = new C11608l();
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C18552l(String str, int i, int i2, int i3, int i4) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C4017l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0;
        } else {
            this.crashlytics = i3;
        }
        if ((i & 8) == 0) {
            this.amazon = (this.crashlytics - this.loadAd) / 1000;
        } else {
            this.amazon = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18552l)) {
            return false;
        }
        C18552l c18552l = (C18552l) obj;
        return AbstractC8576l.yandex(this.yandex, c18552l.yandex) && this.loadAd == c18552l.loadAd && this.crashlytics == c18552l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetAudioPreviewUrlResponseDto(url=");
        sb.append(this.yandex);
        sb.append(", clipFrom=");
        sb.append(this.loadAd);
        sb.append(", clipTo=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
