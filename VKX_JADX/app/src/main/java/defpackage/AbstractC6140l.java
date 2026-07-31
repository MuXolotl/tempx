package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lًؘۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6140l implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient AbstractCollection f12930l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient AbstractCollection f12931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12932l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient AbstractCollection f12933l;

    public /* synthetic */ AbstractC6140l(int i) {
        this.f12932l = i;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:818)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static void yandex(java.util.Set r18) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6140l.yandex(java.util.Set):void");
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f12932l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f12932l) {
            case 0:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f12932l) {
            case 0:
                C8383l c8383l = (C8383l) this.f12933l;
                if (c8383l == null) {
                    C14727l c14727l = (C14727l) this;
                    C8383l c8383l2 = new C8383l(1, c14727l.f28799l, c14727l.f28801l);
                    this.f12933l = c8383l2;
                    c8383l = c8383l2;
                }
                return c8383l.contains(obj);
            case 1:
                C13034l c13034l = (C13034l) this.f12933l;
                if (c13034l == null) {
                    C14885l c14885l = (C14885l) this;
                    C13034l c13034l2 = new C13034l(1, c14885l.f29272l, c14885l.f29274l);
                    this.f12933l = c13034l2;
                    c13034l = c13034l2;
                }
                return c13034l.contains(obj);
            default:
                C10813l c10813l = (C10813l) this.f12933l;
                if (c10813l == null) {
                    C10813l c10813l2 = new C10813l(1, ((C12903l) this).f25364l);
                    this.f12933l = c10813l2;
                    c10813l = c10813l2;
                }
                return c10813l.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f12932l) {
            case 0:
                C10606l c10606l = (C10606l) this.f12931l;
                if (c10606l != null) {
                    return c10606l;
                }
                C14727l c14727l = (C14727l) this;
                C10606l c10606l2 = new C10606l(c14727l, c14727l.f28801l, c14727l.f28799l);
                this.f12931l = c10606l2;
                return c10606l2;
            case 1:
                C8418l c8418l = (C8418l) this.f12931l;
                if (c8418l != null) {
                    return c8418l;
                }
                C14885l c14885l = (C14885l) this;
                C8418l c8418l2 = new C8418l(c14885l, c14885l.f29274l, c14885l.f29272l);
                this.f12931l = c8418l2;
                return c8418l2;
            default:
                C18126l c18126l = (C18126l) this.f12931l;
                if (c18126l != null) {
                    return c18126l;
                }
                C12903l c12903l = (C12903l) this;
                C18126l c18126l2 = new C18126l(c12903l, c12903l.f25364l);
                this.f12931l = c18126l2;
                return c18126l2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f12932l) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        int i = this.f12932l;
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f12932l) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f12932l) {
            case 0:
                C10606l c10606l = (C10606l) this.f12931l;
                if (c10606l == null) {
                    C14727l c14727l = (C14727l) this;
                    C10606l c10606l2 = new C10606l(c14727l, c14727l.f28801l, c14727l.f28799l);
                    this.f12931l = c10606l2;
                    c10606l = c10606l2;
                }
                Iterator it = c10606l.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                C8418l c8418l = (C8418l) this.f12931l;
                if (c8418l == null) {
                    C14885l c14885l = (C14885l) this;
                    C8418l c8418l2 = new C8418l(c14885l, c14885l.f29274l, c14885l.f29272l);
                    this.f12931l = c8418l2;
                    c8418l = c8418l2;
                }
                Iterator it2 = c8418l.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                C18126l c18126l = (C18126l) this.f12931l;
                if (c18126l == null) {
                    C12903l c12903l = (C12903l) this;
                    C18126l c18126l2 = new C18126l(c12903l, c12903l.f25364l);
                    this.f12931l = c18126l2;
                    c18126l = c18126l2;
                }
                Iterator it3 = c18126l.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f12932l) {
            case 0:
                return ((C14727l) this).size() == 0;
            case 1:
                return ((C14885l) this).size() == 0;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f12932l) {
            case 0:
                C8834l c8834l = (C8834l) this.f12930l;
                if (c8834l != null) {
                    return c8834l;
                }
                C14727l c14727l = (C14727l) this;
                C8834l c8834l2 = new C8834l(c14727l, new C8383l(0, c14727l.f28799l, c14727l.f28801l));
                this.f12930l = c8834l2;
                return c8834l2;
            case 1:
                C9752l c9752l = (C9752l) this.f12930l;
                if (c9752l != null) {
                    return c9752l;
                }
                C14885l c14885l = (C14885l) this;
                C9752l c9752l2 = new C9752l(c14885l, new C13034l(0, c14885l.f29272l, c14885l.f29274l));
                this.f12930l = c9752l2;
                return c9752l2;
            default:
                C16622l c16622l = (C16622l) this.f12930l;
                if (c16622l != null) {
                    return c16622l;
                }
                C12903l c12903l = (C12903l) this;
                C16622l c16622l2 = new C16622l(c12903l, new C10813l(0, c12903l.f25364l));
                this.f12930l = c16622l2;
                return c16622l2;
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f12932l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f12932l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f12932l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i = this.f12932l;
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        boolean z = true;
        switch (this.f12932l) {
            case 0:
                int i = ((C14727l) this).f28799l;
                if (i < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (C10606l) entrySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                int i2 = ((C14885l) this).f29272l;
                if (i2 < 0) {
                    C8339l.metrica(AbstractC9361l.Signature(i2, "size cannot be negative but was: ", new StringBuilder(String.valueOf(i2).length() + 33)));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (C8418l) entrySet()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry3 : (C18126l) entrySet()) {
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f12932l) {
            case 0:
                C8383l c8383l = (C8383l) this.f12933l;
                if (c8383l != null) {
                    return c8383l;
                }
                C14727l c14727l = (C14727l) this;
                C8383l c8383l2 = new C8383l(1, c14727l.f28799l, c14727l.f28801l);
                this.f12933l = c8383l2;
                return c8383l2;
            case 1:
                C13034l c13034l = (C13034l) this.f12933l;
                if (c13034l != null) {
                    return c13034l;
                }
                C14885l c14885l = (C14885l) this;
                C13034l c13034l2 = new C13034l(1, c14885l.f29272l, c14885l.f29274l);
                this.f12933l = c13034l2;
                return c13034l2;
            default:
                C10813l c10813l = (C10813l) this.f12933l;
                if (c10813l != null) {
                    return c10813l;
                }
                C10813l c10813l2 = new C10813l(1, ((C12903l) this).f25364l);
                this.f12933l = c10813l2;
                return c10813l2;
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i = this.f12932l;
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }
}
