package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lُۧٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11506l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f23127l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Iterator f23128l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23129l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f23130l;

    public C11506l(C0819l c0819l) {
        this.f23129l = 6;
        this.f23130l = c0819l;
        Collection collection = c0819l.f2457l;
        this.f23127l = collection;
        this.f23128l = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void crashlytics() {
        C0819l c0819l = (C0819l) this.f23130l;
        c0819l.billing();
        if (c0819l.f2457l == ((Collection) this.f23127l)) {
            return;
        }
        C8339l.mopub();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23129l) {
            case 0:
                Iterator it = (Iterator) this.f23127l;
                Iterator it2 = this.f23128l;
                if (it2 != null && it2.hasNext()) {
                    return true;
                }
                if (it.hasNext()) {
                    return it.hasNext();
                }
                return false;
            case 1:
                return this.f23128l.hasNext();
            case 2:
                return this.f23128l.hasNext();
            case 3:
                loadAd();
                return this.f23128l.hasNext();
            case 4:
                return this.f23128l.hasNext();
            case 5:
                return this.f23128l.hasNext();
            default:
                crashlytics();
                return this.f23128l.hasNext();
        }
    }

    public void loadAd() {
        AbstractC1979l abstractC1979l = (AbstractC1979l) this.f23130l;
        abstractC1979l.billing();
        if (abstractC1979l.f4493l == ((Collection) this.f23127l)) {
            return;
        }
        C8339l.mopub();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f23129l;
        Object obj = this.f23130l;
        switch (i) {
            case 0:
                if (this.f23128l == null) {
                    yandex();
                }
                Iterator it = this.f23128l;
                if (it != null && !it.hasNext()) {
                    yandex();
                }
                Iterator it2 = this.f23128l;
                if (it2 != null) {
                    return (InterfaceC4656l) it2.next();
                }
                C4875l.firebase();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.f23128l.next();
                this.f23127l = (Collection) entry.getValue();
                return ((C1137l) obj).yandex(entry);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f23128l.next();
                this.f23127l = entry2;
                return entry2.getKey();
            case 3:
                loadAd();
                return this.f23128l.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f23128l.next();
                this.f23127l = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                C14164l c14164l = (C14164l) ((C1137l) obj).f3095l;
                c14164l.getClass();
                List list = (List) collection;
                return new C6628l(key, list instanceof RandomAccess ? new C9209l(c14164l, key, list, null) : new C0819l(c14164l, key, list, null));
            case 5:
                Map.Entry entry4 = (Map.Entry) this.f23128l.next();
                this.f23127l = entry4;
                return entry4.getKey();
            default:
                crashlytics();
                return this.f23128l.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f23129l;
        Object obj = this.f23130l;
        switch (i) {
            case 0:
                this.f23128l.remove();
                break;
            case 1:
                AbstractC12442l.ads("no calls to next() since the last call to remove()", ((Collection) this.f23127l) != null);
                this.f23128l.remove();
                ((AbstractC2168l) ((C1137l) obj).f3095l).f4809l -= ((Collection) this.f23127l).size();
                ((Collection) this.f23127l).clear();
                this.f23127l = null;
                break;
            case 2:
                AbstractC12442l.ads("no calls to next() since the last call to remove()", ((Map.Entry) this.f23127l) != null);
                Collection collection = (Collection) ((Map.Entry) this.f23127l).getValue();
                this.f23128l.remove();
                ((C3087l) obj).f6620l.f4809l -= collection.size();
                collection.clear();
                this.f23127l = null;
                break;
            case 3:
                this.f23128l.remove();
                AbstractC1979l abstractC1979l = (AbstractC1979l) obj;
                abstractC1979l.f4495l.f4809l--;
                abstractC1979l.mopub();
                break;
            case 4:
                if (!(((Collection) this.f23127l) != null)) {
                    C8339l.smaato("no calls to next() since the last call to remove()");
                } else {
                    this.f23128l.remove();
                    ((C14164l) ((C1137l) obj).f3095l).getClass();
                    ((Collection) this.f23127l).size();
                    ((Collection) this.f23127l).clear();
                    this.f23127l = null;
                }
                break;
            case 5:
                Map.Entry entry = (Map.Entry) this.f23127l;
                if (!(entry != null)) {
                    C8339l.smaato("no calls to next() since the last call to remove()");
                } else {
                    Collection collection2 = (Collection) entry.getValue();
                    this.f23128l.remove();
                    ((C14679l) obj).f28727l.getClass();
                    collection2.size();
                    collection2.clear();
                    this.f23127l = null;
                }
                break;
            default:
                this.f23128l.remove();
                ((C0819l) obj).mopub();
                break;
        }
    }

    public void yandex() {
        Iterator it = (Iterator) this.f23130l;
        if (it.hasNext()) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!(entry.getValue() instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((InterfaceC4656l) entry.getValue());
                    this.f23128l = arrayList.iterator();
                    return;
                } else {
                    List list = (List) entry.getValue();
                    if (list.size() != 0) {
                        this.f23128l = list.iterator();
                        return;
                    }
                }
            }
        }
    }

    public C11506l(C0819l c0819l, ListIterator listIterator) {
        this.f23129l = 6;
        this.f23130l = c0819l;
        this.f23127l = c0819l.f2457l;
        this.f23128l = listIterator;
    }

    public C11506l(C1137l c1137l, byte b) {
        this.f23129l = 4;
        this.f23130l = c1137l;
        this.f23128l = c1137l.f3093l.entrySet().iterator();
    }

    public /* synthetic */ C11506l(AbstractSet abstractSet, Iterator it, int i) {
        this.f23129l = i;
        this.f23128l = it;
        this.f23130l = abstractSet;
    }

    public C11506l(AbstractC1979l abstractC1979l) {
        Iterator it;
        this.f23129l = 3;
        this.f23130l = abstractC1979l;
        Collection collection = abstractC1979l.f4493l;
        this.f23127l = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f23128l = it;
    }

    public C11506l(C9898l c9898l, ListIterator listIterator) {
        this.f23129l = 3;
        this.f23130l = c9898l;
        this.f23127l = c9898l.f4493l;
        this.f23128l = listIterator;
    }

    public C11506l(Iterator it, Iterator it2) {
        this.f23129l = 0;
        this.f23127l = it;
        this.f23130l = it2;
    }

    public C11506l(C1137l c1137l) {
        this.f23129l = 1;
        this.f23130l = c1137l;
        this.f23128l = c1137l.f3093l.entrySet().iterator();
    }
}
