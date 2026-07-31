package defpackage;

/* JADX INFO: renamed from: lُْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13296l extends AbstractC13107l {
    public C13296l(C6364l c6364l, byte b) {
        super(b);
        if (amazon()) {
            C13975l c13975l = C6364l.f13328l;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            AbstractC6419l.billing(this.yandex);
            c13975l.getClass();
            int i = C17500l.yandex;
        }
        if (loadAd()) {
            C13975l c13975l2 = C6364l.f13328l;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l2.getClass();
            int i2 = C17500l.yandex;
        }
        if (crashlytics()) {
            C13975l c13975l3 = C6364l.f13328l;
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l3.getClass();
            int i3 = C17500l.yandex;
        }
        if ((this.yandex & 32) > 0) {
            C13975l c13975l4 = C6364l.f13328l;
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l4.getClass();
            int i4 = C17500l.yandex;
        }
    }

    public final boolean amazon() {
        byte b = this.yandex;
        return (b & 16) > 0 || (b & 8) > 0 || (b & 4) > 0 || (b & 2) > 0 || (b & 1) > 0;
    }

    public final boolean crashlytics() {
        return (this.yandex & 64) > 0;
    }

    public final boolean loadAd() {
        return (this.yandex & 128) > 0;
    }
}
