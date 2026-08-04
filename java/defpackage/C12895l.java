package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12895l extends AbstractC7910l {
    public Function1 loadAd;
    public C2397l yandex;

    @Override // defpackage.AbstractC7910l
    public final void loadAd(Throwable th) {
        C2397l c2397l = this.yandex;
        if (c2397l != null) {
            c2397l.subs(new C18435l(th));
        }
    }

    @Override // defpackage.AbstractC7910l
    public final void yandex() {
        this.loadAd = null;
        this.yandex = null;
    }
}
