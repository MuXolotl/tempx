package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؒٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1208l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f3255l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f3256l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CharSequence f3257l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3258l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f3259l;

    public C1208l(CharSequence charSequence) {
        this.f3257l = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f3256l;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f3258l < 0) {
            this.f3256l = 2;
            return false;
        }
        CharSequence charSequence = this.f3257l;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f3255l; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f3256l = 1;
                this.f3258l = i;
                this.f3259l = length;
                return true;
            }
        }
        i = -1;
        this.f3256l = 1;
        this.f3258l = i;
        this.f3259l = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        this.f3256l = 0;
        int i = this.f3259l;
        int i2 = this.f3255l;
        this.f3255l = this.f3258l + i;
        return this.f3257l.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
