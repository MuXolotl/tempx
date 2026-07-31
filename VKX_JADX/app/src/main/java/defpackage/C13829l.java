package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lْٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13829l {
    public static final C13829l loadAd;
    public final AbstractC8481l yandex;

    static {
        C13161l c13161l = new C13161l();
        c13161l.f25776l = AbstractC8481l.metrica(2, 1, 5);
        loadAd = new C13829l(c13161l);
    }

    public C13829l(C13161l c13161l) {
        this.yandex = (AbstractC8481l) c13161l.f25776l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13829l) && this.yandex.equals(((C13829l) obj).yandex);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.yandex, null, null, bool, bool, bool, bool, bool);
    }
}
