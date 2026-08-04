package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: lُۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11521l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f23173l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f23174l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23175l;

    public C11521l(C4955l c4955l) {
        this.f23175l = 2;
        this.f23173l = c4955l;
        this.f23174l = c4955l.crashlytics;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f23175l;
        Object obj = this.f23173l;
        switch (i) {
            case 0:
                return this.f23174l < ((AbstractC9813l) obj).pro();
            case 1:
                return this.f23174l < ((Object[]) obj).length;
            case 2:
                return this.f23174l > 0;
            case 3:
                return this.f23174l < ((byte[]) obj).length;
            case 4:
                return this.f23174l < ((int[]) obj).length;
            case 5:
                return this.f23174l < ((long[]) obj).length;
            case 6:
                return this.f23174l < ((short[]) obj).length;
            default:
                return this.f23174l < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f23175l;
        Object obj = this.f23173l;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C4875l.firebase();
                    return null;
                }
                int i2 = this.f23174l;
                this.f23174l = i2 + 1;
                return ((AbstractC9813l) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f23174l;
                    this.f23174l = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f23174l--;
                    C1759l.firebase(e.getMessage());
                    return null;
                }
            case 2:
                C4955l c4955l = (C4955l) obj;
                int i4 = c4955l.crashlytics;
                int i5 = this.f23174l;
                this.f23174l = i5 - 1;
                return c4955l.purchase[i4 - i5];
            case 3:
                int i6 = this.f23174l;
                byte[] bArr = (byte[]) obj;
                if (i6 < bArr.length) {
                    this.f23174l = i6 + 1;
                    return new C15962l(bArr[i6]);
                }
                C1759l.firebase(String.valueOf(i6));
                return null;
            case 4:
                int i7 = this.f23174l;
                int[] iArr = (int[]) obj;
                if (i7 < iArr.length) {
                    this.f23174l = i7 + 1;
                    return new C12524l(iArr[i7]);
                }
                C1759l.firebase(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.f23174l;
                long[] jArr = (long[]) obj;
                if (i8 < jArr.length) {
                    this.f23174l = i8 + 1;
                    return new C10882l(jArr[i8]);
                }
                C1759l.firebase(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.f23174l;
                short[] sArr = (short[]) obj;
                if (i9 < sArr.length) {
                    this.f23174l = i9 + 1;
                    return new C15717l(sArr[i9]);
                }
                C1759l.firebase(String.valueOf(i9));
                return null;
            default:
                int i10 = this.f23174l;
                this.f23174l = i10 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23175l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f23173l;
                int i = this.f23174l - 1;
                this.f23174l = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ C11521l(int i, Object obj) {
        this.f23175l = i;
        this.f23173l = obj;
    }
}
