package defpackage;

/* JADX INFO: renamed from: lؘؐٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5341l {
    public static final C6763l yandex = new C6763l(0.4f, 0.0f, 0.2f, 1.0f);
    public static final C6763l loadAd = new C6763l(0.0f, 0.0f, 0.2f, 1.0f);
    public static final C6763l crashlytics = new C6763l(0.4f, 0.0f, 1.0f, 1.0f);
    public static final C9409l amazon = new InterfaceC8097l() { // from class: lًٍ۠
        public final /* synthetic */ int yandex = 1;

        @Override // defpackage.InterfaceC8097l
        public final float yandex(float f) {
            float f2;
            float f3;
            switch (this.yandex) {
                case 0:
                    if (f < 0.36363637f) {
                        return 7.5625f * f * f;
                    }
                    if (f < 0.72727275f) {
                        float f4 = f - 0.54545456f;
                        f2 = 7.5625f * f4 * f4;
                        f3 = 0.75f;
                    } else if (f < 0.90909094f) {
                        float f5 = f - 0.8181818f;
                        f2 = 7.5625f * f5 * f5;
                        f3 = 0.9375f;
                    } else {
                        float f6 = f - 0.95454544f;
                        f2 = 7.5625f * f6 * f6;
                        f3 = 0.984375f;
                    }
                    return f2 + f3;
                default:
                    return f;
            }
        }
    };
}
