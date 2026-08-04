package defpackage;

/* JADX INFO: renamed from: lٕٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15699l implements InterfaceC6097l {
    public final String yandex;

    public C15699l(String str) {
        this.yandex = str;
        if (str.length() <= 0) {
            C8339l.metrica("Empty string is not allowed");
            throw null;
        }
        if (AbstractC3230l.purchase(str.charAt(0))) {
            C10754l.metrica(AbstractC15560l.Signature("String '", str, "' starts with a digit"));
            throw null;
        }
        if (AbstractC3230l.purchase(str.charAt(str.length() - 1))) {
            C10754l.metrica(AbstractC15560l.Signature("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("'"), this.yandex, '\'');
    }

    @Override // defpackage.InterfaceC6097l
    public final Object yandex(InterfaceC7697l interfaceC7697l, String str, int i) {
        String str2 = this.yandex;
        if (str2.length() + i > str.length()) {
            return new C0876l(i, new C10740l(18, this));
        }
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i + i2) != str2.charAt(i2)) {
                return new C0876l(i, new C7033l(this, str, i, i2));
            }
        }
        return Integer.valueOf(str2.length() + i);
    }
}
