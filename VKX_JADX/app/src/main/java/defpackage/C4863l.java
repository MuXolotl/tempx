package defpackage;

/* JADX INFO: renamed from: lؘؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4863l {
    public final InterfaceC9858l yandex(long j, Object obj) {
        InterfaceC9858l interfaceC9858l = (InterfaceC9858l) AbstractC1900l.crashlytics.subs(j, obj);
        if (((AbstractC7021l) interfaceC9858l).f14716l) {
            return interfaceC9858l;
        }
        int size = interfaceC9858l.size();
        InterfaceC9858l interfaceC9858lYandex = interfaceC9858l.yandex(size == 0 ? 10 : size * 2);
        AbstractC1900l.startapp(j, obj, interfaceC9858lYandex);
        return interfaceC9858lYandex;
    }
}
