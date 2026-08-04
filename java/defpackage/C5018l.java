package defpackage;

/* JADX INFO: renamed from: lٜؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5018l {
    public final InterfaceC10996l yandex(long j, Object obj) {
        InterfaceC10996l interfaceC10996l = (InterfaceC10996l) AbstractC10176l.crashlytics.subs(j, obj);
        if (((AbstractC0853l) interfaceC10996l).f2503l) {
            return interfaceC10996l;
        }
        int size = interfaceC10996l.size();
        InterfaceC10996l interfaceC10996lYandex = interfaceC10996l.yandex(size == 0 ? 10 : size * 2);
        AbstractC10176l.startapp(j, obj, interfaceC10996lYandex);
        return interfaceC10996lYandex;
    }
}
