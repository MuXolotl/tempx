package defpackage;

/* JADX INFO: renamed from: lًؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7953l extends AbstractC13761l implements InterfaceC7547l {
    public C7953l(Class cls, String str, String str2) {
        super(C11128l.f22339l, cls, str, str2, 0);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final C0859l crashlytics() {
        return ((InterfaceC7547l) mo965synchronized()).crashlytics();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return crashlytics().pro(obj, obj2);
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l pro() {
        return AbstractC18202l.yandex.subs(this);
    }
}
