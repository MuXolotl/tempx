package defpackage;

/* JADX INFO: renamed from: lٌؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8791l implements InterfaceC0629l {
    public static AbstractC8791l loadAd(String str) {
        int length = str.length();
        if (length == 0) {
            return C16219l.f31752l;
        }
        int i = 0;
        if (length != 1) {
            return length != 2 ? new C18284l(str) : new C13795l(str.charAt(0), str.charAt(1));
        }
        return new C4256l(str.charAt(0), i);
    }

    public static String yandex(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public AbstractC8791l amazon() {
        return new C18284l(this);
    }

    public abstract boolean crashlytics(char c);
}
