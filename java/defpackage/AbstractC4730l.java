package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: renamed from: lؚٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4730l extends AbstractC14080l implements Serializable {
    public static C7654l admob(AbstractC14080l abstractC14080l, Object obj, AbstractC14080l abstractC14080l2, int i, EnumC17998l enumC17998l, Class cls) {
        return new C7654l(abstractC14080l, obj, abstractC14080l2, new C7367l(i, enumC17998l, false), cls);
    }

    public static C7654l mopub(AbstractC14080l abstractC14080l, AbstractC14080l abstractC14080l2, int i, EnumC17998l enumC17998l, Class cls) {
        return new C7654l(abstractC14080l, Collections.EMPTY_LIST, abstractC14080l2, new C7367l(i, enumC17998l, true), cls);
    }
}
