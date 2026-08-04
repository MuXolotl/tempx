package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: lٌؘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6005l extends AbstractList implements List, InterfaceC4742l {
    public abstract Object ad(int i);

    public abstract int pro();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return ad(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return pro();
    }
}
