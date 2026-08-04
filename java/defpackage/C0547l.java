package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؑۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0547l extends AbstractC8481l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f1928l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient Object[] f1929l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient AbstractC13675l f1930l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f1931l;

    public C0547l(AbstractC13675l abstractC13675l, Object[] objArr, int i, int i2) {
        this.f1930l = abstractC13675l;
        this.f1929l = objArr;
        this.f1931l = i;
        this.f1928l = i2;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        return amazon().billing(i, objArr);
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f1930l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return amazon().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1928l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC8481l
    public final AbstractC1186l tapsense() {
        return new C12351l(this);
    }
}
