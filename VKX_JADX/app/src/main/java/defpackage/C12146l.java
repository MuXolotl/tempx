package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lِۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12146l extends AbstractC5511l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18252l f24154l;

    public C12146l(C18252l c18252l) {
        this.f24154l = c18252l;
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f24154l.yandex(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        C18252l c18252l = this.f24154l;
        c18252l.getClass();
        return new C15220l(c18252l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f24154l.f35760l;
    }
}
