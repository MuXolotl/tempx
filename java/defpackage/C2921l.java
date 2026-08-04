package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؔۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2921l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f6359l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6360l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6361l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11349l f6362l;

    public C2921l(C11349l c11349l, int i) {
        this.f6361l = i;
        switch (i) {
            case 1:
                this.f6362l = c11349l;
                while (true) {
                    int i2 = this.f6360l;
                    C11349l c11349l2 = this.f6362l;
                    if (i2 < c11349l2.f22894l) {
                        int i3 = c11349l2.f22895l[i2];
                        if (i3 < 0 || c11349l2.f22893l[i3] == null) {
                            this.f6360l = i2 + 1;
                        }
                    }
                    break;
                }
                break;
            case 2:
                this.f6362l = c11349l;
                while (true) {
                    int i4 = this.f6360l;
                    C11349l c11349l3 = this.f6362l;
                    if (i4 < c11349l3.f22894l) {
                        int i5 = c11349l3.f22895l[i4];
                        if (i5 < 0 || c11349l3.f22893l[i5] == null) {
                            this.f6360l = i4 + 1;
                        }
                    }
                    break;
                }
                break;
            default:
                this.f6362l = c11349l;
                while (true) {
                    int i6 = this.f6360l;
                    C11349l c11349l4 = this.f6362l;
                    if (i6 < c11349l4.f22894l) {
                        int i7 = c11349l4.f22895l[i6];
                        if (i7 < 0 || c11349l4.f22893l[i7] == null) {
                            this.f6360l = i6 + 1;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6361l;
        C11349l c11349l = this.f6362l;
        switch (i) {
            case 0:
                return this.f6360l < c11349l.f22894l;
            case 1:
                return this.f6360l < c11349l.f22894l;
            default:
                return this.f6360l < c11349l.f22894l;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        int i2;
        int i3;
        int i4 = this.f6361l;
        C11349l c11349l = this.f6362l;
        switch (i4) {
            case 0:
                if (!hasNext()) {
                    C4875l.firebase();
                    return null;
                }
                int[] iArr = c11349l.f22895l;
                int i5 = this.f6360l;
                int i6 = iArr[i5];
                String str = c11349l.f22893l[i6];
                this.f6359l = str;
                C3162l c3162l = new C3162l(c11349l, str, c11349l.f22892l[i6]);
                this.f6360l = i5 + 1;
                while (true) {
                    int i7 = this.f6360l;
                    if (i7 < c11349l.f22894l && ((i = c11349l.f22895l[i7]) < 0 || c11349l.f22893l[i] == null)) {
                        this.f6360l = i7 + 1;
                    }
                }
                return c3162l;
            case 1:
                if (!hasNext()) {
                    C4875l.firebase();
                    return null;
                }
                int[] iArr2 = c11349l.f22895l;
                int i8 = this.f6360l;
                this.f6359l = c11349l.f22893l[iArr2[i8]];
                this.f6360l = i8 + 1;
                while (true) {
                    int i9 = this.f6360l;
                    if (i9 < c11349l.f22894l && ((i2 = c11349l.f22895l[i9]) < 0 || c11349l.f22893l[i2] == null)) {
                        this.f6360l = i9 + 1;
                    }
                }
                return this.f6359l;
            default:
                if (!hasNext()) {
                    C4875l.firebase();
                    return null;
                }
                int[] iArr3 = c11349l.f22895l;
                int i10 = this.f6360l;
                int i11 = iArr3[i10];
                this.f6359l = c11349l.f22893l[i11];
                Object obj = c11349l.f22892l[i11];
                this.f6360l = i10 + 1;
                while (true) {
                    int i12 = this.f6360l;
                    if (i12 < c11349l.f22894l && ((i3 = c11349l.f22895l[i12]) < 0 || c11349l.f22893l[i3] == null)) {
                        this.f6360l = i12 + 1;
                    }
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f6361l;
        C11349l c11349l = this.f6362l;
        switch (i) {
            case 0:
                String str = this.f6359l;
                if (str == null) {
                    C8339l.smaato("next() must be called before remove()");
                } else {
                    c11349l.remove(str);
                    this.f6359l = null;
                }
                break;
            case 1:
                String str2 = this.f6359l;
                if (str2 == null) {
                    C8339l.smaato("next() must be called before remove()");
                } else {
                    c11349l.remove(str2);
                    this.f6359l = null;
                }
                break;
            default:
                String str3 = this.f6359l;
                if (str3 == null) {
                    C8339l.smaato("next() must be called before remove()");
                } else {
                    c11349l.remove(str3);
                    this.f6359l = null;
                }
                break;
        }
    }
}
