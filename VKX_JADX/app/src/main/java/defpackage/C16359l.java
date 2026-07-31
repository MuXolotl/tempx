package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lّٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16359l implements Iterable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f31986l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f31987l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31988l = 0;

    public C16359l(List list, List list2) {
        this.f31987l = list;
        this.f31986l = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f31988l;
        Object obj = this.f31987l;
        Object obj2 = this.f31986l;
        switch (i) {
            case 0:
                return new C10836l(((List) obj).iterator(), ((List) obj2).iterator());
            default:
                C8662l c8662l = (C8662l) obj2;
                return ((C15053l) c8662l.purchase).metrica(c8662l, (String) obj);
        }
    }

    public String toString() {
        switch (this.f31988l) {
            case 1:
                C1693l c1693l = new C1693l(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                c1693l.yandex(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C16359l(C8662l c8662l, String str) {
        this.f31987l = str;
        this.f31986l = c8662l;
    }
}
