package defpackage;

/* JADX INFO: renamed from: lٍۢۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9899l {
    public final InterfaceC0400l yandex(long j, Object obj) {
        InterfaceC0400l interfaceC0400l = (InterfaceC0400l) AbstractC0357l.crashlytics.admob(j, obj);
        if (((C10268l) interfaceC0400l).f20905l) {
            return interfaceC0400l;
        }
        C10268l c10268l = (C10268l) interfaceC0400l;
        int i = c10268l.f20903l;
        C10268l c10268lMopub = c10268l.mopub(i == 0 ? 10 : i * 2);
        AbstractC0357l.metrica(j, obj, c10268lMopub);
        return c10268lMopub;
    }
}
