package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13314l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13975l f26120l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7288l f26121l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f26120l = new C13975l(4);
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final boolean mo1010l() {
        AbstractC3348l c15649l;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f26120l;
        c13975l.getClass();
        int i = C17500l.yandex;
        ByteBuffer byteBuffer = (ByteBuffer) this.f33214l;
        for (int i2 = 0; i2 < 3; i2++) {
            if (byteBuffer.get() != AbstractC3348l.f7141l[i2]) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i3 = C17500l.yandex;
                return false;
            }
        }
        byte b = byteBuffer.get();
        if (b == 2) {
            c15649l = new C15649l();
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
        } else if (b == 3) {
            c15649l = new C9553l();
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
        } else {
            if (b != 4) {
                return false;
            }
            c15649l = new C11246l();
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i6 = C17500l.yandex;
        }
        this.f26121l.f15140l = c15649l;
        byteBuffer.position(0);
        try {
            c15649l.read(byteBuffer);
            return true;
        } catch (AbstractC4923l unused) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i7 = C17500l.yandex;
            return false;
        }
    }
}
