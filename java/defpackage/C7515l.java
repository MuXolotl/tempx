package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؚۛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7515l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f15526l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Iterable f15529l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15528l = 5;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15527l = 0;

    public C7515l(AbstractC15619l abstractC15619l) {
        this.f15529l = abstractC15619l;
        this.f15526l = abstractC15619l.billing();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15528l) {
            case 0:
                return this.f15527l < this.f15526l;
            case 1:
                return this.f15527l < this.f15526l;
            case 2:
                return this.f15527l < this.f15526l;
            case 3:
                return this.f15527l < this.f15526l;
            case 4:
                return this.f15527l < this.f15526l;
            default:
                return this.f15527l < this.f15526l;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15528l;
        Iterable iterable = this.f15529l;
        int i2 = this.f15526l;
        switch (i) {
            case 0:
                int i3 = this.f15527l;
                if (i3 < i2) {
                    this.f15527l = i3 + 1;
                    return Byte.valueOf(((C15379l) iterable).smaato(i3));
                }
                C4875l.firebase();
                return null;
            case 1:
                int i4 = this.f15527l;
                if (i4 < i2) {
                    this.f15527l = i4 + 1;
                    return Byte.valueOf(((C14809l) iterable).remoteconfig(i4));
                }
                C4875l.firebase();
                return null;
            case 2:
                int i5 = this.f15527l;
                if (i5 < i2) {
                    this.f15527l = i5 + 1;
                    return Byte.valueOf(((C4966l) iterable).smaato(i5));
                }
                C4875l.firebase();
                return null;
            case 3:
                return Byte.valueOf(yandex());
            case 4:
                int i6 = this.f15527l;
                if (i6 < i2) {
                    this.f15527l = i6 + 1;
                    return Byte.valueOf(((AbstractC15619l) iterable).amazon(i6));
                }
                C4875l.firebase();
                return null;
            default:
                int i7 = this.f15527l;
                if (i7 < i2) {
                    this.f15527l = i7 + 1;
                    return Byte.valueOf(((C1998l) iterable).billing(i7));
                }
                C4875l.firebase();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15528l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public byte yandex() {
        try {
            byte[] bArr = ((C7362l) this.f15529l).f15271l;
            int i = this.f15527l;
            this.f15527l = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            C1759l.firebase(e.getMessage());
            return (byte) 0;
        }
    }

    public C7515l(C1998l c1998l) {
        this.f15529l = c1998l;
        this.f15526l = c1998l.mopub();
    }

    public C7515l(C15379l c15379l) {
        this.f15529l = c15379l;
        this.f15526l = c15379l.size();
    }

    public C7515l(C14809l c14809l) {
        this.f15529l = c14809l;
        this.f15526l = c14809l.size();
    }

    public C7515l(C4966l c4966l) {
        this.f15529l = c4966l;
        this.f15526l = c4966l.size();
    }

    public C7515l(C7362l c7362l) {
        this.f15529l = c7362l;
        this.f15526l = c7362l.f15271l.length;
    }
}
