package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterator, x {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public l(m mVar) {
        this.b = mVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.x
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.O(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.O(this.b, new j$.time.s(1, consumer));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new p((java.util.Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public l(r rVar) {
        this.b = rVar.a.iterator();
    }
}
