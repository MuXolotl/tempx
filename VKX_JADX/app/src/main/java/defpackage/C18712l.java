package defpackage;

/* JADX INFO: renamed from: lۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18712l {
    public final C4974l loadAd;
    public final C4974l yandex;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        C8195l c8195l = new C8195l(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new C18712l(c8195l, new C8195l(fValueOf2, fValueOf2));
    }

    public C18712l(C8195l... c8195lArr) {
        this.yandex = new C4974l(c8195lArr.length);
        this.loadAd = new C4974l(c8195lArr.length);
        int length = c8195lArr.length;
        int i = 0;
        while (true) {
            C4974l c4974l = this.yandex;
            if (i >= length) {
                AbstractC7236l.subs(c4974l);
                AbstractC7236l.subs(this.loadAd);
                return;
            } else {
                c4974l.yandex(((Number) c8195lArr[i].f17098l).floatValue());
                this.loadAd.yandex(((Number) c8195lArr[i].f17097l).floatValue());
                i++;
            }
        }
    }
}
