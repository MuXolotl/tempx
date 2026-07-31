package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌَؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10145l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20653l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f20654l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20655l;

    public /* synthetic */ C10145l(int i, Object obj) {
        this.f20655l = i;
        this.f20653l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20655l) {
            case 0:
                return this.f20654l < ((C13997l) this.f20653l).f27303l.length();
            case 1:
                return this.f20654l < ((C13997l) this.f20653l).f27303l.length();
            default:
                return this.f20654l < ((C5181l) this.f20653l).Signature();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.f20655l;
        Object obj = this.f20653l;
        switch (i) {
            case 0:
                String str = ((C13997l) obj).f27303l;
                int i2 = this.f20654l;
                if (i2 < str.length()) {
                    this.f20654l = i2 + 1;
                    return new C13997l(String.valueOf(i2));
                }
                C4875l.firebase();
                return null;
            case 1:
                C13997l c13997l = (C13997l) obj;
                String str2 = c13997l.f27303l;
                int i3 = this.f20654l;
                if (i3 < str2.length()) {
                    this.f20654l = i3 + 1;
                    return new C13997l(String.valueOf(c13997l.f27303l.charAt(i3)));
                }
                C4875l.firebase();
                return null;
            default:
                C5181l c5181l = (C5181l) obj;
                int i4 = this.f20654l;
                int iSignature = c5181l.Signature();
                int i5 = this.f20654l;
                if (i4 < iSignature) {
                    this.f20654l = i5 + 1;
                    return c5181l.pro(i5);
                }
                C1759l.firebase(AbstractC9361l.Signature(i5, "Out of bounds index: ", new StringBuilder(String.valueOf(i5).length() + 21)));
                return null;
        }
    }
}
