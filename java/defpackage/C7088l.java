package defpackage;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؘؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7088l extends AbstractList implements RandomAccess, InterfaceC5258l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13229l f14852l = new C13229l(new C7088l());

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f14853l;

    public C7088l(InterfaceC5258l interfaceC5258l) {
        this.f14853l = new ArrayList(interfaceC5258l.size());
        addAll(interfaceC5258l);
    }

    @Override // defpackage.InterfaceC5258l
    public final C13229l adcel() {
        return new C13229l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f14853l.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC5258l) {
            collection = ((InterfaceC5258l) collection).crashlytics();
        }
        boolean zAddAll = this.f14853l.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14853l.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC5258l
    public final List crashlytics() {
        return DesugarCollections.unmodifiableList(this.f14853l);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f14853l;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7735l) {
            AbstractC7735l abstractC7735l = (AbstractC7735l) obj;
            String strAd = abstractC7735l.ad();
            if (abstractC7735l.remoteconfig()) {
                arrayList.set(i, strAd);
            }
            return strAd;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC3119l.yandex;
        try {
            String str = new String(bArr, "UTF-8");
            if (AbstractC6159l.mopub(0, bArr.length, bArr) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            C18073l.Signature("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f14853l.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC7735l) {
            return ((AbstractC7735l) objRemove).ad();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC3119l.yandex;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C18073l.Signature("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f14853l.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC7735l) {
            return ((AbstractC7735l) obj2).ad();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC3119l.yandex;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C18073l.Signature("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14853l.size();
    }

    @Override // defpackage.InterfaceC5258l
    public final AbstractC7735l startapp(int i) {
        AbstractC7735l c7362l;
        ArrayList arrayList = this.f14853l;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC7735l) {
            c7362l = (AbstractC7735l) obj;
        } else if (obj instanceof String) {
            try {
                c7362l = new C7362l(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                C18073l.Signature("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c7362l = new C7362l(bArr2);
        }
        if (c7362l != obj) {
            arrayList.set(i, c7362l);
        }
        return c7362l;
    }

    @Override // defpackage.InterfaceC5258l
    public final void subscription(C7362l c7362l) {
        this.f14853l.add(c7362l);
        ((AbstractList) this).modCount++;
    }

    public C7088l() {
        this.f14853l = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f14853l.size(), collection);
    }
}
