package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l٘ۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18343l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f35857l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Iterator f35858l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35859l;

    public C18343l(C11100l c11100l) {
        this.f35859l = 0;
        this.f35857l = c11100l;
        this.f35858l = c11100l.yandex.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35859l) {
            case 0:
                break;
        }
        return this.f35858l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35859l;
        Object obj = this.f35857l;
        switch (i) {
            case 0:
                return ((C11100l) obj).loadAd.invoke(this.f35858l.next());
            default:
                Object next = this.f35858l.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C11521l c11521l = viewGroup != null ? new C11521l(7, viewGroup) : null;
                if (c11521l == null || !c11521l.hasNext()) {
                    while (!this.f35858l.hasNext() && !arrayList.isEmpty()) {
                        this.f35858l = (Iterator) AbstractC16901l.m4214continue(arrayList);
                        AbstractC3984l.isVip(arrayList);
                    }
                } else {
                    arrayList.add(this.f35858l);
                    this.f35858l = c11521l;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f35859l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C18343l(C11521l c11521l) {
        this.f35859l = 1;
        this.f35857l = new ArrayList();
        this.f35858l = c11521l;
    }
}
