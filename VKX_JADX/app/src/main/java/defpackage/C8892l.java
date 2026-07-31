package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٌٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8892l extends AbstractC9813l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f18267l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18268l;

    public /* synthetic */ C8892l(int i, Object obj) {
        this.f18268l = i;
        this.f18267l = obj;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f18268l) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f18268l;
        Object obj = this.f18267l;
        switch (i2) {
            case 0:
                String strGroup = ((C0711l) obj).yandex.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(AbstractC16901l.premium(i, this));
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f18268l) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f18268l) {
            case 1:
                return new C8772l(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f18268l) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public ListIterator listIterator() {
        switch (this.f18268l) {
            case 1:
                return new C8772l(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        int i = this.f18268l;
        Object obj = this.f18267l;
        switch (i) {
            case 0:
                return ((C0711l) obj).yandex.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f18268l) {
            case 1:
                return new C8772l(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
