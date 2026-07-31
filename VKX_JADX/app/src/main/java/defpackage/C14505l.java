package defpackage;

/* JADX INFO: renamed from: lٌۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14505l {
    public final int yandex;

    public final boolean equals(Object obj) {
        if (obj instanceof C14505l) {
            return this.yandex == ((C14505l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        int i = this.yandex;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
