package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lؙٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15037l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f29559l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f29560l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29561l;

    public /* synthetic */ C15037l(int i, Object obj) {
        this.f29561l = i;
        this.f29559l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f29561l;
        Object obj = this.f29559l;
        switch (i) {
            case 0:
                return this.f29560l < ((C10518l) obj).getChildCount();
            case 1:
                return this.f29560l < ((Object[]) obj).length;
            case 2:
                C4187l c4187l = (C4187l) obj;
                return this.f29560l < c4187l.billing() - c4187l.amazon();
            default:
                return this.f29560l < ((C12518l) ((C6542l) obj).f13652l).purchase;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f29561l;
        Object obj = this.f29559l;
        switch (i) {
            case 0:
                View childAt = ((C10518l) obj).getChildAt(this.f29560l);
                this.f29560l++;
                return childAt;
            case 1:
                int i2 = this.f29560l;
                Object[] objArr = (Object[]) obj;
                if (i2 != objArr.length) {
                    this.f29560l = i2 + 1;
                    return objArr[i2];
                }
                throw new NoSuchElementException("Out of elements: " + this.f29560l);
            case 2:
                int i3 = this.f29560l;
                C4187l c4187l = (C4187l) obj;
                if (i3 >= c4187l.billing() - c4187l.amazon()) {
                    C4875l.firebase();
                    return null;
                }
                Object obj2 = c4187l.f8602l.f34589l[c4187l.amazon() + i3];
                this.f29560l = i3 + 1;
                return obj2;
            default:
                int i4 = this.f29560l;
                this.f29560l = i4 + 1;
                C12518l c12518l = (C12518l) ((C6542l) obj).f13652l;
                return c12518l.amazon(c12518l.amazon[i4] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f29561l) {
            case 0:
                ((C10518l) this.f29559l).removeViewAt(this.f29560l);
                this.f29560l--;
                return;
            case 1:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
