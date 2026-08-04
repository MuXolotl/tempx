package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٕؖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C4146l extends AbstractC2604l {
    @Override // defpackage.AbstractC3594l
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public C4146l yandex(Object obj) {
        obj.getClass();
        crashlytics(obj);
        return this;
    }

    public AbstractC8481l mopub() {
        int i = this.loadAd;
        if (i == 0) {
            int i2 = AbstractC8481l.f17529l;
            return C13825l.f26967l;
        }
        Object[] objArr = this.yandex;
        if (i != 1) {
            AbstractC8481l abstractC8481lMetrica = AbstractC8481l.metrica(i, objArr);
            this.loadAd = abstractC8481lMetrica.size();
            this.crashlytics = true;
            return abstractC8481lMetrica;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = AbstractC8481l.f17529l;
        return new C12950l(obj);
    }
}
