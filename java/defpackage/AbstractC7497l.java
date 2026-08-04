package defpackage;

/* JADX INFO: renamed from: lؚۚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7497l {
    public static final C6839l yandex;

    static {
        C7863l c7863l = new C7863l(50.0f);
        yandex = new C6839l(c7863l, c7863l, c7863l, c7863l);
    }

    public static C6839l loadAd(int i) {
        return new C6839l(new C8448l((i & 1) != 0 ? 0.0f : 16.0f), new C8448l((i & 2) != 0 ? 0.0f : 16.0f), new C8448l((i & 4) != 0 ? 0.0f : 16.0f), new C8448l((i & 8) != 0 ? 0.0f : 16.0f));
    }

    public static final C6839l yandex(float f) {
        C8448l c8448l = new C8448l(f);
        return new C6839l(c8448l, c8448l, c8448l, c8448l);
    }
}
