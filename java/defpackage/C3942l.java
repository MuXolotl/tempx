package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: lؘْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3942l implements CharacterIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8118l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f8119l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CharSequence f8120l;

    public C3942l(CharSequence charSequence, int i) {
        this.f8120l = charSequence;
        this.f8119l = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f8118l;
        if (i == this.f8119l) {
            return (char) 65535;
        }
        return this.f8120l.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f8118l = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f8119l;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f8118l;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f8119l;
        if (i == 0) {
            this.f8118l = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f8118l = i2;
        return this.f8120l.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f8118l + 1;
        this.f8118l = i;
        int i2 = this.f8119l;
        if (i < i2) {
            return this.f8120l.charAt(i);
        }
        this.f8118l = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f8118l;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f8118l = i2;
        return this.f8120l.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f8119l || i < 0) {
            C8339l.metrica("invalid position");
            return (char) 0;
        }
        this.f8118l = i;
        return current();
    }
}
