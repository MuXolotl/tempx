package defpackage;

/* JADX INFO: renamed from: lًۦؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8405l {
    public final int yandex;

    public static String yandex(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : AbstractC15560l.tapsense("Invalid(value=", i, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8405l) {
            return this.yandex == ((C8405l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return yandex(this.yandex);
    }
}
