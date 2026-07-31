package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: lِٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12172l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f24187l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f24188l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC6429l f24189l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24190l = -1;

    public AbstractC12172l(InterfaceC6429l interfaceC6429l) {
        this.f24189l = interfaceC6429l;
        this.f24188l = interfaceC6429l.admob();
    }

    public abstract Object crashlytics(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        yandex();
        return this.f24187l < this.f24189l.mopub();
    }

    @Override // java.util.Iterator
    public final Object next() {
        yandex();
        int i = this.f24187l;
        InterfaceC6429l interfaceC6429l = this.f24189l;
        if (i >= interfaceC6429l.mopub()) {
            C18262l.adcel(AbstractC12589l.applovin(i, interfaceC6429l.mopub(), "Cannot access index ", " when size is ", ". Remember to check hasNext() before using next()."));
            return null;
        }
        Object objCrashlytics = crashlytics(i);
        this.f24190l = i;
        this.f24187l = i + 1;
        return objCrashlytics;
    }

    @Override // java.util.Iterator
    public final void remove() {
        yandex();
        InterfaceC6429l interfaceC6429l = this.f24189l;
        if (interfaceC6429l.mopub() == 0) {
            C1759l.firebase("Could not remove last element returned by the iterator: dictionary is empty.");
            return;
        }
        int i = this.f24190l;
        if (i < 0) {
            C8339l.smaato("Could not remove last element returned by the iterator: iterator never returned an element.");
            return;
        }
        Boolean bool = (Boolean) interfaceC6429l.adcel(interfaceC6429l.metrica(i).f17098l).f17097l;
        bool.getClass();
        int i2 = this.f24190l;
        int i3 = this.f24187l;
        if (i2 < i3) {
            this.f24187l = i3 - 1;
        }
        this.f24190l = -1;
        boolean zBooleanValue = bool.booleanValue();
        this.f24188l = interfaceC6429l.admob();
        if (zBooleanValue) {
            return;
        }
        C1759l.firebase("Could not remove last element returned by the iterator: was there an element to remove?");
    }

    public final void yandex() {
        if (this.f24189l.admob() != this.f24188l) {
            throw new ConcurrentModificationException("The underlying RealmDictionary was modified while iterating over its entry set.");
        }
    }
}
