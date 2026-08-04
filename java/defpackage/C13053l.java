package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lْؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13053l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f25564l = 1;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final char f25565l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char f25566l;

    static {
        new C13053l((char) 1, (char) 0);
    }

    public C13053l(char c, char c2) {
        this.f25566l = c;
        this.f25565l = (char) AbstractC17764l.amazon(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13053l)) {
            return false;
        }
        if (isEmpty() && ((C13053l) obj).isEmpty()) {
            return true;
        }
        C13053l c13053l = (C13053l) obj;
        return this.f25566l == c13053l.f25566l && this.f25565l == c13053l.f25565l;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f25566l * 31) + this.f25565l;
    }

    public final boolean isEmpty() {
        return AbstractC8576l.subs(this.f25566l, this.f25565l) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1115l(this.f25566l, this.f25565l, this.f25564l);
    }

    public final String toString() {
        return this.f25566l + ".." + this.f25565l;
    }
}
