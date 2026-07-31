package defpackage;

/* JADX INFO: renamed from: lَۤۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10686l extends AbstractC13107l {
    public C10686l(C11204l c11204l, byte b) {
        super(b);
        if ((b & 128) > 0 || (b & 32) > 0 || (b & 16) > 0) {
            C13975l c13975l = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            AbstractC6419l.billing(b);
            c13975l.getClass();
            int i = C17500l.yandex;
        }
        if ((this.yandex & 8) > 0) {
            C13975l c13975l2 = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l2.getClass();
            int i2 = C17500l.yandex;
        }
        if (loadAd()) {
            C13975l c13975l3 = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l3.getClass();
            int i3 = C17500l.yandex;
        }
        if ((this.yandex & 64) > 0) {
            C13975l c13975l4 = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l4.getClass();
            int i4 = C17500l.yandex;
        }
        if ((this.yandex & 2) > 0) {
            C13975l c13975l5 = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            c13975l5.getClass();
            int i5 = C17500l.yandex;
        }
        if ((this.yandex & 1) > 0) {
            C13975l c13975l6 = C11204l.f22557l;
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l6.getClass();
            int i6 = C17500l.yandex;
        }
    }

    public final boolean loadAd() {
        return (this.yandex & 4) > 0;
    }

    @Override // defpackage.AbstractC13107l
    public final byte yandex() {
        return this.yandex;
    }

    public C10686l(C11204l c11204l) {
    }
}
