package defpackage;

/* JADX INFO: renamed from: lؑؖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0114l extends AbstractC12329l implements InterfaceC2463l {
    public C0114l(Class cls, String str, String str2, int i) {
        super(C11128l.f22339l, cls, str, str2, i);
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC0109l amazon() {
        return ((InterfaceC2463l) mo965synchronized()).amazon();
    }

    public void appmetrica(Object obj, Object obj2) {
        ((AbstractC0061l) amazon()).pro(obj, obj2);
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC11259l crashlytics() {
        return ((InterfaceC2463l) mo965synchronized()).crashlytics();
    }

    public Object get(Object obj) {
        return ((AbstractC0061l) crashlytics()).pro(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l pro() {
        return AbstractC18202l.yandex.billing(this);
    }
}
