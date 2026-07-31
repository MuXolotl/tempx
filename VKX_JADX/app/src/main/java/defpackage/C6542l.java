package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٍؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C6542l extends AbstractSet {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13652l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13653l;

    public /* synthetic */ C6542l(int i, Object obj) {
        this.f13653l = i;
        this.f13652l = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.f13653l;
        Object obj2 = this.f13652l;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C16515l) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C2902l) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((C3052l) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((C13639l) obj2).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f13653l;
        Object obj = this.f13652l;
        switch (i) {
            case 1:
                ((C16515l) obj).clear();
                break;
            case 2:
                ((C2902l) obj).clear();
                break;
            case 3:
                ((C3052l) obj).clear();
                break;
            case 4:
                ((C13639l) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.f13653l;
        Object obj2 = this.f13652l;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((C16515l) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((C2902l) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((C3052l) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 != value3) {
                    return obj5 != null && obj5.equals(value3);
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((C13639l) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 != value4) {
                    return obj6 != null && obj6.equals(value4);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f13653l;
        int i2 = 3;
        Object obj = this.f13652l;
        switch (i) {
            case 0:
                return new C0904l((C11154l) obj);
            case 1:
                return new C12104l((C16515l) obj, 0);
            case 2:
                return new C12104l((C2902l) obj, 1);
            case 3:
                return new C12104l((C3052l) obj);
            case 4:
                return new C12104l((C13639l) obj, i2);
            default:
                return new C15037l(i2, this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.f13653l;
        Object obj2 = this.f13652l;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C16515l) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C2902l) obj2).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C3052l) obj2).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((C13639l) obj2).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f13653l;
        Object obj = this.f13652l;
        switch (i) {
            case 0:
                return ((C11154l) obj).f11161l;
            case 1:
                return ((C16515l) obj).size();
            case 2:
                return ((C2902l) obj).size();
            case 3:
                return ((C3052l) obj).size();
            case 4:
                return ((C13639l) obj).size();
            default:
                return ((C12518l) obj).purchase;
        }
    }
}
