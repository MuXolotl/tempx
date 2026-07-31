package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُۧ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11514l implements Iterator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11514l[] f23136l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC11514l f23137l;

    static {
        EnumC11514l enumC11514l = new EnumC11514l("INSTANCE", 0);
        f23137l = enumC11514l;
        f23136l = new EnumC11514l[]{enumC11514l};
    }

    public static EnumC11514l valueOf(String str) {
        return (EnumC11514l) Enum.valueOf(EnumC11514l.class, str);
    }

    public static EnumC11514l[] values() {
        return (EnumC11514l[]) f23136l.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC12442l.ads("no calls to next() since the last call to remove()", false);
    }
}
