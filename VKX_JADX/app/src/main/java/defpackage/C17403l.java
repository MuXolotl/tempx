package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17403l extends C1538l implements Function2 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C17403l f33908l = new C17403l(2, AbstractC5573l.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
