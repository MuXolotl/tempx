package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: lٕۜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15945l extends AbstractC7188l {
    public AbstractC7188l amazon;
    public final Object crashlytics;
    public final String loadAd;
    public final Type yandex;

    public C15945l(Type type, String str, Object obj) {
        this.yandex = type;
        this.loadAd = str;
        this.crashlytics = obj;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        AbstractC7188l abstractC7188l = this.amazon;
        if (abstractC7188l != null) {
            abstractC7188l.billing(c3631l, obj);
        } else {
            C8339l.smaato("JsonAdapter isn't ready");
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) {
        AbstractC7188l abstractC7188l = this.amazon;
        if (abstractC7188l != null) {
            return abstractC7188l.loadAd(c0396l);
        }
        C8339l.smaato("JsonAdapter isn't ready");
        return null;
    }

    public final String toString() {
        AbstractC7188l abstractC7188l = this.amazon;
        return abstractC7188l != null ? abstractC7188l.toString() : super.toString();
    }
}
