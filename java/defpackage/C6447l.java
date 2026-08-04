package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6447l extends AbstractC3165l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13470l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f13471l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6756l f13472l;

    public C6447l(C6756l c6756l, int i) {
        super(false, 1);
        this.f13472l = c6756l;
        Object obj = C6756l.f14155l;
        this.f13471l = c6756l.vip()[i];
        this.f13470l = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13471l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C6756l c6756l = this.f13472l;
        Map mapStartapp = c6756l.startapp();
        if (mapStartapp != null) {
            return mapStartapp.get(this.f13471l);
        }
        yandex();
        int i = this.f13470l;
        if (i == -1) {
            return null;
        }
        return c6756l.metrica()[i];
    }

    @Override // defpackage.AbstractC3165l, java.util.Map.Entry
    public final Object setValue(Object obj) {
        C6756l c6756l = this.f13472l;
        Map mapStartapp = c6756l.startapp();
        Object obj2 = this.f13471l;
        if (mapStartapp != null) {
            return mapStartapp.put(obj2, obj);
        }
        yandex();
        int i = this.f13470l;
        if (i == -1) {
            c6756l.put(obj2, obj);
            return null;
        }
        Object obj3 = c6756l.metrica()[i];
        c6756l.metrica()[this.f13470l] = obj;
        return obj3;
    }

    public final void yandex() {
        int i = this.f13470l;
        Object obj = this.f13471l;
        C6756l c6756l = this.f13472l;
        if (i != -1 && i < c6756l.size()) {
            if (AbstractC7574l.firebase(obj, c6756l.vip()[this.f13470l])) {
                return;
            }
        }
        Object obj2 = C6756l.f14155l;
        this.f13470l = c6756l.tapsense(obj);
    }
}
