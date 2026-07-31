package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؓۗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2054l extends AbstractC3165l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f4588l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f4589l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f4590l;

    public C2054l(C6756l c6756l, int i) {
        super(false, 0);
        this.f4590l = c6756l;
        Object obj = C6756l.f14155l;
        this.f4589l = c6756l.isPro()[i];
        this.f4588l = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4589l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C6756l c6756l = this.f4590l;
        Map mapCrashlytics = c6756l.crashlytics();
        if (mapCrashlytics != null) {
            return mapCrashlytics.get(this.f4589l);
        }
        yandex();
        int i = this.f4588l;
        if (i == -1) {
            return null;
        }
        return c6756l.firebase()[i];
    }

    @Override // defpackage.AbstractC3165l, java.util.Map.Entry
    public final Object setValue(Object obj) {
        C6756l c6756l = this.f4590l;
        Map mapCrashlytics = c6756l.crashlytics();
        Object obj2 = this.f4589l;
        if (mapCrashlytics != null) {
            return mapCrashlytics.put(obj2, obj);
        }
        yandex();
        int i = this.f4588l;
        if (i == -1) {
            c6756l.put(obj2, obj);
            return null;
        }
        Object obj3 = c6756l.firebase()[i];
        c6756l.firebase()[this.f4588l] = obj;
        return obj3;
    }

    public final void yandex() {
        int i = this.f4588l;
        Object obj = this.f4589l;
        C6756l c6756l = this.f4590l;
        if (i != -1 && i < c6756l.size()) {
            if (AbstractC7000l.loadAd(obj, c6756l.isPro()[this.f4588l])) {
                return;
            }
        }
        Object obj2 = C6756l.f14155l;
        this.f4588l = c6756l.purchase(obj);
    }
}
