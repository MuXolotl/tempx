package defpackage;

/* JADX INFO: renamed from: lؘُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11393l {
    public final String yandex;

    public AbstractC11393l(String str) {
        this.yandex = str;
        if (!AbstractC10436l.crashlytics.amazon(str)) {
            throw new C15157l("Invalid authScheme value: it should be token, but instead it is ".concat(str));
        }
    }

    public final String toString() {
        return yandex();
    }

    public abstract String yandex();
}
